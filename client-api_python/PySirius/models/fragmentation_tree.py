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

class FragmentationTree(object):
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
        'fragments': 'list[FragmentNode]',
        'losses': 'list[LossEdge]',
        'tree_score': 'float',
        'root': 'FragmentNode'
    }

    attribute_map = {
        'fragments': 'fragments',
        'losses': 'losses',
        'tree_score': 'treeScore',
        'root': 'root'
    }

    def __init__(self, fragments=None, losses=None, tree_score=None, root=None):  # noqa: E501
        """FragmentationTree - a model defined in Swagger"""  # noqa: E501
        self._fragments = None
        self._losses = None
        self._tree_score = None
        self._root = None
        self.discriminator = None
        if fragments is not None:
            self.fragments = fragments
        if losses is not None:
            self.losses = losses
        if tree_score is not None:
            self.tree_score = tree_score
        if root is not None:
            self.root = root

    @property
    def fragments(self):
        """Gets the fragments of this FragmentationTree.  # noqa: E501


        :return: The fragments of this FragmentationTree.  # noqa: E501
        :rtype: list[FragmentNode]
        """
        return self._fragments

    @fragments.setter
    def fragments(self, fragments):
        """Sets the fragments of this FragmentationTree.


        :param fragments: The fragments of this FragmentationTree.  # noqa: E501
        :type: list[FragmentNode]
        """

        self._fragments = fragments

    @property
    def losses(self):
        """Gets the losses of this FragmentationTree.  # noqa: E501


        :return: The losses of this FragmentationTree.  # noqa: E501
        :rtype: list[LossEdge]
        """
        return self._losses

    @losses.setter
    def losses(self, losses):
        """Sets the losses of this FragmentationTree.


        :param losses: The losses of this FragmentationTree.  # noqa: E501
        :type: list[LossEdge]
        """

        self._losses = losses

    @property
    def tree_score(self):
        """Gets the tree_score of this FragmentationTree.  # noqa: E501


        :return: The tree_score of this FragmentationTree.  # noqa: E501
        :rtype: float
        """
        return self._tree_score

    @tree_score.setter
    def tree_score(self, tree_score):
        """Sets the tree_score of this FragmentationTree.


        :param tree_score: The tree_score of this FragmentationTree.  # noqa: E501
        :type: float
        """

        self._tree_score = tree_score

    @property
    def root(self):
        """Gets the root of this FragmentationTree.  # noqa: E501


        :return: The root of this FragmentationTree.  # noqa: E501
        :rtype: FragmentNode
        """
        return self._root

    @root.setter
    def root(self, root):
        """Sets the root of this FragmentationTree.


        :param root: The root of this FragmentationTree.  # noqa: E501
        :type: FragmentNode
        """

        self._root = root

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
        if issubclass(FragmentationTree, dict):
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
        if not isinstance(other, FragmentationTree):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
