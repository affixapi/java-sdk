

# CreateEmployeeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**employeeNumber** | **String** |  |  [optional]
**firstName** | **String** | the first name of the individual | 
**lastName** | **String** | the last name of the individual | 
**displayFullName** | **String** |  |  [optional]
**nationality** | **String** |  |  [optional]
**jobTitle** | **String** |  |  [optional]
**workEmail** | **String** | the work email of the individual |  [optional]
**personalEmail** | **String** | the personal email of the individual |  [optional]
**mobilePhoneNumber** | **String** | +1234567890 |  [optional]
**taxId** | **String** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**ethnicity** | [**EthnicityEnum**](#EthnicityEnum) |  |  [optional]
**maritalStatus** | [**MaritalStatusEnum**](#MaritalStatusEnum) | &#x60;other&#x60; option can include co-habitating, civil partnership, separated, widowed, etc  |  [optional]
**dateOfBirth** | **LocalDate** |  |  [optional]
**employmentStatus** | **EmploymentStatusNotNullRequest** |  |  [optional]
**employmentType** | [**EmploymentTypeEnum**](#EmploymentTypeEnum) |  |  [optional]
**startDate** | **LocalDate** |  |  [optional]
**terminationDate** | **LocalDate** |  |  [optional]
**avatar** | **String** |  |  [optional]
**homeLocation** | [**AddressNoNonNullRequest**](AddressNoNonNullRequest.md) |  |  [optional]
**workLocation** | [**LocationNoNonNullRequest**](LocationNoNonNullRequest.md) |  |  [optional]
**manager** | [**CreateEmployeeRequestManager**](CreateEmployeeRequestManager.md) |  |  [optional]
**bankAccount** | [**CreateEmployeeRequestBankAccount**](CreateEmployeeRequestBankAccount.md) |  |  [optional]
**employmentHistory** | [**List&lt;EmploymentHistoryNoNonNullRequest&gt;**](EmploymentHistoryNoNonNullRequest.md) |  |  [optional]
**compensationHistory** | [**List&lt;CompensationHistoryNoNonNullRequest&gt;**](CompensationHistoryNoNonNullRequest.md) |  |  [optional]
**customFields** | **Object** |  |  [optional]
**groups** | [**List&lt;GroupNoNullEnumRequest&gt;**](GroupNoNullEnumRequest.md) |  |  [optional]
**dependents** | [**List&lt;CreateEmployeeRequestDependents&gt;**](CreateEmployeeRequestDependents.md) |  |  [optional]
**emergencyContacts** | [**List&lt;CreateEmployeeRequestEmergencyContacts&gt;**](CreateEmployeeRequestEmergencyContacts.md) |  |  [optional]



## Enum: GenderEnum

Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
NOT_SPECIFIED | &quot;not_specified&quot;



## Enum: EthnicityEnum

Name | Value
---- | -----
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
DIVORCED | &quot;divorced&quot;
NOT_SPECIFIED | &quot;not_specified&quot;
OTHER | &quot;other&quot;



## Enum: EmploymentTypeEnum

Name | Value
---- | -----
FULL_TIME | &quot;full_time&quot;
PART_TIME | &quot;part_time&quot;
CONTRACTOR | &quot;contractor&quot;
OTHER | &quot;other&quot;



