

# PayrunResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Affix-assigned id of the individual | 
**remoteId** | **String** | the remote system-assigned id of the payrun | 
**state** | [**StateEnum**](#StateEnum) |  | 
**type** | **PayrunTypeResponse** |  | 
**startDate** | **LocalDate** | Payrun period start date | 
**endDate** | **LocalDate** | Payrun period end date | 
**paymentDate** | **LocalDate** | Payment date / check date | 



## Enum: StateEnum

Name | Value
---- | -----
PAID | &quot;paid&quot;
PENDING | &quot;pending&quot;
NULL | &quot;null&quot;



