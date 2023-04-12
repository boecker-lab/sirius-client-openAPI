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

class CompoundClasses(object):
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
        'npc_pathway': 'CompoundClass',
        'npc_superclass': 'CompoundClass',
        'npc_class': 'CompoundClass',
        'classy_fire_most_specific': 'CompoundClass',
        'classy_fire_level5': 'CompoundClass',
        'classy_fire_class': 'CompoundClass',
        'classy_fire_sub_class': 'CompoundClass',
        'classy_fire_super_class': 'CompoundClass'
    }

    attribute_map = {
        'npc_pathway': 'npcPathway',
        'npc_superclass': 'npcSuperclass',
        'npc_class': 'npcClass',
        'classy_fire_most_specific': 'classyFireMostSpecific',
        'classy_fire_level5': 'classyFireLevel5',
        'classy_fire_class': 'classyFireClass',
        'classy_fire_sub_class': 'classyFireSubClass',
        'classy_fire_super_class': 'classyFireSuperClass'
    }

    def __init__(self, npc_pathway=None, npc_superclass=None, npc_class=None, classy_fire_most_specific=None, classy_fire_level5=None, classy_fire_class=None, classy_fire_sub_class=None, classy_fire_super_class=None):  # noqa: E501
        """CompoundClasses - a model defined in Swagger"""  # noqa: E501
        self._npc_pathway = None
        self._npc_superclass = None
        self._npc_class = None
        self._classy_fire_most_specific = None
        self._classy_fire_level5 = None
        self._classy_fire_class = None
        self._classy_fire_sub_class = None
        self._classy_fire_super_class = None
        self.discriminator = None
        if npc_pathway is not None:
            self.npc_pathway = npc_pathway
        if npc_superclass is not None:
            self.npc_superclass = npc_superclass
        if npc_class is not None:
            self.npc_class = npc_class
        if classy_fire_most_specific is not None:
            self.classy_fire_most_specific = classy_fire_most_specific
        if classy_fire_level5 is not None:
            self.classy_fire_level5 = classy_fire_level5
        if classy_fire_class is not None:
            self.classy_fire_class = classy_fire_class
        if classy_fire_sub_class is not None:
            self.classy_fire_sub_class = classy_fire_sub_class
        if classy_fire_super_class is not None:
            self.classy_fire_super_class = classy_fire_super_class

    @property
    def npc_pathway(self):
        """Gets the npc_pathway of this CompoundClasses.  # noqa: E501


        :return: The npc_pathway of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._npc_pathway

    @npc_pathway.setter
    def npc_pathway(self, npc_pathway):
        """Sets the npc_pathway of this CompoundClasses.


        :param npc_pathway: The npc_pathway of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._npc_pathway = npc_pathway

    @property
    def npc_superclass(self):
        """Gets the npc_superclass of this CompoundClasses.  # noqa: E501


        :return: The npc_superclass of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._npc_superclass

    @npc_superclass.setter
    def npc_superclass(self, npc_superclass):
        """Sets the npc_superclass of this CompoundClasses.


        :param npc_superclass: The npc_superclass of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._npc_superclass = npc_superclass

    @property
    def npc_class(self):
        """Gets the npc_class of this CompoundClasses.  # noqa: E501


        :return: The npc_class of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._npc_class

    @npc_class.setter
    def npc_class(self, npc_class):
        """Sets the npc_class of this CompoundClasses.


        :param npc_class: The npc_class of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._npc_class = npc_class

    @property
    def classy_fire_most_specific(self):
        """Gets the classy_fire_most_specific of this CompoundClasses.  # noqa: E501


        :return: The classy_fire_most_specific of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._classy_fire_most_specific

    @classy_fire_most_specific.setter
    def classy_fire_most_specific(self, classy_fire_most_specific):
        """Sets the classy_fire_most_specific of this CompoundClasses.


        :param classy_fire_most_specific: The classy_fire_most_specific of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._classy_fire_most_specific = classy_fire_most_specific

    @property
    def classy_fire_level5(self):
        """Gets the classy_fire_level5 of this CompoundClasses.  # noqa: E501


        :return: The classy_fire_level5 of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._classy_fire_level5

    @classy_fire_level5.setter
    def classy_fire_level5(self, classy_fire_level5):
        """Sets the classy_fire_level5 of this CompoundClasses.


        :param classy_fire_level5: The classy_fire_level5 of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._classy_fire_level5 = classy_fire_level5

    @property
    def classy_fire_class(self):
        """Gets the classy_fire_class of this CompoundClasses.  # noqa: E501


        :return: The classy_fire_class of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._classy_fire_class

    @classy_fire_class.setter
    def classy_fire_class(self, classy_fire_class):
        """Sets the classy_fire_class of this CompoundClasses.


        :param classy_fire_class: The classy_fire_class of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._classy_fire_class = classy_fire_class

    @property
    def classy_fire_sub_class(self):
        """Gets the classy_fire_sub_class of this CompoundClasses.  # noqa: E501


        :return: The classy_fire_sub_class of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._classy_fire_sub_class

    @classy_fire_sub_class.setter
    def classy_fire_sub_class(self, classy_fire_sub_class):
        """Sets the classy_fire_sub_class of this CompoundClasses.


        :param classy_fire_sub_class: The classy_fire_sub_class of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._classy_fire_sub_class = classy_fire_sub_class

    @property
    def classy_fire_super_class(self):
        """Gets the classy_fire_super_class of this CompoundClasses.  # noqa: E501


        :return: The classy_fire_super_class of this CompoundClasses.  # noqa: E501
        :rtype: CompoundClass
        """
        return self._classy_fire_super_class

    @classy_fire_super_class.setter
    def classy_fire_super_class(self, classy_fire_super_class):
        """Sets the classy_fire_super_class of this CompoundClasses.


        :param classy_fire_super_class: The classy_fire_super_class of this CompoundClasses.  # noqa: E501
        :type: CompoundClass
        """

        self._classy_fire_super_class = classy_fire_super_class

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
        if issubclass(CompoundClasses, dict):
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
        if not isinstance(other, CompoundClasses):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
