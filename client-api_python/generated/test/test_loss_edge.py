# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.loss_edge import LossEdge

class TestLossEdge(unittest.TestCase):
    """LossEdge unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> LossEdge:
        """Test LossEdge
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `LossEdge`
        """
        model = LossEdge()
        if include_optional:
            return LossEdge(
                source_fragment_idx = 56,
                target_fragment_idx = 56,
                molecular_formula = '',
                score = 1.337
            )
        else:
            return LossEdge(
        )
        """

    def testLossEdge(self):
        """Test LossEdge"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
