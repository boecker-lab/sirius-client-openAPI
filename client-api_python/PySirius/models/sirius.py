# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class Sirius(object):
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
        'enabled': 'bool',
        'profile': 'str',
        'number_of_candidates': 'int',
        'number_of_candidates_per_ion': 'int',
        'mass_accuracy_ms2ppm': 'float',
        'isotope_ms2_settings': 'str',
        'formula_search_d_bs': 'list[str]',
        'enforced_formula_constraints': 'str',
        'fallback_formula_constraints': 'str',
        'detectable_elements': 'list[str]',
        'ilp_timeout': 'Timeout',
        'use_heuristic': 'UseHeuristic'
    }

    attribute_map = {
        'enabled': 'enabled',
        'profile': 'profile',
        'number_of_candidates': 'numberOfCandidates',
        'number_of_candidates_per_ion': 'numberOfCandidatesPerIon',
        'mass_accuracy_ms2ppm': 'massAccuracyMS2ppm',
        'isotope_ms2_settings': 'isotopeMs2Settings',
        'formula_search_d_bs': 'formulaSearchDBs',
        'enforced_formula_constraints': 'enforcedFormulaConstraints',
        'fallback_formula_constraints': 'fallbackFormulaConstraints',
        'detectable_elements': 'detectableElements',
        'ilp_timeout': 'ilpTimeout',
        'use_heuristic': 'useHeuristic'
    }

    def __init__(self, enabled=None, profile=None, number_of_candidates=None, number_of_candidates_per_ion=None, mass_accuracy_ms2ppm=None, isotope_ms2_settings=None, formula_search_d_bs=None, enforced_formula_constraints=None, fallback_formula_constraints=None, detectable_elements=None, ilp_timeout=None, use_heuristic=None):  # noqa: E501
        """Sirius - a model defined in Swagger"""  # noqa: E501
        self._enabled = None
        self._profile = None
        self._number_of_candidates = None
        self._number_of_candidates_per_ion = None
        self._mass_accuracy_ms2ppm = None
        self._isotope_ms2_settings = None
        self._formula_search_d_bs = None
        self._enforced_formula_constraints = None
        self._fallback_formula_constraints = None
        self._detectable_elements = None
        self._ilp_timeout = None
        self._use_heuristic = None
        self.discriminator = None
        if enabled is not None:
            self.enabled = enabled
        if profile is not None:
            self.profile = profile
        if number_of_candidates is not None:
            self.number_of_candidates = number_of_candidates
        if number_of_candidates_per_ion is not None:
            self.number_of_candidates_per_ion = number_of_candidates_per_ion
        if mass_accuracy_ms2ppm is not None:
            self.mass_accuracy_ms2ppm = mass_accuracy_ms2ppm
        if isotope_ms2_settings is not None:
            self.isotope_ms2_settings = isotope_ms2_settings
        if formula_search_d_bs is not None:
            self.formula_search_d_bs = formula_search_d_bs
        if enforced_formula_constraints is not None:
            self.enforced_formula_constraints = enforced_formula_constraints
        if fallback_formula_constraints is not None:
            self.fallback_formula_constraints = fallback_formula_constraints
        if detectable_elements is not None:
            self.detectable_elements = detectable_elements
        if ilp_timeout is not None:
            self.ilp_timeout = ilp_timeout
        if use_heuristic is not None:
            self.use_heuristic = use_heuristic

    @property
    def enabled(self):
        """Gets the enabled of this Sirius.  # noqa: E501

        tags whether the tool is enabled  # noqa: E501

        :return: The enabled of this Sirius.  # noqa: E501
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this Sirius.

        tags whether the tool is enabled  # noqa: E501

        :param enabled: The enabled of this Sirius.  # noqa: E501
        :type: bool
        """

        self._enabled = enabled

    @property
    def profile(self):
        """Gets the profile of this Sirius.  # noqa: E501

        Instrument specific profile for internal algorithms  Just select what comes closest to the instrument that was used for measuring the data.  # noqa: E501

        :return: The profile of this Sirius.  # noqa: E501
        :rtype: str
        """
        return self._profile

    @profile.setter
    def profile(self, profile):
        """Sets the profile of this Sirius.

        Instrument specific profile for internal algorithms  Just select what comes closest to the instrument that was used for measuring the data.  # noqa: E501

        :param profile: The profile of this Sirius.  # noqa: E501
        :type: str
        """
        allowed_values = ["QTOF", "ORBI", "FTICR"]  # noqa: E501
        if profile not in allowed_values:
            raise ValueError(
                "Invalid value for `profile` ({0}), must be one of {1}"  # noqa: E501
                .format(profile, allowed_values)
            )

        self._profile = profile

    @property
    def number_of_candidates(self):
        """Gets the number_of_candidates of this Sirius.  # noqa: E501

        Number of formula candidates to keep as result list (Formula Candidates).  # noqa: E501

        :return: The number_of_candidates of this Sirius.  # noqa: E501
        :rtype: int
        """
        return self._number_of_candidates

    @number_of_candidates.setter
    def number_of_candidates(self, number_of_candidates):
        """Sets the number_of_candidates of this Sirius.

        Number of formula candidates to keep as result list (Formula Candidates).  # noqa: E501

        :param number_of_candidates: The number_of_candidates of this Sirius.  # noqa: E501
        :type: int
        """

        self._number_of_candidates = number_of_candidates

    @property
    def number_of_candidates_per_ion(self):
        """Gets the number_of_candidates_per_ion of this Sirius.  # noqa: E501

        Use this parameter if you want to force SIRIUS to report at least  NumberOfCandidatesPerIon results per ionization.  if <= 0, this parameter will have no effect and just the top  NumberOfCandidates results will be reported.  # noqa: E501

        :return: The number_of_candidates_per_ion of this Sirius.  # noqa: E501
        :rtype: int
        """
        return self._number_of_candidates_per_ion

    @number_of_candidates_per_ion.setter
    def number_of_candidates_per_ion(self, number_of_candidates_per_ion):
        """Sets the number_of_candidates_per_ion of this Sirius.

        Use this parameter if you want to force SIRIUS to report at least  NumberOfCandidatesPerIon results per ionization.  if <= 0, this parameter will have no effect and just the top  NumberOfCandidates results will be reported.  # noqa: E501

        :param number_of_candidates_per_ion: The number_of_candidates_per_ion of this Sirius.  # noqa: E501
        :type: int
        """

        self._number_of_candidates_per_ion = number_of_candidates_per_ion

    @property
    def mass_accuracy_ms2ppm(self):
        """Gets the mass_accuracy_ms2ppm of this Sirius.  # noqa: E501

        Maximum allowed mass accuracy. Only molecular formulas within this mass window are considered.  # noqa: E501

        :return: The mass_accuracy_ms2ppm of this Sirius.  # noqa: E501
        :rtype: float
        """
        return self._mass_accuracy_ms2ppm

    @mass_accuracy_ms2ppm.setter
    def mass_accuracy_ms2ppm(self, mass_accuracy_ms2ppm):
        """Sets the mass_accuracy_ms2ppm of this Sirius.

        Maximum allowed mass accuracy. Only molecular formulas within this mass window are considered.  # noqa: E501

        :param mass_accuracy_ms2ppm: The mass_accuracy_ms2ppm of this Sirius.  # noqa: E501
        :type: float
        """

        self._mass_accuracy_ms2ppm = mass_accuracy_ms2ppm

    @property
    def isotope_ms2_settings(self):
        """Gets the isotope_ms2_settings of this Sirius.  # noqa: E501

        Specify how isotope patterns in MS/MS should be handled.  <p>  FILTER: When filtering is enabled, molecular formulas are excluded if their  theoretical isotope pattern does not match the theoretical one, even if their MS/MS pattern has high score.  <p>  SCORE: Use them for SCORING. To use this the instrument should produce clear MS/MS isotope patterns  <p>  IGNORE: Ignore that there might be isotope patterns in MS/MS  # noqa: E501

        :return: The isotope_ms2_settings of this Sirius.  # noqa: E501
        :rtype: str
        """
        return self._isotope_ms2_settings

    @isotope_ms2_settings.setter
    def isotope_ms2_settings(self, isotope_ms2_settings):
        """Sets the isotope_ms2_settings of this Sirius.

        Specify how isotope patterns in MS/MS should be handled.  <p>  FILTER: When filtering is enabled, molecular formulas are excluded if their  theoretical isotope pattern does not match the theoretical one, even if their MS/MS pattern has high score.  <p>  SCORE: Use them for SCORING. To use this the instrument should produce clear MS/MS isotope patterns  <p>  IGNORE: Ignore that there might be isotope patterns in MS/MS  # noqa: E501

        :param isotope_ms2_settings: The isotope_ms2_settings of this Sirius.  # noqa: E501
        :type: str
        """
        allowed_values = ["IGNORE", "FILTER", "SCORE"]  # noqa: E501
        if isotope_ms2_settings not in allowed_values:
            raise ValueError(
                "Invalid value for `isotope_ms2_settings` ({0}), must be one of {1}"  # noqa: E501
                .format(isotope_ms2_settings, allowed_values)
            )

        self._isotope_ms2_settings = isotope_ms2_settings

    @property
    def formula_search_d_bs(self):
        """Gets the formula_search_d_bs of this Sirius.  # noqa: E501

        List Structure database to extract molecular formulas from to reduce formula search space.  SIRIUS is quite good at de novo formula annotation, so only enable if you have a good reason.  # noqa: E501

        :return: The formula_search_d_bs of this Sirius.  # noqa: E501
        :rtype: list[str]
        """
        return self._formula_search_d_bs

    @formula_search_d_bs.setter
    def formula_search_d_bs(self, formula_search_d_bs):
        """Sets the formula_search_d_bs of this Sirius.

        List Structure database to extract molecular formulas from to reduce formula search space.  SIRIUS is quite good at de novo formula annotation, so only enable if you have a good reason.  # noqa: E501

        :param formula_search_d_bs: The formula_search_d_bs of this Sirius.  # noqa: E501
        :type: list[str]
        """
        allowed_values = ["ALL", "ALL_BUT_INSILICO", "PUBCHEM", "MESH", "HMDB", "KNAPSACK", "CHEBI", "PUBMED", "BIO", "KEGG", "HSDB", "MACONDA", "METACYC", "GNPS", "ZINCBIO", "TRAIN", "UNDP", "YMDB", "PLANTCYC", "NORMAN", "ADDITIONAL", "SUPERNATURAL", "COCONUT", "PUBCHEMANNOTATIONBIO", "PUBCHEMANNOTATIONDRUG", "PUBCHEMANNOTATIONSAFETYANDTOXIC", "PUBCHEMANNOTATIONFOOD", "LIPID", "KEGGMINE", "ECOCYCMINE", "YMDBMINE"]  # noqa: E501
        if not set(formula_search_d_bs).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `formula_search_d_bs` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(formula_search_d_bs) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._formula_search_d_bs = formula_search_d_bs

    @property
    def enforced_formula_constraints(self):
        """Gets the enforced_formula_constraints of this Sirius.  # noqa: E501

        These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Enforced: Enforced elements are always considered  # noqa: E501

        :return: The enforced_formula_constraints of this Sirius.  # noqa: E501
        :rtype: str
        """
        return self._enforced_formula_constraints

    @enforced_formula_constraints.setter
    def enforced_formula_constraints(self, enforced_formula_constraints):
        """Sets the enforced_formula_constraints of this Sirius.

        These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Enforced: Enforced elements are always considered  # noqa: E501

        :param enforced_formula_constraints: The enforced_formula_constraints of this Sirius.  # noqa: E501
        :type: str
        """

        self._enforced_formula_constraints = enforced_formula_constraints

    @property
    def fallback_formula_constraints(self):
        """Gets the fallback_formula_constraints of this Sirius.  # noqa: E501

        These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Fallback: Fallback elements are used, if the auto-detection fails (e.g. no isotope pattern available)  # noqa: E501

        :return: The fallback_formula_constraints of this Sirius.  # noqa: E501
        :rtype: str
        """
        return self._fallback_formula_constraints

    @fallback_formula_constraints.setter
    def fallback_formula_constraints(self, fallback_formula_constraints):
        """Sets the fallback_formula_constraints of this Sirius.

        These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Fallback: Fallback elements are used, if the auto-detection fails (e.g. no isotope pattern available)  # noqa: E501

        :param fallback_formula_constraints: The fallback_formula_constraints of this Sirius.  # noqa: E501
        :type: str
        """

        self._fallback_formula_constraints = fallback_formula_constraints

    @property
    def detectable_elements(self):
        """Gets the detectable_elements of this Sirius.  # noqa: E501

        These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Detectable: Detectable elements are added to the chemical alphabet, if there are indications for them (e.g. in isotope pattern)  # noqa: E501

        :return: The detectable_elements of this Sirius.  # noqa: E501
        :rtype: list[str]
        """
        return self._detectable_elements

    @detectable_elements.setter
    def detectable_elements(self, detectable_elements):
        """Sets the detectable_elements of this Sirius.

        These configurations hold the information how to autodetect elements based on the given formula constraints.  Note: If the compound is already assigned to a specific molecular formula, this annotation is ignored.  <p>  Detectable: Detectable elements are added to the chemical alphabet, if there are indications for them (e.g. in isotope pattern)  # noqa: E501

        :param detectable_elements: The detectable_elements of this Sirius.  # noqa: E501
        :type: list[str]
        """

        self._detectable_elements = detectable_elements

    @property
    def ilp_timeout(self):
        """Gets the ilp_timeout of this Sirius.  # noqa: E501


        :return: The ilp_timeout of this Sirius.  # noqa: E501
        :rtype: Timeout
        """
        return self._ilp_timeout

    @ilp_timeout.setter
    def ilp_timeout(self, ilp_timeout):
        """Sets the ilp_timeout of this Sirius.


        :param ilp_timeout: The ilp_timeout of this Sirius.  # noqa: E501
        :type: Timeout
        """

        self._ilp_timeout = ilp_timeout

    @property
    def use_heuristic(self):
        """Gets the use_heuristic of this Sirius.  # noqa: E501


        :return: The use_heuristic of this Sirius.  # noqa: E501
        :rtype: UseHeuristic
        """
        return self._use_heuristic

    @use_heuristic.setter
    def use_heuristic(self, use_heuristic):
        """Sets the use_heuristic of this Sirius.


        :param use_heuristic: The use_heuristic of this Sirius.  # noqa: E501
        :type: UseHeuristic
        """

        self._use_heuristic = use_heuristic

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
        if issubclass(Sirius, dict):
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
        if not isinstance(other, Sirius):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
