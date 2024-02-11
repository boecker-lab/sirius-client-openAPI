# coding: utf-8

"""
    SIRIUS Nightsky API

    OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.  # noqa: E501

    OpenAPI spec version: 0.9
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six
from PySirius.models.canopus import Canopus  # noqa: F401,E501
from PySirius.models.fingerprint_prediction import FingerprintPrediction  # noqa: F401,E501
from PySirius.models.sirius import Sirius  # noqa: F401,E501
from PySirius.models.structure_db_search import StructureDbSearch  # noqa: F401,E501
from PySirius.models.zodiac import Zodiac  # noqa: F401,E501


class JobSubmission(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'compound_ids': 'list[str]',
        'fallback_adducts': 'list[str]',
        'enforced_adducts': 'list[str]',
        'detectable_adducts': 'list[str]',
        'recompute': 'bool',
        'formula_id_paras': 'Sirius',
        'zodiac_paras': 'Zodiac',
        'fingerprint_prediction_paras': 'FingerprintPrediction',
        'structure_db_search_paras': 'StructureDbSearch',
        'canopus_paras': 'Canopus',
        'config_map': 'dict(str, str)'
    }

    attribute_map = {
        'compound_ids': 'compoundIds',
        'fallback_adducts': 'fallbackAdducts',
        'enforced_adducts': 'enforcedAdducts',
        'detectable_adducts': 'detectableAdducts',
        'recompute': 'recompute',
        'formula_id_paras': 'formulaIdParas',
        'zodiac_paras': 'zodiacParas',
        'fingerprint_prediction_paras': 'fingerprintPredictionParas',
        'structure_db_search_paras': 'structureDbSearchParas',
        'canopus_paras': 'canopusParas',
        'config_map': 'configMap'
    }

    def __init__(self, compound_ids=None, fallback_adducts=None, enforced_adducts=None, detectable_adducts=None, recompute=None, formula_id_paras=None, zodiac_paras=None, fingerprint_prediction_paras=None, structure_db_search_paras=None, canopus_paras=None, config_map=None):  # noqa: E501
        """JobSubmission - a model defined in Swagger"""  # noqa: E501
        self._compound_ids = None
        self._fallback_adducts = None
        self._enforced_adducts = None
        self._detectable_adducts = None
        self._recompute = None
        self._formula_id_paras = None
        self._zodiac_paras = None
        self._fingerprint_prediction_paras = None
        self._structure_db_search_paras = None
        self._canopus_paras = None
        self._config_map = None
        self.discriminator = None
        if compound_ids is not None:
            self.compound_ids = compound_ids
        if fallback_adducts is not None:
            self.fallback_adducts = fallback_adducts
        if enforced_adducts is not None:
            self.enforced_adducts = enforced_adducts
        if detectable_adducts is not None:
            self.detectable_adducts = detectable_adducts
        if recompute is not None:
            self.recompute = recompute
        if formula_id_paras is not None:
            self.formula_id_paras = formula_id_paras
        if zodiac_paras is not None:
            self.zodiac_paras = zodiac_paras
        if fingerprint_prediction_paras is not None:
            self.fingerprint_prediction_paras = fingerprint_prediction_paras
        if structure_db_search_paras is not None:
            self.structure_db_search_paras = structure_db_search_paras
        if canopus_paras is not None:
            self.canopus_paras = canopus_paras
        if config_map is not None:
            self.config_map = config_map

    @property
    def compound_ids(self):
        """Gets the compound_ids of this JobSubmission.  # noqa: E501

        Compounds that should be the input for this Job  # noqa: E501

        :return: The compound_ids of this JobSubmission.  # noqa: E501
        :rtype: list[str]
        """
        return self._compound_ids

    @compound_ids.setter
    def compound_ids(self, compound_ids):
        """Sets the compound_ids of this JobSubmission.

        Compounds that should be the input for this Job  # noqa: E501

        :param compound_ids: The compound_ids of this JobSubmission.  # noqa: E501
        :type: list[str]
        """

        self._compound_ids = compound_ids

    @property
    def fallback_adducts(self):
        """Gets the fallback_adducts of this JobSubmission.  # noqa: E501

        Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-  # noqa: E501

        :return: The fallback_adducts of this JobSubmission.  # noqa: E501
        :rtype: list[str]
        """
        return self._fallback_adducts

    @fallback_adducts.setter
    def fallback_adducts(self, fallback_adducts):
        """Sets the fallback_adducts of this JobSubmission.

        Describes how to deal with Adducts: Fallback adducts are considered if the auto detection did not find any indication for an ion mode.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-  # noqa: E501

        :param fallback_adducts: The fallback_adducts of this JobSubmission.  # noqa: E501
        :type: list[str]
        """

        self._fallback_adducts = fallback_adducts

    @property
    def enforced_adducts(self):
        """Gets the enforced_adducts of this JobSubmission.  # noqa: E501

        Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-  # noqa: E501

        :return: The enforced_adducts of this JobSubmission.  # noqa: E501
        :rtype: list[str]
        """
        return self._enforced_adducts

    @enforced_adducts.setter
    def enforced_adducts(self, enforced_adducts):
        """Sets the enforced_adducts of this JobSubmission.

        Describes how to deal with Adducts:  Enforced adducts that are always considered.  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-  # noqa: E501

        :param enforced_adducts: The enforced_adducts of this JobSubmission.  # noqa: E501
        :type: list[str]
        """

        self._enforced_adducts = enforced_adducts

    @property
    def detectable_adducts(self):
        """Gets the detectable_adducts of this JobSubmission.  # noqa: E501

        Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-  # noqa: E501

        :return: The detectable_adducts of this JobSubmission.  # noqa: E501
        :rtype: list[str]
        """
        return self._detectable_adducts

    @detectable_adducts.setter
    def detectable_adducts(self, detectable_adducts):
        """Sets the detectable_adducts of this JobSubmission.

        Describes how to deal with Adducts: Detectable adducts which are only considered if there is an indication in the MS1 scan (e.g. correct mass delta).  Pos Examples: [M+H]+,[M]+,[M+K]+,[M+Na]+,[M+H-H2O]+,[M+Na2-H]+,[M+2K-H]+,[M+NH4]+,[M+H3O]+,[M+MeOH+H]+,[M+ACN+H]+,[M+2ACN+H]+,[M+IPA+H]+,[M+ACN+Na]+,[M+DMSO+H]+  Neg Examples: [M-H]-,[M]-,[M+K-2H]-,[M+Cl]-,[M-H2O-H]-,[M+Na-2H]-,M+FA-H]-,[M+Br]-,[M+HAc-H]-,[M+TFA-H]-,[M+ACN-H]-  # noqa: E501

        :param detectable_adducts: The detectable_adducts of this JobSubmission.  # noqa: E501
        :type: list[str]
        """

        self._detectable_adducts = detectable_adducts

    @property
    def recompute(self):
        """Gets the recompute of this JobSubmission.  # noqa: E501

        Indicate if already existing result for a tool to be executed should be overwritten or not.  # noqa: E501

        :return: The recompute of this JobSubmission.  # noqa: E501
        :rtype: bool
        """
        return self._recompute

    @recompute.setter
    def recompute(self, recompute):
        """Sets the recompute of this JobSubmission.

        Indicate if already existing result for a tool to be executed should be overwritten or not.  # noqa: E501

        :param recompute: The recompute of this JobSubmission.  # noqa: E501
        :type: bool
        """

        self._recompute = recompute

    @property
    def formula_id_paras(self):
        """Gets the formula_id_paras of this JobSubmission.  # noqa: E501


        :return: The formula_id_paras of this JobSubmission.  # noqa: E501
        :rtype: Sirius
        """
        return self._formula_id_paras

    @formula_id_paras.setter
    def formula_id_paras(self, formula_id_paras):
        """Sets the formula_id_paras of this JobSubmission.


        :param formula_id_paras: The formula_id_paras of this JobSubmission.  # noqa: E501
        :type: Sirius
        """

        self._formula_id_paras = formula_id_paras

    @property
    def zodiac_paras(self):
        """Gets the zodiac_paras of this JobSubmission.  # noqa: E501


        :return: The zodiac_paras of this JobSubmission.  # noqa: E501
        :rtype: Zodiac
        """
        return self._zodiac_paras

    @zodiac_paras.setter
    def zodiac_paras(self, zodiac_paras):
        """Sets the zodiac_paras of this JobSubmission.


        :param zodiac_paras: The zodiac_paras of this JobSubmission.  # noqa: E501
        :type: Zodiac
        """

        self._zodiac_paras = zodiac_paras

    @property
    def fingerprint_prediction_paras(self):
        """Gets the fingerprint_prediction_paras of this JobSubmission.  # noqa: E501


        :return: The fingerprint_prediction_paras of this JobSubmission.  # noqa: E501
        :rtype: FingerprintPrediction
        """
        return self._fingerprint_prediction_paras

    @fingerprint_prediction_paras.setter
    def fingerprint_prediction_paras(self, fingerprint_prediction_paras):
        """Sets the fingerprint_prediction_paras of this JobSubmission.


        :param fingerprint_prediction_paras: The fingerprint_prediction_paras of this JobSubmission.  # noqa: E501
        :type: FingerprintPrediction
        """

        self._fingerprint_prediction_paras = fingerprint_prediction_paras

    @property
    def structure_db_search_paras(self):
        """Gets the structure_db_search_paras of this JobSubmission.  # noqa: E501


        :return: The structure_db_search_paras of this JobSubmission.  # noqa: E501
        :rtype: StructureDbSearch
        """
        return self._structure_db_search_paras

    @structure_db_search_paras.setter
    def structure_db_search_paras(self, structure_db_search_paras):
        """Sets the structure_db_search_paras of this JobSubmission.


        :param structure_db_search_paras: The structure_db_search_paras of this JobSubmission.  # noqa: E501
        :type: StructureDbSearch
        """

        self._structure_db_search_paras = structure_db_search_paras

    @property
    def canopus_paras(self):
        """Gets the canopus_paras of this JobSubmission.  # noqa: E501


        :return: The canopus_paras of this JobSubmission.  # noqa: E501
        :rtype: Canopus
        """
        return self._canopus_paras

    @canopus_paras.setter
    def canopus_paras(self, canopus_paras):
        """Sets the canopus_paras of this JobSubmission.


        :param canopus_paras: The canopus_paras of this JobSubmission.  # noqa: E501
        :type: Canopus
        """

        self._canopus_paras = canopus_paras

    @property
    def config_map(self):
        """Gets the config_map of this JobSubmission.  # noqa: E501

        As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.  # noqa: E501

        :return: The config_map of this JobSubmission.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._config_map

    @config_map.setter
    def config_map(self, config_map):
        """Sets the config_map of this JobSubmission.

        As an alternative to the object based parameters, this map allows to store key value pairs  of ALL SIRIUS parameters. All possible parameters can be retrieved from SIRIUS via the respective endpoint.  # noqa: E501

        :param config_map: The config_map of this JobSubmission.  # noqa: E501
        :type: dict(str, str)
        """

        self._config_map = config_map

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(JobSubmission, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, JobSubmission):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
