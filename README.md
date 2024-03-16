# api

Affix API
- API version: 2023-03-01
  - Build date: 2024-03-16T22:42:16.450519Z[Etc/UTC]

The affixapi.com API documentation.

# Introduction
Affix API is an OAuth 2.1 application that allows developers to access
customer data, without developers needing to manage or maintain
integrations; or collect login credentials or API keys from users for these
third party systems.

# OAuth 2.1
Affix API follows the [OAuth 2.1 spec](https://datatracker.ietf.org/doc/html/draft-ietf-oauth-v2-1-08).

As an OAuth application, Affix API handles not only both the collection of
sensitive user credentials or API keys, but also builds and maintains the
integrations with the providers, so you don't have to.

# How to obtain an access token
in order to get started, you must:
  - register a `client_id`
  - direct your user to the sign in flow  (`https://connect.affixapi.com`
    [with the appropriate query
    parameters](https://github.com/affixapi/starter-kit/tree/master/connect))
  - capture `authorization_code` we will send to your redirect URI after
    the sign in flow is complete and exchange that `authorization_code` for
    a Bearer token

# Sandbox keys (developer mode)
### dev
```
eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6ImQ1OTZhMmYzLWYzNzktNGE1ZC1hMmRhLTk4OWJmYWViYTg1ZCIsImlhdCI6MTcwMjkyMDkwMywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5kZXYuZW5naW5lZXJpbmcuYWZmaXhhcGkuY29tIiwic3ViIjoiZGV2ZWxvcGVyIiwiYXVkIjoiM0ZEQUVERjktMURDQTRGNTQtODc5NDlGNkEtNDEwMjc2NDMifQ.VLWYjCQvBS0C3ZA6_J3-U-idZj5EYI2IlDdTjAWBxSIHGufp6cqaVodKsF2BeIqcIeB3P0lW-KL9mY3xGd7ckQ
```

#### `employees` endpoint sample:
```
curl --fail \\
  -X GET \\
  -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6ImQ1OTZhMmYzLWYzNzktNGE1ZC1hMmRhLTk4OWJmYWViYTg1ZCIsImlhdCI6MTcwMjkyMDkwMywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5kZXYuZW5naW5lZXJpbmcuYWZmaXhhcGkuY29tIiwic3ViIjoiZGV2ZWxvcGVyIiwiYXVkIjoiM0ZEQUVERjktMURDQTRGNTQtODc5NDlGNkEtNDEwMjc2NDMifQ.VLWYjCQvBS0C3ZA6_J3-U-idZj5EYI2IlDdTjAWBxSIHGufp6cqaVodKsF2BeIqcIeB3P0lW-KL9mY3xGd7ckQ' \\
  'https://dev.api.affixapi.com/2023-03-01/developer/employees'
```

### prod
```
eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6IjI5YjFjYTg4LWNlNjktNDgyZC1iNGZjLTkzMWMzZmJkYWM4ZSIsImlhdCI6MTcwMjkyMTA4MywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5wcm9kLmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6ImRldmVsb3BlciIsImF1ZCI6IjA4QkIwODFFLUQ5QUI0RDE0LThERjk5MjMzLTY2NjE1Q0U5In0.2zdpFAmiyYiYk6MOcbXNUwwR4M1Fextnaac340x54AidiWXCyw-u9KeavbqfYF6q8a9kcDLrxhJ8Wc_3tIzuVw
```

#### `employees` endpoint sample:
```
curl --fail \\
  -X GET \\
  -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL2lkZW50aXR5IiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3BheXJ1bnMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvcGF5cnVucy86cGF5cnVuX2lkIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWJhbGFuY2VzIiwiLzIwMjMtMDMtMDEvZGV2ZWxvcGVyL3RpbWUtb2ZmLWVudHJpZXMiLCIvMjAyMy0wMy0wMS9kZXZlbG9wZXIvdGltZXNoZWV0cyJdLCJ0b2tlbiI6IjI5YjFjYTg4LWNlNjktNDgyZC1iNGZjLTkzMWMzZmJkYWM4ZSIsImlhdCI6MTcwMjkyMTA4MywiaXNzIjoicHVibGljYXBpLWludGVybWVkaWF0ZS5wcm9kLmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6ImRldmVsb3BlciIsImF1ZCI6IjA4QkIwODFFLUQ5QUI0RDE0LThERjk5MjMzLTY2NjE1Q0U5In0.2zdpFAmiyYiYk6MOcbXNUwwR4M1Fextnaac340x54AidiWXCyw-u9KeavbqfYF6q8a9kcDLrxhJ8Wc_3tIzuVw' \\
  'https://api.affixapi.com/2023-03-01/developer/employees'
```

# Compression
We support `brotli`, `gzip`, and `deflate` compression algorithms.

To enable, pass the `Accept-Encoding` header with one or all of the values:
`br`, `gzip`, `deflate`, or `identity` (no compression)

In the response, you will receive the `Content-Encoding` response header
indicating the compression algorithm used in the data payload to enable you
to decompress the result. If the `Accept-Encoding: identity` header was
passed, no `Content-Encoding` response header is sent back, as no
compression algorithm was used.

# Webhooks
An exciting feature for HR/Payroll modes are webhooks.

If enabled, your `webhook_uri` is set on your `client_id` for the
respective environment: `dev | prod`

Webhooks are configured to make live requests to the underlying integration
1x/hr, and if a difference is detected since the last request, we will send a
request to your `webhook_uri` with this shape:

```
{

  added: <api.v20230301.Employees>[
    <api.v20230301.Employee>{
      ...,
      date_of_birth: '2010-08-06',
      display_full_name: 'Daija Rogahn',
      employee_number: '57993',
      employment_status: 'pending',
      employment_type: 'other',
      employments: [
        {
          currency: 'eur',
          effective_date: '2022-02-25',
          employment_type: 'other',
          job_title: 'Dynamic Implementation Manager',
          pay_frequency: 'semimonthly',
          pay_period: 'YEAR',
          pay_rate: 96000,
        },
      ],
      first_name: 'Daija',
      ...
    }
  ],
  removed: [],
  updated: [
    <api.v20230301.Employee>{
      ...,
      date_of_birth: '2009-11-09',
      display_full_name: 'Lourdes Stiedemann',
      employee_number: '63189',
      employment_status: 'leave',
      employment_type: 'full_time',
      employments: [
        {
          currency: 'gbp',
          effective_date: '2023-01-16',
          employment_type: 'full_time',
          job_title: 'Forward Brand Planner',
          pay_frequency: 'semimonthly',
          pay_period: 'YEAR',
          pay_rate: 86000,
        },
      ],
      first_name: 'Lourdes',
    }
  ]
}
```

the following headers will be sent with webhook requests:

```
x-affix-api-signature: ab8474e609db95d5df3adc39ea3add7a7544bd215c5c520a30a650ae93a2fba7

x-affix-api-origin:  webhooks-employees-webhook

user-agent:  affixapi.com
```

Before trusting the payload, you should sign the payload and verify the
signature matches the signature sent by the `affixapi.com` service.

This secures that the data sent to your `webhook_uri` is from the
`affixapi.com` server.

The signature is created by combining the signing secret (your
`client_secret`) with the body of the request sent using a standard
HMAC-SHA256 keyed hash.

The signature can be created via:
  - create an `HMAC` with your `client_secret`
  - update the `HMAC` with the payload
  - get the hex digest -> this is the signature

Sample `typescript` code that follows this recipe:

```
import { createHmac } from 'crypto';

export const computeSignature = ({
  str,
  signingSecret,
}: {
  signingSecret: string;
  str: string;
}): string => {
  const hmac = createHmac('sha256', signingSecret);
  hmac.update(str);
  const signature = hmac.digest('hex');

  return signature;
};
```

## Rate limits
Open endpoints (not gated by an API key) (applied at endpoint level):
  - 15 requests every 1 minute (by IP address)
  - 25 requests every 5 minutes (by IP address)

Gated endpoints (require an API key) (applied at endpoint level):
  - 40 requests every 1 minute (by IP address)
  - 40 requests every 5 minutes (by `client_id`)

Things to keep in mind:
  - Open endpoints (not gated by an API key) will likely be called by your
    users, not you, so rate limits generally would not apply to you.
  - As a developer, rate limits are applied at the endpoint granularity.
    - For example, say the rate limits below are 10 requests per minute by ip.
      from that same ip, within 1 minute, you get:
      - 10 requests per minute on `/orders`,
      - another 10 requests per minute on `/items`,
      - and another 10 requests per minute on `/identity`,
      - for a total of 30 requests per minute.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.affixapi</groupId>
  <artifactId>api</artifactId>
  <version>1.1.42</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.affixapi:api:1.1.42"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-1.1.42.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Class20230301Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    Class20230301Api apiInstance = new Class20230301Api(defaultClient);
    try {
      List<CompanyResponse> result = apiInstance.developerCompanies20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class20230301Api#developerCompanies20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.affixapi.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*Class20230301Api* | [**developerCompanies20230301**](docs/Class20230301Api.md#developerCompanies20230301) | **GET** /2023-03-01/developer/company | Company
*Class20230301Api* | [**developerCreateEmployee20230301**](docs/Class20230301Api.md#developerCreateEmployee20230301) | **POST** /2023-03-01/developer/employee | Create employee
*Class20230301Api* | [**developerEmployees20230301**](docs/Class20230301Api.md#developerEmployees20230301) | **GET** /2023-03-01/developer/employees | Employees
*Class20230301Api* | [**developerGroups20230301**](docs/Class20230301Api.md#developerGroups20230301) | **GET** /2023-03-01/developer/groups | Groups
*Class20230301Api* | [**developerIdentity20230301**](docs/Class20230301Api.md#developerIdentity20230301) | **GET** /2023-03-01/developer/identity | Identity
*Class20230301Api* | [**developerPayruns20230301**](docs/Class20230301Api.md#developerPayruns20230301) | **GET** /2023-03-01/developer/payruns | Payruns
*Class20230301Api* | [**developerPayslips20230301**](docs/Class20230301Api.md#developerPayslips20230301) | **GET** /2023-03-01/developer/payruns/{payrun_id} | Payslips
*Class20230301Api* | [**developerTimeOffBalances20230301**](docs/Class20230301Api.md#developerTimeOffBalances20230301) | **GET** /2023-03-01/developer/time-off-balances | Time off balances
*Class20230301Api* | [**developerTimeOffEntries20230301**](docs/Class20230301Api.md#developerTimeOffEntries20230301) | **GET** /2023-03-01/developer/time-off-entries | Time off entries
*Class20230301Api* | [**developerTimesheets20230301**](docs/Class20230301Api.md#developerTimesheets20230301) | **GET** /2023-03-01/developer/timesheets | Timesheets
*Class20230301Api* | [**developerWorkLocations20230301**](docs/Class20230301Api.md#developerWorkLocations20230301) | **GET** /2023-03-01/developer/work-locations | Work locations
*Class20230301Api* | [**officialCompanies20230301**](docs/Class20230301Api.md#officialCompanies20230301) | **GET** /2023-03-01/official/company | Company
*Class20230301Api* | [**officialCreateEmployee20230301**](docs/Class20230301Api.md#officialCreateEmployee20230301) | **POST** /2023-03-01/official/employee | Create Employee
*Class20230301Api* | [**officialEmployees20230301**](docs/Class20230301Api.md#officialEmployees20230301) | **GET** /2023-03-01/official/employees | Employees
*Class20230301Api* | [**officialGroups20230301**](docs/Class20230301Api.md#officialGroups20230301) | **GET** /2023-03-01/official/groups | Groups
*Class20230301Api* | [**officialTimeOffBalances20230301**](docs/Class20230301Api.md#officialTimeOffBalances20230301) | **GET** /2023-03-01/official/time-off-balances | Time off balances
*Class20230301Api* | [**officialTimeOffEntries20230301**](docs/Class20230301Api.md#officialTimeOffEntries20230301) | **GET** /2023-03-01/official/time-off-entries | Time off entries
*Class20230301Api* | [**officialTimesheets20230301**](docs/Class20230301Api.md#officialTimesheets20230301) | **GET** /2023-03-01/official/timesheets | Timesheets
*Class20230301Api* | [**officialWorkLocations20230301**](docs/Class20230301Api.md#officialWorkLocations20230301) | **GET** /2023-03-01/official/work-locations | Work locations
*Class20230301Api* | [**officialdentity20230301**](docs/Class20230301Api.md#officialdentity20230301) | **GET** /2023-03-01/official/identity | Identity
*CoreApi* | [**providers**](docs/CoreApi.md#providers) | **GET** /providers | Providers
*DeveloperApi* | [**developerCompanies20230301**](docs/DeveloperApi.md#developerCompanies20230301) | **GET** /2023-03-01/developer/company | Company
*DeveloperApi* | [**developerCreateEmployee20230301**](docs/DeveloperApi.md#developerCreateEmployee20230301) | **POST** /2023-03-01/developer/employee | Create employee
*DeveloperApi* | [**developerEmployees20230301**](docs/DeveloperApi.md#developerEmployees20230301) | **GET** /2023-03-01/developer/employees | Employees
*DeveloperApi* | [**developerGroups20230301**](docs/DeveloperApi.md#developerGroups20230301) | **GET** /2023-03-01/developer/groups | Groups
*DeveloperApi* | [**developerIdentity20230301**](docs/DeveloperApi.md#developerIdentity20230301) | **GET** /2023-03-01/developer/identity | Identity
*DeveloperApi* | [**developerPayruns20230301**](docs/DeveloperApi.md#developerPayruns20230301) | **GET** /2023-03-01/developer/payruns | Payruns
*DeveloperApi* | [**developerPayslips20230301**](docs/DeveloperApi.md#developerPayslips20230301) | **GET** /2023-03-01/developer/payruns/{payrun_id} | Payslips
*DeveloperApi* | [**developerTimeOffBalances20230301**](docs/DeveloperApi.md#developerTimeOffBalances20230301) | **GET** /2023-03-01/developer/time-off-balances | Time off balances
*DeveloperApi* | [**developerTimeOffEntries20230301**](docs/DeveloperApi.md#developerTimeOffEntries20230301) | **GET** /2023-03-01/developer/time-off-entries | Time off entries
*DeveloperApi* | [**developerTimesheets20230301**](docs/DeveloperApi.md#developerTimesheets20230301) | **GET** /2023-03-01/developer/timesheets | Timesheets
*DeveloperApi* | [**developerWorkLocations20230301**](docs/DeveloperApi.md#developerWorkLocations20230301) | **GET** /2023-03-01/developer/work-locations | Work locations
*ManagementApi* | [**client**](docs/ManagementApi.md#client) | **GET** /2023-03-01/management/client | Client
*ManagementApi* | [**disconnect**](docs/ManagementApi.md#disconnect) | **POST** /2023-03-01/management/disconnect | Disconnect token
*ManagementApi* | [**introspect**](docs/ManagementApi.md#introspect) | **GET** /2023-03-01/management/introspect | Inspect token
*ManagementApi* | [**token**](docs/ManagementApi.md#token) | **POST** /2023-03-01/management/token | Create token
*ManagementApi* | [**tokens**](docs/ManagementApi.md#tokens) | **GET** /2023-03-01/management/tokens | Tokens
*ManagementApi* | [**updateClient**](docs/ManagementApi.md#updateClient) | **POST** /2023-03-01/management/client | Update client
*OfficialApi* | [**officialCompanies20230301**](docs/OfficialApi.md#officialCompanies20230301) | **GET** /2023-03-01/official/company | Company
*OfficialApi* | [**officialCreateEmployee20230301**](docs/OfficialApi.md#officialCreateEmployee20230301) | **POST** /2023-03-01/official/employee | Create Employee
*OfficialApi* | [**officialEmployees20230301**](docs/OfficialApi.md#officialEmployees20230301) | **GET** /2023-03-01/official/employees | Employees
*OfficialApi* | [**officialGroups20230301**](docs/OfficialApi.md#officialGroups20230301) | **GET** /2023-03-01/official/groups | Groups
*OfficialApi* | [**officialTimeOffBalances20230301**](docs/OfficialApi.md#officialTimeOffBalances20230301) | **GET** /2023-03-01/official/time-off-balances | Time off balances
*OfficialApi* | [**officialTimeOffEntries20230301**](docs/OfficialApi.md#officialTimeOffEntries20230301) | **GET** /2023-03-01/official/time-off-entries | Time off entries
*OfficialApi* | [**officialTimesheets20230301**](docs/OfficialApi.md#officialTimesheets20230301) | **GET** /2023-03-01/official/timesheets | Timesheets
*OfficialApi* | [**officialWorkLocations20230301**](docs/OfficialApi.md#officialWorkLocations20230301) | **GET** /2023-03-01/official/work-locations | Work locations
*OfficialApi* | [**officialdentity20230301**](docs/OfficialApi.md#officialdentity20230301) | **GET** /2023-03-01/official/identity | Identity


## Documentation for Models

 - [AddressNoNonNullRequest](docs/AddressNoNonNullRequest.md)
 - [AddressResponse](docs/AddressResponse.md)
 - [ClientRequest](docs/ClientRequest.md)
 - [ClientResponse](docs/ClientResponse.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [CreateEmployeeRequest](docs/CreateEmployeeRequest.md)
 - [CreateEmployeeRequestBankAccount](docs/CreateEmployeeRequestBankAccount.md)
 - [CreateEmployeeRequestManager](docs/CreateEmployeeRequestManager.md)
 - [CurrencyRequest](docs/CurrencyRequest.md)
 - [CurrencyResponse](docs/CurrencyResponse.md)
 - [DisconnectResponse](docs/DisconnectResponse.md)
 - [EmployeeResponse](docs/EmployeeResponse.md)
 - [EmploymentNoNullEnumRequest](docs/EmploymentNoNullEnumRequest.md)
 - [EmploymentResponse](docs/EmploymentResponse.md)
 - [GroupNoNullEnumRequest](docs/GroupNoNullEnumRequest.md)
 - [GroupResponse](docs/GroupResponse.md)
 - [IdAndMessageResponse](docs/IdAndMessageResponse.md)
 - [IdentityResponse](docs/IdentityResponse.md)
 - [InlineResponse400](docs/InlineResponse400.md)
 - [InlineResponse401](docs/InlineResponse401.md)
 - [InlineResponse409](docs/InlineResponse409.md)
 - [IntrospectResponse](docs/IntrospectResponse.md)
 - [LocationNoNonNullRequest](docs/LocationNoNonNullRequest.md)
 - [LocationResponse](docs/LocationResponse.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [ModeRequest](docs/ModeRequest.md)
 - [ModeResponse](docs/ModeResponse.md)
 - [PayrunResponse](docs/PayrunResponse.md)
 - [PayslipResponse](docs/PayslipResponse.md)
 - [PayslipResponseContributions](docs/PayslipResponseContributions.md)
 - [PayslipResponseDeductions](docs/PayslipResponseDeductions.md)
 - [PayslipResponseEarnings](docs/PayslipResponseEarnings.md)
 - [PayslipResponseTaxes](docs/PayslipResponseTaxes.md)
 - [ProviderRequest](docs/ProviderRequest.md)
 - [ProviderResponse](docs/ProviderResponse.md)
 - [ScopesRequest](docs/ScopesRequest.md)
 - [ScopesResponse](docs/ScopesResponse.md)
 - [TimeOffBalanceResponse](docs/TimeOffBalanceResponse.md)
 - [TimeOffEntryResponse](docs/TimeOffEntryResponse.md)
 - [TimesheetResponse](docs/TimesheetResponse.md)
 - [TokenRequest](docs/TokenRequest.md)
 - [TokenResponse](docs/TokenResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### access-token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

### basic

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developers@affixapi.com

