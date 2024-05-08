

# TimeOffEntryResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Affix-assigned id of the time off entry | 
**remoteId** | **String** | the remote system-assigned id of the time off entry | 
**employeeId** | **String** | the Affix-assigned id of the individual | 
**employeeRemoteId** | **String** | the remote system-assigned id of the individual | 
**startDate** | **LocalDate** |  | 
**endDate** | **LocalDate** |  | 
**amount** | **BigDecimal** |  | 
**unit** | [**UnitEnum**](#UnitEnum) |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**employeeNote** | **String** |  | 
**policyId** | **String** | The Affix-assigned id of the policy | 
**policyRemoteId** | **String** | The remote system-assigned id of the policy | 
**policyName** | **String** | The name of the policy, as assigned by the remote system | 
**policyType** | **PolicyTypeResponse** |  | 
**remoteCreatedAt** | **LocalDate** |  | 
**remoteModifiedAt** | **LocalDate** |  | 



## Enum: UnitEnum

Name | Value
---- | -----
NULL | &quot;null&quot;
HOURS | &quot;hours&quot;
DAYS | &quot;days&quot;
MONTHS | &quot;months&quot;



## Enum: StatusEnum

Name | Value
---- | -----
NULL | &quot;null&quot;
APPROVED | &quot;approved&quot;
PENDING | &quot;pending&quot;
REJECTED | &quot;rejected&quot;



