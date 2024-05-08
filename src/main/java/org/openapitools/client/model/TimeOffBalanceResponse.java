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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.openapitools.client.model.PolicyTypeResponse;
import org.threeten.bp.LocalDate;

/**
 * TimeOffBalanceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T23:56:05.947621Z[Etc/UTC]")
public class TimeOffBalanceResponse {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_EMPLOYEE_REMOTE_ID = "employee_remote_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_REMOTE_ID)
  private String employeeRemoteId;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_USED = "used";
  @SerializedName(SERIALIZED_NAME_USED)
  private BigDecimal used;

  public static final String SERIALIZED_NAME_POLICY_ID = "policy_id";
  @SerializedName(SERIALIZED_NAME_POLICY_ID)
  private String policyId;

  public static final String SERIALIZED_NAME_POLICY_REMOTE_ID = "policy_remote_id";
  @SerializedName(SERIALIZED_NAME_POLICY_REMOTE_ID)
  private String policyRemoteId;

  public static final String SERIALIZED_NAME_POLICY_NAME = "policy_name";
  @SerializedName(SERIALIZED_NAME_POLICY_NAME)
  private String policyName;

  public static final String SERIALIZED_NAME_POLICY_TYPE = "policy_type";
  @SerializedName(SERIALIZED_NAME_POLICY_TYPE)
  private PolicyTypeResponse policyType;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private LocalDate remoteCreatedAt;

  public static final String SERIALIZED_NAME_REMOTE_MODIFIED_AT = "remote_modified_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_MODIFIED_AT)
  private LocalDate remoteModifiedAt;


  public TimeOffBalanceResponse employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The Affix-assigned id of the individual
   * @return employeeId
  **/
  @ApiModelProperty(example = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw", required = true, value = "The Affix-assigned id of the individual")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public TimeOffBalanceResponse employeeRemoteId(String employeeRemoteId) {
    
    this.employeeRemoteId = employeeRemoteId;
    return this;
  }

   /**
   * the remote system-assigned id of the individual
   * @return employeeRemoteId
  **/
  @ApiModelProperty(example = "19202938", required = true, value = "the remote system-assigned id of the individual")

  public String getEmployeeRemoteId() {
    return employeeRemoteId;
  }


  public void setEmployeeRemoteId(String employeeRemoteId) {
    this.employeeRemoteId = employeeRemoteId;
  }


  public TimeOffBalanceResponse balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24.5", required = true, value = "")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public TimeOffBalanceResponse used(BigDecimal used) {
    
    this.used = used;
    return this;
  }

   /**
   * Get used
   * @return used
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", required = true, value = "")

  public BigDecimal getUsed() {
    return used;
  }


  public void setUsed(BigDecimal used) {
    this.used = used;
  }


  public TimeOffBalanceResponse policyId(String policyId) {
    
    this.policyId = policyId;
    return this;
  }

   /**
   * The Affix-assigned id of the policy
   * @return policyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw", required = true, value = "The Affix-assigned id of the policy")

  public String getPolicyId() {
    return policyId;
  }


  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }


  public TimeOffBalanceResponse policyRemoteId(String policyRemoteId) {
    
    this.policyRemoteId = policyRemoteId;
    return this;
  }

   /**
   * The remote system-assigned id of the policy
   * @return policyRemoteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw", required = true, value = "The remote system-assigned id of the policy")

  public String getPolicyRemoteId() {
    return policyRemoteId;
  }


  public void setPolicyRemoteId(String policyRemoteId) {
    this.policyRemoteId = policyRemoteId;
  }


  public TimeOffBalanceResponse policyName(String policyName) {
    
    this.policyName = policyName;
    return this;
  }

   /**
   * The name of the policy, as assigned by the remote system
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Comp/In Lieu Time", required = true, value = "The name of the policy, as assigned by the remote system")

  public String getPolicyName() {
    return policyName;
  }


  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public TimeOffBalanceResponse policyType(PolicyTypeResponse policyType) {
    
    this.policyType = policyType;
    return this;
  }

   /**
   * Get policyType
   * @return policyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PolicyTypeResponse getPolicyType() {
    return policyType;
  }


  public void setPolicyType(PolicyTypeResponse policyType) {
    this.policyType = policyType;
  }


  public TimeOffBalanceResponse remoteCreatedAt(LocalDate remoteCreatedAt) {
    
    this.remoteCreatedAt = remoteCreatedAt;
    return this;
  }

   /**
   * Get remoteCreatedAt
   * @return remoteCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Oct 11 00:00:00 UTC 2020", required = true, value = "")

  public LocalDate getRemoteCreatedAt() {
    return remoteCreatedAt;
  }


  public void setRemoteCreatedAt(LocalDate remoteCreatedAt) {
    this.remoteCreatedAt = remoteCreatedAt;
  }


  public TimeOffBalanceResponse remoteModifiedAt(LocalDate remoteModifiedAt) {
    
    this.remoteModifiedAt = remoteModifiedAt;
    return this;
  }

   /**
   * Get remoteModifiedAt
   * @return remoteModifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Oct 11 00:00:00 UTC 2020", required = true, value = "")

  public LocalDate getRemoteModifiedAt() {
    return remoteModifiedAt;
  }


  public void setRemoteModifiedAt(LocalDate remoteModifiedAt) {
    this.remoteModifiedAt = remoteModifiedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffBalanceResponse timeOffBalanceResponse = (TimeOffBalanceResponse) o;
    return Objects.equals(this.employeeId, timeOffBalanceResponse.employeeId) &&
        Objects.equals(this.employeeRemoteId, timeOffBalanceResponse.employeeRemoteId) &&
        Objects.equals(this.balance, timeOffBalanceResponse.balance) &&
        Objects.equals(this.used, timeOffBalanceResponse.used) &&
        Objects.equals(this.policyId, timeOffBalanceResponse.policyId) &&
        Objects.equals(this.policyRemoteId, timeOffBalanceResponse.policyRemoteId) &&
        Objects.equals(this.policyName, timeOffBalanceResponse.policyName) &&
        Objects.equals(this.policyType, timeOffBalanceResponse.policyType) &&
        Objects.equals(this.remoteCreatedAt, timeOffBalanceResponse.remoteCreatedAt) &&
        Objects.equals(this.remoteModifiedAt, timeOffBalanceResponse.remoteModifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, employeeRemoteId, balance, used, policyId, policyRemoteId, policyName, policyType, remoteCreatedAt, remoteModifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffBalanceResponse {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    employeeRemoteId: ").append(toIndentedString(employeeRemoteId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyRemoteId: ").append(toIndentedString(policyRemoteId)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    remoteModifiedAt: ").append(toIndentedString(remoteModifiedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

