# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' PeakAnnotation Class
#'
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PeakAnnotation <- R6::R6Class(
  'PeakAnnotation',
  public = list(
    initialize = function(){
    },
    toJSON = function() {
      PeakAnnotationObject <- list()

      PeakAnnotationObject
    },
    fromJSON = function(PeakAnnotationJson) {
      PeakAnnotationObject <- jsonlite::fromJSON(PeakAnnotationJson)
    },
    toJSONString = function() {
       sprintf(
        '{
        }',
      )
    },
    fromJSONString = function(PeakAnnotationJson) {
      PeakAnnotationObject <- jsonlite::fromJSON(PeakAnnotationJson)
    }
  )
)
