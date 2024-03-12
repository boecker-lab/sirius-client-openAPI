# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.sirius import Sirius

class TestSirius(unittest.TestCase):
    """Sirius unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Sirius:
        """Test Sirius
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Sirius`
        """
        model = Sirius()
        if include_optional:
            return Sirius(
                enabled = True,
                profile = 'QTOF',
                number_of_candidates = 56,
                number_of_candidates_per_ionization = 56,
                mass_accuracy_ms2ppm = 1.337,
                isotope_ms2_settings = 'IGNORE',
                filter_by_isotope_pattern = True,
                enforce_el_gordo_formula = True,
                perform_bottom_up_search = True,
                perform_denovo_below_mz = 1.337,
                formula_search_dbs = [
                    ''
                    ],
                apply_formula_constraints_to_db_and_bottom_up_search = True,
                enforced_formula_constraints = '',
                fallback_formula_constraints = '',
                detectable_elements = [
                    ''
                    ],
                ilp_timeout = PySirius.models.timeout.Timeout(
                    number_of_seconds_per_decomposition = 56, 
                    number_of_seconds_per_instance = 56, ),
                use_heuristic = PySirius.models.use_heuristic.UseHeuristic(
                    use_heuristic_above_mz = 56, 
                    use_only_heuristic_above_mz = 56, ),
                inject_spec_lib_match_formulas = True,
                min_score_to_inject_spec_lib_match = 1.337,
                min_peaks_to_inject_spec_lib_match = 56
            )
        else:
            return Sirius(
        )
        """

    def testSirius(self):
        """Test Sirius"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
