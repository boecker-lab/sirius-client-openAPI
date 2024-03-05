# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.This API is exposed by SIRIUS 6.0.0-SNAPSHOT

    The version of the OpenAPI document: 2.1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, Field, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Optional, Union
from PySirius.models.peak_annotation import PeakAnnotation
from typing import Optional, Set
from typing_extensions import Self

class AnnotatedPeak(BaseModel):
    """
    AnnotatedPeak
    """ # noqa: E501
    mz: Optional[Union[StrictFloat, StrictInt]] = None
    intensity: Optional[Union[StrictFloat, StrictInt]] = None
    peak_annotation: Optional[PeakAnnotation] = Field(default=None, alias="peakAnnotation")
    __properties: ClassVar[List[str]] = ["mz", "intensity", "peakAnnotation"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of AnnotatedPeak from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of peak_annotation
        if self.peak_annotation:
            _dict['peakAnnotation'] = self.peak_annotation.to_dict()
        # set to None if peak_annotation (nullable) is None
        # and model_fields_set contains the field
        if self.peak_annotation is None and "peak_annotation" in self.model_fields_set:
            _dict['peakAnnotation'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AnnotatedPeak from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "mz": obj.get("mz"),
            "intensity": obj.get("intensity"),
            "peakAnnotation": PeakAnnotation.from_dict(obj["peakAnnotation"]) if obj.get("peakAnnotation") is not None else None
        })
        return _obj


