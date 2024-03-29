% Generated by roxygen2: do not edit by hand
% Please edit documentation in R/compound_annotation.R
\docType{class}
\name{CompoundAnnotation}
\alias{CompoundAnnotation}
\title{CompoundAnnotation}
\format{
An \code{R6Class} generator object
}
\description{
Summary of the results of a Compound. Can be added to a CompoundId.  It is null within a CompoundId if it was not requested und non-null otherwise.  The different summary fields within this summary object are null if the corresponding  compound does not contain the represented results. If fields are non-null  the corresponding result has been computed but might still be empty.

CompoundAnnotation Class
}
\details{
Create a new CompoundAnnotation
}
\section{Public fields}{
\if{html}{\out{<div class="r6-fields">}}
\describe{
\item{\code{formulaAnnotation}}{\link{FormulaCandidate} [optional]}

\item{\code{structureAnnotation}}{\link{StructureCandidate} [optional]}

\item{\code{compoundClassAnnotation}}{\link{CompoundClasses} [optional]}
}
\if{html}{\out{</div>}}
}
\section{Methods}{
\subsection{Public methods}{
\itemize{
\item \href{#method-CompoundAnnotation-new}{\code{CompoundAnnotation$new()}}
\item \href{#method-CompoundAnnotation-toJSON}{\code{CompoundAnnotation$toJSON()}}
\item \href{#method-CompoundAnnotation-fromJSON}{\code{CompoundAnnotation$fromJSON()}}
\item \href{#method-CompoundAnnotation-toJSONString}{\code{CompoundAnnotation$toJSONString()}}
\item \href{#method-CompoundAnnotation-fromJSONString}{\code{CompoundAnnotation$fromJSONString()}}
\item \href{#method-CompoundAnnotation-validateJSON}{\code{CompoundAnnotation$validateJSON()}}
\item \href{#method-CompoundAnnotation-toString}{\code{CompoundAnnotation$toString()}}
\item \href{#method-CompoundAnnotation-isValid}{\code{CompoundAnnotation$isValid()}}
\item \href{#method-CompoundAnnotation-getInvalidFields}{\code{CompoundAnnotation$getInvalidFields()}}
\item \href{#method-CompoundAnnotation-print}{\code{CompoundAnnotation$print()}}
\item \href{#method-CompoundAnnotation-clone}{\code{CompoundAnnotation$clone()}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-new"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-new}{}}}
\subsection{Method \code{new()}}{
Initialize a new CompoundAnnotation class.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$new(
  formulaAnnotation = NULL,
  structureAnnotation = NULL,
  compoundClassAnnotation = NULL,
  ...
)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{formulaAnnotation}}{formulaAnnotation}

\item{\code{structureAnnotation}}{structureAnnotation}

\item{\code{compoundClassAnnotation}}{compoundClassAnnotation}

\item{\code{...}}{Other optional arguments.}
}
\if{html}{\out{</div>}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-toJSON"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-toJSON}{}}}
\subsection{Method \code{toJSON()}}{
To JSON String
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$toJSON()}\if{html}{\out{</div>}}
}

\subsection{Returns}{
CompoundAnnotation in JSON format
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-fromJSON"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-fromJSON}{}}}
\subsection{Method \code{fromJSON()}}{
Deserialize JSON string into an instance of CompoundAnnotation
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$fromJSON(input_json)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{input_json}}{the JSON input}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
the instance of CompoundAnnotation
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-toJSONString"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-toJSONString}{}}}
\subsection{Method \code{toJSONString()}}{
To JSON String
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$toJSONString()}\if{html}{\out{</div>}}
}

\subsection{Returns}{
CompoundAnnotation in JSON format
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-fromJSONString"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-fromJSONString}{}}}
\subsection{Method \code{fromJSONString()}}{
Deserialize JSON string into an instance of CompoundAnnotation
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$fromJSONString(input_json)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{input_json}}{the JSON input}
}
\if{html}{\out{</div>}}
}
\subsection{Returns}{
the instance of CompoundAnnotation
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-validateJSON"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-validateJSON}{}}}
\subsection{Method \code{validateJSON()}}{
Validate JSON input with respect to CompoundAnnotation and throw an exception if invalid
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$validateJSON(input)}\if{html}{\out{</div>}}
}

\subsection{Arguments}{
\if{html}{\out{<div class="arguments">}}
\describe{
\item{\code{input}}{the JSON input}
}
\if{html}{\out{</div>}}
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-toString"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-toString}{}}}
\subsection{Method \code{toString()}}{
To string (JSON format)
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$toString()}\if{html}{\out{</div>}}
}

\subsection{Returns}{
String representation of CompoundAnnotation
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-isValid"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-isValid}{}}}
\subsection{Method \code{isValid()}}{
Return true if the values in all fields are valid.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$isValid()}\if{html}{\out{</div>}}
}

\subsection{Returns}{
true if the values in all fields are valid.
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-getInvalidFields"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-getInvalidFields}{}}}
\subsection{Method \code{getInvalidFields()}}{
Return a list of invalid fields (if any).
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$getInvalidFields()}\if{html}{\out{</div>}}
}

\subsection{Returns}{
A list of invalid fields (if any).
}
}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-print"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-print}{}}}
\subsection{Method \code{print()}}{
Print the object
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$print()}\if{html}{\out{</div>}}
}

}
\if{html}{\out{<hr>}}
\if{html}{\out{<a id="method-CompoundAnnotation-clone"></a>}}
\if{latex}{\out{\hypertarget{method-CompoundAnnotation-clone}{}}}
\subsection{Method \code{clone()}}{
The objects of this class are cloneable with this method.
\subsection{Usage}{
\if{html}{\out{<div class="r">}}\preformatted{CompoundAnnotation$clone(deep = FALSE)}\if{html}{\out{</div>}}
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
