/*
 * API CHC v4
 * Liste l'ensemble des services et des opérations disponibles dans le module choix des cursus v4
 *
 * The version of the OpenAPI document: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.univlorraine.pegase.api.chc;

import fr.univlorraine.pegase.api.ApiCallback;
import fr.univlorraine.pegase.api.ApiClient;
import fr.univlorraine.pegase.api.ApiException;
import fr.univlorraine.pegase.api.ApiResponse;
import fr.univlorraine.pegase.api.Configuration;
import fr.univlorraine.pegase.api.Pair;
import fr.univlorraine.pegase.api.ProgressRequestBody;
import fr.univlorraine.pegase.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import fr.univlorraine.pegase.model.chc.Apprenant;
import fr.univlorraine.pegase.model.chc.ApprenantExtention;
import fr.univlorraine.pegase.model.chc.ObjetMaquetteExtension;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InscriptionApi {
    private ApiClient localVarApiClient;

    public InscriptionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InscriptionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for lireListeInscriptionsApprenantsDansFormation1
     * @param codeChemin Le code chemin de l&#39;objet de maquette (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @param versionMaquette La version maquette de l&#39;objet de maquette (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA valide ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeInscriptionsApprenantsDansFormation1Call(String codeChemin, String codePeriode, String codeStructure, String statutInscription, Integer versionMaquette, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/chc/v4/inscriptions/apprenants/objets-maquette/{codeChemin}/{codePeriode}/{codeStructure}/{versionMaquette}/{statutInscription}"
            .replaceAll("\\{" + "codeChemin" + "\\}", localVarApiClient.escapeString(codeChemin.toString()))
            .replaceAll("\\{" + "codePeriode" + "\\}", localVarApiClient.escapeString(codePeriode.toString()))
            .replaceAll("\\{" + "codeStructure" + "\\}", localVarApiClient.escapeString(codeStructure.toString()))
            .replaceAll("\\{" + "statutInscription" + "\\}", localVarApiClient.escapeString(statutInscription.toString()))
            .replaceAll("\\{" + "versionMaquette" + "\\}", localVarApiClient.escapeString(versionMaquette.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "idTokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call lireListeInscriptionsApprenantsDansFormation1ValidateBeforeCall(String codeChemin, String codePeriode, String codeStructure, String statutInscription, Integer versionMaquette, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codeChemin' is set
        if (codeChemin == null) {
            throw new ApiException("Missing the required parameter 'codeChemin' when calling lireListeInscriptionsApprenantsDansFormation1(Async)");
        }
        
        // verify the required parameter 'codePeriode' is set
        if (codePeriode == null) {
            throw new ApiException("Missing the required parameter 'codePeriode' when calling lireListeInscriptionsApprenantsDansFormation1(Async)");
        }
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling lireListeInscriptionsApprenantsDansFormation1(Async)");
        }
        
        // verify the required parameter 'statutInscription' is set
        if (statutInscription == null) {
            throw new ApiException("Missing the required parameter 'statutInscription' when calling lireListeInscriptionsApprenantsDansFormation1(Async)");
        }
        
        // verify the required parameter 'versionMaquette' is set
        if (versionMaquette == null) {
            throw new ApiException("Missing the required parameter 'versionMaquette' when calling lireListeInscriptionsApprenantsDansFormation1(Async)");
        }
        

        okhttp3.Call localVarCall = lireListeInscriptionsApprenantsDansFormation1Call(codeChemin, codePeriode, codeStructure, statutInscription, versionMaquette, _callback);
        return localVarCall;

    }

    /**
     * Liste des inscriptions des apprenants qui ont une IA en fonction d&#39;une formation , d&#39;un statut inscription et d&#39;une structure
     * 
     * @param codeChemin Le code chemin de l&#39;objet de maquette (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @param versionMaquette La version maquette de l&#39;objet de maquette (required)
     * @return List&lt;ApprenantExtention&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA valide ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public List<ApprenantExtention> lireListeInscriptionsApprenantsDansFormation1(String codeChemin, String codePeriode, String codeStructure, String statutInscription, Integer versionMaquette) throws ApiException {
        ApiResponse<List<ApprenantExtention>> localVarResp = lireListeInscriptionsApprenantsDansFormation1WithHttpInfo(codeChemin, codePeriode, codeStructure, statutInscription, versionMaquette);
        return localVarResp.getData();
    }

    /**
     * Liste des inscriptions des apprenants qui ont une IA en fonction d&#39;une formation , d&#39;un statut inscription et d&#39;une structure
     * 
     * @param codeChemin Le code chemin de l&#39;objet de maquette (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @param versionMaquette La version maquette de l&#39;objet de maquette (required)
     * @return ApiResponse&lt;List&lt;ApprenantExtention&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA valide ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ApprenantExtention>> lireListeInscriptionsApprenantsDansFormation1WithHttpInfo(String codeChemin, String codePeriode, String codeStructure, String statutInscription, Integer versionMaquette) throws ApiException {
        okhttp3.Call localVarCall = lireListeInscriptionsApprenantsDansFormation1ValidateBeforeCall(codeChemin, codePeriode, codeStructure, statutInscription, versionMaquette, null);
        Type localVarReturnType = new TypeToken<List<ApprenantExtention>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liste des inscriptions des apprenants qui ont une IA en fonction d&#39;une formation , d&#39;un statut inscription et d&#39;une structure (asynchronously)
     * 
     * @param codeChemin Le code chemin de l&#39;objet de maquette (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @param versionMaquette La version maquette de l&#39;objet de maquette (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA valide ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeInscriptionsApprenantsDansFormation1Async(String codeChemin, String codePeriode, String codeStructure, String statutInscription, Integer versionMaquette, final ApiCallback<List<ApprenantExtention>> _callback) throws ApiException {

        okhttp3.Call localVarCall = lireListeInscriptionsApprenantsDansFormation1ValidateBeforeCall(codeChemin, codePeriode, codeStructure, statutInscription, versionMaquette, _callback);
        Type localVarReturnType = new TypeToken<List<ApprenantExtention>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for lireListeInscriptionsApprenantsDansPeriode1
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA  ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeInscriptionsApprenantsDansPeriode1Call(String codePeriode, String codeStructure, String statutInscription, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/chc/v4/inscriptions/apprenants/{codePeriode}/{codeStructure}/{statutInscription}"
            .replaceAll("\\{" + "codePeriode" + "\\}", localVarApiClient.escapeString(codePeriode.toString()))
            .replaceAll("\\{" + "codeStructure" + "\\}", localVarApiClient.escapeString(codeStructure.toString()))
            .replaceAll("\\{" + "statutInscription" + "\\}", localVarApiClient.escapeString(statutInscription.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "idTokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call lireListeInscriptionsApprenantsDansPeriode1ValidateBeforeCall(String codePeriode, String codeStructure, String statutInscription, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codePeriode' is set
        if (codePeriode == null) {
            throw new ApiException("Missing the required parameter 'codePeriode' when calling lireListeInscriptionsApprenantsDansPeriode1(Async)");
        }
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling lireListeInscriptionsApprenantsDansPeriode1(Async)");
        }
        
        // verify the required parameter 'statutInscription' is set
        if (statutInscription == null) {
            throw new ApiException("Missing the required parameter 'statutInscription' when calling lireListeInscriptionsApprenantsDansPeriode1(Async)");
        }
        

        okhttp3.Call localVarCall = lireListeInscriptionsApprenantsDansPeriode1Call(codePeriode, codeStructure, statutInscription, _callback);
        return localVarCall;

    }

    /**
     * Liste des inscriptions des apprenants qui ont une IA en fonction d&#39;une structure, d&#39;une période et d&#39;un statut inscription
     * 
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @return List&lt;Apprenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA  ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public List<Apprenant> lireListeInscriptionsApprenantsDansPeriode1(String codePeriode, String codeStructure, String statutInscription) throws ApiException {
        ApiResponse<List<Apprenant>> localVarResp = lireListeInscriptionsApprenantsDansPeriode1WithHttpInfo(codePeriode, codeStructure, statutInscription);
        return localVarResp.getData();
    }

    /**
     * Liste des inscriptions des apprenants qui ont une IA en fonction d&#39;une structure, d&#39;une période et d&#39;un statut inscription
     * 
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @return ApiResponse&lt;List&lt;Apprenant&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA  ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Apprenant>> lireListeInscriptionsApprenantsDansPeriode1WithHttpInfo(String codePeriode, String codeStructure, String statutInscription) throws ApiException {
        okhttp3.Call localVarCall = lireListeInscriptionsApprenantsDansPeriode1ValidateBeforeCall(codePeriode, codeStructure, statutInscription, null);
        Type localVarReturnType = new TypeToken<List<Apprenant>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liste des inscriptions des apprenants qui ont une IA en fonction d&#39;une structure, d&#39;une période et d&#39;un statut inscription (asynchronously)
     * 
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param statutInscription Le code statut de l&#39;inscription (VALIDE / ANNULEE) (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les inscriptions des apprenants qui ont une IA  ont été récupérées </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeInscriptionsApprenantsDansPeriode1Async(String codePeriode, String codeStructure, String statutInscription, final ApiCallback<List<Apprenant>> _callback) throws ApiException {

        okhttp3.Call localVarCall = lireListeInscriptionsApprenantsDansPeriode1ValidateBeforeCall(codePeriode, codeStructure, statutInscription, _callback);
        Type localVarReturnType = new TypeToken<List<Apprenant>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les objets de maquettes de l&#39;apprenant avec un IA valide ont été récupérés </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2Call(String codeApprenant, String codePeriode, String codeStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/chc/v4/inscriptions/objets-maquette/{codeApprenant}/{codePeriode}/{codeStructure}"
            .replaceAll("\\{" + "codeApprenant" + "\\}", localVarApiClient.escapeString(codeApprenant.toString()))
            .replaceAll("\\{" + "codePeriode" + "\\}", localVarApiClient.escapeString(codePeriode.toString()))
            .replaceAll("\\{" + "codeStructure" + "\\}", localVarApiClient.escapeString(codeStructure.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "idTokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2ValidateBeforeCall(String codeApprenant, String codePeriode, String codeStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codeApprenant' is set
        if (codeApprenant == null) {
            throw new ApiException("Missing the required parameter 'codeApprenant' when calling lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2(Async)");
        }
        
        // verify the required parameter 'codePeriode' is set
        if (codePeriode == null) {
            throw new ApiException("Missing the required parameter 'codePeriode' when calling lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2(Async)");
        }
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2(Async)");
        }
        

        okhttp3.Call localVarCall = lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2Call(codeApprenant, codePeriode, codeStructure, _callback);
        return localVarCall;

    }

    /**
     * Liste des objets de maquette de l&#39;apprenant avec une IA validée ou annulée en fonction d&#39;une période, d&#39;une structure
     * 
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @return List&lt;ObjetMaquetteExtension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les objets de maquettes de l&#39;apprenant avec un IA valide ont été récupérés </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public List<ObjetMaquetteExtension> lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2(String codeApprenant, String codePeriode, String codeStructure) throws ApiException {
        ApiResponse<List<ObjetMaquetteExtension>> localVarResp = lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2WithHttpInfo(codeApprenant, codePeriode, codeStructure);
        return localVarResp.getData();
    }

    /**
     * Liste des objets de maquette de l&#39;apprenant avec une IA validée ou annulée en fonction d&#39;une période, d&#39;une structure
     * 
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @return ApiResponse&lt;List&lt;ObjetMaquetteExtension&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les objets de maquettes de l&#39;apprenant avec un IA valide ont été récupérés </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ObjetMaquetteExtension>> lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2WithHttpInfo(String codeApprenant, String codePeriode, String codeStructure) throws ApiException {
        okhttp3.Call localVarCall = lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2ValidateBeforeCall(codeApprenant, codePeriode, codeStructure, null);
        Type localVarReturnType = new TypeToken<List<ObjetMaquetteExtension>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liste des objets de maquette de l&#39;apprenant avec une IA validée ou annulée en fonction d&#39;une période, d&#39;une structure (asynchronously)
     * 
     * @param codeApprenant Le code de l&#39;apprenant (required)
     * @param codePeriode Le code de la période de l&#39;objet de maquette (required)
     * @param codeStructure Le code structure de l&#39;objet de maquette (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Les objets de maquettes de l&#39;apprenant avec un IA valide ont été récupérés </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2Async(String codeApprenant, String codePeriode, String codeStructure, final ApiCallback<List<ObjetMaquetteExtension>> _callback) throws ApiException {

        okhttp3.Call localVarCall = lireListeInscriptionsObjetsMaquettesPourApprenantDansPeriode2ValidateBeforeCall(codeApprenant, codePeriode, codeStructure, _callback);
        Type localVarReturnType = new TypeToken<List<ObjetMaquetteExtension>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}