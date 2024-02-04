

# PayslipResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The Affix-assigned id of the payslip | 
**remoteId** | **String** | the remote system-assigned id of the payrun | 
**employeeId** | **String** |  | 
**payrunId** | **String** |  | 
**currency** | [**CurrencyEnum**](#CurrencyEnum) |  | 
**grossPay** | **BigDecimal** | if USD/EUR/GBP, in cent | 
**netPay** | **BigDecimal** | if USD/EUR/GBP, in cent | 
**startDate** | **LocalDate** |  | 
**endDate** | **LocalDate** |  | 
**paymentDate** | **LocalDate** |  | 
**earnings** | [**List&lt;PayslipResponseEarnings&gt;**](PayslipResponseEarnings.md) |  | 
**contributions** | [**List&lt;PayslipResponseContributions&gt;**](PayslipResponseContributions.md) | Items paid by the employer that are not included in gross pay, such as employer-paid portion of private health insurance  | 
**deductions** | [**List&lt;PayslipResponseDeductions&gt;**](PayslipResponseDeductions.md) |  | 
**taxes** | [**List&lt;PayslipResponseTaxes&gt;**](PayslipResponseTaxes.md) |  | 



## Enum: CurrencyEnum

Name | Value
---- | -----
USD | &quot;usd&quot;
EUR | &quot;eur&quot;
GBP | &quot;gbp&quot;



