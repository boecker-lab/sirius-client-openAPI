# coding: utf-8

"""
    SIRIUS Nightsky API

    OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.  # noqa: E501

    OpenAPI spec version: 0.9
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import PySirius
from PySirius.models.job_id import JobId  # noqa: E501
from PySirius.rest import ApiException


class TestJobId(unittest.TestCase):
    """JobId unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testJobId(self):
        """Test JobId"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PySirius.models.job_id.JobId()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
