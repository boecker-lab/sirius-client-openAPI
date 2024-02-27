# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.peak_annotation import PeakAnnotation

class TestPeakAnnotation(unittest.TestCase):
    """PeakAnnotation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PeakAnnotation:
        """Test PeakAnnotation
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PeakAnnotation`
        """
        model = PeakAnnotation()
        if include_optional:
            return PeakAnnotation(
                fragment_id = 56,
                molecular_formula = '',
                ionization = '',
                exact_mass = 1.337,
                mass_deviation_mz = 1.337,
                mass_deviation_ppm = 1.337,
                recalibrated_mass_deviation_mz = 1.337,
                recalibrated_mass_deviation_ppm = 1.337,
                parent_peak = PySirius.models.parent_peak.ParentPeak(
                    parent_idx = 56, 
                    parent_fragment_id = 56, 
                    loss_formula = '', ),
                substructure_atoms = [
                    56
                    ],
                substructure_bonds = [
                    56
                    ],
                substructure_bonds_cut = [
                    56
                    ],
                substructure_score = 1.337,
                hydrogen_rearrangements = 56
            )
        else:
            return PeakAnnotation(
                fragment_id = 56,
        )
        """

    def testPeakAnnotation(self):
        """Test PeakAnnotation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
