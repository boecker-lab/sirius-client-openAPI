# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 6.0.0-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import PySirius
from PySirius.api.graphical_user_interface_api import GraphicalUserInterfaceApi  # noqa: E501
from PySirius.rest import ApiException


class TestGraphicalUserInterfaceApi(unittest.TestCase):
    """GraphicalUserInterfaceApi unit test stubs"""

    def setUp(self):
        self.api = GraphicalUserInterfaceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_apply_to_gui(self):
        """Test case for apply_to_gui

        Apply given changes to the running GUI instance.  # noqa: E501
        """
        pass

    def test_close_gui(self):
        """Test case for close_gui

        Close GUI instance of given project-space if available.  # noqa: E501
        """
        pass

    def test_open_gui(self):
        """Test case for open_gui

        Open GUI instance on specified project-space and bring the GUI window to foreground.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
