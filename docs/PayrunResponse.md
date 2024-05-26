

# PayrunResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Affix-assigned id of the individual | 
**remoteId** | **String** | the remote system-assigned id of the payrun | 
**runState** | [**RunStateEnum**](#RunStateEnum) |  | 
**runType** | [**RunTypeEnum**](#RunTypeEnum) |  | 
**startDate** | **LocalDate** | Payrun period start date | 
**endDate** | **LocalDate** | Payrun period end date | 
**paymentDate** | **LocalDate** | Payment date / check date | 



## Enum: RunStateEnum

Name | Value
---- | -----
PAID | &quot;paid&quot;
PENDING | &quot;pending&quot;
NULL | &quot;null&quot;



## Enum: RunTypeEnum

Name | Value
---- | -----
REGULAR | &quot;regular&quot;
ONE_TIME | &quot;one-time&quot;
OFF_CYCLE | &quot;off-cycle&quot;
CORRECTION | &quot;correction&quot;
REVERSAL | &quot;reversal&quot;
NULL | &quot;null&quot;



