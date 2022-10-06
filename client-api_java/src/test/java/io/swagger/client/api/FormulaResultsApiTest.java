/*
 * SIRIUS Nightsky API
 * REST API that provides the full functionality of SIRIUS and its web services as background service. It is intended as entry-point for scripting languages and software integration SDKs.
 *
 * OpenAPI spec version: v0.9 on SIRIUS 5.6.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.AnnotatedSpectrum;
import io.swagger.client.model.CanopusPredictions;
import io.swagger.client.model.CompoundClasses;
import io.swagger.client.model.FormulaResultContainer;
import io.swagger.client.model.FragmentationTree;
import io.swagger.client.model.StructureCandidate;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FormulaResultsApi
 */
@Ignore
public class FormulaResultsApiTest {

    private final FormulaResultsApi api = new FormulaResultsApi();

    /**
     * Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
     *
     * Best matching compound classes,  Set of the highest scoring compound classes CANOPUS) on each hierarchy level of  the ClassyFire and NPC ontology,
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBestMatchingCanopusPredictionsTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        CompoundClasses response = api.getBestMatchingCanopusPredictions(projectId, compoundId, formulaId);

        // TODO: test validations
    }
    /**
     * All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
     *
     * All predicted compound classes (CANOPUS) from ClassyFire and NPC and their probabilities,
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCanopusPredictionsTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        CanopusPredictions response = api.getCanopusPredictions(projectId, compoundId, formulaId);

        // TODO: test validations
    }
    /**
     * Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.
     *
     * Returns predicted fingerprint (CSI:FingerID) for the given formula result identifier  This fingerprint is used to perfom structure database search and predict compound classes.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFingerprintPredictionTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        List<Double> response = api.getFingerprintPrediction(projectId, compoundId, formulaId);

        // TODO: test validations
    }
    /**
     * List of all FormulaResultContainers available for this compound/feature with minimal information.
     *
     * List of all FormulaResultContainers available for this compound/feature with minimal information.  Can be enriched with an optional results overview.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormulaIdsTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        Boolean resultOverview = null;
        Boolean formulaCandidate = null;
        List<FormulaResultContainer> response = api.getFormulaIds(projectId, compoundId, resultOverview, formulaCandidate);

        // TODO: test validations
    }
    /**
     * FormulaResultContainers for the given &#x27;formulaId&#x27; with minimal information.
     *
     * FormulaResultContainers for the given &#x27;formulaId&#x27; with minimal information.  Can be enriched with an optional results overview and formula candidate information.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFormulaResultTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        Boolean resultOverview = null;
        Boolean formulaCandidate = null;
        FormulaResultContainer response = api.getFormulaResult(projectId, compoundId, formulaId, resultOverview, formulaCandidate);

        // TODO: test validations
    }
    /**
     * Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
     *
     * Returns fragmentation tree (SIRIUS) for the given formula result identifier  This tree is used to rank formula candidates (treeScore).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFragTreeTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        FragmentationTree response = api.getFragTree(projectId, compoundId, formulaId);

        // TODO: test validations
    }
    /**
     * Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.
     *
     * Returns simulated isotope pattern (SIRIUS) for the given formula result identifier.  This simulated isotope pattern is used to rank formula candidates (treeScore).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSimulatedIsotopePatternTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        AnnotatedSpectrum response = api.getSimulatedIsotopePattern(projectId, compoundId, formulaId);

        // TODO: test validations
    }
    /**
     * List of StructureCandidates the given &#x27;formulaId&#x27; with minimal information.
     *
     * List of StructureCandidates the given &#x27;formulaId&#x27; with minimal information.  StructureCandidates can be enriched with molecular fingerprint, structure database links and pubmed ids,
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStructureCandidatesTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        String formulaId = null;
        Boolean fingerprint = null;
        Boolean dbLinks = null;
        Boolean pubMedIds = null;
        Integer topK = null;
        List<StructureCandidate> response = api.getStructureCandidates(projectId, compoundId, formulaId, fingerprint, dbLinks, pubMedIds, topK);

        // TODO: test validations
    }
    /**
     * Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).
     *
     * Best Scoring StructureCandidate over all molecular formular resutls that belong to the specified  compound/feature (compoundId).
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTopStructureCandidateTest() throws Exception {
        String projectId = null;
        String compoundId = null;
        Boolean fingerprint = null;
        Boolean dbLinks = null;
        Boolean pubMedIds = null;
        StructureCandidate response = api.getTopStructureCandidate(projectId, compoundId, fingerprint, dbLinks, pubMedIds);

        // TODO: test validations
    }
}