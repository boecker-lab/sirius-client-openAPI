% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/graphical_user_interface_api.R
\docType{class}
\name{GraphicalUserInterfaceApi}
\alias{GraphicalUserInterfaceApi}
\title{GraphicalUserInterface operations}
\format{
An \code{R6Class} generator object
}
\description{
GraphicalUserInterfaceApi
}
\details{
SIRIUS Nightsky API

OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.

The version of the OpenAPI document: 0.9
Generated by: https://openapi-generator.tech
}
\section{Methods}{

\describe{
\strong{ ApplyToGui } \emph{ Apply given changes to the running GUI instance. }
Apply given changes to the running GUI instance.

\itemize{
\item \emph{ @param } project_id character
\item \emph{ @param } gui_parameters \link{GuiParameters}


\item status code : 200 | OK


\item response headers :

\tabular{ll}{
}
}

\strong{ CloseGui } \emph{ Close GUI instance of given project-space if available. }
Close GUI instance of given project-space if available.

\itemize{
\item \emph{ @param } project_id character


\item status code : 200 | OK


\item response headers :

\tabular{ll}{
}
}

\strong{ OpenGui } \emph{ Open GUI instance on specified project-space and bring the GUI window to foreground. }
Open GUI instance on specified project-space and bring the GUI window to foreground.

\itemize{
\item \emph{ @param } project_id character
\item \emph{ @param } read_only character


\item status code : 200 | OK


\item response headers :

\tabular{ll}{
}
}

}
}

\examples{
\dontrun{
####################  ApplyToGui  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | of project-space the GUI instance is connected to.
var_gui_parameters <- GuiParameters$new("FORMULAS", "cid_example", "fid_example", "structureCandidateInChIKey_example", "bringToFront_example") # GuiParameters | parameters that should be applied.

#Apply given changes to the running GUI instance.
api_instance <- rsirius_api$new()

api_instance$graphical_user_interface_api$ApplyToGui(var_project_id, var_gui_parameters)


####################  CloseGui  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | if project-space the GUI instance is connected to.

#Close GUI instance of given project-space if available.
api_instance <- rsirius_api$new()

api_instance$graphical_user_interface_api$CloseGui(var_project_id)


####################  OpenGui  ####################

library(Rsirius)
var_project_id <- "project_id_example" # character | of project-space the GUI instance will connect to.
var_read_only <- TRUE # character | open in read-only mode. (Optional)

#Open GUI instance on specified project-space and bring the GUI window to foreground.
api_instance <- rsirius_api$new()

api_instance$graphical_user_interface_api$OpenGui(var_project_id, read_only = var_read_only)


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
\item \href{#method-GraphicalUserInterfaceApi-new}{\code{GraphicalUserInterfaceApi$new()}}
\item \href{#method-GraphicalUserInterfaceApi-ApplyToGui}{\code{GraphicalUserInterfaceApi$ApplyToGui()}}
\item \href{#method-GraphicalUserInterfaceApi-ApplyToGuiWithHttpInfo}{\code{GraphicalUserInterfaceApi$ApplyToGuiWithHttpInfo()}}
\item \href{#method-GraphicalUserInterfaceApi-CloseGui}{\code{GraphicalUserInterfaceApi$CloseGui()}}
\item \href{#method-GraphicalUserInterfaceApi-CloseGuiWithHttpInfo}{\code{GraphicalUserInterfaceApi$CloseGuiWithHttpInfo()}}
\item \href{#method-GraphicalUserInterfaceApi-OpenGui}{\code{GraphicalUserInterfaceApi$OpenGui()}}
\item \href{#method-GraphicalUserInterfaceApi-OpenGuiWithHttpInfo}{\code{GraphicalUserInterfaceApi$OpenGuiWithHttpInfo()}}
\item \href{#method-GraphicalUserInterfaceApi-clone}{\code{GraphicalUserInterfaceApi$clone()}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-new"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-new}{}}}
\subsection{Method \code{new()}}{
Initialize a new GraphicalUserInterfaceApi.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$new(api_client)}\if{html}{\out{</div>}}
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
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-ApplyToGui"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-ApplyToGui}{}}}
\subsection{Method \code{ApplyToGui()}}{
Apply given changes to the running GUI instance.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$ApplyToGui(project_id, gui_parameters, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{of project-space the GUI instance is connected to.}

\item{\code{gui_parameters}}{parameters that should be applied.}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
void
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-ApplyToGuiWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-ApplyToGuiWithHttpInfo}{}}}
\subsection{Method \code{ApplyToGuiWithHttpInfo()}}{
Apply given changes to the running GUI instance.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$ApplyToGuiWithHttpInfo(
  project_id,
  gui_parameters,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{of project-space the GUI instance is connected to.}

\item{\code{gui_parameters}}{parameters that should be applied.}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (void) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-CloseGui"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-CloseGui}{}}}
\subsection{Method \code{CloseGui()}}{
Close GUI instance of given project-space if available.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$CloseGui(project_id, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{if project-space the GUI instance is connected to.}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
void
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-CloseGuiWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-CloseGuiWithHttpInfo}{}}}
\subsection{Method \code{CloseGuiWithHttpInfo()}}{
Close GUI instance of given project-space if available.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$CloseGuiWithHttpInfo(project_id, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{if project-space the GUI instance is connected to.}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (void) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-OpenGui"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-OpenGui}{}}}
\subsection{Method \code{OpenGui()}}{
Open GUI instance on specified project-space and bring the GUI window to foreground.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$OpenGui(project_id, read_only = TRUE, ...)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{of project-space the GUI instance will connect to.}

\item{\code{read_only}}{(optional) open in read-only mode. (default value: TRUE)}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
void
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-OpenGuiWithHttpInfo"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-OpenGuiWithHttpInfo}{}}}
\subsection{Method \code{OpenGuiWithHttpInfo()}}{
Open GUI instance on specified project-space and bring the GUI window to foreground.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$OpenGuiWithHttpInfo(
  project_id,
  read_only = TRUE,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{project_id}}{of project-space the GUI instance will connect to.}

\item{\code{read_only}}{(optional) open in read-only mode. (default value: TRUE)}

\item{\code{...}}{Other optional arguments}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
API response (void) with additional information such as HTTP status code, headers
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-GraphicalUserInterfaceApi-clone"></a>}}
\if{latex}{\out{\hypertarget{method-GraphicalUserInterfaceApi-clone}{}}}
\subsection{Method \code{clone()}}{
The objects of this class are cloneable with this method.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{GraphicalUserInterfaceApi$clone(deep = FALSE)}\if{html}{\out{</div>}}
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
