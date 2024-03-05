# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import os
import time
import shutil
import unittest

import PySirius
from PySirius import PySiriusAPI
from PySirius.models.ms_data import MsData
from PySirius.models.aligned_feature import AlignedFeature
from PySirius.models.page_aligned_feature import PageAlignedFeature


class TestFeaturesApi(unittest.TestCase):
    """FeaturesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = PySiriusAPI(PySirius.ApiClient())
        self.project_id = "test_features_api"
        self.path_to_project = f"{os.environ.get('HOME')}/test_features_api_dir"
        self.api.get_ProjectsApi().create_project_space(self.project_id, self.path_to_project)

        path_to_demo_data = f"{os.environ.get('HOME')}/sirius-client-openAPI/.updater/clientTests/Data"
        import_local_files_submission = PySirius.ImportLocalFilesSubmission.from_dict(
            {
                "allowMs1OnlyData": True,
                "ignoreFormulas": True,
                "inputPaths": [
                    path_to_demo_data + "/Kaempferol.ms",
                    path_to_demo_data + "/laudanosine.mgf"
                ]
            }
        )
        self.api.get_JobsApi().start_import_from_path_job(self.project_id, import_local_files_submission)
        time.sleep(1)

    def tearDown(self) -> None:
        self.api.get_ProjectsApi().close_project_space(self.project_id)
        shutil.rmtree(self.path_to_project)

    def test_add_aligned_features(self) -> None:
        """Test case for add_aligned_features

        """
        pass

    def test_delete_aligned_feature(self) -> None:
        """Test case for delete_aligned_feature

        Delete feature (aligned over runs) with the given identifier from the specified project-space.
        """
        response_before = self.api.get_FeaturesApi().get_aligned_features(self.project_id)
        aligned_feature_id = self.api.get_FeaturesApi().get_aligned_features(self.project_id)[0].aligned_feature_id
        self.api.get_FeaturesApi().delete_aligned_feature(self.project_id, aligned_feature_id)
        response_after = self.api.get_FeaturesApi().get_aligned_features(self.project_id)

        self.assertEqual(len(response_before), 2)
        self.assertIsInstance(response_before, list)
        self.assertIsInstance(response_before[0], AlignedFeature)
        self.assertIsInstance(response_before[1], AlignedFeature)

        self.assertEqual(len(response_after), 1)
        self.assertIsInstance(response_after, list)
        self.assertIsInstance(response_after[0], AlignedFeature)


    def test_get_aligned_feature(self) -> None:
        """Test case for get_aligned_feature

        Get feature (aligned over runs) with the given identifier from the specified project-space.
        """
        aligned_feature_id = self.api.get_FeaturesApi().get_aligned_features(self.project_id)[0].aligned_feature_id
        response = self.api.get_FeaturesApi().get_aligned_feature(self.project_id, aligned_feature_id)

        self.assertIsInstance(response, AlignedFeature)


    def test_get_aligned_features(self) -> None:
        """Test case for get_aligned_features

        Get all available features (aligned over runs) in the given project-space.
        """
        response = self.api.get_FeaturesApi().get_aligned_features(self.project_id)

        self.assertEqual(len(response), 2)
        self.assertIsInstance(response, list)
        self.assertIsInstance(response[0], AlignedFeature)
        self.assertIsInstance(response[1], AlignedFeature)

    def test_get_aligned_features_paged(self) -> None:
        """Test case for get_aligned_features_paged

        Get all available features (aligned over runs) in the given project-space.
        """
        response = self.api.get_FeaturesApi().get_aligned_features_paged(self.project_id)

        self.assertIsInstance(response, PageAlignedFeature)

    def test_get_best_matching_compound_classes(self) -> None:
        """Test case for get_best_matching_compound_classes

        Best matching compound classes,  Set of the highest scoring compound classes (CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
        """
        pass

    def test_get_canopus_prediction(self) -> None:
        """Test case for get_canopus_prediction

        All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
        """
        pass

    def test_get_fingerprint_prediction(self) -> None:
        """Test case for get_fingerprint_prediction

        Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perform structure database search and predict compound classes.
        """
        pass

    def test_get_formula_annotated_ms_ms_data(self) -> None:
        """Test case for get_formula_annotated_ms_ms_data

        Returns MS/MS Spectrum (Merged MS/MS and measured MS/MS) which is annotated with fragments and losses  for the given formula result identifier  These annotations are only available if a fragmentation tree and the structure candidate are available.
        """
        pass

    def test_get_formula_annotated_spectrum(self) -> None:
        """Test case for get_formula_annotated_spectrum

        Returns a fragmentation spectrum (e.g. Merged MS/MS) which is annotated with fragments and losses for the given formula result identifier  These annotations are only available if a fragmentation tree is available.
        """
        pass

    def test_get_formula_candidate(self) -> None:
        """Test case for get_formula_candidate

        FormulaResultContainers for the given 'formulaId' with minimal information.
        """
        pass

    def test_get_formula_candidates(self) -> None:
        """Test case for get_formula_candidates

        List of FormulaResultContainers available for this feature with minimal information.
        """
        pass

    def test_get_formula_candidates_paged(self) -> None:
        """Test case for get_formula_candidates_paged

        Page of FormulaResultContainers available for this feature with minimal information.
        """
        pass

    def test_get_frag_tree(self) -> None:
        """Test case for get_frag_tree

        Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
        """
        pass

    def test_get_isotope_pattern_annotation(self) -> None:
        """Test case for get_isotope_pattern_annotation

        Returns Isotope pattern information (simulated isotope pattern, measured isotope pattern, isotope pattern highlighting)  for the given formula result identifier.
        """
        pass

    def test_get_lipid_annotation(self) -> None:
        """Test case for get_lipid_annotation

        Returns Lipid annotation (ElGordo) for the given formula result identifier.
        """
        pass

    def test_get_ms_data(self) -> None:
        """Test case for get_ms_data

        Mass Spec data (input data) for the given 'alignedFeatureId' .
        """
        aligned_feature_id = self.api.get_FeaturesApi().get_aligned_features(self.project_id)[0].aligned_feature_id
        response = self.api.get_FeaturesApi().get_ms_data(self.project_id, aligned_feature_id)

        self.assertIsInstance(response, MsData)

    def test_get_sirius_frag_tree(self) -> None:
        """Test case for get_sirius_frag_tree

        """
        pass

    def test_get_spectral_library_matches(self) -> None:
        """Test case for get_spectral_library_matches

        List of spectral library matches for the given 'alignedFeatureId'.
        """
        pass

    def test_get_spectral_library_matches_paged(self) -> None:
        """Test case for get_spectral_library_matches_paged

        Page of spectral library matches for the given 'alignedFeatureId'.
        """
        pass

    def test_get_structure_annotated_ms_data(self) -> None:
        """Test case for get_structure_annotated_ms_data

        Returns MS/MS Data (Merged MS/MS and list of measured MS/MS ) which are annotated with fragments and losses  for the given formula result identifier and structure candidate inChIKey.
        """
        pass

    def test_get_structure_annotated_spectrum(self) -> None:
        """Test case for get_structure_annotated_spectrum

        Returns a fragmentation spectrum (e.g. Merged MS/MS) which is annotated with fragments and losses for the given formula result identifier  These annotations are only available if a fragmentation tree is available.
        """
        pass

    def test_get_structure_candidates(self) -> None:
        """Test case for get_structure_candidates

        List of StructureCandidates for the given 'alignedFeatureId' with minimal information.
        """
        pass

    def test_get_structure_candidates_by_formula(self) -> None:
        """Test case for get_structure_candidates_by_formula

        List of StructureCandidates the given 'formulaId' with minimal information.
        """
        pass

    def test_get_structure_candidates_by_formula_paged(self) -> None:
        """Test case for get_structure_candidates_by_formula_paged

        Page of StructureCandidates the given 'formulaId' with minimal information.
        """
        pass

    def test_get_structure_candidates_paged(self) -> None:
        """Test case for get_structure_candidates_paged

        Page of StructureCandidates for the given 'alignedFeatureId' with minimal information.
        """
        pass


if __name__ == '__main__':
    unittest.main()