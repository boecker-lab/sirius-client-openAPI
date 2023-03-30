# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.4-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import PySirius
from PySirius.api.computations_api import ComputationsApi  # noqa: E501
from PySirius.rest import ApiException


class TestComputationsApi(unittest.TestCase):
    """ComputationsApi unit test stubs"""

    def setUp(self):
        self.api = ComputationsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_delete_job(self):
        """Test case for delete_job

        Delete job.  # noqa: E501
        """
        pass

    def test_delete_job_config(self):
        """Test case for delete_job_config

        Delete job configuration with given name.  # noqa: E501
        """
        pass

    def test_get_default_job_config(self):
        """Test case for get_default_job_config

        Request default job configuration  # noqa: E501
        """
        pass

    def test_get_job(self):
        """Test case for get_job

        Get job information and its current state and progress (if available).  # noqa: E501
        """
        pass

    def test_get_job_config(self):
        """Test case for get_job_config

        Request job configuration with given name.  # noqa: E501
        """
        pass

    def test_get_job_configs(self):
        """Test case for get_job_configs

        Request all available job configurations  # noqa: E501
        """
        pass

    def test_get_jobs(self):
        """Test case for get_jobs

        Get job information and its current state and progress (if available).  # noqa: E501
        """
        pass

    def test_post_job_config(self):
        """Test case for post_job_config

        Add new job configuration with given name.  # noqa: E501
        """
        pass

    def test_start_job(self):
        """Test case for start_job

        Start computation for given compounds and with given parameters.  # noqa: E501
        """
        pass

    def test_start_job_from_config(self):
        """Test case for start_job_from_config

        Start computation for given compounds and with parameters from a stored job-config.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
