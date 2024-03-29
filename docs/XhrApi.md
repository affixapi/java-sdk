# XhrApi

All URIs are relative to *https://api.affixapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xhrCompanies20230301**](XhrApi.md#xhrCompanies20230301) | **GET** /2023-03-01/xhr/company | Company
[**xhrCreateEmployee20230301**](XhrApi.md#xhrCreateEmployee20230301) | **POST** /2023-03-01/xhr/employee | Create employee
[**xhrEmployees20230301**](XhrApi.md#xhrEmployees20230301) | **GET** /2023-03-01/xhr/employees | Employees
[**xhrGroups20230301**](XhrApi.md#xhrGroups20230301) | **GET** /2023-03-01/xhr/groups | Groups
[**xhrIdentity20230301**](XhrApi.md#xhrIdentity20230301) | **GET** /2023-03-01/xhr/identity | Identity
[**xhrPayruns20230301**](XhrApi.md#xhrPayruns20230301) | **GET** /2023-03-01/xhr/payruns | Payruns
[**xhrPayslips20230301**](XhrApi.md#xhrPayslips20230301) | **GET** /2023-03-01/xhr/payruns/{payrun_id} | Payslips
[**xhrTimeOffBalances20230301**](XhrApi.md#xhrTimeOffBalances20230301) | **GET** /2023-03-01/xhr/time-off-balances | Time off balances
[**xhrTimeOffEntries20230301**](XhrApi.md#xhrTimeOffEntries20230301) | **GET** /2023-03-01/xhr/time-off-entries | Time off entries
[**xhrTimesheets20230301**](XhrApi.md#xhrTimesheets20230301) | **GET** /2023-03-01/xhr/timesheets | Timesheets
[**xhrWorkLocations20230301**](XhrApi.md#xhrWorkLocations20230301) | **GET** /2023-03-01/xhr/work-locations | Work locations


<a name="xhrCompanies20230301"></a>
# **xhrCompanies20230301**
> List&lt;CompanyResponse&gt; xhrCompanies20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<CompanyResponse> result = apiInstance.xhrCompanies20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrCompanies20230301");
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

<a name="xhrCreateEmployee20230301"></a>
# **xhrCreateEmployee20230301**
> EmployeeResponse xhrCreateEmployee20230301(createEmployeeRequest)

Create employee

Creates a new Employee 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    CreateEmployeeRequest createEmployeeRequest = new CreateEmployeeRequest(); // CreateEmployeeRequest | 
    try {
      EmployeeResponse result = apiInstance.xhrCreateEmployee20230301(createEmployeeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrCreateEmployee20230301");
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

<a name="xhrEmployees20230301"></a>
# **xhrEmployees20230301**
> List&lt;EmployeeResponse&gt; xhrEmployees20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<EmployeeResponse> result = apiInstance.xhrEmployees20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrEmployees20230301");
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

<a name="xhrGroups20230301"></a>
# **xhrGroups20230301**
> List&lt;GroupResponse&gt; xhrGroups20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<GroupResponse> result = apiInstance.xhrGroups20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrGroups20230301");
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

<a name="xhrIdentity20230301"></a>
# **xhrIdentity20230301**
> IdentityResponse xhrIdentity20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      IdentityResponse result = apiInstance.xhrIdentity20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrIdentity20230301");
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

<a name="xhrPayruns20230301"></a>
# **xhrPayruns20230301**
> List&lt;PayrunResponse&gt; xhrPayruns20230301(startDate, endDate)

Payruns

List all the pay runs that occurred during the respective period.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    LocalDate startDate = new LocalDate(); // LocalDate | The start date of the search period
    LocalDate endDate = new LocalDate(); // LocalDate | The end date of the search period
    try {
      List<PayrunResponse> result = apiInstance.xhrPayruns20230301(startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrPayruns20230301");
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
 **startDate** | **LocalDate**| The start date of the search period |
 **endDate** | **LocalDate**| The end date of the search period |

### Return type

[**List&lt;PayrunResponse&gt;**](PayrunResponse.md)

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

<a name="xhrPayslips20230301"></a>
# **xhrPayslips20230301**
> List&lt;PayslipResponse&gt; xhrPayslips20230301(payrunId)

Payslips

Retrieves payslips from a specific payrun.  Supported integrations:   - sageone   - simplepay.ie   - brightpay connect 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    String payrunId = "payrunId_example"; // String | The id of the payrun.
    try {
      List<PayslipResponse> result = apiInstance.xhrPayslips20230301(payrunId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrPayslips20230301");
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
 **payrunId** | **String**| The id of the payrun. |

### Return type

[**List&lt;PayslipResponse&gt;**](PayslipResponse.md)

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

<a name="xhrTimeOffBalances20230301"></a>
# **xhrTimeOffBalances20230301**
> List&lt;TimeOffBalanceResponse&gt; xhrTimeOffBalances20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<TimeOffBalanceResponse> result = apiInstance.xhrTimeOffBalances20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrTimeOffBalances20230301");
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

<a name="xhrTimeOffEntries20230301"></a>
# **xhrTimeOffEntries20230301**
> List&lt;TimeOffEntryResponse&gt; xhrTimeOffEntries20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<TimeOffEntryResponse> result = apiInstance.xhrTimeOffEntries20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrTimeOffEntries20230301");
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

<a name="xhrTimesheets20230301"></a>
# **xhrTimesheets20230301**
> List&lt;TimesheetResponse&gt; xhrTimesheets20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<TimesheetResponse> result = apiInstance.xhrTimesheets20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrTimesheets20230301");
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

<a name="xhrWorkLocations20230301"></a>
# **xhrWorkLocations20230301**
> List&lt;LocationResponse&gt; xhrWorkLocations20230301()

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
import org.openapitools.client.api.XhrApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.affixapi.com");
    
    // Configure API key authorization: access-token
    ApiKeyAuth access-token = (ApiKeyAuth) defaultClient.getAuthentication("access-token");
    access-token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //access-token.setApiKeyPrefix("Token");

    XhrApi apiInstance = new XhrApi(defaultClient);
    try {
      List<LocationResponse> result = apiInstance.xhrWorkLocations20230301();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling XhrApi#xhrWorkLocations20230301");
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
