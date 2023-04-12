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

class JobId(object):
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
        'id': 'str',
        'command': 'str',
        'progress': 'JobProgress',
        'affected_compound_ids': 'list[str]'
    }

    attribute_map = {
        'id': 'id',
        'command': 'command',
        'progress': 'progress',
        'affected_compound_ids': 'affectedCompoundIds'
    }

    def __init__(self, id=None, command=None, progress=None, affected_compound_ids=None):  # noqa: E501
        """JobId - a model defined in Swagger"""  # noqa: E501
        self._id = None
        self._command = None
        self._progress = None
        self._affected_compound_ids = None
        self.discriminator = None
        if id is not None:
            self.id = id
        if command is not None:
            self.command = command
        if progress is not None:
            self.progress = progress
        if affected_compound_ids is not None:
            self.affected_compound_ids = affected_compound_ids

    @property
    def id(self):
        """Gets the id of this JobId.  # noqa: E501

        Unique identifier to access the job via the API  # noqa: E501

        :return: The id of this JobId.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this JobId.

        Unique identifier to access the job via the API  # noqa: E501

        :param id: The id of this JobId.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def command(self):
        """Gets the command of this JobId.  # noqa: E501

        Command string of the executed Task  # noqa: E501

        :return: The command of this JobId.  # noqa: E501
        :rtype: str
        """
        return self._command

    @command.setter
    def command(self, command):
        """Sets the command of this JobId.

        Command string of the executed Task  # noqa: E501

        :param command: The command of this JobId.  # noqa: E501
        :type: str
        """

        self._command = command

    @property
    def progress(self):
        """Gets the progress of this JobId.  # noqa: E501


        :return: The progress of this JobId.  # noqa: E501
        :rtype: JobProgress
        """
        return self._progress

    @progress.setter
    def progress(self, progress):
        """Sets the progress of this JobId.


        :param progress: The progress of this JobId.  # noqa: E501
        :type: JobProgress
        """

        self._progress = progress

    @property
    def affected_compound_ids(self):
        """Gets the affected_compound_ids of this JobId.  # noqa: E501

        List of compound ids that are affected by this job.  If this job is creating compounds (e.g. data import jobs) this value will be NULL until the jobs has finished  # noqa: E501

        :return: The affected_compound_ids of this JobId.  # noqa: E501
        :rtype: list[str]
        """
        return self._affected_compound_ids

    @affected_compound_ids.setter
    def affected_compound_ids(self, affected_compound_ids):
        """Sets the affected_compound_ids of this JobId.

        List of compound ids that are affected by this job.  If this job is creating compounds (e.g. data import jobs) this value will be NULL until the jobs has finished  # noqa: E501

        :param affected_compound_ids: The affected_compound_ids of this JobId.  # noqa: E501
        :type: list[str]
        """

        self._affected_compound_ids = affected_compound_ids

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
        if issubclass(JobId, dict):
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
        if not isinstance(other, JobId):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
