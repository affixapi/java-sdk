/*
 * Affix API
 * The affixapi.com API documentation.  # Introduction Affix API is an OAuth 2.1 application that allows developers to access customer data, without developers needing to manage or maintain integrations; or collect login credentials or API keys from users for these third party systems.  # OAuth 2.1 Affix API follows the [OAuth 2.1 spec](https://datatracker.ietf.org/doc/html/draft-ietf-oauth-v2-1-08).  As an OAuth application, Affix API handles not only both the collection of sensitive user credentials or API keys, but also builds and maintains the integrations with the providers, so you don't have to.  # How to obtain an access token in order to get started, you must:   - register a `client_id`   - direct your user to the sign in flow  (`https://connect.affixapi.com`     [with the appropriate query     parameters](https://github.com/affixapi/starter-kit/tree/master/connect))   - capture `authorization_code` we will send to your redirect URI after     the sign in flow is complete and exchange that `authorization_code` for     a Bearer token  # Sandbox keys (developer mode) ### dev ``` eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6ImQ1OTZhMmYzLWYzNzktNGE1ZC1hMmRhLTk4OWJmYWViYTg1ZCIsImlhdCI6MTcwMjkyMDkwMywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5kZXYuZW5naW5lZXJpbmcuYWZmaXhhcGkuY29tIiwic3ViIjoiZGV2ZWxvcGVyIiwiYXVkIjoiM0ZEQUVERjktMURDQTRGNTQtODc5NDlGNkEtNDEwMjc2NDMifQ.VLWYjCQvBS0C3ZA6_J3-U-idZj5EYI2IlDdTjAWBxSIHGufp6cqaVodKsF2BeIqcIeB3P0lW-KL9mY3xGd7ckQ ```  #### `employees` endpoint sample: ``` curl --fail \\   -X GET \\   -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6ImQ1OTZhMmYzLWYzNzktNGE1ZC1hMmRhLTk4OWJmYWViYTg1ZCIsImlhdCI6MTcwMjkyMDkwMywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5kZXYuZW5naW5lZXJpbmcuYWZmaXhhcGkuY29tIiwic3ViIjoiZGV2ZWxvcGVyIiwiYXVkIjoiM0ZEQUVERjktMURDQTRGNTQtODc5NDlGNkEtNDEwMjc2NDMifQ.VLWYjCQvBS0C3ZA6_J3-U-idZj5EYI2IlDdTjAWBxSIHGufp6cqaVodKsF2BeIqcIeB3P0lW-KL9mY3xGd7ckQ' \\   'https://dev.api.affixapi.com/2023-03-01/developer/employees' ```  ### prod ``` eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6IjI5YjFjYTg4LWNlNjktNDgyZC1iNGZjLTkzMWMzZmJkYWM4ZSIsImlhdCI6MTcwMjkyMTA4MywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5wcm9kLmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6ImRldmVsb3BlciIsImF1ZCI6IjA4QkIwODFFLUQ5QUI0RDE0LThERjk5MjMzLTY2NjE1Q0U5In0.2zdpFAmiyYiYk6MOcbXNUwwR4M1Fextnaac340x54AidiWXCyw-u9KeavbqfYF6q8a9kcDLrxhJ8Wc_3tIzuVw ```  #### `employees` endpoint sample: ``` curl --fail \\   -X GET \\   -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6IjI5YjFjYTg4LWNlNjktNDgyZC1iNGZjLTkzMWMzZmJkYWM4ZSIsImlhdCI6MTcwMjkyMTA4MywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5wcm9kLmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6ImRldmVsb3BlciIsImF1ZCI6IjA4QkIwODFFLUQ5QUI0RDE0LThERjk5MjMzLTY2NjE1Q0U5In0.2zdpFAmiyYiYk6MOcbXNUwwR4M1Fextnaac340x54AidiWXCyw-u9KeavbqfYF6q8a9kcDLrxhJ8Wc_3tIzuVw' \\   'https://api.affixapi.com/2023-03-01/developer/employees' ```  # Compression We support `brotli`, `gzip`, and `deflate` compression algorithms.  To enable, pass the `Accept-Encoding` header with one or all of the values: `br`, `gzip`, `deflate`, or `identity` (no compression)  In the response, you will receive the `Content-Encoding` response header indicating the compression algorithm used in the data payload to enable you to decompress the result. If the `Accept-Encoding: identity` header was passed, no `Content-Encoding` response header is sent back, as no compression algorithm was used.  # Webhooks An exciting feature for HR/Payroll modes are webhooks.  If enabled, your `webhook_uri` is set on your `client_id` for the respective environment: `dev | prod`  Webhooks are configured to make live requests to the underlying integration 1x/hr, and if a difference is detected since the last request, we will send a request to your `webhook_uri` with this shape:  ``` {    added: <api.v20230301.Employees>[     <api.v20230301.Employee>{       ...,       date_of_birth: '2010-08-06',       display_full_name: 'Daija Rogahn',       employee_number: '57993',       employment_status: 'pending',       employment_type: 'other',       employments: [         {           currency: 'eur',           effective_date: '2022-02-25',           employment_type: 'other',           job_title: 'Dynamic Implementation Manager',           pay_frequency: 'semimonthly',           pay_period: 'YEAR',           pay_rate: 96000,         },       ],       first_name: 'Daija',       ...     }   ],   removed: [],   updated: [     <api.v20230301.Employee>{       ...,       date_of_birth: '2009-11-09',       display_full_name: 'Lourdes Stiedemann',       employee_number: '63189',       employment_status: 'leave',       employment_type: 'full_time',       employments: [         {           currency: 'gbp',           effective_date: '2023-01-16',           employment_type: 'full_time',           job_title: 'Forward Brand Planner',           pay_frequency: 'semimonthly',           pay_period: 'YEAR',           pay_rate: 86000,         },       ],       first_name: 'Lourdes',     }   ] } ```  the following headers will be sent with webhook requests:  ``` x-affix-api-signature: ab8474e609db95d5df3adc39ea3add7a7544bd215c5c520a30a650ae93a2fba7  x-affix-api-origin:  webhooks-employees-webhook  user-agent:  affixapi.com ```  Before trusting the payload, you should sign the payload and verify the signature matches the signature sent by the `affixapi.com` service.  This secures that the data sent to your `webhook_uri` is from the `affixapi.com` server.  The signature is created by combining the signing secret (your `client_secret`) with the body of the request sent using a standard HMAC-SHA256 keyed hash.  The signature can be created via:   - create an `HMAC` with your `client_secret`   - update the `HMAC` with the payload   - get the hex digest -> this is the signature  Sample `typescript` code that follows this recipe:  ``` import { createHmac } from 'crypto';  export const computeSignature = ({   str,   signingSecret, }: {   signingSecret: string;   str: string; }): string => {   const hmac = createHmac('sha256', signingSecret);   hmac.update(str);   const signature = hmac.digest('hex');    return signature; }; ```  While verifying the Affix API signature header should be your primary method of confirming validity, you can also whitelist our outbound webhook static IP addresses.  ``` dev:   - 52.210.169.82   - 52.210.38.77   - 3.248.135.204  prod:   - 52.51.160.102   - 54.220.83.244   - 3.254.213.171 ```  ## Rate limits Open endpoints (not gated by an API key) (applied at endpoint level):   - 15 requests every 1 minute (by IP address)   - 25 requests every 5 minutes (by IP address)  Gated endpoints (require an API key) (applied at endpoint level):   - 40 requests every 1 minute (by IP address)   - 40 requests every 5 minutes (by `client_id`)  Things to keep in mind:   - Open endpoints (not gated by an API key) will likely be called by your     users, not you, so rate limits generally would not apply to you.   - As a developer, rate limits are applied at the endpoint granularity.     - For example, say the rate limits below are 10 requests per minute by ip.       from that same ip, within 1 minute, you get:       - 10 requests per minute on `/orders`,       - another 10 requests per minute on `/items`,       - and another 10 requests per minute on `/identity`,       - for a total of 30 requests per minute. 
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
import org.openapitools.client.model.CreateEmployeeRequest;
import org.openapitools.client.model.EmployeeResponse;
import org.openapitools.client.model.GroupResponse;
import org.openapitools.client.model.IdentityResponse;
import org.openapitools.client.model.InlineResponse400;
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

public class Class20230301Api {
    private ApiClient localVarApiClient;

    public Class20230301Api() {
        this(Configuration.getDefaultApiClient());
    }

    public Class20230301Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for developerCompanies20230301
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
    public okhttp3.Call developerCompanies20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/company";

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
    private okhttp3.Call developerCompanies20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerCompanies20230301Call(_callback);
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
    public List<CompanyResponse> developerCompanies20230301() throws ApiException {
        ApiResponse<List<CompanyResponse>> localVarResp = developerCompanies20230301WithHttpInfo();
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
    public ApiResponse<List<CompanyResponse>> developerCompanies20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerCompanies20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerCompanies20230301Async(final ApiCallback<List<CompanyResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerCompanies20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<CompanyResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerCreateEmployee20230301
     * @param createEmployeeRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call developerCreateEmployee20230301Call(CreateEmployeeRequest createEmployeeRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createEmployeeRequest;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/employee";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call developerCreateEmployee20230301ValidateBeforeCall(CreateEmployeeRequest createEmployeeRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createEmployeeRequest' is set
        if (createEmployeeRequest == null) {
            throw new ApiException("Missing the required parameter 'createEmployeeRequest' when calling developerCreateEmployee20230301(Async)");
        }
        

        okhttp3.Call localVarCall = developerCreateEmployee20230301Call(createEmployeeRequest, _callback);
        return localVarCall;

    }

    /**
     * Create employee
     * Creates a new Employee 
     * @param createEmployeeRequest  (required)
     * @return EmployeeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public EmployeeResponse developerCreateEmployee20230301(CreateEmployeeRequest createEmployeeRequest) throws ApiException {
        ApiResponse<EmployeeResponse> localVarResp = developerCreateEmployee20230301WithHttpInfo(createEmployeeRequest);
        return localVarResp.getData();
    }

    /**
     * Create employee
     * Creates a new Employee 
     * @param createEmployeeRequest  (required)
     * @return ApiResponse&lt;EmployeeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmployeeResponse> developerCreateEmployee20230301WithHttpInfo(CreateEmployeeRequest createEmployeeRequest) throws ApiException {
        okhttp3.Call localVarCall = developerCreateEmployee20230301ValidateBeforeCall(createEmployeeRequest, null);
        Type localVarReturnType = new TypeToken<EmployeeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create employee (asynchronously)
     * Creates a new Employee 
     * @param createEmployeeRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call developerCreateEmployee20230301Async(CreateEmployeeRequest createEmployeeRequest, final ApiCallback<EmployeeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerCreateEmployee20230301ValidateBeforeCall(createEmployeeRequest, _callback);
        Type localVarReturnType = new TypeToken<EmployeeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerEmployees20230301
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
    public okhttp3.Call developerEmployees20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/employees";

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
    private okhttp3.Call developerEmployees20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerEmployees20230301Call(_callback);
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
    public List<EmployeeResponse> developerEmployees20230301() throws ApiException {
        ApiResponse<List<EmployeeResponse>> localVarResp = developerEmployees20230301WithHttpInfo();
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
    public ApiResponse<List<EmployeeResponse>> developerEmployees20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerEmployees20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerEmployees20230301Async(final ApiCallback<List<EmployeeResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerEmployees20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<EmployeeResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerGroups20230301
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
    public okhttp3.Call developerGroups20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/groups";

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
    private okhttp3.Call developerGroups20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerGroups20230301Call(_callback);
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
    public List<GroupResponse> developerGroups20230301() throws ApiException {
        ApiResponse<List<GroupResponse>> localVarResp = developerGroups20230301WithHttpInfo();
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
    public ApiResponse<List<GroupResponse>> developerGroups20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerGroups20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerGroups20230301Async(final ApiCallback<List<GroupResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerGroups20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<GroupResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerIdentity20230301
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
    public okhttp3.Call developerIdentity20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/identity";

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
    private okhttp3.Call developerIdentity20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerIdentity20230301Call(_callback);
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
    public IdentityResponse developerIdentity20230301() throws ApiException {
        ApiResponse<IdentityResponse> localVarResp = developerIdentity20230301WithHttpInfo();
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
    public ApiResponse<IdentityResponse> developerIdentity20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerIdentity20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerIdentity20230301Async(final ApiCallback<IdentityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerIdentity20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<IdentityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerPayruns20230301
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
    public okhttp3.Call developerPayruns20230301Call(LocalDate startDate, LocalDate endDate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/payruns";

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
    private okhttp3.Call developerPayruns20230301ValidateBeforeCall(LocalDate startDate, LocalDate endDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling developerPayruns20230301(Async)");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling developerPayruns20230301(Async)");
        }
        

        okhttp3.Call localVarCall = developerPayruns20230301Call(startDate, endDate, _callback);
        return localVarCall;

    }

    /**
     * Payruns
     * List all the pay runs that occurred during the respective period.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 
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
    public List<PayrunResponse> developerPayruns20230301(LocalDate startDate, LocalDate endDate) throws ApiException {
        ApiResponse<List<PayrunResponse>> localVarResp = developerPayruns20230301WithHttpInfo(startDate, endDate);
        return localVarResp.getData();
    }

    /**
     * Payruns
     * List all the pay runs that occurred during the respective period.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 
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
    public ApiResponse<List<PayrunResponse>> developerPayruns20230301WithHttpInfo(LocalDate startDate, LocalDate endDate) throws ApiException {
        okhttp3.Call localVarCall = developerPayruns20230301ValidateBeforeCall(startDate, endDate, null);
        Type localVarReturnType = new TypeToken<List<PayrunResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Payruns (asynchronously)
     * List all the pay runs that occurred during the respective period.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 
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
    public okhttp3.Call developerPayruns20230301Async(LocalDate startDate, LocalDate endDate, final ApiCallback<List<PayrunResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerPayruns20230301ValidateBeforeCall(startDate, endDate, _callback);
        Type localVarReturnType = new TypeToken<List<PayrunResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerPayslips20230301
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
    public okhttp3.Call developerPayslips20230301Call(String payrunId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/payruns/{payrun_id}"
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
    private okhttp3.Call developerPayslips20230301ValidateBeforeCall(String payrunId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'payrunId' is set
        if (payrunId == null) {
            throw new ApiException("Missing the required parameter 'payrunId' when calling developerPayslips20230301(Async)");
        }
        

        okhttp3.Call localVarCall = developerPayslips20230301Call(payrunId, _callback);
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
    public List<PayslipResponse> developerPayslips20230301(String payrunId) throws ApiException {
        ApiResponse<List<PayslipResponse>> localVarResp = developerPayslips20230301WithHttpInfo(payrunId);
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
    public ApiResponse<List<PayslipResponse>> developerPayslips20230301WithHttpInfo(String payrunId) throws ApiException {
        okhttp3.Call localVarCall = developerPayslips20230301ValidateBeforeCall(payrunId, null);
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
    public okhttp3.Call developerPayslips20230301Async(String payrunId, final ApiCallback<List<PayslipResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerPayslips20230301ValidateBeforeCall(payrunId, _callback);
        Type localVarReturnType = new TypeToken<List<PayslipResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerTimeOffBalances20230301
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
    public okhttp3.Call developerTimeOffBalances20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/time-off-balances";

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
    private okhttp3.Call developerTimeOffBalances20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerTimeOffBalances20230301Call(_callback);
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
    public List<TimeOffBalanceResponse> developerTimeOffBalances20230301() throws ApiException {
        ApiResponse<List<TimeOffBalanceResponse>> localVarResp = developerTimeOffBalances20230301WithHttpInfo();
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
    public ApiResponse<List<TimeOffBalanceResponse>> developerTimeOffBalances20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerTimeOffBalances20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerTimeOffBalances20230301Async(final ApiCallback<List<TimeOffBalanceResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerTimeOffBalances20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimeOffBalanceResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerTimeOffEntries20230301
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
    public okhttp3.Call developerTimeOffEntries20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/time-off-entries";

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
    private okhttp3.Call developerTimeOffEntries20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerTimeOffEntries20230301Call(_callback);
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
    public List<TimeOffEntryResponse> developerTimeOffEntries20230301() throws ApiException {
        ApiResponse<List<TimeOffEntryResponse>> localVarResp = developerTimeOffEntries20230301WithHttpInfo();
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
    public ApiResponse<List<TimeOffEntryResponse>> developerTimeOffEntries20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerTimeOffEntries20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerTimeOffEntries20230301Async(final ApiCallback<List<TimeOffEntryResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerTimeOffEntries20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimeOffEntryResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerTimesheets20230301
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
    public okhttp3.Call developerTimesheets20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/timesheets";

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
    private okhttp3.Call developerTimesheets20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerTimesheets20230301Call(_callback);
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
    public List<TimesheetResponse> developerTimesheets20230301() throws ApiException {
        ApiResponse<List<TimesheetResponse>> localVarResp = developerTimesheets20230301WithHttpInfo();
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
    public ApiResponse<List<TimesheetResponse>> developerTimesheets20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerTimesheets20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerTimesheets20230301Async(final ApiCallback<List<TimesheetResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerTimesheets20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimesheetResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for developerWorkLocations20230301
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
    public okhttp3.Call developerWorkLocations20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/developer/work-locations";

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
    private okhttp3.Call developerWorkLocations20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = developerWorkLocations20230301Call(_callback);
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
    public List<LocationResponse> developerWorkLocations20230301() throws ApiException {
        ApiResponse<List<LocationResponse>> localVarResp = developerWorkLocations20230301WithHttpInfo();
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
    public ApiResponse<List<LocationResponse>> developerWorkLocations20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = developerWorkLocations20230301ValidateBeforeCall(null);
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
    public okhttp3.Call developerWorkLocations20230301Async(final ApiCallback<List<LocationResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = developerWorkLocations20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<LocationResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialCompanies20230301
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
    public okhttp3.Call officialCompanies20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/company";

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
    private okhttp3.Call officialCompanies20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialCompanies20230301Call(_callback);
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
    public List<CompanyResponse> officialCompanies20230301() throws ApiException {
        ApiResponse<List<CompanyResponse>> localVarResp = officialCompanies20230301WithHttpInfo();
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
    public ApiResponse<List<CompanyResponse>> officialCompanies20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialCompanies20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialCompanies20230301Async(final ApiCallback<List<CompanyResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialCompanies20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<CompanyResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialCreateEmployee20230301
     * @param createEmployeeRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call officialCreateEmployee20230301Call(CreateEmployeeRequest createEmployeeRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createEmployeeRequest;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/employee";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "access-token" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call officialCreateEmployee20230301ValidateBeforeCall(CreateEmployeeRequest createEmployeeRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createEmployeeRequest' is set
        if (createEmployeeRequest == null) {
            throw new ApiException("Missing the required parameter 'createEmployeeRequest' when calling officialCreateEmployee20230301(Async)");
        }
        

        okhttp3.Call localVarCall = officialCreateEmployee20230301Call(createEmployeeRequest, _callback);
        return localVarCall;

    }

    /**
     * Create Employee
     * Creates a new Employee 
     * @param createEmployeeRequest  (required)
     * @return EmployeeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public EmployeeResponse officialCreateEmployee20230301(CreateEmployeeRequest createEmployeeRequest) throws ApiException {
        ApiResponse<EmployeeResponse> localVarResp = officialCreateEmployee20230301WithHttpInfo(createEmployeeRequest);
        return localVarResp.getData();
    }

    /**
     * Create Employee
     * Creates a new Employee 
     * @param createEmployeeRequest  (required)
     * @return ApiResponse&lt;EmployeeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmployeeResponse> officialCreateEmployee20230301WithHttpInfo(CreateEmployeeRequest createEmployeeRequest) throws ApiException {
        okhttp3.Call localVarCall = officialCreateEmployee20230301ValidateBeforeCall(createEmployeeRequest, null);
        Type localVarReturnType = new TypeToken<EmployeeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Employee (asynchronously)
     * Creates a new Employee 
     * @param createEmployeeRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Rate Limited / Too Many Requests </td><td>  * Retry-After - Retry your call after the specified amount of seconds <br>  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> Not Implemented </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call officialCreateEmployee20230301Async(CreateEmployeeRequest createEmployeeRequest, final ApiCallback<EmployeeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialCreateEmployee20230301ValidateBeforeCall(createEmployeeRequest, _callback);
        Type localVarReturnType = new TypeToken<EmployeeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialEmployees20230301
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
    public okhttp3.Call officialEmployees20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/employees";

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
    private okhttp3.Call officialEmployees20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialEmployees20230301Call(_callback);
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
    public List<EmployeeResponse> officialEmployees20230301() throws ApiException {
        ApiResponse<List<EmployeeResponse>> localVarResp = officialEmployees20230301WithHttpInfo();
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
    public ApiResponse<List<EmployeeResponse>> officialEmployees20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialEmployees20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialEmployees20230301Async(final ApiCallback<List<EmployeeResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialEmployees20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<EmployeeResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialGroups20230301
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
    public okhttp3.Call officialGroups20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/groups";

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
    private okhttp3.Call officialGroups20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialGroups20230301Call(_callback);
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
    public List<GroupResponse> officialGroups20230301() throws ApiException {
        ApiResponse<List<GroupResponse>> localVarResp = officialGroups20230301WithHttpInfo();
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
    public ApiResponse<List<GroupResponse>> officialGroups20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialGroups20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialGroups20230301Async(final ApiCallback<List<GroupResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialGroups20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<GroupResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialTimeOffBalances20230301
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
    public okhttp3.Call officialTimeOffBalances20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/time-off-balances";

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
    private okhttp3.Call officialTimeOffBalances20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialTimeOffBalances20230301Call(_callback);
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
    public List<TimeOffBalanceResponse> officialTimeOffBalances20230301() throws ApiException {
        ApiResponse<List<TimeOffBalanceResponse>> localVarResp = officialTimeOffBalances20230301WithHttpInfo();
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
    public ApiResponse<List<TimeOffBalanceResponse>> officialTimeOffBalances20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialTimeOffBalances20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialTimeOffBalances20230301Async(final ApiCallback<List<TimeOffBalanceResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialTimeOffBalances20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimeOffBalanceResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialTimeOffEntries20230301
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
    public okhttp3.Call officialTimeOffEntries20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/time-off-entries";

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
    private okhttp3.Call officialTimeOffEntries20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialTimeOffEntries20230301Call(_callback);
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
    public List<TimeOffEntryResponse> officialTimeOffEntries20230301() throws ApiException {
        ApiResponse<List<TimeOffEntryResponse>> localVarResp = officialTimeOffEntries20230301WithHttpInfo();
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
    public ApiResponse<List<TimeOffEntryResponse>> officialTimeOffEntries20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialTimeOffEntries20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialTimeOffEntries20230301Async(final ApiCallback<List<TimeOffEntryResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialTimeOffEntries20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimeOffEntryResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialTimesheets20230301
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
    public okhttp3.Call officialTimesheets20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/timesheets";

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
    private okhttp3.Call officialTimesheets20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialTimesheets20230301Call(_callback);
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
    public List<TimesheetResponse> officialTimesheets20230301() throws ApiException {
        ApiResponse<List<TimesheetResponse>> localVarResp = officialTimesheets20230301WithHttpInfo();
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
    public ApiResponse<List<TimesheetResponse>> officialTimesheets20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialTimesheets20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialTimesheets20230301Async(final ApiCallback<List<TimesheetResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialTimesheets20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<TimesheetResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialWorkLocations20230301
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
    public okhttp3.Call officialWorkLocations20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/work-locations";

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
    private okhttp3.Call officialWorkLocations20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialWorkLocations20230301Call(_callback);
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
    public List<LocationResponse> officialWorkLocations20230301() throws ApiException {
        ApiResponse<List<LocationResponse>> localVarResp = officialWorkLocations20230301WithHttpInfo();
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
    public ApiResponse<List<LocationResponse>> officialWorkLocations20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialWorkLocations20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialWorkLocations20230301Async(final ApiCallback<List<LocationResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialWorkLocations20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<LocationResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for officialdentity20230301
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
    public okhttp3.Call officialdentity20230301Call(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2023-03-01/official/identity";

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
    private okhttp3.Call officialdentity20230301ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = officialdentity20230301Call(_callback);
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
    public IdentityResponse officialdentity20230301() throws ApiException {
        ApiResponse<IdentityResponse> localVarResp = officialdentity20230301WithHttpInfo();
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
    public ApiResponse<IdentityResponse> officialdentity20230301WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = officialdentity20230301ValidateBeforeCall(null);
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
    public okhttp3.Call officialdentity20230301Async(final ApiCallback<IdentityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = officialdentity20230301ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<IdentityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
