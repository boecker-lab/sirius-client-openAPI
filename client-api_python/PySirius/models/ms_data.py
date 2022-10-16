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

class MsData(object):
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
        'merged_ms1': 'AnnotatedSpectrum',
        'merged_ms2': 'AnnotatedSpectrum',
        'ms2_spectra': 'list[AnnotatedSpectrum]',
        'ms1_spectra': 'list[AnnotatedSpectrum]'
    }

    attribute_map = {
        'merged_ms1': 'mergedMs1',
        'merged_ms2': 'mergedMs2',
        'ms2_spectra': 'ms2Spectra',
        'ms1_spectra': 'ms1Spectra'
    }

    def __init__(self, merged_ms1=None, merged_ms2=None, ms2_spectra=None, ms1_spectra=None):  # noqa: E501
        """MsData - a model defined in Swagger"""  # noqa: E501
        self._merged_ms1 = None
        self._merged_ms2 = None
        self._ms2_spectra = None
        self._ms1_spectra = None
        self.discriminator = None
        if merged_ms1 is not None:
            self.merged_ms1 = merged_ms1
        if merged_ms2 is not None:
            self.merged_ms2 = merged_ms2
        if ms2_spectra is not None:
            self.ms2_spectra = ms2_spectra
        if ms1_spectra is not None:
            self.ms1_spectra = ms1_spectra

    @property
    def merged_ms1(self):
        """Gets the merged_ms1 of this MsData.  # noqa: E501


        :return: The merged_ms1 of this MsData.  # noqa: E501
        :rtype: AnnotatedSpectrum
        """
        return self._merged_ms1

    @merged_ms1.setter
    def merged_ms1(self, merged_ms1):
        """Sets the merged_ms1 of this MsData.


        :param merged_ms1: The merged_ms1 of this MsData.  # noqa: E501
        :type: AnnotatedSpectrum
        """

        self._merged_ms1 = merged_ms1

    @property
    def merged_ms2(self):
        """Gets the merged_ms2 of this MsData.  # noqa: E501


        :return: The merged_ms2 of this MsData.  # noqa: E501
        :rtype: AnnotatedSpectrum
        """
        return self._merged_ms2

    @merged_ms2.setter
    def merged_ms2(self, merged_ms2):
        """Sets the merged_ms2 of this MsData.


        :param merged_ms2: The merged_ms2 of this MsData.  # noqa: E501
        :type: AnnotatedSpectrum
        """

        self._merged_ms2 = merged_ms2

    @property
    def ms2_spectra(self):
        """Gets the ms2_spectra of this MsData.  # noqa: E501


        :return: The ms2_spectra of this MsData.  # noqa: E501
        :rtype: list[AnnotatedSpectrum]
        """
        return self._ms2_spectra

    @ms2_spectra.setter
    def ms2_spectra(self, ms2_spectra):
        """Sets the ms2_spectra of this MsData.


        :param ms2_spectra: The ms2_spectra of this MsData.  # noqa: E501
        :type: list[AnnotatedSpectrum]
        """

        self._ms2_spectra = ms2_spectra

    @property
    def ms1_spectra(self):
        """Gets the ms1_spectra of this MsData.  # noqa: E501


        :return: The ms1_spectra of this MsData.  # noqa: E501
        :rtype: list[AnnotatedSpectrum]
        """
        return self._ms1_spectra

    @ms1_spectra.setter
    def ms1_spectra(self, ms1_spectra):
        """Sets the ms1_spectra of this MsData.


        :param ms1_spectra: The ms1_spectra of this MsData.  # noqa: E501
        :type: list[AnnotatedSpectrum]
        """

        self._ms1_spectra = ms1_spectra

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
        if issubclass(MsData, dict):
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
        if not isinstance(other, MsData):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
