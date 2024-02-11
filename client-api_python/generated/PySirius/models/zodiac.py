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
from PySirius.models.zodiac_edge_filter_thresholds import ZodiacEdgeFilterThresholds  # noqa: F401,E501
from PySirius.models.zodiac_epochs import ZodiacEpochs  # noqa: F401,E501
from PySirius.models.zodiac_number_of_considered_candidates_at300_mz import ZodiacNumberOfConsideredCandidatesAt300Mz  # noqa: F401,E501
from PySirius.models.zodiac_number_of_considered_candidates_at800_mz import ZodiacNumberOfConsideredCandidatesAt800Mz  # noqa: F401,E501
from PySirius.models.zodiac_run_in_two_steps import ZodiacRunInTwoSteps  # noqa: F401,E501


class Zodiac(object):
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
        'considered_candidates_at300_mz': 'ZodiacNumberOfConsideredCandidatesAt300Mz',
        'considered_candidates_at800_mz': 'ZodiacNumberOfConsideredCandidatesAt800Mz',
        'run_in_two_steps': 'ZodiacRunInTwoSteps',
        'edge_filter_thresholds': 'ZodiacEdgeFilterThresholds',
        'gibbs_sampler_parameters': 'ZodiacEpochs'
    }

    attribute_map = {
        'enabled': 'enabled',
        'considered_candidates_at300_mz': 'consideredCandidatesAt300Mz',
        'considered_candidates_at800_mz': 'consideredCandidatesAt800Mz',
        'run_in_two_steps': 'runInTwoSteps',
        'edge_filter_thresholds': 'edgeFilterThresholds',
        'gibbs_sampler_parameters': 'gibbsSamplerParameters'
    }

    def __init__(self, enabled=None, considered_candidates_at300_mz=None, considered_candidates_at800_mz=None, run_in_two_steps=None, edge_filter_thresholds=None, gibbs_sampler_parameters=None):  # noqa: E501
        """Zodiac - a model defined in Swagger"""  # noqa: E501
        self._enabled = None
        self._considered_candidates_at300_mz = None
        self._considered_candidates_at800_mz = None
        self._run_in_two_steps = None
        self._edge_filter_thresholds = None
        self._gibbs_sampler_parameters = None
        self.discriminator = None
        if enabled is not None:
            self.enabled = enabled
        if considered_candidates_at300_mz is not None:
            self.considered_candidates_at300_mz = considered_candidates_at300_mz
        if considered_candidates_at800_mz is not None:
            self.considered_candidates_at800_mz = considered_candidates_at800_mz
        if run_in_two_steps is not None:
            self.run_in_two_steps = run_in_two_steps
        if edge_filter_thresholds is not None:
            self.edge_filter_thresholds = edge_filter_thresholds
        if gibbs_sampler_parameters is not None:
            self.gibbs_sampler_parameters = gibbs_sampler_parameters

    @property
    def enabled(self):
        """Gets the enabled of this Zodiac.  # noqa: E501

        tags whether the tool is enabled  # noqa: E501

        :return: The enabled of this Zodiac.  # noqa: E501
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this Zodiac.

        tags whether the tool is enabled  # noqa: E501

        :param enabled: The enabled of this Zodiac.  # noqa: E501
        :type: bool
        """

        self._enabled = enabled

    @property
    def considered_candidates_at300_mz(self):
        """Gets the considered_candidates_at300_mz of this Zodiac.  # noqa: E501


        :return: The considered_candidates_at300_mz of this Zodiac.  # noqa: E501
        :rtype: ZodiacNumberOfConsideredCandidatesAt300Mz
        """
        return self._considered_candidates_at300_mz

    @considered_candidates_at300_mz.setter
    def considered_candidates_at300_mz(self, considered_candidates_at300_mz):
        """Sets the considered_candidates_at300_mz of this Zodiac.


        :param considered_candidates_at300_mz: The considered_candidates_at300_mz of this Zodiac.  # noqa: E501
        :type: ZodiacNumberOfConsideredCandidatesAt300Mz
        """

        self._considered_candidates_at300_mz = considered_candidates_at300_mz

    @property
    def considered_candidates_at800_mz(self):
        """Gets the considered_candidates_at800_mz of this Zodiac.  # noqa: E501


        :return: The considered_candidates_at800_mz of this Zodiac.  # noqa: E501
        :rtype: ZodiacNumberOfConsideredCandidatesAt800Mz
        """
        return self._considered_candidates_at800_mz

    @considered_candidates_at800_mz.setter
    def considered_candidates_at800_mz(self, considered_candidates_at800_mz):
        """Sets the considered_candidates_at800_mz of this Zodiac.


        :param considered_candidates_at800_mz: The considered_candidates_at800_mz of this Zodiac.  # noqa: E501
        :type: ZodiacNumberOfConsideredCandidatesAt800Mz
        """

        self._considered_candidates_at800_mz = considered_candidates_at800_mz

    @property
    def run_in_two_steps(self):
        """Gets the run_in_two_steps of this Zodiac.  # noqa: E501


        :return: The run_in_two_steps of this Zodiac.  # noqa: E501
        :rtype: ZodiacRunInTwoSteps
        """
        return self._run_in_two_steps

    @run_in_two_steps.setter
    def run_in_two_steps(self, run_in_two_steps):
        """Sets the run_in_two_steps of this Zodiac.


        :param run_in_two_steps: The run_in_two_steps of this Zodiac.  # noqa: E501
        :type: ZodiacRunInTwoSteps
        """

        self._run_in_two_steps = run_in_two_steps

    @property
    def edge_filter_thresholds(self):
        """Gets the edge_filter_thresholds of this Zodiac.  # noqa: E501


        :return: The edge_filter_thresholds of this Zodiac.  # noqa: E501
        :rtype: ZodiacEdgeFilterThresholds
        """
        return self._edge_filter_thresholds

    @edge_filter_thresholds.setter
    def edge_filter_thresholds(self, edge_filter_thresholds):
        """Sets the edge_filter_thresholds of this Zodiac.


        :param edge_filter_thresholds: The edge_filter_thresholds of this Zodiac.  # noqa: E501
        :type: ZodiacEdgeFilterThresholds
        """

        self._edge_filter_thresholds = edge_filter_thresholds

    @property
    def gibbs_sampler_parameters(self):
        """Gets the gibbs_sampler_parameters of this Zodiac.  # noqa: E501


        :return: The gibbs_sampler_parameters of this Zodiac.  # noqa: E501
        :rtype: ZodiacEpochs
        """
        return self._gibbs_sampler_parameters

    @gibbs_sampler_parameters.setter
    def gibbs_sampler_parameters(self, gibbs_sampler_parameters):
        """Sets the gibbs_sampler_parameters of this Zodiac.


        :param gibbs_sampler_parameters: The gibbs_sampler_parameters of this Zodiac.  # noqa: E501
        :type: ZodiacEpochs
        """

        self._gibbs_sampler_parameters = gibbs_sampler_parameters

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
        if issubclass(Zodiac, dict):
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
        if not isinstance(other, Zodiac):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
