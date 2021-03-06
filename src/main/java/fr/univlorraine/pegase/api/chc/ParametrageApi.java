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


import fr.univlorraine.pegase.model.chc.Nomenclature;
import fr.univlorraine.pegase.model.chc.TypeAmenagement;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParametrageApi {
    private ApiClient localVarApiClient;

    public ParametrageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ParametrageApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for lireListeParametrage2
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des paramétrages issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeParametrage2Call(String codeNomenclature, String codeStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/chc/v4/parametrages/{codeStructure}/{codeNomenclature}"
            .replaceAll("\\{" + "codeNomenclature" + "\\}", localVarApiClient.escapeString(codeNomenclature.toString()))
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
    private okhttp3.Call lireListeParametrage2ValidateBeforeCall(String codeNomenclature, String codeStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codeNomenclature' is set
        if (codeNomenclature == null) {
            throw new ApiException("Missing the required parameter 'codeNomenclature' when calling lireListeParametrage2(Async)");
        }
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling lireListeParametrage2(Async)");
        }
        

        okhttp3.Call localVarCall = lireListeParametrage2Call(codeNomenclature, codeStructure, _callback);
        return localVarCall;

    }

    /**
     * Liste des paramétrages valides à la date du jour
     * 
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @return List&lt;Nomenclature&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des paramétrages issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public List<Nomenclature> lireListeParametrage2(String codeNomenclature, String codeStructure) throws ApiException {
        ApiResponse<List<Nomenclature>> localVarResp = lireListeParametrage2WithHttpInfo(codeNomenclature, codeStructure);
        return localVarResp.getData();
    }

    /**
     * Liste des paramétrages valides à la date du jour
     * 
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @return ApiResponse&lt;List&lt;Nomenclature&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des paramétrages issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Nomenclature>> lireListeParametrage2WithHttpInfo(String codeNomenclature, String codeStructure) throws ApiException {
        okhttp3.Call localVarCall = lireListeParametrage2ValidateBeforeCall(codeNomenclature, codeStructure, null);
        Type localVarReturnType = new TypeToken<List<Nomenclature>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liste des paramétrages valides à la date du jour (asynchronously)
     * 
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des paramétrages issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeParametrage2Async(String codeNomenclature, String codeStructure, final ApiCallback<List<Nomenclature>> _callback) throws ApiException {

        okhttp3.Call localVarCall = lireListeParametrage2ValidateBeforeCall(codeNomenclature, codeStructure, _callback);
        Type localVarReturnType = new TypeToken<List<Nomenclature>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for lireListeTypeAmenagement
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des types d&#39;amenagement issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeTypeAmenagementCall(String codeStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/chc/v4/parametrages/amenagements/{codeStructure}"
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
    private okhttp3.Call lireListeTypeAmenagementValidateBeforeCall(String codeStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling lireListeTypeAmenagement(Async)");
        }
        

        okhttp3.Call localVarCall = lireListeTypeAmenagementCall(codeStructure, _callback);
        return localVarCall;

    }

    /**
     * Liste des types d&#39;amenagement valides à la date du jour depuis le referentiel (ref)
     * 
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @return List&lt;TypeAmenagement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des types d&#39;amenagement issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public List<TypeAmenagement> lireListeTypeAmenagement(String codeStructure) throws ApiException {
        ApiResponse<List<TypeAmenagement>> localVarResp = lireListeTypeAmenagementWithHttpInfo(codeStructure);
        return localVarResp.getData();
    }

    /**
     * Liste des types d&#39;amenagement valides à la date du jour depuis le referentiel (ref)
     * 
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @return ApiResponse&lt;List&lt;TypeAmenagement&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des types d&#39;amenagement issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TypeAmenagement>> lireListeTypeAmenagementWithHttpInfo(String codeStructure) throws ApiException {
        okhttp3.Call localVarCall = lireListeTypeAmenagementValidateBeforeCall(codeStructure, null);
        Type localVarReturnType = new TypeToken<List<TypeAmenagement>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Liste des types d&#39;amenagement valides à la date du jour depuis le referentiel (ref) (asynchronously)
     * 
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Liste des types d&#39;amenagement issues du référentiel </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireListeTypeAmenagementAsync(String codeStructure, final ApiCallback<List<TypeAmenagement>> _callback) throws ApiException {

        okhttp3.Call localVarCall = lireListeTypeAmenagementValidateBeforeCall(codeStructure, _callback);
        Type localVarReturnType = new TypeToken<List<TypeAmenagement>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for lireParametrage2
     * @param code Le code métier de la nomenclature ou du paramétrage (required)
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paramétrage a été récupéré </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireParametrage2Call(String code, String codeNomenclature, String codeStructure, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/chc/v4/parametrages/{codeStructure}/{codeNomenclature}/{code}"
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "codeNomenclature" + "\\}", localVarApiClient.escapeString(codeNomenclature.toString()))
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
    private okhttp3.Call lireParametrage2ValidateBeforeCall(String code, String codeNomenclature, String codeStructure, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling lireParametrage2(Async)");
        }
        
        // verify the required parameter 'codeNomenclature' is set
        if (codeNomenclature == null) {
            throw new ApiException("Missing the required parameter 'codeNomenclature' when calling lireParametrage2(Async)");
        }
        
        // verify the required parameter 'codeStructure' is set
        if (codeStructure == null) {
            throw new ApiException("Missing the required parameter 'codeStructure' when calling lireParametrage2(Async)");
        }
        

        okhttp3.Call localVarCall = lireParametrage2Call(code, codeNomenclature, codeStructure, _callback);
        return localVarCall;

    }

    /**
     * Lire le paramétrage avec le code valide à la date du jour
     * 
     * @param code Le code métier de la nomenclature ou du paramétrage (required)
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @return Nomenclature
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paramétrage a été récupéré </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public Nomenclature lireParametrage2(String code, String codeNomenclature, String codeStructure) throws ApiException {
        ApiResponse<Nomenclature> localVarResp = lireParametrage2WithHttpInfo(code, codeNomenclature, codeStructure);
        return localVarResp.getData();
    }

    /**
     * Lire le paramétrage avec le code valide à la date du jour
     * 
     * @param code Le code métier de la nomenclature ou du paramétrage (required)
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @return ApiResponse&lt;Nomenclature&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paramétrage a été récupéré </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Nomenclature> lireParametrage2WithHttpInfo(String code, String codeNomenclature, String codeStructure) throws ApiException {
        okhttp3.Call localVarCall = lireParametrage2ValidateBeforeCall(code, codeNomenclature, codeStructure, null);
        Type localVarReturnType = new TypeToken<Nomenclature>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Lire le paramétrage avec le code valide à la date du jour (asynchronously)
     * 
     * @param code Le code métier de la nomenclature ou du paramétrage (required)
     * @param codeNomenclature Le code de la nomenclature ou du paramétrage (required)
     * @param codeStructure Le code structure de l&#39;établissement (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Le paramétrage a été récupéré </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lireParametrage2Async(String code, String codeNomenclature, String codeStructure, final ApiCallback<Nomenclature> _callback) throws ApiException {

        okhttp3.Call localVarCall = lireParametrage2ValidateBeforeCall(code, codeNomenclature, codeStructure, _callback);
        Type localVarReturnType = new TypeToken<Nomenclature>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
