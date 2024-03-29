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
import JSirius.model.GuiParameters;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GraphicalUserInterfaceApi
 */
@Disabled
public class GraphicalUserInterfaceApiTest {

    private final GraphicalUserInterfaceApi api = new GraphicalUserInterfaceApi();

    /**
     * Apply given changes to the running GUI instance.
     *
     * Apply given changes to the running GUI instance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void applyToGuiTest() throws ApiException {
        String projectId = null;
        GuiParameters guiParameters = null;
        api.applyToGui(projectId, guiParameters);
        // TODO: test validations
    }

    /**
     * Close GUI instance of given project-space if available.
     *
     * Close GUI instance of given project-space if available.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void closeGuiTest() throws ApiException {
        String projectId = null;
        api.closeGui(projectId);
        // TODO: test validations
    }

    /**
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     *
     * Open GUI instance on specified project-space and bring the GUI window to foreground.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void openGuiTest() throws ApiException {
        String projectId = null;
        Boolean readOnly = null;
        api.openGui(projectId, readOnly);
        // TODO: test validations
    }

}
