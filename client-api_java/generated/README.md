# swagger-java-client

SIRIUS Nightsky API
- API version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
  - Build date: 2022-10-10T15:31:49.516631200+02:00[Europe/Berlin]

REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import JSirius.*;
import JSirius.auth.*;
import JSirius.model.*;
import JSirius.api.CompoundsApi;

import java.io.File;
import java.util.*;

public class CompoundsApiExample {

    public static void main(String[] args) {
        
        CompoundsApi apiInstance = new CompoundsApi();
        String projectId = "projectId_example"; // String | project-space to delete from.
        String cid = "cid_example"; // String | identifier of compound to delete.
        try {
            apiInstance.deleteCompound(projectId, cid);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompoundsApi#deleteCompound");
            e.printStackTrace();
        }
    }
}
import JSirius.*;
import JSirius.auth.*;
import JSirius.model.*;
import JSirius.api.CompoundsApi;

import java.io.File;
import java.util.*;

public class CompoundsApiExample {

    public static void main(String[] args) {
        
        CompoundsApi apiInstance = new CompoundsApi();
        String projectId = "projectId_example"; // String | project-space to read from.
        String cid = "cid_example"; // String | identifier of compound to access.
        Boolean topAnnotation = false; // Boolean | include the top annotation of this feature into the output (if available).
        Boolean msData = false; // Boolean | include corresponding source data (MS and MS/MS) into the output.
        try {
            CompoundId result = apiInstance.getCompound(projectId, cid, topAnnotation, msData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompoundsApi#getCompound");
            e.printStackTrace();
        }
    }
}
import JSirius.*;
import JSirius.auth.*;
import JSirius.model.*;
import JSirius.api.CompoundsApi;

import java.io.File;
import java.util.*;

public class CompoundsApiExample {

    public static void main(String[] args) {
        
        CompoundsApi apiInstance = new CompoundsApi();
        String projectId = "projectId_example"; // String | project-space to read from.
        Boolean topAnnotation = false; // Boolean | include the top annotation of this feature into the output (if available).
        Boolean msData = false; // Boolean | include corresponding source data (MS and MS/MS) into the output.
        try {
            List<CompoundId> result = apiInstance.getCompounds(projectId, topAnnotation, msData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompoundsApi#getCompounds");
            e.printStackTrace();
        }
    }
}
import JSirius.*;
import JSirius.auth.*;
import JSirius.model.*;
import JSirius.api.CompoundsApi;

import java.io.File;
import java.util.*;

public class CompoundsApiExample {

    public static void main(String[] args) {
        
        CompoundsApi apiInstance = new CompoundsApi();
        List<String> body = Arrays.asList("body_example"); // List<String> | List of file and directory paths to import
        String projectId = "projectId_example"; // String | project-space to import into.
        Boolean alignLCMSRuns = false; // Boolean | If true, multiple LCMS Runs (mzML, mzXML) will be aligned during import/feature finding
        Boolean allowMs1OnlyData = true; // Boolean | 
        Boolean ignoreFormulas = false; // Boolean | 
        try {
            JobId result = apiInstance.importCompounds(body, projectId, alignLCMSRuns, allowMs1OnlyData, ignoreFormulas);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompoundsApi#importCompounds");
            e.printStackTrace();
        }
    }
}
import JSirius.*;
import JSirius.auth.*;
import JSirius.model.*;
import JSirius.api.CompoundsApi;

import java.io.File;
import java.util.*;

public class CompoundsApiExample {

