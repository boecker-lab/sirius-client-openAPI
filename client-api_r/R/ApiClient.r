# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' ApiClient Class
#'
#' Generic API client for Swagger client library builds.
#' Swagger generic API client. This client handles the client-
#' server communication, and is invariant across implementations. Specifics of
#' the methods and models for each application are generated from the Swagger
#' templates.
#'
#' NOTE: This class is auto generated by the swagger code generator program.
#' Ref: https://github.com/swagger-api/swagger-codegen
#' Do not edit the class manually.
#'
#' @export
ApiClient  <- R6::R6Class(
  'ApiClient',
  public = list(
    basePath = "http://localhost:8080",
    configuration = NULL,
    userAgent = NULL,
    defaultHeaders = NULL,
    initialize = function(basePath, configuration, defaultHeaders){
        if (!missing(basePath)) {
            self$basePath <- basePath
        }

        if (!missing(configuration)) {
            self$configuration <- configuration
        }

        if (!missing(defaultHeaders)) {
            self$defaultHeaders <- defaultHeaders
        }

        self$`userAgent` <- 'Swagger-Codegen/1.0.0/r'
    },
    callApi = function(url, method, queryParams, headerParams, body, ...){
        headers <- httr::add_headers(headerParams)

        if (method == "GET") {
            httr::GET(url, queryParams, headers, ...)
        }
        else if (method == "POST") {
            httr::POST(url, queryParams, headers, body = body, ...)
        }
        else if (method == "PUT") {
            httr::PUT(url, queryParams, headers, body = body, ...)
        }
        else if (method == "PATCH") {
            httr::PATCH(url, queryParams, headers, body = body, ...)
        }
        else if (method == "HEAD") {
            httr::HEAD(url, queryParams, headers, ...)
        }
        else if (method == "DELETE") {
            httr::DELETE(url, queryParams, headers, ...)
        }
        else {
            stop("http method must be `GET`, `HEAD`, `OPTIONS`, `POST`, `PATCH`, `PUT` or `DELETE`.")
        }
    }
  )
)