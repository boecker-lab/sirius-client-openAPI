# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.searchable_database_parameters import SearchableDatabaseParameters

class TestSearchableDatabaseParameters(unittest.TestCase):
    """SearchableDatabaseParameters unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SearchableDatabaseParameters:
        """Test SearchableDatabaseParameters
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SearchableDatabaseParameters`
        """
        model = SearchableDatabaseParameters()
        if include_optional:
            return SearchableDatabaseParameters(
                display_name = '',
                location = '',
                match_rt_of_reference_spectra = True
            )
        else:
            return SearchableDatabaseParameters(
        )
        """

    def testSearchableDatabaseParameters(self):
        """Test SearchableDatabaseParameters"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
