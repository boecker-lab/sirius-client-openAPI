# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class GuiResultTab(str, Enum):
    """
    Available result tabs in the SIRIUS GUI. Name correspond to the names in the GUI.
    """

    """
    allowed enum values
    """
    FORMULAS = 'FORMULAS'
    PREDICTED_FINGERPRINT = 'PREDICTED_FINGERPRINT'
    COMPOUND_CLASSES = 'COMPOUND_CLASSES'
    STRUCTURES = 'STRUCTURES'
    STRUCTURE_ANNOTATION = 'STRUCTURE_ANNOTATION'
    DE_NOVO_STRUCTURES = 'DE_NOVO_STRUCTURES'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of GuiResultTab from a JSON string"""
        return cls(json.loads(json_str))


