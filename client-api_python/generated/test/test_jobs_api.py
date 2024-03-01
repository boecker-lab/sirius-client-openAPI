# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.api.jobs_api import JobsApi


class TestJobsApi(unittest.TestCase):
    """JobsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = JobsApi()

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

        Get List of all available jobs with information such as current state and progress (if available).
        """
        pass

    def test_get_jobs_paged(self) -> None:
        """Test case for get_jobs_paged

        Get Page of jobs with information such as current state and progress (if available).
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

    def test_start_database_import(self) -> None:
        """Test case for start_database_import

        Start import of structure and spectra files into the specified database.
        """
        pass

    def test_start_import_from_path_job(self) -> None:
        """Test case for start_import_from_path_job

        Import ms/ms data in given format from local filesystem into the specified project
        """
        pass

    def test_start_import_from_string_job(self) -> None:
        """Test case for start_import_from_string_job

        Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)
        """
        pass

    def test_start_job(self) -> None:
        """Test case for start_job

        Start computation for given compounds and with given parameters.
        """
        pass

    def test_start_job_from_config(self) -> None:
        """Test case for start_job_from_config

        Start computation for given compounds and with parameters from a stored job-config.
        """
        pass


if __name__ == '__main__':
    unittest.main()
