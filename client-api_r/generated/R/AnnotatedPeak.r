# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' AnnotatedPeak Class
#'
#' @field mass 
#' @field intensity 
#' @field peakAnnotation 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AnnotatedPeak <- R6::R6Class(
  'AnnotatedPeak',
  public = list(
    `mass` = NULL,
    `intensity` = NULL,
    `peakAnnotation` = NULL,
    initialize = function(`mass`, `intensity`, `peakAnnotation`){
      if (!missing(`mass`)) {
        stopifnot(is.numeric(`mass`), length(`mass`) == 1)
        self$`mass` <- `mass`
      }
      if (!missing(`intensity`)) {
        stopifnot(is.numeric(`intensity`), length(`intensity`) == 1)
        self$`intensity` <- `intensity`
      }
      if (!missing(`peakAnnotation`)) {
        stopifnot(R6::is.R6(`peakAnnotation`))
        self$`peakAnnotation` <- `peakAnnotation`
      }
    },
    toJSON = function() {
      AnnotatedPeakObject <- list()
      if (!is.null(self$`mass`)) {
        AnnotatedPeakObject[['mass']] <- self$`mass`
      }
      if (!is.null(self$`intensity`)) {
        AnnotatedPeakObject[['intensity']] <- self$`intensity`
      }
      if (!is.null(self$`peakAnnotation`)) {
        AnnotatedPeakObject[['peakAnnotation']] <- self$`peakAnnotation`$toJSON()
      }

      AnnotatedPeakObject
    },
    fromJSON = function(AnnotatedPeakJson) {
      AnnotatedPeakObject <- jsonlite::fromJSON(AnnotatedPeakJson)
      if (!is.null(AnnotatedPeakObject$`mass`)) {
        self$`mass` <- AnnotatedPeakObject$`mass`
      }
      if (!is.null(AnnotatedPeakObject$`intensity`)) {
        self$`intensity` <- AnnotatedPeakObject$`intensity`
      }
      if (!is.null(AnnotatedPeakObject$`peakAnnotation`)) {
        peakAnnotationObject <- PeakAnnotation$new()
        peakAnnotationObject$fromJSON(jsonlite::toJSON(AnnotatedPeakObject$peakAnnotation, auto_unbox = TRUE))
        self$`peakAnnotation` <- peakAnnotationObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "mass": %d,
           "intensity": %d,
           "peakAnnotation": %s
        }',
        self$`mass`,
        self$`intensity`,
        self$`peakAnnotation`$toJSON()
      )
    },
    fromJSONString = function(AnnotatedPeakJson) {
      AnnotatedPeakObject <- jsonlite::fromJSON(AnnotatedPeakJson)
      self$`mass` <- AnnotatedPeakObject$`mass`
      self$`intensity` <- AnnotatedPeakObject$`intensity`
      PeakAnnotationObject <- PeakAnnotation$new()
      self$`peakAnnotation` <- PeakAnnotationObject$fromJSON(jsonlite::toJSON(AnnotatedPeakObject$peakAnnotation, auto_unbox = TRUE))
    }
  )
)
