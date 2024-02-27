# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.page_gui_info import PageGuiInfo

class TestPageGuiInfo(unittest.TestCase):
    """PageGuiInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PageGuiInfo:
        """Test PageGuiInfo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PageGuiInfo`
        """
        model = PageGuiInfo()
        if include_optional:
            return PageGuiInfo(
                total_pages = 56,
                total_elements = 56,
                size = 56,
                content = [
                    PySirius.models.gui_info.GuiInfo(
                        project_id = '', )
                    ],
                number = 56,
                sort = PySirius.models.sort_object.SortObject(
                    empty = True, 
                    sorted = True, 
                    unsorted = True, ),
                number_of_elements = 56,
                pageable = PySirius.models.pageable_object.PageableObject(
                    offset = 56, 
                    sort = PySirius.models.sort_object.SortObject(
                        empty = True, 
                        sorted = True, 
                        unsorted = True, ), 
                    page_number = 56, 
                    page_size = 56, 
                    paged = True, 
                    unpaged = True, ),
                first = True,
                last = True,
                empty = True
            )
        else:
            return PageGuiInfo(
        )
        """

    def testPageGuiInfo(self):
        """Test PageGuiInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
