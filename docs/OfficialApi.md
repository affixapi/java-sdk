# OfficialApi

All URIs are relative to *https://api.affixapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**officialCompanies20230301**](OfficialApi.md#officialCompanies20230301) | **GET** /2023-03-01/official/company | Company
[**officialCreateEmployee20230301**](OfficialApi.md#officialCreateEmployee20230301) | **POST** /2023-03-01/official/employee | Create Employee
[**officialEmployees20230301**](OfficialApi.md#officialEmployees20230301) | **GET** /2023-03-01/official/employees | Employees
[**officialGroups20230301**](OfficialApi.md#officialGroups20230301) | **GET** /2023-03-01/official/groups | Groups
[**officialTimeOffBalances20230301**](OfficialApi.md#officialTimeOffBalances20230301) | **GET** /2023-03-01/official/time-off-balances | Time off balances
[**officialTimeOffEntries20230301**](OfficialApi.md#officialTimeOffEntries20230301) | **GET** /2023-03-01/official/time-off-entries | Time off entries
[**officialTimesheets20230301**](OfficialApi.md#officialTimesheets20230301) | **GET** /2023-03-01/official/timesheets | Timesheets
[**officialWorkLocations20230301**](OfficialApi.md#officialWorkLocations20230301) | **GET** /2023-03-01/official/work-locations | Work locations
[**officialdentity20230301**](OfficialApi.md#officialdentity20230301) | **GET** /2023-03-01/official/identity | Identity


<a name="officialCompanies20230301"></a>
# **officialCompanies20230301**
> List&lt;CompanyResponse&gt; officialCompanies20230301()

Company

Retrieve company information 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<CompanyResponse> result = apiInstance.officialCompanies20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialCompanies20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;CompanyResponse&gt;**](CompanyResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialCreateEmployee20230301"></a>
# **officialCreateEmployee20230301**
> EmployeeResponse officialCreateEmployee20230301(createEmployeeRequest)

Create Employee

Creates a new Employee 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    CreateEmployeeRequest createEmployeeRequest = new CreateEmployeeRequest(); // CreateEmployeeRequest | 
    try {
      EmployeeResponse result = apiInstance.officialCreateEmployee20230301(createEmployeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialCreateEmployee20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmployeeRequest** | [**CreateEmployeeRequest**](CreateEmployeeRequest.md)|  |

### Return type

[**EmployeeResponse**](EmployeeResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | Bad Request |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialEmployees20230301"></a>
# **officialEmployees20230301**
> List&lt;EmployeeResponse&gt; officialEmployees20230301()

Employees

List the individuals (employees, contractors, accountants, and others) listed in the HRIS/Payroll software 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<EmployeeResponse> result = apiInstance.officialEmployees20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialEmployees20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EmployeeResponse&gt;**](EmployeeResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialGroups20230301"></a>
# **officialGroups20230301**
> List&lt;GroupResponse&gt; officialGroups20230301()

Groups

The Group object is used to represent any subset of employees, such as PayGroup, Team, or Department. Employees can be in multiple Groups. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<GroupResponse> result = apiInstance.officialGroups20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialGroups20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GroupResponse&gt;**](GroupResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialTimeOffBalances20230301"></a>
# **officialTimeOffBalances20230301**
> List&lt;TimeOffBalanceResponse&gt; officialTimeOffBalances20230301()

Time off balances

Retrieve all time off balances. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<TimeOffBalanceResponse> result = apiInstance.officialTimeOffBalances20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialTimeOffBalances20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TimeOffBalanceResponse&gt;**](TimeOffBalanceResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialTimeOffEntries20230301"></a>
# **officialTimeOffEntries20230301**
> List&lt;TimeOffEntryResponse&gt; officialTimeOffEntries20230301()

Time off entries

Retrieve time off / absence entries 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<TimeOffEntryResponse> result = apiInstance.officialTimeOffEntries20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialTimeOffEntries20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TimeOffEntryResponse&gt;**](TimeOffEntryResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialTimesheets20230301"></a>
# **officialTimesheets20230301**
> List&lt;TimesheetResponse&gt; officialTimesheets20230301()

Timesheets

Retrieve Timesheets 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<TimesheetResponse> result = apiInstance.officialTimesheets20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialTimesheets20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TimesheetResponse&gt;**](TimesheetResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialWorkLocations20230301"></a>
# **officialWorkLocations20230301**
> List&lt;LocationResponse&gt; officialWorkLocations20230301()

Work locations

The Location object is used to represent an address that can be associated with an employee 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      List<LocationResponse> result = apiInstance.officialWorkLocations20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialWorkLocations20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;LocationResponse&gt;**](LocationResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**202** | Accepted + pending (async job started) |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |
**501** | Not Implemented |  -  |

<a name="officialdentity20230301"></a>
# **officialdentity20230301**
> IdentityResponse officialdentity20230301()

Identity

List information of the user for the respective account 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OfficialApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    OfficialApi apiInstance = new OfficialApi(defaultClient);
    try {
      IdentityResponse result = apiInstance.officialdentity20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficialApi#officialdentity20230301");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IdentityResponse**](IdentityResponse.md)

### Authorization

[access-token](../README.md#access-token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**401** | Authentication Error |  -  |
**429** | Rate Limited / Too Many Requests |  * Retry-After - Retry your call after the specified amount of seconds <br>  |
**500** | Server Error |  -  |

