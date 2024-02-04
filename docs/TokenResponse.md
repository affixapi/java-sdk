

# TokenResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessToken** | **String** | The issued access_token |  [readonly]
**mode** | **ModeResponse** |  | 
**provider** | **ProviderResponse** |  | 
**scopes** | **List&lt;ScopesResponse&gt;** | One or more scope values indicating which parts of the user&#39;s account you wish to access.  Note, slight deviation from the OAuth 2.1 spec in that the param is scopes (plural) is used vs scope (singular)  |  [readonly]
**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | The token type to pass in the &#x60;Authorization&#x60; header |  [readonly]



## Enum: TokenTypeEnum

Name | Value
---- | -----
BEARER | &quot;Bearer&quot;



