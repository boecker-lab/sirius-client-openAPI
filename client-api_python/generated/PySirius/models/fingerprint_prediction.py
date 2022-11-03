# coding: utf-8

"""
    SIRIUS Nightsky API

    REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.  # noqa: E501

    OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six

class FingerprintPrediction(object):
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
        'use_score_threshold': 'bool'
    }

    attribute_map = {
        'enabled': 'enabled',
        'use_score_threshold': 'useScoreThreshold'
    }

    def __init__(self, enabled=None, use_score_threshold=None):  # noqa: E501
        """FingerprintPrediction - a model defined in Swagger"""  # noqa: E501
        self._enabled = None
        self._use_score_threshold = None
        self.discriminator = None
        if enabled is not None:
            self.enabled = enabled
        if use_score_threshold is not None:
            self.use_score_threshold = use_score_threshold

    @property
    def enabled(self):
        """Gets the enabled of this FingerprintPrediction.  # noqa: E501

        tags whether the tool is enabled  # noqa: E501

        :return: The enabled of this FingerprintPrediction.  # noqa: E501
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this FingerprintPrediction.

        tags whether the tool is enabled  # noqa: E501

        :param enabled: The enabled of this FingerprintPrediction.  # noqa: E501
        :type: bool
        """

        self._enabled = enabled

    @property
    def use_score_threshold(self):
        """Gets the use_score_threshold of this FingerprintPrediction.  # noqa: E501

        If true, an adaptive soft threshold will be applied to only compute Fingerprints for promising formula candidates  Enabling is highly recommended.  # noqa: E501

        :return: The use_score_threshold of this FingerprintPrediction.  # noqa: E501
        :rtype: bool
        """
        return self._use_score_threshold

    @use_score_threshold.setter
    def use_score_threshold(self, use_score_threshold):
        """Sets the use_score_threshold of this FingerprintPrediction.

        If true, an adaptive soft threshold will be applied to only compute Fingerprints for promising formula candidates  Enabling is highly recommended.  # noqa: E501

        :param use_score_threshold: The use_score_threshold of this FingerprintPrediction.  # noqa: E501
        :type: bool
        """

        self._use_score_threshold = use_score_threshold

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
        if issubclass(FingerprintPrediction, dict):
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
        if not isinstance(other, FingerprintPrediction):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
