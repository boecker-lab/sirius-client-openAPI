# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.structure_db_search import StructureDbSearch

class TestStructureDbSearch(unittest.TestCase):
    """StructureDbSearch unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> StructureDbSearch:
        """Test StructureDbSearch
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `StructureDbSearch`
        """
        model = StructureDbSearch()
        if include_optional:
            return StructureDbSearch(
                enabled = True,
                structure_search_dbs = [
                    ''
                    ],
                tag_structures_with_lipid_class = True,
                expansive_search_confidence_mode = 'OFF'
            )
        else:
            return StructureDbSearch(
        )
        """

    def testStructureDbSearch(self):
        """Test StructureDbSearch"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
