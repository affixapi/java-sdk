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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.PayslipResponseContributions;
import org.openapitools.client.model.PayslipResponseDeductions;
import org.openapitools.client.model.PayslipResponseEarnings;
import org.openapitools.client.model.PayslipResponseTaxes;
import org.threeten.bp.LocalDate;

/**
 * PayslipResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T22:49:24.929151Z[Etc/UTC]")
public class PayslipResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employee_id";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private String employeeId;

  public static final String SERIALIZED_NAME_PAYRUN_ID = "payrun_id";
  @SerializedName(SERIALIZED_NAME_PAYRUN_ID)
  private String payrunId;

  /**
   * Gets or Sets currency
   */
  @JsonAdapter(CurrencyEnum.Adapter.class)
  public enum CurrencyEnum {
    USD("usd"),
    
    EUR("eur"),
    
    GBP("gbp");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyEnum fromValue(String value) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CurrencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CurrencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private CurrencyEnum currency;

  public static final String SERIALIZED_NAME_GROSS_PAY = "gross_pay";
  @SerializedName(SERIALIZED_NAME_GROSS_PAY)
  private BigDecimal grossPay;

  public static final String SERIALIZED_NAME_NET_PAY = "net_pay";
  @SerializedName(SERIALIZED_NAME_NET_PAY)
  private BigDecimal netPay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_PAYMENT_DATE = "payment_date";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DATE)
  private LocalDate paymentDate;

  public static final String SERIALIZED_NAME_EARNINGS = "earnings";
  @SerializedName(SERIALIZED_NAME_EARNINGS)
  private List<PayslipResponseEarnings> earnings = new ArrayList<PayslipResponseEarnings>();

  public static final String SERIALIZED_NAME_CONTRIBUTIONS = "contributions";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTIONS)
  private List<PayslipResponseContributions> contributions = new ArrayList<PayslipResponseContributions>();

  public static final String SERIALIZED_NAME_DEDUCTIONS = "deductions";
  @SerializedName(SERIALIZED_NAME_DEDUCTIONS)
  private List<PayslipResponseDeductions> deductions = new ArrayList<PayslipResponseDeductions>();

  public static final String SERIALIZED_NAME_TAXES = "taxes";
  @SerializedName(SERIALIZED_NAME_TAXES)
  private List<PayslipResponseTaxes> taxes = new ArrayList<PayslipResponseTaxes>();


  public PayslipResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The Affix-assigned id of the payslip
   * @return id
  **/
  @ApiModelProperty(example = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw", required = true, value = "The Affix-assigned id of the payslip")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PayslipResponse remoteId(String remoteId) {
    
    this.remoteId = remoteId;
    return this;
  }

   /**
   * the remote system-assigned id of the payrun
   * @return remoteId
  **/
  @ApiModelProperty(example = "19202938", required = true, value = "the remote system-assigned id of the payrun")

  public String getRemoteId() {
    return remoteId;
  }


  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }


  public PayslipResponse employeeId(String employeeId) {
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @ApiModelProperty(example = "d2f972d0-2526-434b-9409-4c3b468e08f0", required = true, value = "")

  public String getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }


  public PayslipResponse payrunId(String payrunId) {
    
    this.payrunId = payrunId;
    return this;
  }

   /**
   * Get payrunId
   * @return payrunId
  **/
  @ApiModelProperty(example = "35347df1-95e7-46e2-93cc-66f1191edca5", required = true, value = "")

  public String getPayrunId() {
    return payrunId;
  }


  public void setPayrunId(String payrunId) {
    this.payrunId = payrunId;
  }


  public PayslipResponse currency(CurrencyEnum currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "eur", required = true, value = "")

  public CurrencyEnum getCurrency() {
    return currency;
  }


  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  public PayslipResponse grossPay(BigDecimal grossPay) {
    
    this.grossPay = grossPay;
    return this;
  }

   /**
   * if USD/EUR/GBP, in cent
   * @return grossPay
  **/
  @ApiModelProperty(example = "134267", required = true, value = "if USD/EUR/GBP, in cent")

  public BigDecimal getGrossPay() {
    return grossPay;
  }


  public void setGrossPay(BigDecimal grossPay) {
    this.grossPay = grossPay;
  }


  public PayslipResponse netPay(BigDecimal netPay) {
    
    this.netPay = netPay;
    return this;
  }

   /**
   * if USD/EUR/GBP, in cent
   * @return netPay
  **/
  @ApiModelProperty(example = "86578", required = true, value = "if USD/EUR/GBP, in cent")

  public BigDecimal getNetPay() {
    return netPay;
  }


  public void setNetPay(BigDecimal netPay) {
    this.netPay = netPay;
  }


  public PayslipResponse startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "Wed Jan 01 00:00:00 UTC 2020", required = true, value = "")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public PayslipResponse endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "Fri Jan 31 00:00:00 UTC 2020", required = true, value = "")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PayslipResponse paymentDate(LocalDate paymentDate) {
    
    this.paymentDate = paymentDate;
    return this;
  }

   /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(example = "Mon Jan 27 00:00:00 UTC 2020", required = true, value = "")

  public LocalDate getPaymentDate() {
    return paymentDate;
  }


  public void setPaymentDate(LocalDate paymentDate) {
    this.paymentDate = paymentDate;
  }


  public PayslipResponse earnings(List<PayslipResponseEarnings> earnings) {
    
    this.earnings = earnings;
    return this;
  }

  public PayslipResponse addEarningsItem(PayslipResponseEarnings earningsItem) {
    this.earnings.add(earningsItem);
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @ApiModelProperty(example = "[{\"amount\":100234,\"name\":\"SALARY\",\"hours\":80},{\"amount\":834234,\"name\":\"OVERTIME\",\"hours\":8}]", required = true, value = "")

  public List<PayslipResponseEarnings> getEarnings() {
    return earnings;
  }


  public void setEarnings(List<PayslipResponseEarnings> earnings) {
    this.earnings = earnings;
  }


  public PayslipResponse contributions(List<PayslipResponseContributions> contributions) {
    
    this.contributions = contributions;
    return this;
  }

  public PayslipResponse addContributionsItem(PayslipResponseContributions contributionsItem) {
    this.contributions.add(contributionsItem);
    return this;
  }

   /**
   * Items paid by the employer that are not included in gross pay, such as employer-paid portion of private health insurance 
   * @return contributions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"name\":\"Private Health Insurance (Employer)\",\"amount\":13454},{\"name\":\"Transportation allowance benefit (Employer)\",\"amount\":3454},{\"name\":\"Other (Employer)\",\"amount\":3454}]", required = true, value = "Items paid by the employer that are not included in gross pay, such as employer-paid portion of private health insurance ")

  public List<PayslipResponseContributions> getContributions() {
    return contributions;
  }


  public void setContributions(List<PayslipResponseContributions> contributions) {
    this.contributions = contributions;
  }


  public PayslipResponse deductions(List<PayslipResponseDeductions> deductions) {
    
    this.deductions = deductions;
    return this;
  }

  public PayslipResponse addDeductionsItem(PayslipResponseDeductions deductionsItem) {
    this.deductions.add(deductionsItem);
    return this;
  }

   /**
   * Get deductions
   * @return deductions
  **/
  @ApiModelProperty(example = "[{\"name\":\"Transportation allowance benefit\",\"amount\":3454},{\"name\":\"Private Health Insurance (Employee)\",\"amount\":3454}]", required = true, value = "")

  public List<PayslipResponseDeductions> getDeductions() {
    return deductions;
  }


  public void setDeductions(List<PayslipResponseDeductions> deductions) {
    this.deductions = deductions;
  }


  public PayslipResponse taxes(List<PayslipResponseTaxes> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public PayslipResponse addTaxesItem(PayslipResponseTaxes taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @ApiModelProperty(example = "[{\"name\":\"PRSI\",\"amount\":725,\"employer_tax\":false},{\"name\":\"PSC (Class S)\",\"amount\":125,\"employer_tax\":false},{\"name\":\"Income Tax\",\"amount\":10025,\"employer_tax\":false},{\"name\":\"Payroll Tax\",\"amount\":10025,\"employer_tax\":true}]", required = true, value = "")

  public List<PayslipResponseTaxes> getTaxes() {
    return taxes;
  }


  public void setTaxes(List<PayslipResponseTaxes> taxes) {
    this.taxes = taxes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayslipResponse payslipResponse = (PayslipResponse) o;
    return Objects.equals(this.id, payslipResponse.id) &&
        Objects.equals(this.remoteId, payslipResponse.remoteId) &&
        Objects.equals(this.employeeId, payslipResponse.employeeId) &&
        Objects.equals(this.payrunId, payslipResponse.payrunId) &&
        Objects.equals(this.currency, payslipResponse.currency) &&
        Objects.equals(this.grossPay, payslipResponse.grossPay) &&
        Objects.equals(this.netPay, payslipResponse.netPay) &&
        Objects.equals(this.startDate, payslipResponse.startDate) &&
        Objects.equals(this.endDate, payslipResponse.endDate) &&
        Objects.equals(this.paymentDate, payslipResponse.paymentDate) &&
        Objects.equals(this.earnings, payslipResponse.earnings) &&
        Objects.equals(this.contributions, payslipResponse.contributions) &&
        Objects.equals(this.deductions, payslipResponse.deductions) &&
        Objects.equals(this.taxes, payslipResponse.taxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employeeId, payrunId, currency, grossPay, netPay, startDate, endDate, paymentDate, earnings, contributions, deductions, taxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayslipResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    payrunId: ").append(toIndentedString(payrunId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    grossPay: ").append(toIndentedString(grossPay)).append("\n");
    sb.append("    netPay: ").append(toIndentedString(netPay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    contributions: ").append(toIndentedString(contributions)).append("\n");
    sb.append("    deductions: ").append(toIndentedString(deductions)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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

