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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from PySirius.models.annotated_spectrum import AnnotatedSpectrum
from typing import Optional, Set
from typing_extensions import Self

class AnnotatedMsMsData(BaseModel):
    """
    AnnotatedMsMsData
    """ # noqa: E501
    merged_ms2: Optional[AnnotatedSpectrum] = Field(alias="mergedMs2")
    ms2_spectra: List[Optional[AnnotatedSpectrum]] = Field(alias="ms2Spectra")
    __properties: ClassVar[List[str]] = ["mergedMs2", "ms2Spectra"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of AnnotatedMsMsData from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of merged_ms2
        if self.merged_ms2:
            _dict['mergedMs2'] = self.merged_ms2.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in ms2_spectra (list)
        _items = []
        if self.ms2_spectra:
            for _item in self.ms2_spectra:
                if _item:
                    _items.append(_item.to_dict())
            _dict['ms2Spectra'] = _items
        # set to None if merged_ms2 (nullable) is None
        # and model_fields_set contains the field
        if self.merged_ms2 is None and "merged_ms2" in self.model_fields_set:
            _dict['mergedMs2'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AnnotatedMsMsData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "mergedMs2": AnnotatedSpectrum.from_dict(obj["mergedMs2"]) if obj.get("mergedMs2") is not None else None,
            "ms2Spectra": [AnnotatedSpectrum.from_dict(_item) for _item in obj["ms2Spectra"]] if obj.get("ms2Spectra") is not None else None
        })
        return _obj


