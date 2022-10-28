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

class CollisionEnergy(object):
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
        'min_energy': 'float',
        'max_energy': 'float',
        'corrected': 'bool'
    }

    attribute_map = {
        'min_energy': 'minEnergy',
        'max_energy': 'maxEnergy',
        'corrected': 'corrected'
    }

    def __init__(self, min_energy=None, max_energy=None, corrected=None):  # noqa: E501
        """CollisionEnergy - a model defined in Swagger"""  # noqa: E501
        self._min_energy = None
        self._max_energy = None
        self._corrected = None
        self.discriminator = None
        if min_energy is not None:
            self.min_energy = min_energy
        if max_energy is not None:
            self.max_energy = max_energy
        if corrected is not None:
            self.corrected = corrected

    @property
    def min_energy(self):
        """Gets the min_energy of this CollisionEnergy.  # noqa: E501


        :return: The min_energy of this CollisionEnergy.  # noqa: E501
        :rtype: float
        """
        return self._min_energy

    @min_energy.setter
    def min_energy(self, min_energy):
        """Sets the min_energy of this CollisionEnergy.


        :param min_energy: The min_energy of this CollisionEnergy.  # noqa: E501
        :type: float
        """

        self._min_energy = min_energy

    @property
    def max_energy(self):
        """Gets the max_energy of this CollisionEnergy.  # noqa: E501


        :return: The max_energy of this CollisionEnergy.  # noqa: E501
        :rtype: float
        """
        return self._max_energy

    @max_energy.setter
    def max_energy(self, max_energy):
        """Sets the max_energy of this CollisionEnergy.


        :param max_energy: The max_energy of this CollisionEnergy.  # noqa: E501
        :type: float
        """

        self._max_energy = max_energy

    @property
    def corrected(self):
        """Gets the corrected of this CollisionEnergy.  # noqa: E501


        :return: The corrected of this CollisionEnergy.  # noqa: E501
        :rtype: bool
        """
        return self._corrected

    @corrected.setter
    def corrected(self, corrected):
        """Sets the corrected of this CollisionEnergy.


        :param corrected: The corrected of this CollisionEnergy.  # noqa: E501
        :type: bool
        """

        self._corrected = corrected

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
        if issubclass(CollisionEnergy, dict):
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
        if not isinstance(other, CollisionEnergy):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other