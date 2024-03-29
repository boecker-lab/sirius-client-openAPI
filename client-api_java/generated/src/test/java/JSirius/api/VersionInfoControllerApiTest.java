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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VersionInfoControllerApi
 */
@Disabled
public class VersionInfoControllerApiTest {

    private final VersionInfoControllerApi api = new VersionInfoControllerApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionInfoTest() throws ApiException {
        String response = api.getVersionInfo();
        // TODO: test validations
    }

}
