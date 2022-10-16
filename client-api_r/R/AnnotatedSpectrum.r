# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' AnnotatedSpectrum Class
#'
#' @field msLevel 
#' @field collisionEnergy 
#' @field peaks 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AnnotatedSpectrum <- R6::R6Class(
  'AnnotatedSpectrum',
  public = list(
    `msLevel` = NULL,
    `collisionEnergy` = NULL,
    `peaks` = NULL,
    initialize = function(`msLevel`, `collisionEnergy`, `peaks`){
      if (!missing(`msLevel`)) {
        stopifnot(is.numeric(`msLevel`), length(`msLevel`) == 1)
        self$`msLevel` <- `msLevel`
      }
      if (!missing(`collisionEnergy`)) {
        stopifnot(R6::is.R6(`collisionEnergy`))
        self$`collisionEnergy` <- `collisionEnergy`
      }
      if (!missing(`peaks`)) {
        stopifnot(is.list(`peaks`), length(`peaks`) != 0)
        lapply(`peaks`, function(x) stopifnot(R6::is.R6(x)))
        self$`peaks` <- `peaks`
      }
    },
    toJSON = function() {
      AnnotatedSpectrumObject <- list()
      if (!is.null(self$`msLevel`)) {
        AnnotatedSpectrumObject[['msLevel']] <- self$`msLevel`
      }
      if (!is.null(self$`collisionEnergy`)) {
        AnnotatedSpectrumObject[['collisionEnergy']] <- self$`collisionEnergy`$toJSON()
      }
      if (!is.null(self$`peaks`)) {
        AnnotatedSpectrumObject[['peaks']] <- lapply(self$`peaks`, function(x) x$toJSON())
      }

      AnnotatedSpectrumObject
    },
    fromJSON = function(AnnotatedSpectrumJson) {
      AnnotatedSpectrumObject <- jsonlite::fromJSON(AnnotatedSpectrumJson)
      if (!is.null(AnnotatedSpectrumObject$`msLevel`)) {
        self$`msLevel` <- AnnotatedSpectrumObject$`msLevel`
      }
      if (!is.null(AnnotatedSpectrumObject$`collisionEnergy`)) {
        collisionEnergyObject <- CollisionEnergy$new()
        collisionEnergyObject$fromJSON(jsonlite::toJSON(AnnotatedSpectrumObject$collisionEnergy, auto_unbox = TRUE))
        self$`collisionEnergy` <- collisionEnergyObject
      }
      if (!is.null(AnnotatedSpectrumObject$`peaks`)) {
        self$`peaks` <- lapply(AnnotatedSpectrumObject$`peaks`, function(x) {
          peaksObject <- AnnotatedPeak$new()
          peaksObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          peaksObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "msLevel": %d,
           "collisionEnergy": %s,
           "peaks": [%s]
        }',
        self$`msLevel`,
        self$`collisionEnergy`$toJSON(),
        lapply(self$`peaks`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(AnnotatedSpectrumJson) {
      AnnotatedSpectrumObject <- jsonlite::fromJSON(AnnotatedSpectrumJson)
      self$`msLevel` <- AnnotatedSpectrumObject$`msLevel`
      CollisionEnergyObject <- CollisionEnergy$new()
      self$`collisionEnergy` <- CollisionEnergyObject$fromJSON(jsonlite::toJSON(AnnotatedSpectrumObject$collisionEnergy, auto_unbox = TRUE))
      self$`peaks` <- lapply(AnnotatedSpectrumObject$`peaks`, function(x) AnnotatedPeak$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
