/*
 * Affix API
 * The affixapi.com API documentation.  # Introduction Affix API is an OAuth 2.1 application that allows developers to access customer data, without developers needing to manage or maintain integrations; or collect login credentials or API keys from users for these third party systems.  # OAuth 2.1 Affix API follows the [OAuth 2.1 spec](https://datatracker.ietf.org/doc/html/draft-ietf-oauth-v2-1-08).  As an OAuth application, Affix API handles not only both the collection of sensitive user credentials or API keys, but also builds and maintains the integrations with the providers, so you don't have to.  # How to obtain an access token in order to get started, you must:   - register a `client_id`   - direct your user to the sign in flow  (`https://connect.affixapi.com`     [with the appropriate query     parameters](https://github.com/affixapi/starter-kit/tree/master/connect))   - capture `authorization_code` we will send to your redirect URI after     the sign in flow is complete and exchange that `authorization_code` for     a Bearer token  # Sandbox keys (developer mode) ### dev ``` eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6ImQ1OTZhMmYzLWYzNzktNGE1ZC1hMmRhLTk4OWJmYWViYTg1ZCIsImlhdCI6MTcwMjkyMDkwMywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5kZXYuZW5naW5lZXJpbmcuYWZmaXhhcGkuY29tIiwic3ViIjoiZGV2ZWxvcGVyIiwiYXVkIjoiM0ZEQUVERjktMURDQTRGNTQtODc5NDlGNkEtNDEwMjc2NDMifQ.VLWYjCQvBS0C3ZA6_J3-U-idZj5EYI2IlDdTjAWBxSIHGufp6cqaVodKsF2BeIqcIeB3P0lW-KL9mY3xGd7ckQ ```  #### `employees` endpoint sample: ``` curl --fail \\   -X GET \\   -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6ImQ1OTZhMmYzLWYzNzktNGE1ZC1hMmRhLTk4OWJmYWViYTg1ZCIsImlhdCI6MTcwMjkyMDkwMywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5kZXYuZW5naW5lZXJpbmcuYWZmaXhhcGkuY29tIiwic3ViIjoiZGV2ZWxvcGVyIiwiYXVkIjoiM0ZEQUVERjktMURDQTRGNTQtODc5NDlGNkEtNDEwMjc2NDMifQ.VLWYjCQvBS0C3ZA6_J3-U-idZj5EYI2IlDdTjAWBxSIHGufp6cqaVodKsF2BeIqcIeB3P0lW-KL9mY3xGd7ckQ' \\   'https://dev.api.affixapi.com/2023-03-01/developer/employees' ```  ### prod ``` eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6IjI5YjFjYTg4LWNlNjktNDgyZC1iNGZjLTkzMWMzZmJkYWM4ZSIsImlhdCI6MTcwMjkyMTA4MywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5wcm9kLmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6ImRldmVsb3BlciIsImF1ZCI6IjA4QkIwODFFLUQ5QUI0RDE0LThERjk5MjMzLTY2NjE1Q0U5In0.2zdpFAmiyYiYk6MOcbXNUwwR4M1Fextnaac340x54AidiWXCyw-u9KeavbqfYF6q8a9kcDLrxhJ8Wc_3tIzuVw ```  #### `employees` endpoint sample: ``` curl --fail \\   -X GET \\   -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6IjI5YjFjYTg4LWNlNjktNDgyZC1iNGZjLTkzMWMzZmJkYWM4ZSIsImlhdCI6MTcwMjkyMTA4MywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5wcm9kLmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6ImRldmVsb3BlciIsImF1ZCI6IjA4QkIwODFFLUQ5QUI0RDE0LThERjk5MjMzLTY2NjE1Q0U5In0.2zdpFAmiyYiYk6MOcbXNUwwR4M1Fextnaac340x54AidiWXCyw-u9KeavbqfYF6q8a9kcDLrxhJ8Wc_3tIzuVw' \\   'https://api.affixapi.com/2023-03-01/developer/employees' ```  # Webhooks An exciting feature for HR/Payroll modes are webhooks.  If enabled, your `webhook_uri` is set on your `client_id` for the respective environment: `dev | prod`  Webhooks are configured to make live requests to the underlying integration 1x/hr, and if a difference is detected since the last request, we will send a request to your `webhook_uri` with this shape:  ``` {    added: <api.v20230301.Employees>[     <api.v20230301.Employee>{       ...,       date_of_birth: '2010-08-06',       display_full_name: 'Daija Rogahn',       employee_number: '57993',       employment_status: 'pending',       employment_type: 'other',       employments: [         {           currency: 'eur',           effective_date: '2022-02-25',           employment_type: 'other',           job_title: 'Dynamic Implementation Manager',           pay_frequency: 'semimonthly',           pay_period: 'YEAR',           pay_rate: 96000,         },       ],       first_name: 'Daija',       ...     }   ],   removed: [],   updated: [     <api.v20230301.Employee>{       ...,       date_of_birth: '2009-11-09',       display_full_name: 'Lourdes Stiedemann',       employee_number: '63189',       employment_status: 'leave',       employment_type: 'full_time',       employments: [         {           currency: 'gbp',           effective_date: '2023-01-16',           employment_type: 'full_time',           job_title: 'Forward Brand Planner',           pay_frequency: 'semimonthly',           pay_period: 'YEAR',           pay_rate: 86000,         },       ],       first_name: 'Lourdes',     }   ] } ```  the following headers will be sent with webhook requests:  ``` x-affix-api-signature: ab8474e609db95d5df3adc39ea3add7a7544bd215c5c520a30a650ae93a2fba7  x-affix-api-origin:  webhooks-employees-webhook  user-agent:  affixapi.com ```  Before trusting the payload, you should sign the payload and verify the signature matches the signature sent by the `affixapi.com` service.  This secures that the data sent to your `webhook_uri` is from the `affixapi.com` server.  The signature is created by combining the signing secret (your `client_secret`) with the body of the request sent using a standard HMAC-SHA256 keyed hash.  The signature can be created via:   - create an `HMAC` with your `client_secret`   - update the `HMAC` with the payload   - get the hex digest -> this is the signature  Sample `typescript` code that follows this recipe:  ``` import { createHmac } from 'crypto';  export const computeSignature = ({   str,   signingSecret, }: {   signingSecret: string;   str: string; }): string => {   const hmac = createHmac('sha256', signingSecret);   hmac.update(str);   const signature = hmac.digest('hex');    return signature; }; ```  ## Rate limits Open endpoints (not gated by an API key) (applied at endpoint level):   - 15 requests every 1 minute (by IP address)   - 25 requests every 5 minutes (by IP address)  Gated endpoints (require an API key) (applied at endpoint level):   - 40 requests every 1 minute (by IP address)   - 40 requests every 5 minutes (by `client_id`)  Things to keep in mind:   - Open endpoints (not gated by an API key) will likely be called by your     users, not you, so rate limits generally would not apply to you.   - As a developer, rate limits are applied at the endpoint granularity.     - For example, say the rate limits below are 10 requests per minute by ip.       from that same ip, within 1 minute, you get:       - 10 requests per minute on `/orders`,       - another 10 requests per minute on `/items`,       - and another 10 requests per minute on `/identity`,       - for a total of 30 requests per minute. 
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.AddressResponse;
import org.openapitools.client.model.CreateEmployeeRequestBankAccount;
import org.openapitools.client.model.CreateEmployeeRequestManager;
import org.openapitools.client.model.EmploymentResponse;
import org.openapitools.client.model.GroupResponse;
import org.openapitools.client.model.LocationResponse;
import org.threeten.bp.LocalDate;

/**
 * EmployeeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-17T04:22:11.153280Z[Etc/UTC]")
public class EmployeeResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_REMOTE_ID = "remote_id";
  @SerializedName(SERIALIZED_NAME_REMOTE_ID)
  private String remoteId;

  public static final String SERIALIZED_NAME_EMPLOYEE_NUMBER = "employee_number";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_NUMBER)
  private String employeeNumber;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_DISPLAY_FULL_NAME = "display_full_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_FULL_NAME)
  private String displayFullName;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private String jobTitle;

  public static final String SERIALIZED_NAME_WORK_EMAIL = "work_email";
  @SerializedName(SERIALIZED_NAME_WORK_EMAIL)
  private String workEmail;

  public static final String SERIALIZED_NAME_PERSONAL_EMAIL = "personal_email";
  @SerializedName(SERIALIZED_NAME_PERSONAL_EMAIL)
  private String personalEmail;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NUMBER = "mobile_phone_number";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NUMBER)
  private String mobilePhoneNumber;

  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    NOT_SPECIFIED("not_specified"),
    
    NULL("null");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  /**
   * Gets or Sets ethnicity
   */
  @JsonAdapter(EthnicityEnum.Adapter.class)
  public enum EthnicityEnum {
    NULL("null"),
    
    ASIAN("asian"),
    
    BLACK("black"),
    
    HISPANIC("hispanic"),
    
    MIXED("mixed"),
    
    NOT_SPECIFIED("not_specified"),
    
    OTHER("other"),
    
    WHITE("white");

    private String value;

    EthnicityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EthnicityEnum fromValue(String value) {
      for (EthnicityEnum b : EthnicityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EthnicityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EthnicityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EthnicityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EthnicityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ETHNICITY = "ethnicity";
  @SerializedName(SERIALIZED_NAME_ETHNICITY)
  private EthnicityEnum ethnicity;

  /**
   * Gets or Sets maritalStatus
   */
  @JsonAdapter(MaritalStatusEnum.Adapter.class)
  public enum MaritalStatusEnum {
    SINGLE("single"),
    
    MARRIED("married"),
    
    NOT_SPECIFIED("not_specified"),
    
    NULL("null");

    private String value;

    MaritalStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MaritalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MaritalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MaritalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MaritalStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MARITAL_STATUS = "marital_status";
  @SerializedName(SERIALIZED_NAME_MARITAL_STATUS)
  private MaritalStatusEnum maritalStatus;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  /**
   * Gets or Sets employmentStatus
   */
  @JsonAdapter(EmploymentStatusEnum.Adapter.class)
  public enum EmploymentStatusEnum {
    NULL("null"),
    
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    PENDING("pending"),
    
    LEAVE("leave");

    private String value;

    EmploymentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmploymentStatusEnum fromValue(String value) {
      for (EmploymentStatusEnum b : EmploymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EmploymentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmploymentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmploymentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmploymentStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMPLOYMENT_STATUS = "employment_status";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_STATUS)
  private EmploymentStatusEnum employmentStatus;

  /**
   * Gets or Sets employmentType
   */
  @JsonAdapter(EmploymentTypeEnum.Adapter.class)
  public enum EmploymentTypeEnum {
    NULL("null"),
    
    FULL_TIME("full_time"),
    
    PART_TIME("part_time"),
    
    CONTRACTOR("contractor"),
    
    OTHER("other");

    private String value;

    EmploymentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmploymentTypeEnum fromValue(String value) {
      for (EmploymentTypeEnum b : EmploymentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EmploymentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmploymentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmploymentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmploymentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMPLOYMENT_TYPE = "employment_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENT_TYPE)
  private EmploymentTypeEnum employmentType;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_REMOTE_CREATED_AT = "remote_created_at";
  @SerializedName(SERIALIZED_NAME_REMOTE_CREATED_AT)
  private LocalDate remoteCreatedAt;

  public static final String SERIALIZED_NAME_TERMINATION_DATE = "termination_date";
  @SerializedName(SERIALIZED_NAME_TERMINATION_DATE)
  private LocalDate terminationDate;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_HOME_LOCATION = "home_location";
  @SerializedName(SERIALIZED_NAME_HOME_LOCATION)
  private AddressResponse homeLocation;

  public static final String SERIALIZED_NAME_WORK_LOCATION = "work_location";
  @SerializedName(SERIALIZED_NAME_WORK_LOCATION)
  private LocationResponse workLocation;

  public static final String SERIALIZED_NAME_MANAGER = "manager";
  @SerializedName(SERIALIZED_NAME_MANAGER)
  private CreateEmployeeRequestManager manager;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT = "bank_account";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT)
  private CreateEmployeeRequestBankAccount bankAccount;

  public static final String SERIALIZED_NAME_EMPLOYMENTS = "employments";
  @SerializedName(SERIALIZED_NAME_EMPLOYMENTS)
  private List<EmploymentResponse> employments = new ArrayList<EmploymentResponse>();

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "custom_fields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Object customFields;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupResponse> groups = new ArrayList<GroupResponse>();


   /**
   * The Affix-assigned id of the individual
   * @return id
  **/
  @ApiModelProperty(example = "cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw", required = true, value = "The Affix-assigned id of the individual")

  public String getId() {
    return id;
  }




   /**
   * the remote system-assigned id of the individual
   * @return remoteId
  **/
  @ApiModelProperty(example = "19202938", required = true, value = "the remote system-assigned id of the individual")

  public String getRemoteId() {
    return remoteId;
  }




  public EmployeeResponse employeeNumber(String employeeNumber) {
    
    this.employeeNumber = employeeNumber;
    return this;
  }

   /**
   * Get employeeNumber
   * @return employeeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", required = true, value = "")

  public String getEmployeeNumber() {
    return employeeNumber;
  }


  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }


  public EmployeeResponse firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * the first name of the individual
   * @return firstName
  **/
  @ApiModelProperty(example = "Greg", required = true, value = "the first name of the individual")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public EmployeeResponse lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * the last name of the individual
   * @return lastName
  **/
  @ApiModelProperty(example = "Hirsch", required = true, value = "the last name of the individual")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public EmployeeResponse displayFullName(String displayFullName) {
    
    this.displayFullName = displayFullName;
    return this;
  }

   /**
   * Get displayFullName
   * @return displayFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hirsch", required = true, value = "")

  public String getDisplayFullName() {
    return displayFullName;
  }


  public void setDisplayFullName(String displayFullName) {
    this.displayFullName = displayFullName;
  }


  public EmployeeResponse nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Irish", required = true, value = "")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public EmployeeResponse jobTitle(String jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Software developer", required = true, value = "")

  public String getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public EmployeeResponse workEmail(String workEmail) {
    
    this.workEmail = workEmail;
    return this;
  }

   /**
   * the work email of the individual
   * @return workEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "greg@affixapi.com", required = true, value = "the work email of the individual")

  public String getWorkEmail() {
    return workEmail;
  }


  public void setWorkEmail(String workEmail) {
    this.workEmail = workEmail;
  }


  public EmployeeResponse personalEmail(String personalEmail) {
    
    this.personalEmail = personalEmail;
    return this;
  }

   /**
   * the personal email of the individual
   * @return personalEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "greg@gmail.com", required = true, value = "the personal email of the individual")

  public String getPersonalEmail() {
    return personalEmail;
  }


  public void setPersonalEmail(String personalEmail) {
    this.personalEmail = personalEmail;
  }


  public EmployeeResponse mobilePhoneNumber(String mobilePhoneNumber) {
    
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * +1234567890
   * @return mobilePhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hirsch", required = true, value = "+1234567890")

  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }


  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }


  public EmployeeResponse taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Get taxId
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567890", required = true, value = "")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public EmployeeResponse gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "male", required = true, value = "")

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public EmployeeResponse ethnicity(EthnicityEnum ethnicity) {
    
    this.ethnicity = ethnicity;
    return this;
  }

   /**
   * Get ethnicity
   * @return ethnicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "white", required = true, value = "")

  public EthnicityEnum getEthnicity() {
    return ethnicity;
  }


  public void setEthnicity(EthnicityEnum ethnicity) {
    this.ethnicity = ethnicity;
  }


  public EmployeeResponse maritalStatus(MaritalStatusEnum maritalStatus) {
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * Get maritalStatus
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "single", required = true, value = "")

  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public EmployeeResponse dateOfBirth(LocalDate dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Nov 10 00:00:00 UTC 1990", required = true, value = "")

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public EmployeeResponse employmentStatus(EmploymentStatusEnum employmentStatus) {
    
    this.employmentStatus = employmentStatus;
    return this;
  }

   /**
   * Get employmentStatus
   * @return employmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", required = true, value = "")

  public EmploymentStatusEnum getEmploymentStatus() {
    return employmentStatus;
  }


  public void setEmploymentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = employmentStatus;
  }


  public EmployeeResponse employmentType(EmploymentTypeEnum employmentType) {
    
    this.employmentType = employmentType;
    return this;
  }

   /**
   * Get employmentType
   * @return employmentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "full_time", required = true, value = "")

  public EmploymentTypeEnum getEmploymentType() {
    return employmentType;
  }


  public void setEmploymentType(EmploymentTypeEnum employmentType) {
    this.employmentType = employmentType;
  }


  public EmployeeResponse startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Oct 11 00:00:00 UTC 2020", required = true, value = "")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
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




  public EmployeeResponse terminationDate(LocalDate terminationDate) {
    
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Get terminationDate
   * @return terminationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Oct 12 00:00:00 UTC 2021", required = true, value = "")

  public LocalDate getTerminationDate() {
    return terminationDate;
  }


  public void setTerminationDate(LocalDate terminationDate) {
    this.terminationDate = terminationDate;
  }


  public EmployeeResponse avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://alturl.com/h2h8m", required = true, value = "")

  public String getAvatar() {
    return avatar;
  }


  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public EmployeeResponse homeLocation(AddressResponse homeLocation) {
    
    this.homeLocation = homeLocation;
    return this;
  }

   /**
   * Get homeLocation
   * @return homeLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AddressResponse getHomeLocation() {
    return homeLocation;
  }


  public void setHomeLocation(AddressResponse homeLocation) {
    this.homeLocation = homeLocation;
  }


  public EmployeeResponse workLocation(LocationResponse workLocation) {
    
    this.workLocation = workLocation;
    return this;
  }

   /**
   * Get workLocation
   * @return workLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public LocationResponse getWorkLocation() {
    return workLocation;
  }


  public void setWorkLocation(LocationResponse workLocation) {
    this.workLocation = workLocation;
  }


  public EmployeeResponse manager(CreateEmployeeRequestManager manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * Get manager
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CreateEmployeeRequestManager getManager() {
    return manager;
  }


  public void setManager(CreateEmployeeRequestManager manager) {
    this.manager = manager;
  }


  public EmployeeResponse bankAccount(CreateEmployeeRequestBankAccount bankAccount) {
    
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CreateEmployeeRequestBankAccount getBankAccount() {
    return bankAccount;
  }


  public void setBankAccount(CreateEmployeeRequestBankAccount bankAccount) {
    this.bankAccount = bankAccount;
  }


  public EmployeeResponse employments(List<EmploymentResponse> employments) {
    
    this.employments = employments;
    return this;
  }

  public EmployeeResponse addEmploymentsItem(EmploymentResponse employmentsItem) {
    this.employments.add(employmentsItem);
    return this;
  }

   /**
   * Get employments
   * @return employments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public List<EmploymentResponse> getEmployments() {
    return employments;
  }


  public void setEmployments(List<EmploymentResponse> employments) {
    this.employments = employments;
  }


  public EmployeeResponse customFields(Object customFields) {
    
    this.customFields = customFields;
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"t_shirt_size\":\"medium\"}", required = true, value = "")

  public Object getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }


  public EmployeeResponse groups(List<GroupResponse> groups) {
    
    this.groups = groups;
    return this;
  }

  public EmployeeResponse addGroupsItem(GroupResponse groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"id\":\"4B9bKBpX5tnwjiG93TAqF7ci\",\"remote_id\":\"df6c28e8\",\"name\":\"backend\",\"type\":\"team\"},{\"id\":\"132Xpnw2a38aaQG93TAqF7ci\",\"remote_id\":\"355c65922637\",\"name\":\"engineering\",\"type\":\"department\"}]", required = true, value = "")

  public List<GroupResponse> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupResponse> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeResponse employeeResponse = (EmployeeResponse) o;
    return Objects.equals(this.id, employeeResponse.id) &&
        Objects.equals(this.remoteId, employeeResponse.remoteId) &&
        Objects.equals(this.employeeNumber, employeeResponse.employeeNumber) &&
        Objects.equals(this.firstName, employeeResponse.firstName) &&
        Objects.equals(this.lastName, employeeResponse.lastName) &&
        Objects.equals(this.displayFullName, employeeResponse.displayFullName) &&
        Objects.equals(this.nationality, employeeResponse.nationality) &&
        Objects.equals(this.jobTitle, employeeResponse.jobTitle) &&
        Objects.equals(this.workEmail, employeeResponse.workEmail) &&
        Objects.equals(this.personalEmail, employeeResponse.personalEmail) &&
        Objects.equals(this.mobilePhoneNumber, employeeResponse.mobilePhoneNumber) &&
        Objects.equals(this.taxId, employeeResponse.taxId) &&
        Objects.equals(this.gender, employeeResponse.gender) &&
        Objects.equals(this.ethnicity, employeeResponse.ethnicity) &&
        Objects.equals(this.maritalStatus, employeeResponse.maritalStatus) &&
        Objects.equals(this.dateOfBirth, employeeResponse.dateOfBirth) &&
        Objects.equals(this.employmentStatus, employeeResponse.employmentStatus) &&
        Objects.equals(this.employmentType, employeeResponse.employmentType) &&
        Objects.equals(this.startDate, employeeResponse.startDate) &&
        Objects.equals(this.remoteCreatedAt, employeeResponse.remoteCreatedAt) &&
        Objects.equals(this.terminationDate, employeeResponse.terminationDate) &&
        Objects.equals(this.avatar, employeeResponse.avatar) &&
        Objects.equals(this.homeLocation, employeeResponse.homeLocation) &&
        Objects.equals(this.workLocation, employeeResponse.workLocation) &&
        Objects.equals(this.manager, employeeResponse.manager) &&
        Objects.equals(this.bankAccount, employeeResponse.bankAccount) &&
        Objects.equals(this.employments, employeeResponse.employments) &&
        Objects.equals(this.customFields, employeeResponse.customFields) &&
        Objects.equals(this.groups, employeeResponse.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, remoteId, employeeNumber, firstName, lastName, displayFullName, nationality, jobTitle, workEmail, personalEmail, mobilePhoneNumber, taxId, gender, ethnicity, maritalStatus, dateOfBirth, employmentStatus, employmentType, startDate, remoteCreatedAt, terminationDate, avatar, homeLocation, workLocation, manager, bankAccount, employments, customFields, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    remoteId: ").append(toIndentedString(remoteId)).append("\n");
    sb.append("    employeeNumber: ").append(toIndentedString(employeeNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    displayFullName: ").append(toIndentedString(displayFullName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    workEmail: ").append(toIndentedString(workEmail)).append("\n");
    sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    remoteCreatedAt: ").append(toIndentedString(remoteCreatedAt)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
    sb.append("    workLocation: ").append(toIndentedString(workLocation)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    employments: ").append(toIndentedString(employments)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

