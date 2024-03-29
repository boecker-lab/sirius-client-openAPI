/*
 * SIRIUS Nightsky API
 * OpenAPI REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.The provided OpenAPI specification allows to autogenerate clients for different programming languages.
 *
 * The version of the OpenAPI document: 0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.api;

import JSirius.ApiException;
import JSirius.model.CompoundId;
import JSirius.model.JobId;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompoundsApi
 */
@Disabled
public class CompoundsApiTest {

    private final CompoundsApi api = new CompoundsApi();

    /**
     * Delete compound/feature with the given identifier from the specified project-space.
     *
     * Delete compound/feature with the given identifier from the specified project-space.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCompoundTest() throws ApiException {
        String projectId = null;
        String cid = null;
        api.deleteCompound(projectId, cid);
        // TODO: test validations
    }

    /**
     * Get compound/feature with the given identifier from the specified project-space.
     *
     * Get compound/feature with the given identifier from the specified project-space.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompoundTest() throws ApiException {
        String projectId = null;
        String cid = null;
        Boolean topAnnotation = null;
        Boolean msData = null;
        Boolean msQuality = null;
        CompoundId response = api.getCompound(projectId, cid, topAnnotation, msData, msQuality);
        // TODO: test validations
    }

    /**
     * Get all available compounds/features in the given project-space.
     *
     * Get all available compounds/features in the given project-space.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCompoundsTest() throws ApiException {
        String projectId = null;
        Boolean topAnnotation = null;
        Boolean msData = null;
        Boolean msQuality = null;
        List<CompoundId> response = api.getCompounds(projectId, topAnnotation, msData, msQuality);
        // TODO: test validations
    }

    /**
     * Import ms/ms data in given format from local filesystem into the specified project-space
     *
     * Import ms/ms data in given format from local filesystem into the specified project-space.  The import will run in a background job  Possible formats (ms, mgf, cef, msp, mzML, mzXML, project-space)  &lt;p&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importCompoundsTest() throws ApiException {
        String projectId = null;
        List<String> requestBody = null;
        Boolean alignLCMSRuns = null;
        Boolean allowMs1OnlyData = null;
        Boolean ignoreFormulas = null;
        JobId response = api.importCompounds(projectId, requestBody, alignLCMSRuns, allowMs1OnlyData, ignoreFormulas);
        // TODO: test validations
    }

    /**
     * Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)
     *
     * Import ms/ms data from the given format into the specified project-space  Possible formats (ms, mgf, cef, msp, mzML, mzXML)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importCompoundsFromStringTest() throws ApiException {
        String projectId = null;
        String format = null;
        String body = null;
        String sourceName = null;
        List<CompoundId> response = api.importCompoundsFromString(projectId, format, body, sourceName);
        // TODO: test validations
    }

}
