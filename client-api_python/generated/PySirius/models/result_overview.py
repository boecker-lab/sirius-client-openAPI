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

class ResultOverview(object):
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
        'sirius_score': 'float',
        'zodiac_score': 'float',
        'top_csi_score': 'float',
        'confidence_score': 'float',
        'canopus_result': 'bool'
    }

    attribute_map = {
        'sirius_score': 'siriusScore',
        'zodiac_score': 'zodiacScore',
        'top_csi_score': 'topCSIScore',
        'confidence_score': 'confidenceScore',
        'canopus_result': 'canopusResult'
    }

    def __init__(self, sirius_score=None, zodiac_score=None, top_csi_score=None, confidence_score=None, canopus_result=None):  # noqa: E501
        """ResultOverview - a model defined in Swagger"""  # noqa: E501
        self._sirius_score = None
        self._zodiac_score = None
        self._top_csi_score = None
        self._confidence_score = None
        self._canopus_result = None
        self.discriminator = None
        if sirius_score is not None:
            self.sirius_score = sirius_score
        if zodiac_score is not None:
            self.zodiac_score = zodiac_score
        if top_csi_score is not None:
            self.top_csi_score = top_csi_score
        if confidence_score is not None:
            self.confidence_score = confidence_score
        if canopus_result is not None:
            self.canopus_result = canopus_result

    @property
    def sirius_score(self):
        """Gets the sirius_score of this ResultOverview.  # noqa: E501

        Sirius Score (isotope + tree score) of the formula candidate.  If NULL result is not available  # noqa: E501

        :return: The sirius_score of this ResultOverview.  # noqa: E501
        :rtype: float
        """
        return self._sirius_score

    @sirius_score.setter
    def sirius_score(self, sirius_score):
        """Sets the sirius_score of this ResultOverview.

        Sirius Score (isotope + tree score) of the formula candidate.  If NULL result is not available  # noqa: E501

        :param sirius_score: The sirius_score of this ResultOverview.  # noqa: E501
        :type: float
        """

        self._sirius_score = sirius_score

    @property
    def zodiac_score(self):
        """Gets the zodiac_score of this ResultOverview.  # noqa: E501

        Zodiac Score of the formula candidate.  If NULL result is not available  # noqa: E501

        :return: The zodiac_score of this ResultOverview.  # noqa: E501
        :rtype: float
        """
        return self._zodiac_score

    @zodiac_score.setter
    def zodiac_score(self, zodiac_score):
        """Sets the zodiac_score of this ResultOverview.

        Zodiac Score of the formula candidate.  If NULL result is not available  # noqa: E501

        :param zodiac_score: The zodiac_score of this ResultOverview.  # noqa: E501
        :type: float
        """

        self._zodiac_score = zodiac_score

    @property
    def top_csi_score(self):
        """Gets the top_csi_score of this ResultOverview.  # noqa: E501

        CSI:FingerID Score of the top ranking structure candidate of the structure database search  performed for this formula candidate.  If NULL structure database result is not available or the structure candidate list is empty.  # noqa: E501

        :return: The top_csi_score of this ResultOverview.  # noqa: E501
        :rtype: float
        """
        return self._top_csi_score

    @top_csi_score.setter
    def top_csi_score(self, top_csi_score):
        """Sets the top_csi_score of this ResultOverview.

        CSI:FingerID Score of the top ranking structure candidate of the structure database search  performed for this formula candidate.  If NULL structure database result is not available or the structure candidate list is empty.  # noqa: E501

        :param top_csi_score: The top_csi_score of this ResultOverview.  # noqa: E501
        :type: float
        """

        self._top_csi_score = top_csi_score

    @property
    def confidence_score(self):
        """Gets the confidence_score of this ResultOverview.  # noqa: E501

        Confidence Score of the  IF NULL structure database result not available a structure candidate hit of another formula candidate is  the top ranking structure candidate.  # noqa: E501

        :return: The confidence_score of this ResultOverview.  # noqa: E501
        :rtype: float
        """
        return self._confidence_score

    @confidence_score.setter
    def confidence_score(self, confidence_score):
        """Sets the confidence_score of this ResultOverview.

        Confidence Score of the  IF NULL structure database result not available a structure candidate hit of another formula candidate is  the top ranking structure candidate.  # noqa: E501

        :param confidence_score: The confidence_score of this ResultOverview.  # noqa: E501
        :type: float
        """

        self._confidence_score = confidence_score

    @property
    def canopus_result(self):
        """Gets the canopus_result of this ResultOverview.  # noqa: E501

        True if Canopus compound class prediction results are available.  # noqa: E501

        :return: The canopus_result of this ResultOverview.  # noqa: E501
        :rtype: bool
        """
        return self._canopus_result

    @canopus_result.setter
    def canopus_result(self, canopus_result):
        """Sets the canopus_result of this ResultOverview.

        True if Canopus compound class prediction results are available.  # noqa: E501

        :param canopus_result: The canopus_result of this ResultOverview.  # noqa: E501
        :type: bool
        """

        self._canopus_result = canopus_result

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
        if issubclass(ResultOverview, dict):
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
        if not isinstance(other, ResultOverview):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
