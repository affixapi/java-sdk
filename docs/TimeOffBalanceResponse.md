

# TimeOffBalanceResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**employeeId** | **String** | The Affix-assigned id of the individual | 
**remoteId** | **String** | the remote system-assigned id of the individual | 
**balance** | **BigDecimal** |  | 
**used** | **BigDecimal** |  | 
**policyName** | **String** | The name of the policy, as assigned by the remote system | 
**policyType** | [**PolicyTypeEnum**](#PolicyTypeEnum) |  | 
**remoteCreatedAt** | **LocalDate** |  | 
**remoteModifiedAt** | **LocalDate** |  | 



## Enum: PolicyTypeEnum

Name | Value
---- | -----
VACATION | &quot;vacation&quot;
SICK | &quot;sick&quot;
PERSONAL | &quot;personal&quot;
JURY_DUTY | &quot;jury_duty&quot;
VOLUNTEER | &quot;volunteer&quot;
BEREAVEMENT | &quot;bereavement&quot;



