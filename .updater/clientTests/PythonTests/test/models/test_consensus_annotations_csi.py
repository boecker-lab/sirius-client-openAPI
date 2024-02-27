# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.consensus_annotations_csi import ConsensusAnnotationsCSI

class TestConsensusAnnotationsCSI(unittest.TestCase):
    """ConsensusAnnotationsCSI unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ConsensusAnnotationsCSI:
        """Test ConsensusAnnotationsCSI
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ConsensusAnnotationsCSI`
        """
        model = ConsensusAnnotationsCSI()
        if include_optional:
            return ConsensusAnnotationsCSI(
                molecular_formula = '',
                compound_classes = PySirius.models.compound_classes.CompoundClasses(
                    npc_pathway = PySirius.models.compound_class.CompoundClass(
                        type = 'ClassyFire', 
                        level = '', 
                        name = '', 
                        description = '', 
                        id = 56, 
                        probability = 1.337, 
                        index = 56, ), 
                    npc_superclass = PySirius.models.compound_class.CompoundClass(
                        level = '', 
                        name = '', 
                        description = '', 
                        id = 56, 
                        probability = 1.337, 
                        index = 56, ), 
                    npc_class = , 
                    classy_fire_lineage = [
                        
                        ], 
                    classy_fire_alternatives = [
                        
                        ], ),
                supporting_feature_ids = [
                    ''
                    ],
                selection_criterion = 'MAJORITY_STRUCTURE',
                csi_finger_id_structure = PySirius.models.structure_candidate.StructureCandidate(
                    inchi_key = '', 
                    smiles = '', 
                    structure_name = '', 
                    xlog_p = 1.337, 
                    db_links = [
                        PySirius.models.db_link.DBLink(
                            name = '', 
                            id = '', )
                        ], 
                    ref_spectra_links = [
                        PySirius.models.db_link.DBLink(
                            name = '', 
                            id = '', )
                        ], ),
                confidence_exact_match = 1.337,
                confidence_approx_match = 1.337
            )
        else:
            return ConsensusAnnotationsCSI(
        )
        """

    def testConsensusAnnotationsCSI(self):
        """Test ConsensusAnnotationsCSI"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
