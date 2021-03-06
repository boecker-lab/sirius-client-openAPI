#' Starting SIRIUS as background/REST service.
#'
#' This method \code{start_server} starts SIRIUS as a background service.
#' This method should be called first in order to enable requests to and calculations with SIRIUS.
#' You have to call the function \code{shutdown_server} or the URL "http:\\localhost:<port>\actuator\shutdown"
#' to shutdown this service.
#'
#' @param pathToSirius A string which represents the path to the SIRIUS instance.
#' @param inputData A string which represents the path to the input data for further analysis.
#'				 	This can be either preprocessed mass spectra in .ms or .mgf file format,
#' 					LC/MS runs in .mzML/.mzXml format or already existing SIRIUS project-space(s) (uncompressed/compressed).
#' @param projectSpace 	A string which specifies the project-space to read from and also write to
#'						if nothing else is specified. For compression use the file ending .zip or .sirius.
#' @param port Specify the port on which the SIRIUS REST service should run (Default: port = 8080).
#'
#' @export
start_server <- function(pathToSirius, inputData, projectSpace = "", port = 8080){
	if(all(is.character(pathToSirius),is.character(inputData),length(pathToSirius) == 1,length(inputData) == 1)){
        if(file.exists(pathToSirius) & !dir.exists(pathToSirius)){
            if(file.exists(inputData)){
                if(is.numeric(port)){
                    port <- as.integer(port)
                    dir_sirius <- dirname(pathToSirius) # can be a (relative or absolute) directory path, or just "."
                    sirius <- basename(pathToSirius) # the file which has to be executed

                    # Change working directory to the directory which contains SIRIUS.
                    # This has to be done in the case that pathToSirius contains at least one whitespace.
                    wd <- getwd()
                    setwd(dir_sirius)

                    # It is also possible that inputData and projectSpace contain at least one whitespace:
                    sirius_call <- paste("./",sirius," --input=","\"",inputData,"\"", sep = "")
                    if(!missing(projectSpace)){
                        if(is.character(projectSpace) & length(projectSpace) == 1){
                            if(file.exists(projectSpace)){
                                sirius_call <- paste(sirius_call," --project-space=","\"",projectSpace,"\"",sep = "")
                            }else{
                                stop("The string \"projectSpace\" should represent a valid path to your project space.")
                            }
                        }else{
                            stop("The given parameter \"projectSpace\" has to be a character vector of length 1.")
                        }
                    }
                    sirius_call <- paste(sirius_call," asService -s --port=",port,sep = "")

                    # Call SIRIUS as background service in commando line:
                    system(sirius_call, wait = FALSE)
                    setwd(wd)
                }else{
                    stop("The given parameter \"port\" has to be an integer value.")
                }
            }else{
                stop("The given string \"inputData\" should represent a valid path to the input.")
            }
        }else{
            stop("The given string \"pathToSirius\" should represent a valid path to the executable SIRIUS file.")
        }
	}else{
		stop("At least one of the parameters \"pathToSirius\" and \"inputData\" does not meet the requirements.
		        Both parameters \"pathToSirius\" and \"inputData\" have to be character vectors of length 1.")
	}
}