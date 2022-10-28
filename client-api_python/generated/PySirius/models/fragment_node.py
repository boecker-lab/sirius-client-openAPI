# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class FragmentNode(object):
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
        'id': 'int',
        'molecular_formula': 'str',
        'ion_type': 'str',
        'mass_deviation_da': 'float',
        'mass_error_ppm': 'float',
        'score': 'float',
        'intensity': 'float',
        'mz': 'float'
    }

    attribute_map = {
        'id': 'id',
        'molecular_formula': 'molecularFormula',
        'ion_type': 'ionType',
        'mass_deviation_da': 'massDeviationDa',
        'mass_error_ppm': 'massErrorPpm',
        'score': 'score',
        'intensity': 'intensity',
        'mz': 'mz'
    }

    def __init__(self, id=None, molecular_formula=None, ion_type=None, mass_deviation_da=None, mass_error_ppm=None, score=None, intensity=None, mz=None):  # noqa: E501
        """FragmentNode - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._molecular_formula = None
        self._ion_type = None
        self._mass_deviation_da = None
        self._mass_error_ppm = None
        self._score = None
        self._intensity = None
        self._mz = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if molecular_formula is not None:
            self.molecular_formula = molecular_formula
        if ion_type is not None:
            self.ion_type = ion_type
        if mass_deviation_da is not None:
            self.mass_deviation_da = mass_deviation_da
        if mass_error_ppm is not None:
            self.mass_error_ppm = mass_error_ppm
        if score is not None:
            self.score = score
        if intensity is not None:
            self.intensity = intensity
        if mz is not None:
            self.mz = mz

    @property
    def id(self):
        """Gets the id of this FragmentNode.  # noqa: E501


        :return: The id of this FragmentNode.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FragmentNode.


        :param id: The id of this FragmentNode.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def molecular_formula(self):
        """Gets the molecular_formula of this FragmentNode.  # noqa: E501


        :return: The molecular_formula of this FragmentNode.  # noqa: E501
        :rtype: str
        """
        return self._molecular_formula

    @molecular_formula.setter
    def molecular_formula(self, molecular_formula):
        """Sets the molecular_formula of this FragmentNode.


        :param molecular_formula: The molecular_formula of this FragmentNode.  # noqa: E501
        :type: str
        """

        self._molecular_formula = molecular_formula

    @property
    def ion_type(self):
        """Gets the ion_type of this FragmentNode.  # noqa: E501


        :return: The ion_type of this FragmentNode.  # noqa: E501
        :rtype: str
        """
        return self._ion_type

    @ion_type.setter
    def ion_type(self, ion_type):
        """Sets the ion_type of this FragmentNode.


        :param ion_type: The ion_type of this FragmentNode.  # noqa: E501
        :type: str
        """

        self._ion_type = ion_type

    @property
    def mass_deviation_da(self):
        """Gets the mass_deviation_da of this FragmentNode.  # noqa: E501


        :return: The mass_deviation_da of this FragmentNode.  # noqa: E501
        :rtype: float
        """
        return self._mass_deviation_da

    @mass_deviation_da.setter
    def mass_deviation_da(self, mass_deviation_da):
        """Sets the mass_deviation_da of this FragmentNode.


        :param mass_deviation_da: The mass_deviation_da of this FragmentNode.  # noqa: E501
        :type: float
        """

        self._mass_deviation_da = mass_deviation_da

    @property
    def mass_error_ppm(self):
        """Gets the mass_error_ppm of this FragmentNode.  # noqa: E501


        :return: The mass_error_ppm of this FragmentNode.  # noqa: E501
        :rtype: float
        """
        return self._mass_error_ppm

    @mass_error_ppm.setter
    def mass_error_ppm(self, mass_error_ppm):
        """Sets the mass_error_ppm of this FragmentNode.


        :param mass_error_ppm: The mass_error_ppm of this FragmentNode.  # noqa: E501
        :type: float
        """

        self._mass_error_ppm = mass_error_ppm

    @property
    def score(self):
        """Gets the score of this FragmentNode.  # noqa: E501


        :return: The score of this FragmentNode.  # noqa: E501
        :rtype: float
        """
        return self._score

    @score.setter
    def score(self, score):
        """Sets the score of this FragmentNode.


        :param score: The score of this FragmentNode.  # noqa: E501
        :type: float
        """

        self._score = score

    @property
    def intensity(self):
        """Gets the intensity of this FragmentNode.  # noqa: E501


        :return: The intensity of this FragmentNode.  # noqa: E501
        :rtype: float
        """
        return self._intensity

    @intensity.setter
    def intensity(self, intensity):
        """Sets the intensity of this FragmentNode.


        :param intensity: The intensity of this FragmentNode.  # noqa: E501
        :type: float
        """

        self._intensity = intensity

    @property
    def mz(self):
        """Gets the mz of this FragmentNode.  # noqa: E501


        :return: The mz of this FragmentNode.  # noqa: E501
        :rtype: float
        """
        return self._mz

    @mz.setter
    def mz(self, mz):
        """Sets the mz of this FragmentNode.


        :param mz: The mz of this FragmentNode.  # noqa: E501
        :type: float
        """

        self._mz = mz

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
        if issubclass(FragmentNode, dict):
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
        if not isinstance(other, FragmentNode):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
