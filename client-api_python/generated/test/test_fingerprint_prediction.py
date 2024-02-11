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
from models.fingerprint_prediction import FingerprintPrediction  # noqa: E501
from PySirius.rest import ApiException


class TestFingerprintPrediction(unittest.TestCase):
    """FingerprintPrediction unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testFingerprintPrediction(self):
        """Test FingerprintPrediction"""
        # FIXME: construct object with mandatory attributes with example values
        # model = PySirius.models.fingerprint_prediction.FingerprintPrediction()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
