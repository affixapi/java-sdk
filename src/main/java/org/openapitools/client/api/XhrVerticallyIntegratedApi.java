/*
 * Affix API
 * The affixapi.com API documentation.  # Introduction Affix API is an OAuth 2.1 application that allows developers to access customer data, without developers needing to manage or maintain integrations; or collect login credentials or API keys from users for these third party systems.  # OAuth 2.1 Affix API follows the [OAuth 2.1 spec](https://datatracker.ietf.org/doc/html/draft-ietf-oauth-v2-1-08).  As an OAuth application, Affix API handles not only both the collection of sensitive user credentials or API keys, but also builds and maintains the integrations with the providers, so you don't have to.  # How to obtain an access token in order to get started, you must:   - register a `client_id`   - direct your user to the sign in flow  (`https://connect.affixapi.com`     [with the appropriate query     parameters](https://github.com/affixapi/starter-kit/tree/master/connect))   - capture `authorization_code` we will send to your redirect URI after     the sign in flow is complete and exchange that `authorization_code` for     a Bearer token  # Sandbox keys (xhr mode) ### dev ``` eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzODIzNTNlMi05N2ZiLTRmMWEtOTYxYy0zZDI5OTViNzYxMTUiLCJpYXQiOjE3MTE4MTA3MTQsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUuZGV2LmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6InhociIsImF1ZCI6IjNGREFFREY5LTFEQ0E0RjU0LTg3OTQ5RjZBLTQxMDI3NjQzIn0.zUJPaT6IxcIdr8b9iO6u-Rr5I-ohTHPYTrQGrgOFghbEbovItiwr9Wk479GnJVJc3WR8bxAwUMAE4Ul6Okdk6Q ```  #### `employees` endpoint sample: ``` curl --fail \\   -X GET \\   -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzODIzNTNlMi05N2ZiLTRmMWEtOTYxYy0zZDI5OTViNzYxMTUiLCJpYXQiOjE3MTE4MTA3MTQsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUuZGV2LmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6InhociIsImF1ZCI6IjNGREFFREY5LTFEQ0E0RjU0LTg3OTQ5RjZBLTQxMDI3NjQzIn0.zUJPaT6IxcIdr8b9iO6u-Rr5I-ohTHPYTrQGrgOFghbEbovItiwr9Wk479GnJVJc3WR8bxAwUMAE4Ul6Okdk6Q' \\   'https://dev.api.affixapi.com/2023-03-01/xhr/employees' ```  ### prod ``` eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzYjg4MDc2NC1kMGFmLTQ5ZDAtOGM5OS00YzIwYjE2MTJjOTMiLCJpYXQiOjE3MTE4MTA4NTgsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUucHJvZC5lbmdpbmVlcmluZy5hZmZpeGFwaS5jb20iLCJzdWIiOiJ4aHIiLCJhdWQiOiIwOEJCMDgxRS1EOUFCNEQxNC04REY5OTIzMy02NjYxNUNFOSJ9.n3pJmmfegU21Tko_TyUyCHi4ITvfd75T8NFFTHmf1r8AI8yCUYTWdfNjyZZWcZD6z50I3Wsk2rAd8GDWXn4vlg ```  #### `employees` endpoint sample: ``` curl --fail \\   -X GET \\   -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzYjg4MDc2NC1kMGFmLTQ5ZDAtOGM5OS00YzIwYjE2MTJjOTMiLCJpYXQiOjE3MTE4MTA4NTgsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUucHJvZC5lbmdpbmVlcmluZy5hZmZpeGFwaS5jb20iLCJzdWIiOiJ4aHIiLCJhdWQiOiIwOEJCMDgxRS1EOUFCNEQxNC04REY5OTIzMy02NjYxNUNFOSJ9.n3pJmmfegU21Tko_TyUyCHi4ITvfd75T8NFFTHmf1r8AI8yCUYTWdfNjyZZWcZD6z50I3Wsk2rAd8GDWXn4vlg' \\   'https://api.affixapi.com/2023-03-01/xhr/employees' ```  # Compression We support `brotli`, `gzip`, and `deflate` compression algorithms.  To enable, pass the `Accept-Encoding` header with one or all of the values: `br`, `gzip`, `deflate`, or `identity` (no compression)  In the response, you will receive the `Content-Encoding` response header indicating the compression algorithm used in the data payload to enable you to decompress the result. If the `Accept-Encoding: identity` header was passed, no `Content-Encoding` response header is sent back, as no compression algorithm was used.  # Webhooks An exciting feature for HR/Payroll modes are webhooks.  If enabled, your `webhook_uri` is set on your `client_id` for the respective environment: `dev | prod`  Webhooks are configured to make live requests to the underlying integration 1x/hr, and if a difference is detected since the last request, we will send a request to your `webhook_uri` with this shape:  ``` {    added: <api.v20230301.Employees>[     <api.v20230301.Employee>{       ...,       date_of_birth: '2010-08-06',       display_full_name: 'Daija Rogahn',       employee_number: '57993',       employment_status: 'pending',       employment_type: 'other',       employments: [         {           currency: 'eur',           effective_date: '2022-02-25',           employment_type: 'other',           job_title: 'Dynamic Implementation Manager',           pay_frequency: 'semimonthly',           pay_period: 'YEAR',           pay_rate: 96000,         },       ],       first_name: 'Daija',       ...     }   ],   removed: [],   updated: [     <api.v20230301.Employee>{       ...,       date_of_birth: '2009-11-09',       display_full_name: 'Lourdes Stiedemann',       employee_number: '63189',       employment_status: 'leave',       employment_type: 'full_time',       employments: [         {           currency: 'gbp',           effective_date: '2023-01-16',           employment_type: 'full_time',           job_title: 'Forward Brand Planner',           pay_frequency: 'semimonthly',           pay_period: 'YEAR',           pay_rate: 86000,         },       ],       first_name: 'Lourdes',     }   ] } ```  the following headers will be sent with webhook requests:  ``` x-affix-api-signature: ab8474e609db95d5df3adc39ea3add7a7544bd215c5c520a30a650ae93a2fba7  x-affix-api-origin:  webhooks-employees-webhook  user-agent:  affixapi.com ```  Before trusting the payload, you should sign the payload and verify the signature matches the signature sent by the `affixapi.com` service.  This secures that the data sent to your `webhook_uri` is from the `affixapi.com` server.  The signature is created by combining the signing secret (your `client_secret`) with the body of the request sent using a standard HMAC-SHA256 keyed hash.  The signature can be created via:   - create an `HMAC` with your `client_secret`   - update the `HMAC` with the payload   - get the hex digest -> this is the signature  Sample `typescript` code that follows this recipe:  ``` import { createHmac } from 'crypto';  export const computeSignature = ({   str,   signingSecret, }: {   signingSecret: string;   str: string; }): string => {   const hmac = createHmac('sha256', signingSecret);   hmac.update(str);   const signature = hmac.digest('hex');    return signature; }; ```  While verifying the Affix API signature header should be your primary method of confirming validity, you can also whitelist our outbound webhook static IP addresses.  ``` dev:   - 52.210.169.82   - 52.210.38.77   - 3.248.135.204  prod:   - 52.51.160.102   - 54.220.83.244   - 3.254.213.171 ```  ## Rate limits Open endpoints (not gated by an API key) (applied at endpoint level):   - 15 requests every 1 minute (by IP address)   - 25 requests every 5 minutes (by IP address)  Gated endpoints (require an API key) (applied at endpoint level):   - 40 requests every 1 minute (by IP address)   - 40 requests every 5 minutes (by `client_id`)  Things to keep in mind:   - Open endpoints (not gated by an API key) will likely be called by your     users, not you, so rate limits generally would not apply to you.   - As a developer, rate limits are applied at the endpoint granularity.     - For example, say the rate limits below are 10 requests per minute by ip.       from that same ip, within 1 minute, you get:       - 10 requests per minute on `/orders`,       - another 10 requests per minute on `/items`,       - and another 10 requests per minute on `/identity`,       - for a total of 30 requests per minute. 
 *
 * The version of the OpenAPI document: 2023-03-01
 * Contact: developers@affixapi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.CompanyResponse;
import org.openapitools.client.model.EmployeeResponse;
import org.openapitools.client.model.GroupResponse;
import org.openapitools.client.model.IdentityResponse;
import org.openapitools.client.model.InlineResponse401;
import org.threeten.bp.LocalDate;
import org.openapitools.client.model.LocationResponse;
import org.openapitools.client.model.MessageResponse;
import org.openapitools.client.model.PayrunResponse;
import org.openapitools.client.model.PayslipResponse;
import org.openapitools.client.model.TimeOffBalanceResponse;
import org.openapitools.client.model.TimeOffEntryResponse;
import org.openapitools.client.model.TimesheetResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XhrVerticallyIntegratedApi {
    private ApiClient localVarApiClient;

    public XhrVerticallyIntegratedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public XhrVerticallyIntegratedApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for xhrCompanies20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrCompanies20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/company";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrCompanies20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrCompanies20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Company
     * Retrieve company information 
     * @return List&lt;CompanyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<CompanyResponse> xhrCompanies20230301() throws ApiException {
        ApiResponse<List<CompanyResponse>> localVarResp = xhrCompanies20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Company
     * Retrieve company information 
     * @return ApiResponse&lt;List&lt;CompanyResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<CompanyResponse>> xhrCompanies20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrCompanies20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<CompanyResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Company (asynchronously)
     * Retrieve company information 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrCompanies20230301Async(final ApiCallback<List<CompanyResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrCompanies20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<CompanyResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrEmployees20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrEmployees20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/employees";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrEmployees20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrEmployees20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Employees
     * List the individuals (employees, contractors, accountants, and others) listed in the HRIS/Payroll software 
     * @return List&lt;EmployeeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<EmployeeResponse> xhrEmployees20230301() throws ApiException {
        ApiResponse<List<EmployeeResponse>> localVarResp = xhrEmployees20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Employees
     * List the individuals (employees, contractors, accountants, and others) listed in the HRIS/Payroll software 
     * @return ApiResponse&lt;List&lt;EmployeeResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<EmployeeResponse>> xhrEmployees20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrEmployees20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<EmployeeResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Employees (asynchronously)
     * List the individuals (employees, contractors, accountants, and others) listed in the HRIS/Payroll software 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrEmployees20230301Async(final ApiCallback<List<EmployeeResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrEmployees20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<EmployeeResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrGroups20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrGroups20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/groups";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrGroups20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrGroups20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Groups
     * The Group object is used to represent any subset of employees, such as PayGroup, Team, or Department. Employees can be in multiple Groups. 
     * @return List&lt;GroupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<GroupResponse> xhrGroups20230301() throws ApiException {
        ApiResponse<List<GroupResponse>> localVarResp = xhrGroups20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Groups
     * The Group object is used to represent any subset of employees, such as PayGroup, Team, or Department. Employees can be in multiple Groups. 
     * @return ApiResponse&lt;List&lt;GroupResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GroupResponse>> xhrGroups20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrGroups20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<GroupResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Groups (asynchronously)
     * The Group object is used to represent any subset of employees, such as PayGroup, Team, or Department. Employees can be in multiple Groups. 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrGroups20230301Async(final ApiCallback<List<GroupResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrGroups20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<GroupResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrIdentity20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrIdentity20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/identity";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrIdentity20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrIdentity20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Identity
     * List information of the user for the respective account 
     * @return IdentityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public IdentityResponse xhrIdentity20230301() throws ApiException {
        ApiResponse<IdentityResponse> localVarResp = xhrIdentity20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Identity
     * List information of the user for the respective account 
     * @return ApiResponse&lt;IdentityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<IdentityResponse> xhrIdentity20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrIdentity20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<IdentityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Identity (asynchronously)
     * List information of the user for the respective account 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrIdentity20230301Async(final ApiCallback<IdentityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrIdentity20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<IdentityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrPayruns20230301
     * @param startDate The start date of the search period (required)
     * @param endDate The end date of the search period (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrPayruns20230301Call(LocalDate startDate, LocalDate endDate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/payruns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrPayruns20230301ValidateBeforeCall(LocalDate startDate, LocalDate endDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling xhrPayruns20230301(Async)");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling xhrPayruns20230301(Async)");
        }
        

        okhttp3.Call localVarCall = xhrPayruns20230301Call(startDate, endDate, _callback);
        return localVarCall;

    }

    /**
     * Payruns
     * List all the pay runs that occurred during the respective period.  Supported integrations:   - brain payroll   - brightpay connect   - deel   - gusto   - justworks   - moorepay   - onpay   - oyster   - parolla.ie   - paycircle   - payfit   - pento.io   - quickbooks online   - remote.com   - rippling   - sageone   - shape payroll   - simplepay.ie   - staffology   - xero uk 
     * @param startDate The start date of the search period (required)
     * @param endDate The end date of the search period (required)
     * @return List&lt;PayrunResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<PayrunResponse> xhrPayruns20230301(LocalDate startDate, LocalDate endDate) throws ApiException {
        ApiResponse<List<PayrunResponse>> localVarResp = xhrPayruns20230301WithHttpInfo(startDate, endDate);
        return localVarResp.getData();
    }

    /**
     * Payruns
     * List all the pay runs that occurred during the respective period.  Supported integrations:   - brain payroll   - brightpay connect   - deel   - gusto   - justworks   - moorepay   - onpay   - oyster   - parolla.ie   - paycircle   - payfit   - pento.io   - quickbooks online   - remote.com   - rippling   - sageone   - shape payroll   - simplepay.ie   - staffology   - xero uk 
     * @param startDate The start date of the search period (required)
     * @param endDate The end date of the search period (required)
     * @return ApiResponse&lt;List&lt;PayrunResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PayrunResponse>> xhrPayruns20230301WithHttpInfo(LocalDate startDate, LocalDate endDate) throws ApiException {
        okhttp3.Call localVarCall = xhrPayruns20230301ValidateBeforeCall(startDate, endDate, null);
        Type localVarReturnType = new TypeToken<List<PayrunResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Payruns (asynchronously)
     * List all the pay runs that occurred during the respective period.  Supported integrations:   - brain payroll   - brightpay connect   - deel   - gusto   - justworks   - moorepay   - onpay   - oyster   - parolla.ie   - paycircle   - payfit   - pento.io   - quickbooks online   - remote.com   - rippling   - sageone   - shape payroll   - simplepay.ie   - staffology   - xero uk 
     * @param startDate The start date of the search period (required)
     * @param endDate The end date of the search period (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrPayruns20230301Async(LocalDate startDate, LocalDate endDate, final ApiCallback<List<PayrunResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrPayruns20230301ValidateBeforeCall(startDate, endDate, _callback);
        Type localVarReturnType = new TypeToken<List<PayrunResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrPayslips20230301
     * @param payrunId The id of the payrun. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrPayslips20230301Call(String payrunId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/payruns/{payrun_id}"
            .replaceAll("\\{" + "payrun_id" + "\\}", localVarApiClient.escapeString(payrunId.toString()));

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrPayslips20230301ValidateBeforeCall(String payrunId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payrunId' is set
        if (payrunId == null) {
            throw new ApiException("Missing the required parameter 'payrunId' when calling xhrPayslips20230301(Async)");
        }
        

        okhttp3.Call localVarCall = xhrPayslips20230301Call(payrunId, _callback);
        return localVarCall;

    }

    /**
     * Payslips
     * Retrieves payslips from a specific payrun.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 
     * @param payrunId The id of the payrun. (required)
     * @return List&lt;PayslipResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<PayslipResponse> xhrPayslips20230301(String payrunId) throws ApiException {
        ApiResponse<List<PayslipResponse>> localVarResp = xhrPayslips20230301WithHttpInfo(payrunId);
        return localVarResp.getData();
    }

    /**
     * Payslips
     * Retrieves payslips from a specific payrun.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 
     * @param payrunId The id of the payrun. (required)
     * @return ApiResponse&lt;List&lt;PayslipResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<PayslipResponse>> xhrPayslips20230301WithHttpInfo(String payrunId) throws ApiException {
        okhttp3.Call localVarCall = xhrPayslips20230301ValidateBeforeCall(payrunId, null);
        Type localVarReturnType = new TypeToken<List<PayslipResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Payslips (asynchronously)
     * Retrieves payslips from a specific payrun.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 
     * @param payrunId The id of the payrun. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrPayslips20230301Async(String payrunId, final ApiCallback<List<PayslipResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrPayslips20230301ValidateBeforeCall(payrunId, _callback);
        Type localVarReturnType = new TypeToken<List<PayslipResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrTimeOffBalances20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrTimeOffBalances20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/time-off-balances";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrTimeOffBalances20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrTimeOffBalances20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Time off balances
     * Retrieve all time off balances. 
     * @return List&lt;TimeOffBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<TimeOffBalanceResponse> xhrTimeOffBalances20230301() throws ApiException {
        ApiResponse<List<TimeOffBalanceResponse>> localVarResp = xhrTimeOffBalances20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Time off balances
     * Retrieve all time off balances. 
     * @return ApiResponse&lt;List&lt;TimeOffBalanceResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TimeOffBalanceResponse>> xhrTimeOffBalances20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrTimeOffBalances20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<TimeOffBalanceResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Time off balances (asynchronously)
     * Retrieve all time off balances. 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrTimeOffBalances20230301Async(final ApiCallback<List<TimeOffBalanceResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrTimeOffBalances20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimeOffBalanceResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrTimeOffEntries20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrTimeOffEntries20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/time-off-entries";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrTimeOffEntries20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrTimeOffEntries20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Time off entries
     * Retrieve time off / absence entries 
     * @return List&lt;TimeOffEntryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<TimeOffEntryResponse> xhrTimeOffEntries20230301() throws ApiException {
        ApiResponse<List<TimeOffEntryResponse>> localVarResp = xhrTimeOffEntries20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Time off entries
     * Retrieve time off / absence entries 
     * @return ApiResponse&lt;List&lt;TimeOffEntryResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TimeOffEntryResponse>> xhrTimeOffEntries20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrTimeOffEntries20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<TimeOffEntryResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Time off entries (asynchronously)
     * Retrieve time off / absence entries 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrTimeOffEntries20230301Async(final ApiCallback<List<TimeOffEntryResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrTimeOffEntries20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimeOffEntryResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrTimesheets20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrTimesheets20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/timesheets";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrTimesheets20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrTimesheets20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Timesheets
     * Retrieve Timesheets 
     * @return List&lt;TimesheetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<TimesheetResponse> xhrTimesheets20230301() throws ApiException {
        ApiResponse<List<TimesheetResponse>> localVarResp = xhrTimesheets20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Timesheets
     * Retrieve Timesheets 
     * @return ApiResponse&lt;List&lt;TimesheetResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TimesheetResponse>> xhrTimesheets20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrTimesheets20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<TimesheetResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Timesheets (asynchronously)
     * Retrieve Timesheets 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrTimesheets20230301Async(final ApiCallback<List<TimesheetResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrTimesheets20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimesheetResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for xhrWorkLocations20230301
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrWorkLocations20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/xhr/work-locations";

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

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call xhrWorkLocations20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = xhrWorkLocations20230301Call(_callback);
        return localVarCall;

    }

    /**
     * Work locations
     * The Location object is used to represent an address that can be associated with an employee 
     * @return List&lt;LocationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public List<LocationResponse> xhrWorkLocations20230301() throws ApiException {
        ApiResponse<List<LocationResponse>> localVarResp = xhrWorkLocations20230301WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Work locations
     * The Location object is used to represent an address that can be associated with an employee 
     * @return ApiResponse&lt;List&lt;LocationResponse&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<LocationResponse>> xhrWorkLocations20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = xhrWorkLocations20230301ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<LocationResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Work locations (asynchronously)
     * The Location object is used to represent an address that can be associated with an employee 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted + pending (async job started) </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 401 </td><td> Authentication Error </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call xhrWorkLocations20230301Async(final ApiCallback<List<LocationResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = xhrWorkLocations20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<LocationResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
