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
from PySirius.models.compound_class import CompoundClass
from typing import Optional, Set
from typing_extensions import Self

class CanopusPrediction(BaseModel):
    """
    Container class that holds the CANOPUS compound class predictions for alle predictable compound classes.  This is the full CANOPUS result.
    """ # noqa: E501
    classy_fire_classes: Optional[List[Optional[CompoundClass]]] = Field(default=None, description="All predicted ClassyFire classes", alias="classyFireClasses")
    npc_classes: Optional[List[Optional[CompoundClass]]] = Field(default=None, description="All predicted NPC classes", alias="npcClasses")
    __properties: ClassVar[List[str]] = ["classyFireClasses", "npcClasses"]

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
        """Create an instance of CanopusPrediction from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in classy_fire_classes (list)
        _items = []
        if self.classy_fire_classes:
            for _item in self.classy_fire_classes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['classyFireClasses'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in npc_classes (list)
        _items = []
        if self.npc_classes:
            for _item in self.npc_classes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['npcClasses'] = _items
        # set to None if classy_fire_classes (nullable) is None
        # and model_fields_set contains the field
        if self.classy_fire_classes is None and "classy_fire_classes" in self.model_fields_set:
            _dict['classyFireClasses'] = None

        # set to None if npc_classes (nullable) is None
        # and model_fields_set contains the field
        if self.npc_classes is None and "npc_classes" in self.model_fields_set:
            _dict['npcClasses'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CanopusPrediction from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "classyFireClasses": [CompoundClass.from_dict(_item) for _item in obj["classyFireClasses"]] if obj.get("classyFireClasses") is not None else None,
            "npcClasses": [CompoundClass.from_dict(_item) for _item in obj["npcClasses"]] if obj.get("npcClasses") is not None else None
        })
        return _obj


