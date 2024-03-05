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

from pydantic import BaseModel, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class SpectrumAnnotation(BaseModel):
    """
    SpectrumAnnotation
    """ # noqa: E501
    molecular_formula: Optional[StrictStr] = Field(default=None, description="Molecular formula that has been annotated to this spectrum", alias="molecularFormula")
    ionization: Optional[StrictStr] = Field(default=None, description="Ionization that has been annotated to this spectrum")
    exact_mass: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Exact mass based on the annotated molecular formula and ionization", alias="exactMass")
    mass_deviation_mz: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Absolute mass deviation of the exact mass to the precursor mass (precursorMz) of this spectrum in mDa", alias="massDeviationMz")
    mass_deviation_ppm: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Relative mass deviation of the exact mass to the precursor mass (precursorMz) of this spectrum in ppm", alias="massDeviationPpm")
    structure_annotation_smiles: Optional[StrictStr] = Field(default=None, description="Smiles of the structure candidate used to derive substructure peak annotations via epimetheus insilico fragmentation  Substructure highlighting (bond and atom indices) refer to this specific SMILES.  If you standardize or canonicalize this SMILES in any way the indices of substructure highlighting might  not match correctly anymore.   Null if substructure annotation not available or not requested.", alias="structureAnnotationSmiles")
    structure_annotation_score: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Overall score of all substructure annotations computed for this structure candidate (structureAnnotationSmiles)   Null if substructure annotation not available or not requested.", alias="structureAnnotationScore")
    __properties: ClassVar[List[str]] = ["molecularFormula", "ionization", "exactMass", "massDeviationMz", "massDeviationPpm", "structureAnnotationSmiles", "structureAnnotationScore"]

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
        """Create an instance of SpectrumAnnotation from a JSON string"""
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
        # set to None if molecular_formula (nullable) is None
        # and model_fields_set contains the field
        if self.molecular_formula is None and "molecular_formula" in self.model_fields_set:
            _dict['molecularFormula'] = None

        # set to None if ionization (nullable) is None
        # and model_fields_set contains the field
        if self.ionization is None and "ionization" in self.model_fields_set:
            _dict['ionization'] = None

        # set to None if exact_mass (nullable) is None
        # and model_fields_set contains the field
        if self.exact_mass is None and "exact_mass" in self.model_fields_set:
            _dict['exactMass'] = None

        # set to None if mass_deviation_mz (nullable) is None
        # and model_fields_set contains the field
        if self.mass_deviation_mz is None and "mass_deviation_mz" in self.model_fields_set:
            _dict['massDeviationMz'] = None

        # set to None if mass_deviation_ppm (nullable) is None
        # and model_fields_set contains the field
        if self.mass_deviation_ppm is None and "mass_deviation_ppm" in self.model_fields_set:
            _dict['massDeviationPpm'] = None

        # set to None if structure_annotation_smiles (nullable) is None
        # and model_fields_set contains the field
        if self.structure_annotation_smiles is None and "structure_annotation_smiles" in self.model_fields_set:
            _dict['structureAnnotationSmiles'] = None

        # set to None if structure_annotation_score (nullable) is None
        # and model_fields_set contains the field
        if self.structure_annotation_score is None and "structure_annotation_score" in self.model_fields_set:
            _dict['structureAnnotationScore'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SpectrumAnnotation from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "molecularFormula": obj.get("molecularFormula"),
            "ionization": obj.get("ionization"),
            "exactMass": obj.get("exactMass"),
            "massDeviationMz": obj.get("massDeviationMz"),
            "massDeviationPpm": obj.get("massDeviationPpm"),
            "structureAnnotationSmiles": obj.get("structureAnnotationSmiles"),
            "structureAnnotationScore": obj.get("structureAnnotationScore")
        })
        return _obj

