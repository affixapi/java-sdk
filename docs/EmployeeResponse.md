

# EmployeeResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Affix-assigned id of the individual |  [readonly]
**remoteId** | **String** | the remote system-assigned id of the individual |  [readonly]
**employeeNumber** | **String** |  | 
**firstName** | **String** | the first name of the individual | 
**lastName** | **String** | the last name of the individual | 
**displayFullName** | **String** |  | 
**nationality** | **String** |  | 
**jobTitle** | **String** |  | 
**workEmail** | **String** | the work email of the individual | 
**personalEmail** | **String** | the personal email of the individual | 
**mobilePhoneNumber** | **String** | +1234567890 | 
**taxId** | **String** |  | 
**gender** | [**GenderEnum**](#GenderEnum) |  | 
**ethnicity** | [**EthnicityEnum**](#EthnicityEnum) |  | 
**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) |  | 
**dateOfBirth** | **LocalDate** |  | 
**employmentStatus** | [**EmploymentStatusEnum**](#EmploymentStatusEnum) |  | 
**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) |  | 
**startDate** | **LocalDate** |  | 
**remoteCreatedAt** | **LocalDate** |  |  [readonly]
**terminationDate** | **LocalDate** |  | 
**avatar** | **String** |  | 
**homeLocation** | [**AddressResponse**](AddressResponse.md) |  | 
**workLocation** | [**LocationResponse**](LocationResponse.md) |  | 
**manager** | [**CreateEmployeeRequestManager**](CreateEmployeeRequestManager.md) |  | 
**bankAccount** | [**CreateEmployeeRequestBankAccount**](CreateEmployeeRequestBankAccount.md) |  | 
**employments** | [**List&lt;EmploymentResponse&gt;**](EmploymentResponse.md) |  | 
**customFields** | **Object** |  | 
**groups** | [**List&lt;GroupResponse&gt;**](GroupResponse.md) |  | 



## Enum: GenderEnum

Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
NOT_SPECIFIED | &quot;not_specified&quot;
NULL | &quot;null&quot;



## Enum: EthnicityEnum

Name | Value
---- | -----
NULL | &quot;null&quot;
ASIAN | &quot;asian&quot;
BLACK | &quot;black&quot;
HISPANIC | &quot;hispanic&quot;
MIXED | &quot;mixed&quot;
NOT_SPECIFIED | &quot;not_specified&quot;
OTHER | &quot;other&quot;
WHITE | &quot;white&quot;



## Enum: MaritalStatusEnum

Name | Value
---- | -----
SINGLE | &quot;single&quot;
MARRIED | &quot;married&quot;
NOT_SPECIFIED | &quot;not_specified&quot;
NULL | &quot;null&quot;



## Enum: EmploymentStatusEnum

Name | Value
---- | -----
NULL | &quot;null&quot;
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
PENDING | &quot;pending&quot;
LEAVE | &quot;leave&quot;



## Enum: EmploymentTypeEnum

Name | Value
---- | -----
NULL | &quot;null&quot;
FULL_TIME | &quot;full_time&quot;
PART_TIME | &quot;part_time&quot;
CONTRACTOR | &quot;contractor&quot;
OTHER | &quot;other&quot;



