# api

Affix API
- API version: 2023-03-01
  - Build date: 2024-05-10T14:02:18.031850Z[Etc/UTC]

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

# Sandbox keys (xhr mode)
### dev
```
eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzODIzNTNlMi05N2ZiLTRmMWEtOTYxYy0zZDI5OTViNzYxMTUiLCJpYXQiOjE3MTE4MTA3MTQsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUuZGV2LmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6InhociIsImF1ZCI6IjNGREFFREY5LTFEQ0E0RjU0LTg3OTQ5RjZBLTQxMDI3NjQzIn0.zUJPaT6IxcIdr8b9iO6u-Rr5I-ohTHPYTrQGrgOFghbEbovItiwr9Wk479GnJVJc3WR8bxAwUMAE4Ul6Okdk6Q
```

#### `employees` endpoint sample:
```
curl --fail \\
  -X GET \\
  -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzODIzNTNlMi05N2ZiLTRmMWEtOTYxYy0zZDI5OTViNzYxMTUiLCJpYXQiOjE3MTE4MTA3MTQsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUuZGV2LmVuZ2luZWVyaW5nLmFmZml4YXBpLmNvbSIsInN1YiI6InhociIsImF1ZCI6IjNGREFFREY5LTFEQ0E0RjU0LTg3OTQ5RjZBLTQxMDI3NjQzIn0.zUJPaT6IxcIdr8b9iO6u-Rr5I-ohTHPYTrQGrgOFghbEbovItiwr9Wk479GnJVJc3WR8bxAwUMAE4Ul6Okdk6Q' \\
  'https://dev.api.affixapi.com/2023-03-01/xhr/employees'
```

### prod
```
eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzYjg4MDc2NC1kMGFmLTQ5ZDAtOGM5OS00YzIwYjE2MTJjOTMiLCJpYXQiOjE3MTE4MTA4NTgsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUucHJvZC5lbmdpbmVlcmluZy5hZmZpeGFwaS5jb20iLCJzdWIiOiJ4aHIiLCJhdWQiOiIwOEJCMDgxRS1EOUFCNEQxNC04REY5OTIzMy02NjYxNUNFOSJ9.n3pJmmfegU21Tko_TyUyCHi4ITvfd75T8NFFTHmf1r8AI8yCUYTWdfNjyZZWcZD6z50I3Wsk2rAd8GDWXn4vlg
```

#### `employees` endpoint sample:
```
curl --fail \\
  -X GET \\
  -H 'Authorization: Bearer eyJhbGciOiJFUzI1NiIsImtpZCI6Ims5RmxwSFR1YklmZWNsUU5QRVZzeFcxazFZZ0Zfbk1BWllOSGVuOFQxdGciLCJ0eXAiOiJKV1MifQ.eyJwcm92aWRlciI6InNhbmRib3giLCJzY29wZXMiOlsiLzIwMjMtMDMtMDEveGhyL2NvbXBhbnkiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWUiLCIvMjAyMy0wMy0wMS94aHIvZW1wbG95ZWVzIiwiLzIwMjMtMDMtMDEveGhyL2dyb3VwcyIsIi8yMDIzLTAzLTAxL3hoci9pZGVudGl0eSIsIi8yMDIzLTAzLTAxL3hoci9wYXlydW5zIiwiLzIwMjMtMDMtMDEveGhyL3BheXJ1bnMvOnBheXJ1bl9pZCIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1iYWxhbmNlcyIsIi8yMDIzLTAzLTAxL3hoci90aW1lLW9mZi1lbnRyaWVzIiwiLzIwMjMtMDMtMDEveGhyL3RpbWVzaGVldHMiLCIvMjAyMy0wMy0wMS94aHIvd29yay1sb2NhdGlvbnMiXSwidG9rZW4iOiIzYjg4MDc2NC1kMGFmLTQ5ZDAtOGM5OS00YzIwYjE2MTJjOTMiLCJpYXQiOjE3MTE4MTA4NTgsImlzcyI6InB1YmxpY2FwaS1pbnRlcm1lZGlhdGUucHJvZC5lbmdpbmVlcmluZy5hZmZpeGFwaS5jb20iLCJzdWIiOiJ4aHIiLCJhdWQiOiIwOEJCMDgxRS1EOUFCNEQxNC04REY5OTIzMy02NjYxNUNFOSJ9.n3pJmmfegU21Tko_TyUyCHi4ITvfd75T8NFFTHmf1r8AI8yCUYTWdfNjyZZWcZD6z50I3Wsk2rAd8GDWXn4vlg' \\
  'https://api.affixapi.com/2023-03-01/xhr/employees'
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

While verifying the Affix API signature header should be your primary
method of confirming validity, you can also whitelist our outbound webhook
static IP addresses.

```
dev:
  - 52.210.169.82
  - 52.210.38.77
  - 3.248.135.204

