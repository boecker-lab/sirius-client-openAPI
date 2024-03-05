# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.project_change_event import ProjectChangeEvent

class TestProjectChangeEvent(unittest.TestCase):
    """ProjectChangeEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProjectChangeEvent:
        """Test ProjectChangeEvent
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProjectChangeEvent`
        """
        model = ProjectChangeEvent()
        if include_optional:
            return ProjectChangeEvent(
                event_type = 'PROJECT_OPENED',
                project_id = '',
                compound_id = '',
                featured_id = '',
                formula_id = '',
                structure_in_ch_i_key = ''
            )
        else:
            return ProjectChangeEvent(
        )
        """

    def testProjectChangeEvent(self):
        """Test ProjectChangeEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()