% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/project_spaces_api.R
\docType{class}
\name{ProjectSpacesApi}
\alias{ProjectSpacesApi}
\title{ProjectSpaces operations}
\format{
An \code{R6Class} generator object
}
\description{
ProjectSpacesApi
}
\details{
SIRIUS Nightsky API

OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.

The version of the OpenAPI document: 0.9
Generated by: https://openapi-generator.tech
}
\section{Methods}{

\describe{
\strong{ CloseProjectSpace } \emph{ Close project-space and remove it from application. }
Close project-space and remove it from application. Project-space will NOT be deleted from disk.

\itemize{
\item \emph{ @param } project_id character


\item status code : 200 | OK


\item response headers :

\tabular{ll}{
}
}

\strong{ CreateProjectSpace } \emph{ Create and open a new project-space at given location and make it accessible via the given projectId. }
Create and open a new project-space at given location and make it accessible via the given projectId.

\itemize{
\item \emph{ @param } project_id character
\item \emph{ @param } path_to_project character
\item \emph{ @param } path_to_source_project character
\item \emph{ @param } await_import character
\item \emph{ @returnType } \link{ProjectSpaceId} \cr


\item status code : 200 | OK

\item return type : ProjectSpaceId
\item response headers :

\tabular{ll}{
}
}

\strong{ GetProjectSpace } \emph{ Get project space info by its projectId. }
Get project space info by its projectId.

\itemize{
\item \emph{ @param } project_id character
\item \emph{ @returnType } \link{ProjectSpaceId} \cr


\item status code : 200 | OK

\item return type : ProjectSpaceId
\item response headers :

\tabular{ll}{
}
}

\strong{ GetProjectSpaces } \emph{ List all opened project spaces. }
List all opened project spaces.

\itemize{
\item \emph{ @returnType } list( \link{ProjectSpaceId} ) \cr


\item status code : 200 | OK

\item return type : array[ProjectSpaceId]
\item response headers :

\tabular{ll}{
}
}

\strong{ OpenProjectSpace } \emph{ Open an existing project-space and make it accessible via the given projectId. }
Open an existing project-space and make it accessible via the given projectId.

\itemize{
\item \emph{ @param } project_id character
\item \emph{ @param } path_to_project character
\item \emph{ @returnType } \link{ProjectSpaceId} \cr


\item status code : 200 | OK

\item return type : ProjectSpaceId
\item response headers :

\tabular{ll}{
}
}

}
}

