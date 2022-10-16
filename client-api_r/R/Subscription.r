# SIRIUS Nightsky API
#
# REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
#
# OpenAPI spec version: v0.9 on SIRIUS 5.6.1-SNAPSHOT
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Subscription Class
#'
#' @field sid 
#' @field subscriberId 
#' @field subscriberName 
#' @field expirationDate 
#' @field countQueries 
#' @field compoundLimit 
#' @field compoundHashRecordingTime 
#' @field maxQueriesPerCompound 
#' @field maxUserAccounts 
#' @field serviceUrl 
#' @field description 
#' @field name 
#' @field tos 
#' @field pp 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Subscription <- R6::R6Class(
  'Subscription',
  public = list(
    `sid` = NULL,
    `subscriberId` = NULL,
    `subscriberName` = NULL,
    `expirationDate` = NULL,
    `countQueries` = NULL,
    `compoundLimit` = NULL,
    `compoundHashRecordingTime` = NULL,
    `maxQueriesPerCompound` = NULL,
    `maxUserAccounts` = NULL,
    `serviceUrl` = NULL,
    `description` = NULL,
    `name` = NULL,
    `tos` = NULL,
    `pp` = NULL,
    initialize = function(`sid`, `subscriberId`, `subscriberName`, `expirationDate`, `countQueries`, `compoundLimit`, `compoundHashRecordingTime`, `maxQueriesPerCompound`, `maxUserAccounts`, `serviceUrl`, `description`, `name`, `tos`, `pp`){
      if (!missing(`sid`)) {
        stopifnot(is.character(`sid`), length(`sid`) == 1)
        self$`sid` <- `sid`
      }
      if (!missing(`subscriberId`)) {
        stopifnot(is.character(`subscriberId`), length(`subscriberId`) == 1)
        self$`subscriberId` <- `subscriberId`
      }
      if (!missing(`subscriberName`)) {
        stopifnot(is.character(`subscriberName`), length(`subscriberName`) == 1)
        self$`subscriberName` <- `subscriberName`
      }
      if (!missing(`expirationDate`)) {
        stopifnot(is.character(`expirationDate`), length(`expirationDate`) == 1)
        self$`expirationDate` <- `expirationDate`
      }
      if (!missing(`countQueries`)) {
        self$`countQueries` <- `countQueries`
      }
      if (!missing(`compoundLimit`)) {
        stopifnot(is.numeric(`compoundLimit`), length(`compoundLimit`) == 1)
        self$`compoundLimit` <- `compoundLimit`
      }
      if (!missing(`compoundHashRecordingTime`)) {
        stopifnot(is.numeric(`compoundHashRecordingTime`), length(`compoundHashRecordingTime`) == 1)
        self$`compoundHashRecordingTime` <- `compoundHashRecordingTime`
      }
      if (!missing(`maxQueriesPerCompound`)) {
        stopifnot(is.numeric(`maxQueriesPerCompound`), length(`maxQueriesPerCompound`) == 1)
        self$`maxQueriesPerCompound` <- `maxQueriesPerCompound`
      }
      if (!missing(`maxUserAccounts`)) {
        stopifnot(is.numeric(`maxUserAccounts`), length(`maxUserAccounts`) == 1)
        self$`maxUserAccounts` <- `maxUserAccounts`
      }
      if (!missing(`serviceUrl`)) {
        stopifnot(is.character(`serviceUrl`), length(`serviceUrl`) == 1)
        self$`serviceUrl` <- `serviceUrl`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`tos`)) {
        stopifnot(is.character(`tos`), length(`tos`) == 1)
        self$`tos` <- `tos`
      }
      if (!missing(`pp`)) {
        stopifnot(is.character(`pp`), length(`pp`) == 1)
        self$`pp` <- `pp`
      }
    },
    toJSON = function() {
      SubscriptionObject <- list()
      if (!is.null(self$`sid`)) {
        SubscriptionObject[['sid']] <- self$`sid`
      }
      if (!is.null(self$`subscriberId`)) {
        SubscriptionObject[['subscriberId']] <- self$`subscriberId`
      }
      if (!is.null(self$`subscriberName`)) {
        SubscriptionObject[['subscriberName']] <- self$`subscriberName`
      }
      if (!is.null(self$`expirationDate`)) {
        SubscriptionObject[['expirationDate']] <- self$`expirationDate`
      }
      if (!is.null(self$`countQueries`)) {
        SubscriptionObject[['countQueries']] <- self$`countQueries`
      }
      if (!is.null(self$`compoundLimit`)) {
        SubscriptionObject[['compoundLimit']] <- self$`compoundLimit`
      }
      if (!is.null(self$`compoundHashRecordingTime`)) {
        SubscriptionObject[['compoundHashRecordingTime']] <- self$`compoundHashRecordingTime`
      }
      if (!is.null(self$`maxQueriesPerCompound`)) {
        SubscriptionObject[['maxQueriesPerCompound']] <- self$`maxQueriesPerCompound`
      }
      if (!is.null(self$`maxUserAccounts`)) {
        SubscriptionObject[['maxUserAccounts']] <- self$`maxUserAccounts`
      }
      if (!is.null(self$`serviceUrl`)) {
        SubscriptionObject[['serviceUrl']] <- self$`serviceUrl`
      }
      if (!is.null(self$`description`)) {
        SubscriptionObject[['description']] <- self$`description`
      }
      if (!is.null(self$`name`)) {
        SubscriptionObject[['name']] <- self$`name`
      }
      if (!is.null(self$`tos`)) {
        SubscriptionObject[['tos']] <- self$`tos`
      }
      if (!is.null(self$`pp`)) {
        SubscriptionObject[['pp']] <- self$`pp`
      }

      SubscriptionObject
    },
    fromJSON = function(SubscriptionJson) {
      SubscriptionObject <- jsonlite::fromJSON(SubscriptionJson)
      if (!is.null(SubscriptionObject$`sid`)) {
        self$`sid` <- SubscriptionObject$`sid`
      }
      if (!is.null(SubscriptionObject$`subscriberId`)) {
        self$`subscriberId` <- SubscriptionObject$`subscriberId`
      }
      if (!is.null(SubscriptionObject$`subscriberName`)) {
        self$`subscriberName` <- SubscriptionObject$`subscriberName`
      }
      if (!is.null(SubscriptionObject$`expirationDate`)) {
        self$`expirationDate` <- SubscriptionObject$`expirationDate`
      }
      if (!is.null(SubscriptionObject$`countQueries`)) {
        self$`countQueries` <- SubscriptionObject$`countQueries`
      }
      if (!is.null(SubscriptionObject$`compoundLimit`)) {
        self$`compoundLimit` <- SubscriptionObject$`compoundLimit`
      }
      if (!is.null(SubscriptionObject$`compoundHashRecordingTime`)) {
        self$`compoundHashRecordingTime` <- SubscriptionObject$`compoundHashRecordingTime`
      }
      if (!is.null(SubscriptionObject$`maxQueriesPerCompound`)) {
        self$`maxQueriesPerCompound` <- SubscriptionObject$`maxQueriesPerCompound`
      }
      if (!is.null(SubscriptionObject$`maxUserAccounts`)) {
        self$`maxUserAccounts` <- SubscriptionObject$`maxUserAccounts`
      }
      if (!is.null(SubscriptionObject$`serviceUrl`)) {
        self$`serviceUrl` <- SubscriptionObject$`serviceUrl`
      }
      if (!is.null(SubscriptionObject$`description`)) {
        self$`description` <- SubscriptionObject$`description`
      }
      if (!is.null(SubscriptionObject$`name`)) {
        self$`name` <- SubscriptionObject$`name`
      }
      if (!is.null(SubscriptionObject$`tos`)) {
        self$`tos` <- SubscriptionObject$`tos`
      }
      if (!is.null(SubscriptionObject$`pp`)) {
        self$`pp` <- SubscriptionObject$`pp`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "sid": %s,
           "subscriberId": %s,
           "subscriberName": %s,
           "expirationDate": %s,
           "countQueries": %s,
           "compoundLimit": %d,
           "compoundHashRecordingTime": %d,
           "maxQueriesPerCompound": %d,
           "maxUserAccounts": %d,
           "serviceUrl": %s,
           "description": %s,
           "name": %s,
           "tos": %s,
           "pp": %s
        }',
        self$`sid`,
        self$`subscriberId`,
        self$`subscriberName`,
        self$`expirationDate`,
        self$`countQueries`,
        self$`compoundLimit`,
        self$`compoundHashRecordingTime`,
        self$`maxQueriesPerCompound`,
        self$`maxUserAccounts`,
        self$`serviceUrl`,
        self$`description`,
        self$`name`,
        self$`tos`,
        self$`pp`
      )
    },
    fromJSONString = function(SubscriptionJson) {
      SubscriptionObject <- jsonlite::fromJSON(SubscriptionJson)
      self$`sid` <- SubscriptionObject$`sid`
      self$`subscriberId` <- SubscriptionObject$`subscriberId`
      self$`subscriberName` <- SubscriptionObject$`subscriberName`
      self$`expirationDate` <- SubscriptionObject$`expirationDate`
      self$`countQueries` <- SubscriptionObject$`countQueries`
      self$`compoundLimit` <- SubscriptionObject$`compoundLimit`
      self$`compoundHashRecordingTime` <- SubscriptionObject$`compoundHashRecordingTime`
      self$`maxQueriesPerCompound` <- SubscriptionObject$`maxQueriesPerCompound`
      self$`maxUserAccounts` <- SubscriptionObject$`maxUserAccounts`
      self$`serviceUrl` <- SubscriptionObject$`serviceUrl`
      self$`description` <- SubscriptionObject$`description`
      self$`name` <- SubscriptionObject$`name`
      self$`tos` <- SubscriptionObject$`tos`
      self$`pp` <- SubscriptionObject$`pp`
    }
  )
)
