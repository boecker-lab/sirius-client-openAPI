/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * The version of the OpenAPI document: v0.9 on SIRIUS 6.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package JSirius.api;

import JSirius.ApiException;
import JSirius.model.ProjectSpaceId;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectSpacesApi
 */
@Disabled
public class ProjectSpacesApiTest {

    private final ProjectSpacesApi api = new ProjectSpacesApi();

    /**
     * Close project-space and remove it from application.
     *
     * Close project-space and remove it from application. Project-space will NOT be deleted from disk.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void closeProjectSpaceTest() throws ApiException {
        String projectId = null;
        api.closeProjectSpace(projectId);
        // TODO: test validations
    }

    /**
     * Create and open a new project-space at given location and make it accessible via the given projectId.
     *
     * Create and open a new project-space at given location and make it accessible via the given projectId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectSpaceTest() throws ApiException {
        String projectId = null;
        String pathToProject = null;
        String pathToSourceProject = null;
        Boolean awaitImport = null;
        ProjectSpaceId response = api.createProjectSpace(projectId, pathToProject, pathToSourceProject, awaitImport);
        // TODO: test validations
    }

    /**
     * Get project space info by its projectId.
     *
     * Get project space info by its projectId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectSpaceTest() throws ApiException {
        String projectId = null;
        ProjectSpaceId response = api.getProjectSpace(projectId);
        // TODO: test validations
    }

    /**
     * List all opened project spaces.
     *
     * List all opened project spaces.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectSpacesTest() throws ApiException {
        List<ProjectSpaceId> response = api.getProjectSpaces();
        // TODO: test validations
    }

    /**
     * Open an existing project-space and make it accessible via the given projectId.
     *
     * Open an existing project-space and make it accessible via the given projectId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void openProjectSpaceTest() throws ApiException {
        String projectId = null;
        String pathToProject = null;
        ProjectSpaceId response = api.openProjectSpace(projectId, pathToProject);
        // TODO: test validations
    }

}
