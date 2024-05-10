

# CompensationHistoryNoNonNullRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payRate** | **BigDecimal** |  | 
**payPeriod** | **String** |  | 
**payFrequency** | [**PayFrequencyEnum**](#PayFrequencyEnum) |  | 
**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) |  | 
**currency** | **CurrencyNotNullRequest** |  | 
**effectiveDate** | **LocalDate** |  | 
**notes** | **String** |  | 



## Enum: PayFrequencyEnum

Name | Value
---- | -----
YEAR | &quot;year&quot;
WEEKLY | &quot;weekly&quot;
BIWEEKLY | &quot;biweekly&quot;
SEMIMONTHLY | &quot;semimonthly&quot;
MONTHLY | &quot;monthly&quot;
OTHER | &quot;other&quot;



## Enum: EmploymentTypeEnum

Name | Value
---- | -----
FULL_TIME | &quot;full_time&quot;
PART_TIME | &quot;part_time&quot;
CONTRACTOR | &quot;contractor&quot;
OTHER | &quot;other&quot;