\examples{
\dontrun{
####################  CloseProjectSpace  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | unique name/identifier of the  project-space to be closed.

#Close project-space and remove it from application.
api_instance <- rsirius_api$new()

api_instance$project_spaces_api$CloseProjectSpace(var_project_id)


####################  CreateProjectSpace  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | unique name/identifier that shall be used to access the newly created project-space.
var_path_to_project <- "path_to_project_example" # character | 
var_path_to_source_project <- "path_to_source_project_example" # character |  (Optional)
var_await_import <- TRUE # character |  (Optional)

#Create and open a new project-space at given location and make it accessible via the given projectId.
api_instance <- rsirius_api$new()

# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CreateProjectSpace(var_project_id, var_path_to_project, path_to_source_project = var_path_to_source_project, await_import = var_await_importdata_file = "result.txt")
result <- api_instance$project_spaces_api$CreateProjectSpace(var_project_id, var_path_to_project, path_to_source_project = var_path_to_source_project, await_import = var_await_import)
dput(result)


####################  GetProjectSpace  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | unique name/identifier tof the project-space to be accessed.

#Get project space info by its projectId.
api_instance <- rsirius_api$new()

# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetProjectSpace(var_project_iddata_file = "result.txt")
result <- api_instance$project_spaces_api$GetProjectSpace(var_project_id)
dput(result)


####################  GetProjectSpaces  ####################

library(Rsirius)

#List all opened project spaces.
api_instance <- rsirius_api$new()

# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetProjectSpaces(data_file = "result.txt")
result <- api_instance$project_spaces_api$GetProjectSpaces()
dput(result)


####################  OpenProjectSpace  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | unique name/identifier that shall be used to access the opened project-space.
var_path_to_project <- "path_to_project_example" # character | 

#Open an existing project-space and make it accessible via the given projectId.
api_instance <- rsirius_api$new()

# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$OpenProjectSpace(var_project_id, var_path_to_projectdata_file = "result.txt")
result <- api_instance$project_spaces_api$OpenProjectSpace(var_project_id, var_path_to_project)
dput(result)


}
}
\section{Public fields}{
\if{html}{\out{<div class="r6-fields">}}
\describe{
\item{\code{api_client}}{Handles the client-server communication.}
}
\if{html}{\out{</div>}}
}
\section{Methods}{
\subsection{Public methods}{
\itemize{
\item \href{#method-ProjectSpacesApi-new}{\code{ProjectSpacesApi$new()}}
\item \href{#method-ProjectSpacesApi-CloseProjectSpace}{\code{ProjectSpacesApi$CloseProjectSpace()}}
\item \href{#method-ProjectSpacesApi-CloseProjectSpaceWithHttpInfo}{\code{ProjectSpacesApi$CloseProjectSpaceWithHttpInfo()}}
\item \href{#method-ProjectSpacesApi-CreateProjectSpace}{\code{ProjectSpacesApi$CreateProjectSpace()}}
\item \href{#method-ProjectSpacesApi-CreateProjectSpaceWithHttpInfo}{\code{ProjectSpacesApi$CreateProjectSpaceWithHttpInfo()}}
\item \href{#method-ProjectSpacesApi-GetProjectSpace}{\code{ProjectSpacesApi$GetProjectSpace()}}
\item \href{#method-ProjectSpacesApi-GetProjectSpaceWithHttpInfo}{\code{ProjectSpacesApi$GetProjectSpaceWithHttpInfo()}}
\item \href{#method-ProjectSpacesApi-GetProjectSpaces}{\code{ProjectSpacesApi$GetProjectSpaces()}}
\item \href{#method-ProjectSpacesApi-GetProjectSpacesWithHttpInfo}{\code{ProjectSpacesApi$GetProjectSpacesWithHttpInfo()}}
\item \href{#method-ProjectSpacesApi-OpenProjectSpace}{\code{ProjectSpacesApi$OpenProjectSpace()}}
\item \href{#method-ProjectSpacesApi-OpenProjectSpaceWithHttpInfo}{\code{ProjectSpacesApi$OpenProjectSpaceWithHttpInfo()}}
\item \href{#method-ProjectSpacesApi-clone}{\code{ProjectSpacesApi$clone()}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-new"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-new}{}}}
\subsection{Method \code{new()}}{
Initialize a new ProjectSpacesApi.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$new(api_client)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{api_client}}{An instance of API client.}
}
\if{html}{\out{</div>}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-CloseProjectSpace"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-CloseProjectSpace}{}}}
\subsection{Method \code{CloseProjectSpace()}}{
Close project-space and remove it from application.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$CloseProjectSpace(project_id, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier of the  project-space to be closed.}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
void
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-CloseProjectSpaceWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-CloseProjectSpaceWithHttpInfo}{}}}
\subsection{Method \code{CloseProjectSpaceWithHttpInfo()}}{
Close project-space and remove it from application.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$CloseProjectSpaceWithHttpInfo(project_id, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier of the  project-space to be closed.}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (void) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-CreateProjectSpace"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-CreateProjectSpace}{}}}
\subsection{Method \code{CreateProjectSpace()}}{
Create and open a new project-space at given location and make it accessible via the given projectId.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$CreateProjectSpace(
  project_id,
  path_to_project,
  path_to_source_project = NULL,
  await_import = TRUE,
  data_file = NULL,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier that shall be used to access the newly created project-space.}

\item{\code{path_to_project}}{}

\item{\code{path_to_source_project}}{(optional) No description}

\item{\code{await_import}}{(optional) No description (default value: TRUE)}

\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
ProjectSpaceId
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-CreateProjectSpaceWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-CreateProjectSpaceWithHttpInfo}{}}}
\subsection{Method \code{CreateProjectSpaceWithHttpInfo()}}{
Create and open a new project-space at given location and make it accessible via the given projectId.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$CreateProjectSpaceWithHttpInfo(
  project_id,
  path_to_project,
  path_to_source_project = NULL,
  await_import = TRUE,
  data_file = NULL,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier that shall be used to access the newly created project-space.}

\item{\code{path_to_project}}{}

\item{\code{path_to_source_project}}{(optional) No description}

\item{\code{await_import}}{(optional) No description (default value: TRUE)}

\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (ProjectSpaceId) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-GetProjectSpace"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-GetProjectSpace}{}}}
\subsection{Method \code{GetProjectSpace()}}{
Get project space info by its projectId.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$GetProjectSpace(project_id, data_file = NULL, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier tof the project-space to be accessed.}

\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
ProjectSpaceId
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-GetProjectSpaceWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-GetProjectSpaceWithHttpInfo}{}}}
\subsection{Method \code{GetProjectSpaceWithHttpInfo()}}{
Get project space info by its projectId.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$GetProjectSpaceWithHttpInfo(project_id, data_file = NULL, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier tof the project-space to be accessed.}

\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (ProjectSpaceId) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-GetProjectSpaces"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-GetProjectSpaces}{}}}
\subsection{Method \code{GetProjectSpaces()}}{
List all opened project spaces.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$GetProjectSpaces(data_file = NULL, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
array[ProjectSpaceId]
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-GetProjectSpacesWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-GetProjectSpacesWithHttpInfo}{}}}
\subsection{Method \code{GetProjectSpacesWithHttpInfo()}}{
List all opened project spaces.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$GetProjectSpacesWithHttpInfo(data_file = NULL, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (array[ProjectSpaceId]) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-OpenProjectSpace"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-OpenProjectSpace}{}}}
\subsection{Method \code{OpenProjectSpace()}}{
Open an existing project-space and make it accessible via the given projectId.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$OpenProjectSpace(
  project_id,
  path_to_project,
  data_file = NULL,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier that shall be used to access the opened project-space.}

\item{\code{path_to_project}}{}

\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
ProjectSpaceId
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-OpenProjectSpaceWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-OpenProjectSpaceWithHttpInfo}{}}}
\subsection{Method \code{OpenProjectSpaceWithHttpInfo()}}{
Open an existing project-space and make it accessible via the given projectId.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$OpenProjectSpaceWithHttpInfo(
  project_id,
  path_to_project,
  data_file = NULL,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{unique name/identifier that shall be used to access the opened project-space.}

\item{\code{path_to_project}}{}

\item{\code{data_file}}{(optional) name of the data file to save the result}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (ProjectSpaceId) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-ProjectSpacesApi-clone"></a>}}
\if{latex}{\out{\hypertarget{method-ProjectSpacesApi-clone}{}}}
\subsection{Method \code{clone()}}{
The objects of this class are cloneable with this method.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{ProjectSpacesApi$clone(deep = FALSE)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{deep}}{Whether to make a deep clone.}
}
\if{html}{\out{</div>}}
}
}
}
