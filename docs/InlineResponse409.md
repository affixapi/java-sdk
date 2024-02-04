

# InlineResponse409


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The authorization code insert that caused a conflict  |  [optional]
**token** | **String** | The access token insert that caused a conflict  |  [optional]
**error** | [**ErrorEnum**](#ErrorEnum) | The description of the type of error, ie conflict of two requests of the the same authorization code  | 



## Enum: ErrorEnum

Name | Value
---- | -----
CONFLICT | &quot;conflict&quot;



