# coding: utf-8

"""
    SIRIUS Nightsky API

    OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.

    The version of the OpenAPI document: 0.9
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from PySirius.models.canopus import Canopus
from PySirius.models.fingerprint_prediction import FingerprintPrediction
from PySirius.models.sirius import Sirius
from PySirius.models.structure_db_search import StructureDbSearch
from PySirius.models.zodiac import Zodiac
from typing import Optional, Set
from typing_extensions import Self

class JobSubmission(BaseModel):
    """
    Object to submit a job to be executed by SIRIUS
    """ # noqa: E501
    compound_ids: Optional[List[StrictStr]] = Field(default=None, description="Compounds that should be the input for this Job", alias="compoundIds")
    fallback_adducts: Optional[List[StrictStr]] = Field(default=None, description="Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-", alias="fallbackAdducts")
    enforced_adducts: Optional[List[StrictStr]] = Field(default=None, description="Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-", alias="enforcedAdducts")
    detectable_adducts: Optional[List[StrictStr]] = Field(default=None, description="Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-", alias="detectableAdducts")
    recompute: Optional[StrictBool] = Field(default=None, description="Indicate if already existing result for a tool to be executed should be overwritten or not.")
    formula_id_paras: Optional[Sirius] = Field(default=None, alias="formulaIdParas")
    zodiac_paras: Optional[Zodiac] = Field(default=None, alias="zodiacParas")
    fingerprint_prediction_paras: Optional[FingerprintPrediction] = Field(default=None, alias="fingerprintPredictionParas")
    structure_db_search_paras: Optional[StructureDbSearch] = Field(default=None, alias="structureDbSearchParas")
    canopus_paras: Optional[Canopus] = Field(default=None, alias="canopusParas")
    config_map: Optional[Dict[str, StrictStr]] = Field(default=None, description="As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.", alias="configMap")
    __properties: ClassVar[List[str]] = ["compoundIds", "fallbackAdducts", "enforcedAdducts", "detectableAdducts", "recompute", "formulaIdParas", "zodiacParas", "fingerprintPredictionParas", "structureDbSearchParas", "canopusParas", "configMap"]

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
        """Create an instance of JobSubmission from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of formula_id_paras
        if self.formula_id_paras:
            _dict['formulaIdParas'] = self.formula_id_paras.to_dict()
        # override the default output from pydantic by calling `to_dict()` of zodiac_paras
        if self.zodiac_paras:
            _dict['zodiacParas'] = self.zodiac_paras.to_dict()
        # override the default output from pydantic by calling `to_dict()` of fingerprint_prediction_paras
        if self.fingerprint_prediction_paras:
            _dict['fingerprintPredictionParas'] = self.fingerprint_prediction_paras.to_dict()
        # override the default output from pydantic by calling `to_dict()` of structure_db_search_paras
        if self.structure_db_search_paras:
            _dict['structureDbSearchParas'] = self.structure_db_search_paras.to_dict()
        # override the default output from pydantic by calling `to_dict()` of canopus_paras
        if self.canopus_paras:
            _dict['canopusParas'] = self.canopus_paras.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of JobSubmission from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "compoundIds": obj.get("compoundIds"),
            "fallbackAdducts": obj.get("fallbackAdducts"),
            "enforcedAdducts": obj.get("enforcedAdducts"),
            "detectableAdducts": obj.get("detectableAdducts"),
            "recompute": obj.get("recompute"),
            "formulaIdParas": Sirius.from_dict(obj["formulaIdParas"]) if obj.get("formulaIdParas") is not None else None,
            "zodiacParas": Zodiac.from_dict(obj["zodiacParas"]) if obj.get("zodiacParas") is not None else None,
            "fingerprintPredictionParas": FingerprintPrediction.from_dict(obj["fingerprintPredictionParas"]) if obj.get("fingerprintPredictionParas") is not None else None,
            "structureDbSearchParas": StructureDbSearch.from_dict(obj["structureDbSearchParas"]) if obj.get("structureDbSearchParas") is not None else None,
            "canopusParas": Canopus.from_dict(obj["canopusParas"]) if obj.get("canopusParas") is not None else None,
            "configMap": obj.get("configMap")
        })
        return _obj


