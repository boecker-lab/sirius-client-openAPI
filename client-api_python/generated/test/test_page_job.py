# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from PySirius.models.page_job import PageJob

class TestPageJob(unittest.TestCase):
    """PageJob unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PageJob:
        """Test PageJob
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PageJob`
        """
        model = PageJob()
        if include_optional:
            return PageJob(
                total_pages = 56,
                total_elements = 56,
                size = 56,
                content = [
                    PySirius.models.job.Job(
                        id = '', 
                        command = '', 
                        progress = PySirius.models.job_progress.JobProgress(
                            indeterminate = True, 
                            state = 'WAITING', 
                            current_progress = 56, 
                            max_progress = 56, 
                            message = '', 
                            error_message = '', ), 
                        affected_compound_ids = [
                            ''
                            ], 
                        affected_aligned_feature_ids = [
                            ''
                            ], )
                    ],
                number = 56,
                sort = PySirius.models.sort_object.SortObject(
                    empty = True, 
                    sorted = True, 
                    unsorted = True, ),
                first = True,
                last = True,
                number_of_elements = 56,
                pageable = PySirius.models.pageable_object.PageableObject(
                    offset = 56, 
                    sort = PySirius.models.sort_object.SortObject(
                        empty = True, 
                        sorted = True, 
                        unsorted = True, ), 
                    page_size = 56, 
                    page_number = 56, 
                    paged = True, 
                    unpaged = True, ),
                empty = True
            )
        else:
            return PageJob(
        )
        """

    def testPageJob(self):
        """Test PageJob"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