    public static void main(String[] args) {
        
        CompoundsApi apiInstance = new CompoundsApi();
        String body = "body_example"; // String | data content in specified format
        String projectId = "projectId_example"; // String | project-space to import into.
        String format = "format_example"; // String | data format specified by the usual file extension of the format (without [.])
        String sourceName = "sourceName_example"; // String | name that specifies the data source. Can e.g. be a file path or just a name.
        try {
            List<CompoundId> result = apiInstance.importCompoundsFromString(body, projectId, format, sourceName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CompoundsApi#importCompoundsFromString");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CompoundsApi* | [**deleteCompound**](docs/CompoundsApi.md#deleteCompound) | **DELETE** /api/projects/{projectId}/compounds/{cid} | Delete compound/feature with the given identifier from the specified project-space.
*CompoundsApi* | [**getCompound**](docs/CompoundsApi.md#getCompound) | **GET** /api/projects/{projectId}/compounds/{cid} | Get compound/feature with the given identifier from the specified project-space.
*CompoundsApi* | [**getCompounds**](docs/CompoundsApi.md#getCompounds) | **GET** /api/projects/{projectId}/compounds | Get all available compounds/features in the given project-space.
*CompoundsApi* | [**importCompounds**](docs/CompoundsApi.md#importCompounds) | **POST** /api/projects/{projectId}/compounds | Import ms/ms data in given format from local filesystem into the specified project-space
*CompoundsApi* | [**importCompoundsFromString**](docs/CompoundsApi.md#importCompoundsFromString) | **POST** /api/projects/{projectId}/compounds/import-from-string | Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)
*ComputationsApi* | [**deleteJob**](docs/ComputationsApi.md#deleteJob) | **DELETE** /api/projects/{projectId}/jobs/{jobId} | Delete job.
*ComputationsApi* | [**deleteJobConfig**](docs/ComputationsApi.md#deleteJobConfig) | **DELETE** /api/job-configs/{name} | Delete job configuration with given name.
*ComputationsApi* | [**getDefaultJobConfig**](docs/ComputationsApi.md#getDefaultJobConfig) | **GET** /api/default-job-config | Request default job configuration
*ComputationsApi* | [**getJob**](docs/ComputationsApi.md#getJob) | **GET** /api/projects/{projectId}/jobs/{jobId} | Get job information and its current state and progress (if available).
*ComputationsApi* | [**getJobConfig**](docs/ComputationsApi.md#getJobConfig) | **GET** /api/job-configs/{name} | Request job configuration with given name.
*ComputationsApi* | [**getJobConfigs**](docs/ComputationsApi.md#getJobConfigs) | **GET** /api/job-configs | Request all available job configurations
*ComputationsApi* | [**getJobs**](docs/ComputationsApi.md#getJobs) | **GET** /api/projects/{projectId}/jobs | Get job information and its current state and progress (if available).
*ComputationsApi* | [**postJobConfig**](docs/ComputationsApi.md#postJobConfig) | **POST** /api/job-configs/{name} | Add new job configuration with given name.
*ComputationsApi* | [**startJob**](docs/ComputationsApi.md#startJob) | **POST** /api/projects/{projectId}/jobs | Start computation for given compounds and with given parameters.
*ComputationsApi* | [**startJobFromConfig**](docs/ComputationsApi.md#startJobFromConfig) | **POST** /api/projects/{projectId}/jobs-from-config | Start computation for given compounds and with parameters from a stored job-config.
*FormulaResultsApi* | [**getBestMatchingCanopusPredictions**](docs/FormulaResultsApi.md#getBestMatchingCanopusPredictions) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/best-canopus-predictions | Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
*FormulaResultsApi* | [**getCanopusPredictions**](docs/FormulaResultsApi.md#getCanopusPredictions) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/canopus-predictions | All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
*FormulaResultsApi* | [**getFingerprintPrediction**](docs/FormulaResultsApi.md#getFingerprintPrediction) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/fingerprint | Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.
*FormulaResultsApi* | [**getFormulaIds**](docs/FormulaResultsApi.md#getFormulaIds) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas | List of all FormulaResultContainers available for this compound/feature with minimal information.
*FormulaResultsApi* | [**getFormulaResult**](docs/FormulaResultsApi.md#getFormulaResult) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId} | FormulaResultContainers for the given &#x27;formulaId&#x27; with minimal information.
*FormulaResultsApi* | [**getFragTree**](docs/FormulaResultsApi.md#getFragTree) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/tree | Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
*FormulaResultsApi* | [**getSimulatedIsotopePattern**](docs/FormulaResultsApi.md#getSimulatedIsotopePattern) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/isotope-pattern | Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.
*FormulaResultsApi* | [**getStructureCandidates**](docs/FormulaResultsApi.md#getStructureCandidates) | **GET** /api/projects/{projectId}/compounds/{compoundId}/formulas/{formulaId}/structures | List of StructureCandidates the given &#x27;formulaId&#x27; with minimal information.
*FormulaResultsApi* | [**getTopStructureCandidate**](docs/FormulaResultsApi.md#getTopStructureCandidate) | **GET** /api/projects/{projectId}/compounds/{compoundId}/top-structure | Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).
*GraphicalUserInterfaceApi* | [**applyToGui**](docs/GraphicalUserInterfaceApi.md#applyToGui) | **PATCH** /api/projects/{projectId}/gui | Apply given changes to the running GUI instance.
*GraphicalUserInterfaceApi* | [**closeGui**](docs/GraphicalUserInterfaceApi.md#closeGui) | **DELETE** /api/projects/{projectId}/gui | Close GUI instance of given project-space if available.
*GraphicalUserInterfaceApi* | [**openGui**](docs/GraphicalUserInterfaceApi.md#openGui) | **POST** /api/projects/{projectId}/gui | Open GUI instance on specified project-space and bring the GUI window to foreground.
*LoginAndAccountApi* | [**getAccountInfo**](docs/LoginAndAccountApi.md#getAccountInfo) | **GET** /api/account/ | Get information about the account currently logged in.
*LoginAndAccountApi* | [**getSignUpURL**](docs/LoginAndAccountApi.md#getSignUpURL) | **GET** /api/account/signUpURL | Get SignUp URL (For signUp via web browser)
*LoginAndAccountApi* | [**getSubscriptions**](docs/LoginAndAccountApi.md#getSubscriptions) | **GET** /api/account/subscriptions | Get available subscriptions of the account currently logged in.
*LoginAndAccountApi* | [**isLoggedIn**](docs/LoginAndAccountApi.md#isLoggedIn) | **GET** /api/account/isLoggedIn | Check if a user is logged in.
*LoginAndAccountApi* | [**login**](docs/LoginAndAccountApi.md#login) | **POST** /api/account/login | Login into SIRIUS web services.
*LoginAndAccountApi* | [**logout**](docs/LoginAndAccountApi.md#logout) | **POST** /api/account/logout | Logout from SIRIUS web services.
*LoginAndAccountApi* | [**signUp**](docs/LoginAndAccountApi.md#signUp) | **GET** /api/account/signUp | Open SignUp window in system browser and return signUp link.
*ProjectSpacesApi* | [**closeProjectSpace**](docs/ProjectSpacesApi.md#closeProjectSpace) | **DELETE** /api/projects/{projectId} | Close project-space and remove it from application.
*ProjectSpacesApi* | [**createProjectSpace**](docs/ProjectSpacesApi.md#createProjectSpace) | **POST** /api/projects/{projectId} | Create and open a new project-space at given location and make it accessible via the given projectId.
*ProjectSpacesApi* | [**getProjectSpace**](docs/ProjectSpacesApi.md#getProjectSpace) | **GET** /api/projects/{projectId} | Get project space info by its projectId.
*ProjectSpacesApi* | [**getProjectSpaces**](docs/ProjectSpacesApi.md#getProjectSpaces) | **GET** /api/projects | List all opened project spaces.
*ProjectSpacesApi* | [**openProjectSpace**](docs/ProjectSpacesApi.md#openProjectSpace) | **PUT** /api/projects/{projectId} | Open an existing project-space and make it accessible via the given projectId.
*VersionInfoControllerApi* | [**getVersionInfo**](docs/VersionInfoControllerApi.md#getVersionInfo) | **GET** /api/version.json | 

## Documentation for Models

 - [AccountCredentials](docs/AccountCredentials.md)
 - [AccountInfo](docs/AccountInfo.md)
 - [AnnotatedPeak](docs/AnnotatedPeak.md)
 - [AnnotatedSpectrum](docs/AnnotatedSpectrum.md)
 - [Canopus](docs/Canopus.md)
 - [CanopusPredictions](docs/CanopusPredictions.md)
 - [CollisionEnergy](docs/CollisionEnergy.md)
 - [CompoundAnnotation](docs/CompoundAnnotation.md)
 - [CompoundClass](docs/CompoundClass.md)
 - [CompoundClasses](docs/CompoundClasses.md)
 - [CompoundId](docs/CompoundId.md)
 - [DBLink](docs/DBLink.md)
 - [Deviation](docs/Deviation.md)
 - [FingerprintPrediction](docs/FingerprintPrediction.md)
 - [FormulaCandidate](docs/FormulaCandidate.md)
 - [FormulaResultContainer](docs/FormulaResultContainer.md)
 - [FragmentNode](docs/FragmentNode.md)
 - [FragmentationTree](docs/FragmentationTree.md)
 - [GuiParameters](docs/GuiParameters.md)
 - [JobId](docs/JobId.md)
 - [JobProgress](docs/JobProgress.md)
 - [JobSubmission](docs/JobSubmission.md)
 - [LossEdge](docs/LossEdge.md)
 - [MsData](docs/MsData.md)
 - [PeakAnnotation](docs/PeakAnnotation.md)
 - [ProjectSpaceId](docs/ProjectSpaceId.md)
 - [ResultOverview](docs/ResultOverview.md)
 - [Sirius](docs/Sirius.md)
 - [StructureCandidate](docs/StructureCandidate.md)
 - [StructureDbSearch](docs/StructureDbSearch.md)
 - [Subscription](docs/Subscription.md)
 - [Timeout](docs/Timeout.md)
 - [UseHeuristic](docs/UseHeuristic.md)
 - [Zodiac](docs/Zodiac.md)
 - [ZodiacEdgeFilterThresholds](docs/ZodiacEdgeFilterThresholds.md)
 - [ZodiacEpochs](docs/ZodiacEpochs.md)
 - [ZodiacNumberOfConsideredCandidatesAt300Mz](docs/ZodiacNumberOfConsideredCandidatesAt300Mz.md)
 - [ZodiacNumberOfConsideredCandidatesAt800Mz](docs/ZodiacNumberOfConsideredCandidatesAt800Mz.md)
 - [ZodiacRunInTwoSteps](docs/ZodiacRunInTwoSteps.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

