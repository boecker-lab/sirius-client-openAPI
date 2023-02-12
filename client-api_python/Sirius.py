import os
import time
import subprocess
import json

import urllib3
import PySirius

class SiriusSDK:
    """entry point for running the Sirius Rest service from a new instance"""
    
    process = None
    port = None
    workspace = None
    
    def start(project_space, sirius_executable, override_workspace_location=None ,port=8080, forceStart=False, ):
        """starts the Sirius rest service and returns an API instance that allows access to the API endpoints"""
        is_up = False
        workspace = override_workspace_location
        http = urllib3.PoolManager()

        if (SiriusSDK.process is not None) and not forceStart:
            print("Sirius has already been started with PID: "+str(SiriusSDK.process.pid))
            return None
        
        SiriusSDK.port = port
        
        # add windows and mac
        executable_exist = os.path.exists(sirius_executable)
        project_space_exist = os.path.exists(project_space)

        if  (executable_exist and project_space_exist) or forceStart:
            path_to_executable = os.path.abspath(sirius_executable)
            path_to_project = os.path.abspath(project_space)
            # run_command = "java -jar " + sirius_executable + " --output " + project_space + " REST  -p " + port + " -s"
            run_command = [path_to_executable, "--output", path_to_project, "REST", "-p", str(port), "-s"]
            if workspace is not None:
                if not os.path.exists(workspace) and not forceStart:
                    print("Wrong path to workspace")
                    return None
                print("\033[93m [WARNING] Overriding workspace location [NOT RECOMMENDED] \033[0m")
                run_command.insert(3, "--workspace")
                run_command.insert(4, workspace)
            SiriusSDK.process = subprocess.Popen(run_command)

            while not is_up:
                time.sleep(0.5)
                try:
                    resp = http.request('GET', "http://localhost:" + str(port) + "/actuator/health")
                    if resp.status == 200:
                        resp_data = json.loads(resp.data.decode('utf-8'))
                        is_up = resp_data["status"] == "UP"
                        if is_up:
                            print("Sirius started succesully on the port " + str(port))
                            return PySirius.PySiriusAPI(address="http://localhost", port=SiriusSDK.port)
                except:
                    pass
        else:
            if not executable_exist: 
                print("Wrong path to executable")
            if not project_space_exist:
                print("Wrong path to project space")
            print("Please enter the correct path to the projectspace / executeable")
            return None

    def shutdown():
        """shuts down the via the start function started sirius rest application"""
        http = urllib3.PoolManager()
        resp = http.request('POST', "http://localhost:" + str(SiriusSDK.port) + "/actuator/shutdown")
        if resp.status == 200:
            # terminated via Rest Call
            print("Sirius wash shut down succesfully")
            SiriusSDK.process = None
            return 0
        # Terminate via SIGTERM
        SiriusSDK.process.terminate()
        if SiriusSDK.process.poll() is not None:
            print("Sirius was shut down forcibly")
            SiriusSDK.process = None
            return 0
        # Terminate via SIGKILL
        SiriusSDK.process.kill()
        if SiriusSDK.process.poll() is not None:
            print("Sirius has been shut down...")
            SiriusSDK.process = None
            return 0
        # Termination not successful!
        print("Unable to stop Sirius! - Please manually terminate the process with PID "+ str(SiriusSDK.process.pid))
        SiriusSDK.process = None
        return 1