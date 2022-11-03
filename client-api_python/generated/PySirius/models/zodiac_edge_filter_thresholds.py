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

class ZodiacEdgeFilterThresholds(object):
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
        'threshold_filter': 'float',
        'min_local_candidates': 'int',
        'min_local_connections': 'int',
        'identifier': 'str'
    }

    attribute_map = {
        'threshold_filter': 'thresholdFilter',
        'min_local_candidates': 'minLocalCandidates',
        'min_local_connections': 'minLocalConnections',
        'identifier': 'identifier'
    }

    def __init__(self, threshold_filter=None, min_local_candidates=None, min_local_connections=None, identifier=None):  # noqa: E501
        """ZodiacEdgeFilterThresholds - a model defined in Swagger"""  # noqa: E501
        self._threshold_filter = None
        self._min_local_candidates = None
        self._min_local_connections = None
        self._identifier = None
        self.discriminator = None
        if threshold_filter is not None:
            self.threshold_filter = threshold_filter
        if min_local_candidates is not None:
            self.min_local_candidates = min_local_candidates
        if min_local_connections is not None:
            self.min_local_connections = min_local_connections
        if identifier is not None:
            self.identifier = identifier

    @property
    def threshold_filter(self):
        """Gets the threshold_filter of this ZodiacEdgeFilterThresholds.  # noqa: E501


        :return: The threshold_filter of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :rtype: float
        """
        return self._threshold_filter

    @threshold_filter.setter
    def threshold_filter(self, threshold_filter):
        """Sets the threshold_filter of this ZodiacEdgeFilterThresholds.


        :param threshold_filter: The threshold_filter of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :type: float
        """

        self._threshold_filter = threshold_filter

    @property
    def min_local_candidates(self):
        """Gets the min_local_candidates of this ZodiacEdgeFilterThresholds.  # noqa: E501


        :return: The min_local_candidates of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :rtype: int
        """
        return self._min_local_candidates

    @min_local_candidates.setter
    def min_local_candidates(self, min_local_candidates):
        """Sets the min_local_candidates of this ZodiacEdgeFilterThresholds.


        :param min_local_candidates: The min_local_candidates of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :type: int
        """

        self._min_local_candidates = min_local_candidates

    @property
    def min_local_connections(self):
        """Gets the min_local_connections of this ZodiacEdgeFilterThresholds.  # noqa: E501


        :return: The min_local_connections of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :rtype: int
        """
        return self._min_local_connections

    @min_local_connections.setter
    def min_local_connections(self, min_local_connections):
        """Sets the min_local_connections of this ZodiacEdgeFilterThresholds.


        :param min_local_connections: The min_local_connections of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :type: int
        """

        self._min_local_connections = min_local_connections

    @property
    def identifier(self):
        """Gets the identifier of this ZodiacEdgeFilterThresholds.  # noqa: E501


        :return: The identifier of this ZodiacEdgeFilterThresholds.  # noqa: E501
        :rtype: str
        """
        return self._identifier

    @identifier.setter
    def identifier(self, identifier):
        """Sets the identifier of this ZodiacEdgeFilterThresholds.


        :param identifier: The identifier of this ZodiacEdgeFilterThresholds.  # noqa: E501
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
        if issubclass(ZodiacEdgeFilterThresholds, dict):
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
        if not isinstance(other, ZodiacEdgeFilterThresholds):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
