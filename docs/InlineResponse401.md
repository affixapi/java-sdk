

# InlineResponse401


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**ErrorEnum**](#ErrorEnum) | The type of error | 
**message** | **String** | A descriptive description of the error  | 
**code** | [**CodeEnum**](#CodeEnum) |  | 



## Enum: ErrorEnum

Name | Value
---- | -----
AUTHENTICATION_ERROR | &quot;authentication_error&quot;



## Enum: CodeEnum

Name | Value
---- | -----
INCORRECT_USERNAME_OR_PASSWORD | &quot;incorrect_username_or_password&quot;
INCORRECT_MFA_OR_OTP | &quot;incorrect_mfa_or_otp&quot;
REAUTHENTICATION_REQUIRED_COOKIES_ARE_NOW_EXPIRED | &quot;reauthentication_required // cookies are now expired&quot;
ADDITIONAL_ACCOUNT_SETUP_REQUIRED_PASSWORD_RESET_ETC | &quot;additional_account_setup_required // password reset, etc&quot;
CAPTCHA_CHALLENGE_AMAZON_TYPE1_CAPTCHA_CHALLENGE_CURRENTLY_UNSOVABLE_ | &quot;captcha_challenge // amazon type1 captcha challenge (currently unsovable)&quot;
NO_VALID_ACCOUNTS_NOT_USED_CURRENTLY_BUT_RESERVED_FOR_FUTURE_USE | &quot;no_valid_accounts // not used currently but reserved for future use&quot;
INSUFFICIENT_PERMISSION_NOT_ENOUGH_PRIVILEGES_IE_NOT_AN_ADMIN_OR_NOT_ENOUGH_PROVIDER_SCOPES_ON_A_PROVIDER_API_TOKEN_FOR_THE_AFFIX_SCOPES_REQUESTED_ | &quot;insufficient_permission // not enough privileges (ie not an admin, or not enough provider scopes on a provider api token for the Affix scopes requested)&quot;



