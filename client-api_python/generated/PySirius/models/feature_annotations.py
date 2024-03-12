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
from PySirius.models.compound_classes import CompoundClasses
from PySirius.models.formula_candidate import FormulaCandidate
from PySirius.models.structure_candidate_scored import StructureCandidateScored
from typing import Optional, Set
from typing_extensions import Self

class FeatureAnnotations(BaseModel):
    """
    Summary of the results of a feature (aligned over runs). Can be added to a AlignedFeature.  The different annotation fields within this summary object are null if the corresponding  feature does not contain the represented results. If fields are non-null  the corresponding result has been computed but might still be empty.
    """ # noqa: E501
    formula_annotation: Optional[FormulaCandidate] = Field(default=None, alias="formulaAnnotation")
    structure_annotation: Optional[StructureCandidateScored] = Field(default=None, alias="structureAnnotation")
    compound_class_annotation: Optional[CompoundClasses] = Field(default=None, alias="compoundClassAnnotation")
    __properties: ClassVar[List[str]] = ["formulaAnnotation", "structureAnnotation", "compoundClassAnnotation"]

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
        """Create an instance of FeatureAnnotations from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of formula_annotation
        if self.formula_annotation:
            _dict['formulaAnnotation'] = self.formula_annotation.to_dict()
        # override the default output from pydantic by calling `to_dict()` of structure_annotation
        if self.structure_annotation:
            _dict['structureAnnotation'] = self.structure_annotation.to_dict()
        # override the default output from pydantic by calling `to_dict()` of compound_class_annotation
        if self.compound_class_annotation:
            _dict['compoundClassAnnotation'] = self.compound_class_annotation.to_dict()
        # set to None if formula_annotation (nullable) is None
        # and model_fields_set contains the field
        if self.formula_annotation is None and "formula_annotation" in self.model_fields_set:
            _dict['formulaAnnotation'] = None

        # set to None if structure_annotation (nullable) is None
        # and model_fields_set contains the field
        if self.structure_annotation is None and "structure_annotation" in self.model_fields_set:
            _dict['structureAnnotation'] = None

        # set to None if compound_class_annotation (nullable) is None
        # and model_fields_set contains the field
        if self.compound_class_annotation is None and "compound_class_annotation" in self.model_fields_set:
            _dict['compoundClassAnnotation'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of FeatureAnnotations from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "formulaAnnotation": FormulaCandidate.from_dict(obj["formulaAnnotation"]) if obj.get("formulaAnnotation") is not None else None,
            "structureAnnotation": StructureCandidateScored.from_dict(obj["structureAnnotation"]) if obj.get("structureAnnotation") is not None else None,
            "compoundClassAnnotation": CompoundClasses.from_dict(obj["compoundClassAnnotation"]) if obj.get("compoundClassAnnotation") is not None else None
        })
        return _obj


