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

class Deviation(object):
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
        'ppm': 'float',
        'absolute': 'float',
        'identifier': 'str'
    }

    attribute_map = {
        'ppm': 'ppm',
        'absolute': 'absolute',
        'identifier': 'identifier'
    }

    def __init__(self, ppm=None, absolute=None, identifier=None):  # noqa: E501
        """Deviation - a model defined in Swagger"""  # noqa: E501
        self._ppm = None
        self._absolute = None
        self._identifier = None
        self.discriminator = None
        if ppm is not None:
            self.ppm = ppm
        if absolute is not None:
            self.absolute = absolute
        if identifier is not None:
            self.identifier = identifier

    @property
    def ppm(self):
        """Gets the ppm of this Deviation.  # noqa: E501


        :return: The ppm of this Deviation.  # noqa: E501
        :rtype: float
        """
        return self._ppm

    @ppm.setter
    def ppm(self, ppm):
        """Sets the ppm of this Deviation.


        :param ppm: The ppm of this Deviation.  # noqa: E501
        :type: float
        """

        self._ppm = ppm

    @property
    def absolute(self):
        """Gets the absolute of this Deviation.  # noqa: E501


        :return: The absolute of this Deviation.  # noqa: E501
        :rtype: float
        """
        return self._absolute

    @absolute.setter
    def absolute(self, absolute):
        """Sets the absolute of this Deviation.


        :param absolute: The absolute of this Deviation.  # noqa: E501
        :type: float
        """

        self._absolute = absolute

    @property
    def identifier(self):
        """Gets the identifier of this Deviation.  # noqa: E501


        :return: The identifier of this Deviation.  # noqa: E501
        :rtype: str
        """
        return self._identifier

    @identifier.setter
    def identifier(self, identifier):
        """Sets the identifier of this Deviation.


        :param identifier: The identifier of this Deviation.  # noqa: E501
        :type: str
        """

        self._identifier = identifier

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
        if issubclass(Deviation, dict):
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
        if not isinstance(other, Deviation):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
