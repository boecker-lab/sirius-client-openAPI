# Sirius Nightsky Middleware API
#
# Sirius Nightsky Middleware API
#
# OpenAPI spec version: 0.9
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Deviation Class
#'
#' @field absolute 
#' @field identifier 
#' @field ppm 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Deviation <- R6::R6Class(
  'Deviation',
  public = list(
    `absolute` = NULL,
    `identifier` = NULL,
    `ppm` = NULL,
    initialize = function(`absolute`, `identifier`, `ppm`){
      if (!missing(`absolute`)) {
        stopifnot(is.numeric(`absolute`), length(`absolute`) == 1)
        self$`absolute` <- `absolute`
      }
      if (!missing(`identifier`)) {
        stopifnot(is.character(`identifier`), length(`identifier`) == 1)
        self$`identifier` <- `identifier`
      }
      if (!missing(`ppm`)) {
        stopifnot(is.numeric(`ppm`), length(`ppm`) == 1)
        self$`ppm` <- `ppm`
      }
    },
    toJSON = function() {
      DeviationObject <- list()
      if (!is.null(self$`absolute`)) {
        DeviationObject[['absolute']] <- self$`absolute`
      }
      if (!is.null(self$`identifier`)) {
        DeviationObject[['identifier']] <- self$`identifier`
      }
      if (!is.null(self$`ppm`)) {
        DeviationObject[['ppm']] <- self$`ppm`
      }

      DeviationObject
    },
    fromJSON = function(DeviationJson) {
      DeviationObject <- jsonlite::fromJSON(DeviationJson)
      if (!is.null(DeviationObject$`absolute`)) {
        self$`absolute` <- DeviationObject$`absolute`
      }
      if (!is.null(DeviationObject$`identifier`)) {
        self$`identifier` <- DeviationObject$`identifier`
      }
      if (!is.null(DeviationObject$`ppm`)) {
        self$`ppm` <- DeviationObject$`ppm`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "absolute": %d,
           "identifier": %s,
           "ppm": %d
        }',
        self$`absolute`,
        self$`identifier`,
        self$`ppm`
      )
    },
    fromJSONString = function(DeviationJson) {
      DeviationObject <- jsonlite::fromJSON(DeviationJson)
      self$`absolute` <- DeviationObject$`absolute`
      self$`identifier` <- DeviationObject$`identifier`
      self$`ppm` <- DeviationObject$`ppm`
    }
  )
)
