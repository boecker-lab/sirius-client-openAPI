# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501
import os
import shutil
import time
import unittest
from os.path import abspath

import PySirius
from PySirius import PySiriusAPI
from PySirius.api.jobs_api import JobsApi

api = PySiriusAPI(PySirius.ApiClient())

jobConfig= {"alignedFeatureIds": [
    "string"
  ],"formulaIdParams": {
    "enabled": True,
    "profile": "QTOF",
  }}


class TestJobsApi(unittest.TestCase):
    """JobsApi unit test stubs"""

    def setUp(self) -> None:
        pass
    def tearDown(self) -> None:
        pass

    def test_delete_job(self) -> None:
        """Test case for delete_job

        Delete job.
        """
        pass

    def test_delete_job_config(self) -> None:
        """Test case for delete_job_config

        Delete job configuration with given name.
        """
        pass

    def test_delete_jobs(self) -> None:
        """Test case for delete_jobs

        * Delete ALL jobs.
        """
        pass

    def test_get_default_job_config(self) -> None:
        """Test case for get_default_job_config

        Request default job configuration
        """
        pass

    def test_get_job(self) -> None:
        """Test case for get_job

        Get job information and its current state and progress (if available).
        """
        pass

    def test_get_job_config(self) -> None:
        """Test case for get_job_config

        Request job configuration with given name.
        """
        pass

    def test_get_job_configs(self) -> None:
        """Test case for get_job_configs

        Request all available job configurations
        """
        pass

    def test_get_jobs(self) -> None:
        """Test case for get_jobs

        Get job information and its current state and progress (if available).
        """
        pass

    def test_has_jobs(self) -> None:
        """Test case for has_jobs

        """
        pass

    def test_post_job_config(self) -> None:
        """Test case for post_job_config

        Add new job configuration with given name.
        """
        pass

    def test_start_command(self) -> None:
        """Test case for start_command

        Start computation for given command and input.
        """
        pass

    def test_start_import_from_path_job(self) -> None:
        """Test case for start_import_from_path_job

        Import ms/ms data in given format from local filesystem into the specified project
        """

        path_to_demo_data = "../../../.updater/clientTests/Data"
        os.makedirs("temp_0")
        projectID="tempProject"
        api.get_ProjectsApi().create_project_space(project_id=projectID,
                                               path_to_project="../../../../client-api_python/generated/test/temp_0")

        api.get_JobsApi().start_import_from_path_job(project_id=projectID,
                                                       import_local_files_submission=PySirius.ImportLocalFilesSubmission.from_dict(
                                                           {
                                                               "allowMs1OnlyData": True,
                                                               "ignoreFormulas": True,
                                                               "inputPaths": [
                                                                   abspath(path_to_demo_data + "/Kaempferol.ms"),
                                                                   abspath(path_to_demo_data + "/laudanosine.mgf")]
                                                           }))

        time.sleep(3)

        nrFeatures = api.get_FeaturesApi().get_aligned_features(project_id=projectID).number_of_elements
        shutil.rmtree("temp_0")
        api.get_ProjectsApi().close_project_space(project_id=projectID)
        self.assertEqual(nrFeatures,2)

    def test_start_import_from_string_job(self) -> None:
        """Test case for start_import_from_string_job

        Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)
        """
        pass

    def test_start_job(self) -> None:
        """Test case for start_job

        Start computation for given compounds and with given parameters.
        """
        path_to_demo_data = "../../../.updater/clientTests/Data"
        os.makedirs("temp_0")
        projectID = "tempProject"
        api.get_ProjectsApi().create_project_space(project_id=projectID,
                                                   path_to_project="../../../../client-api_python/generated/test/temp_0")
        api.get_JobsApi().start_import_from_path_job(project_id=projectID,
                                                     import_local_files_submission=PySirius.ImportLocalFilesSubmission.from_dict(
                                                         {
                                                             "allowMs1OnlyData": True,
                                                             "ignoreFormulas": True,
                                                             "inputPaths": [
                                                                 abspath(path_to_demo_data + "/ms/Bicuculline.ms"),
                                                                 abspath(path_to_demo_data + "/ms/laudanosine.mgf")]
                                                         }))

        time.sleep(1)



        api.get_JobsApi().start_job(project_id=projectID,job_submission=jobConfig)
        pass

    def test_start_job_from_config(self) -> None:
        """Test case for start_job_from_config

        Start computation for given compounds and with parameters from a stored job-config.
        """
        pass


if __name__ == '__main__':
    unittest.main()