# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest
import time
import os
import shutil
from PySirius import PySiriusAPI
from PySirius.rest import ApiException


address = "http://localhost"
port = 8080
api = PySiriusAPI(address=address, port=port)
path_to_demo_data = "/home/runner/work/sirius-client-openAPI/sirius-client-openAPI/.updater/examples"
formula_id_paras = api.get_models().Sirius(True)
os.makedirs("temp_8")
os.makedirs("temp_4")
os.makedirs("temp_7")
os.makedirs("temp_5")
os.makedirs("temp_6")


class TestComputationsApi(unittest.TestCase):
    """ComputationsApi unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_delete_job(self):
        psid = api.get_ProjectSpacesApi().create_project_space("temp4","temp_4")
        jobid = api.get_CompoundsApi().import_compounds([path_to_demo_data+"/ms/Bicuculline.ms", path_to_demo_data+"/ms/Kaempferol.ms" ], "temp4")
        api.get_ComputationsApi().delete_job("temp4",jobid.id)
        

    def test_delete_job_config(self):
        api_instance = api.get_ComputationsApi()
        pid_dir = api.get_ProjectSpacesApi().create_project_space("computations2", "computationsDir2")
        sub = api.get_models().JobSubmission(canopus_paras = api.get_models().Canopus(enabled=False))
        #api_instance.post_job_config("canopusConfig", sub)
        #api_instance.get_job_config("canopusConfig")
        #api_instance.delete_job_config("canopusConfig")
        # TODO: ERR 400 - Bad Request

    def test_get_default_job_config(self):
        api_instance = api.get_ComputationsApi()
        api_instance.get_default_job_config()

    def test_get_job(self):
        """Already done in formula_results"""
        self.assertTrue(True)

    def test_get_job_config(self):
        """Already done in setup"""
        self.assertTrue(True)
        
    def test_get_job_configs(self):
        api_instance = api.get_ComputationsApi()
        api_instance.get_job_configs()

    def test_get_jobs(self):
        psid = api.get_ProjectSpacesApi().create_project_space("temp7","temp_7")
        api_instance = api.get_ComputationsApi()
        api_instance.get_jobs("temp7")

    def test_post_job_config(self):
        """Already done in setup"""
        self.assertTrue(True)

    def test_start_job(self):
        """Already done in formula_results"""
        self.assertTrue(True)
        
    def test_start_job_from_config(self):
        api_instance = api.get_ComputationsApi()
        psid = api.get_ProjectSpacesApi().create_project_space("temp6","temp_6")
        ps_name = "temp6"
        config = api_instance.get_default_job_config()
        config_name = "default_config"
        api_instance.post_job_config(config, config_name)
        api.get_CompoundsApi().import_compounds([path_to_demo_data+"/ms/Bicuculline.ms", path_to_demo_data+"/ms/Kaempferol.ms" ], ps_name)
        fallback_adducts = ["[M+H]+","[M]+,[M+K]+","[M+Na]+","[M+H-H2O]+","[M+Na2-H]+","[M+2K-H]+","[M+NH4]+","[M+H3O]+","[M+MeOH+H]+"]
        detectable_adducts = ["[M+H]+","[M]+,[M+K]+","[M+Na]+","[M+H-H2O]+","[M+Na2-H]+","[M+2K-H]+","[M+NH4]+","[M+H3O]+","[M+MeOH+H]+"]
        time.sleep(2)
        job = api.get_models().JobSubmission([api.get_CompoundsApi().get_compounds(ps_name)[0].id, api.get_CompoundsApi().get_compounds(ps_name)[1].id], fallback_adducts, None, detectable_adducts, True, formula_id_paras)
        time.sleep(2)
        #job_id = api.get_ComputationsApi().start_job_from_config(job, config_name, ps_name)
        # TODO: ERR 400

if __name__ == '__main__':
    unittest.main()