prod:
  - 52.51.160.102
  - 54.220.83.244
  - 3.254.213.171
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
  <version>1.1.76</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.affixapi:api:1.1.76"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-1.1.76.jar`
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
      List<CompanyResponse> result = apiInstance.xhrCompanies20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class20230301Api#xhrCompanies20230301");
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
*Class20230301Api* | [**xhrCompanies20230301**](docs/Class20230301Api.md#xhrCompanies20230301) | **GET** /2023-03-01/xhr/company | Company
*Class20230301Api* | [**xhrEmployees20230301**](docs/Class20230301Api.md#xhrEmployees20230301) | **GET** /2023-03-01/xhr/employees | Employees
*Class20230301Api* | [**xhrGroups20230301**](docs/Class20230301Api.md#xhrGroups20230301) | **GET** /2023-03-01/xhr/groups | Groups
*Class20230301Api* | [**xhrIdentity20230301**](docs/Class20230301Api.md#xhrIdentity20230301) | **GET** /2023-03-01/xhr/identity | Identity
*Class20230301Api* | [**xhrPayruns20230301**](docs/Class20230301Api.md#xhrPayruns20230301) | **GET** /2023-03-01/xhr/payruns | Payruns
*Class20230301Api* | [**xhrPayslips20230301**](docs/Class20230301Api.md#xhrPayslips20230301) | **GET** /2023-03-01/xhr/payruns/{payrun_id} | Payslips
*Class20230301Api* | [**xhrTimeOffBalances20230301**](docs/Class20230301Api.md#xhrTimeOffBalances20230301) | **GET** /2023-03-01/xhr/time-off-balances | Time off balances
*Class20230301Api* | [**xhrTimeOffEntries20230301**](docs/Class20230301Api.md#xhrTimeOffEntries20230301) | **GET** /2023-03-01/xhr/time-off-entries | Time off entries
*Class20230301Api* | [**xhrTimesheets20230301**](docs/Class20230301Api.md#xhrTimesheets20230301) | **GET** /2023-03-01/xhr/timesheets | Timesheets
*Class20230301Api* | [**xhrWorkLocations20230301**](docs/Class20230301Api.md#xhrWorkLocations20230301) | **GET** /2023-03-01/xhr/work-locations | Work locations
*CoreApi* | [**providers**](docs/CoreApi.md#providers) | **GET** /providers | Providers
*ManagementApi* | [**client**](docs/ManagementApi.md#client) | **GET** /2023-03-01/management/client | Client
*ManagementApi* | [**disconnect**](docs/ManagementApi.md#disconnect) | **POST** /2023-03-01/management/disconnect | Disconnect token
*ManagementApi* | [**introspect**](docs/ManagementApi.md#introspect) | **GET** /2023-03-01/management/introspect | Inspect token
*ManagementApi* | [**token**](docs/ManagementApi.md#token) | **POST** /2023-03-01/management/token | Create token
*ManagementApi* | [**tokens**](docs/ManagementApi.md#tokens) | **GET** /2023-03-01/management/tokens | Tokens
*ManagementApi* | [**updateClient**](docs/ManagementApi.md#updateClient) | **POST** /2023-03-01/management/client | Update client
*XhrVerticallyIntegratedApi* | [**xhrCompanies20230301**](docs/XhrVerticallyIntegratedApi.md#xhrCompanies20230301) | **GET** /2023-03-01/xhr/company | Company
*XhrVerticallyIntegratedApi* | [**xhrEmployees20230301**](docs/XhrVerticallyIntegratedApi.md#xhrEmployees20230301) | **GET** /2023-03-01/xhr/employees | Employees
*XhrVerticallyIntegratedApi* | [**xhrGroups20230301**](docs/XhrVerticallyIntegratedApi.md#xhrGroups20230301) | **GET** /2023-03-01/xhr/groups | Groups
*XhrVerticallyIntegratedApi* | [**xhrIdentity20230301**](docs/XhrVerticallyIntegratedApi.md#xhrIdentity20230301) | **GET** /2023-03-01/xhr/identity | Identity
*XhrVerticallyIntegratedApi* | [**xhrPayruns20230301**](docs/XhrVerticallyIntegratedApi.md#xhrPayruns20230301) | **GET** /2023-03-01/xhr/payruns | Payruns
*XhrVerticallyIntegratedApi* | [**xhrPayslips20230301**](docs/XhrVerticallyIntegratedApi.md#xhrPayslips20230301) | **GET** /2023-03-01/xhr/payruns/{payrun_id} | Payslips
*XhrVerticallyIntegratedApi* | [**xhrTimeOffBalances20230301**](docs/XhrVerticallyIntegratedApi.md#xhrTimeOffBalances20230301) | **GET** /2023-03-01/xhr/time-off-balances | Time off balances
*XhrVerticallyIntegratedApi* | [**xhrTimeOffEntries20230301**](docs/XhrVerticallyIntegratedApi.md#xhrTimeOffEntries20230301) | **GET** /2023-03-01/xhr/time-off-entries | Time off entries
*XhrVerticallyIntegratedApi* | [**xhrTimesheets20230301**](docs/XhrVerticallyIntegratedApi.md#xhrTimesheets20230301) | **GET** /2023-03-01/xhr/timesheets | Timesheets
*XhrVerticallyIntegratedApi* | [**xhrWorkLocations20230301**](docs/XhrVerticallyIntegratedApi.md#xhrWorkLocations20230301) | **GET** /2023-03-01/xhr/work-locations | Work locations


## Documentation for Models

 - [AddressNoNonNullRequest](docs/AddressNoNonNullRequest.md)
 - [AddressResponse](docs/AddressResponse.md)
 - [ClientRequest](docs/ClientRequest.md)
 - [ClientResponse](docs/ClientResponse.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [CompensationHistoryNoNonNullRequest](docs/CompensationHistoryNoNonNullRequest.md)
 - [CompensationHistoryResponse](docs/CompensationHistoryResponse.md)
 - [CreateEmployeeRequest](docs/CreateEmployeeRequest.md)
 - [CreateEmployeeRequestBankAccount](docs/CreateEmployeeRequestBankAccount.md)
 - [CreateEmployeeRequestDependents](docs/CreateEmployeeRequestDependents.md)
 - [CreateEmployeeRequestEmergencyContacts](docs/CreateEmployeeRequestEmergencyContacts.md)
 - [CreateEmployeeRequestManager](docs/CreateEmployeeRequestManager.md)
 - [CurrencyNotNullRequest](docs/CurrencyNotNullRequest.md)
 - [CurrencyResponse](docs/CurrencyResponse.md)
 - [DisconnectResponse](docs/DisconnectResponse.md)
 - [EmployeeResponse](docs/EmployeeResponse.md)
 - [EmployeeResponseManager](docs/EmployeeResponseManager.md)
 - [EmploymentHistoryNoNonNullRequest](docs/EmploymentHistoryNoNonNullRequest.md)
 - [EmploymentHistoryResponse](docs/EmploymentHistoryResponse.md)
 - [EmploymentStatusNotNullNotNullable](docs/EmploymentStatusNotNullNotNullable.md)
 - [EmploymentStatusNotNullRequest](docs/EmploymentStatusNotNullRequest.md)
 - [EmploymentStatusResponse](docs/EmploymentStatusResponse.md)
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
 - [PolicyTypeResponse](docs/PolicyTypeResponse.md)
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

