# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.3-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' MsData Class
#'
#' @field mergedMs1 
#' @field mergedMs2 
#' @field ms2Spectra 
#' @field ms1Spectra 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MsData <- R6::R6Class(
  'MsData',
  public = list(
    `mergedMs1` = NULL,
    `mergedMs2` = NULL,
    `ms2Spectra` = NULL,
    `ms1Spectra` = NULL,
    initialize = function(`mergedMs1`, `mergedMs2`, `ms2Spectra`, `ms1Spectra`){
      if (!missing(`mergedMs1`)) {
        stopifnot(R6::is.R6(`mergedMs1`))
        self$`mergedMs1` <- `mergedMs1`
      }
      if (!missing(`mergedMs2`)) {
        stopifnot(R6::is.R6(`mergedMs2`))
        self$`mergedMs2` <- `mergedMs2`
      }
      if (!missing(`ms2Spectra`)) {
        stopifnot(is.list(`ms2Spectra`), length(`ms2Spectra`) != 0)
        lapply(`ms2Spectra`, function(x) stopifnot(R6::is.R6(x)))
        self$`ms2Spectra` <- `ms2Spectra`
      }
      if (!missing(`ms1Spectra`)) {
        stopifnot(is.list(`ms1Spectra`), length(`ms1Spectra`) != 0)
        lapply(`ms1Spectra`, function(x) stopifnot(R6::is.R6(x)))
        self$`ms1Spectra` <- `ms1Spectra`
      }
    },
    toJSON = function() {
      MsDataObject <- list()
      if (!is.null(self$`mergedMs1`)) {
        MsDataObject[['mergedMs1']] <- self$`mergedMs1`$toJSON()
      }
      if (!is.null(self$`mergedMs2`)) {
        MsDataObject[['mergedMs2']] <- self$`mergedMs2`$toJSON()
      }
      if (!is.null(self$`ms2Spectra`)) {
        MsDataObject[['ms2Spectra']] <- lapply(self$`ms2Spectra`, function(x) x$toJSON())
      }
      if (!is.null(self$`ms1Spectra`)) {
        MsDataObject[['ms1Spectra']] <- lapply(self$`ms1Spectra`, function(x) x$toJSON())
      }

      MsDataObject
    },
    fromJSON = function(MsDataJson) {
      MsDataObject <- jsonlite::fromJSON(MsDataJson)
      if (!is.null(MsDataObject$`mergedMs1`)) {
        mergedMs1Object <- AnnotatedSpectrum$new()
        mergedMs1Object$fromJSON(jsonlite::toJSON(MsDataObject$mergedMs1, auto_unbox = TRUE))
        self$`mergedMs1` <- mergedMs1Object
      }
      if (!is.null(MsDataObject$`mergedMs2`)) {
        mergedMs2Object <- AnnotatedSpectrum$new()
        mergedMs2Object$fromJSON(jsonlite::toJSON(MsDataObject$mergedMs2, auto_unbox = TRUE))
        self$`mergedMs2` <- mergedMs2Object
      }
      if (!is.null(MsDataObject$`ms2Spectra`)) {
        self$`ms2Spectra` <- lapply(MsDataObject$`ms2Spectra`, function(x) {
          ms2SpectraObject <- AnnotatedSpectrum$new()
          ms2SpectraObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          ms2SpectraObject
        })
      }
      if (!is.null(MsDataObject$`ms1Spectra`)) {
        self$`ms1Spectra` <- lapply(MsDataObject$`ms1Spectra`, function(x) {
          ms1SpectraObject <- AnnotatedSpectrum$new()
          ms1SpectraObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          ms1SpectraObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "mergedMs1": %s,
           "mergedMs2": %s,
           "ms2Spectra": [%s],
           "ms1Spectra": [%s]
        }',
        self$`mergedMs1`$toJSON(),
        self$`mergedMs2`$toJSON(),
        lapply(self$`ms2Spectra`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`ms1Spectra`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(MsDataJson) {
      MsDataObject <- jsonlite::fromJSON(MsDataJson)
      AnnotatedSpectrumObject <- AnnotatedSpectrum$new()
      self$`mergedMs1` <- AnnotatedSpectrumObject$fromJSON(jsonlite::toJSON(MsDataObject$mergedMs1, auto_unbox = TRUE))
      AnnotatedSpectrumObject <- AnnotatedSpectrum$new()
      self$`mergedMs2` <- AnnotatedSpectrumObject$fromJSON(jsonlite::toJSON(MsDataObject$mergedMs2, auto_unbox = TRUE))
      self$`ms2Spectra` <- lapply(MsDataObject$`ms2Spectra`, function(x) AnnotatedSpectrum$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`ms1Spectra` <- lapply(MsDataObject$`ms1Spectra`, function(x) AnnotatedSpectrum$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
