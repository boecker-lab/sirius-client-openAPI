# swagger-client
Sirius Nightsky Middleware API

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.CompoundControllerApi(swagger_client.ApiClient(configuration))
pid = 'pid_example' # str | pid

try:
    # getCompoundIds
    api_response = api_instance.get_compound_ids_using_get(pid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CompoundControllerApi->get_compound_ids_using_get: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompoundControllerApi* | [**get_compound_ids_using_get**](docs/CompoundControllerApi.md#get_compound_ids_using_get) | **GET** /api/projects/{pid}/compounds | getCompoundIds
*CompoundControllerApi* | [**get_compound_using_get**](docs/CompoundControllerApi.md#get_compound_using_get) | **GET** /api/projects/{pid}/compounds/{cid} | getCompound
*ProjectSpaceControllerApi* | [**get_project_space_using_get**](docs/ProjectSpaceControllerApi.md#get_project_space_using_get) | **GET** /api/projects/{name} | getProjectSpace
*ProjectSpaceControllerApi* | [**get_project_spaces_using_get**](docs/ProjectSpaceControllerApi.md#get_project_spaces_using_get) | **GET** /api/projects | getProjectSpaces
*ProjectSpaceControllerApi* | [**open_project_space_using_post**](docs/ProjectSpaceControllerApi.md#open_project_space_using_post) | **POST** /api/projects/new | openProjectSpace
*ProjectSpaceControllerApi* | [**open_project_space_using_put**](docs/ProjectSpaceControllerApi.md#open_project_space_using_put) | **PUT** /api/projects/{name} | openProjectSpace
*VersionInfoControllerApi* | [**get_version_info_using_get**](docs/VersionInfoControllerApi.md#get_version_info_using_get) | **GET** /api/version.json | getVersionInfo


## Documentation For Models

 - [AnnotatedSpectrum](docs/AnnotatedSpectrum.md)
 - [CollisionEnergy](docs/CollisionEnergy.md)
 - [CompoundId](docs/CompoundId.md)
 - [CompoundMsData](docs/CompoundMsData.md)
 - [File](docs/File.md)
 - [ProjectSpaceId](docs/ProjectSpaceId.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author



