

# ClientResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientId** | **String** | The client ID you received when you first created the application |  [readonly]
**clientSecret** | **List&lt;String&gt;** | The client secret(s). It is an array datatype to allow for rotation of secrets without downtime for your customers  | 
**redirectUris** | **List&lt;String&gt;** | Indicates the URI to return the user to after authorization is complete, which is the endpoint on your server to receive the authorization_code.  Must be identical to the redirect URI provided in the original link.  Please email me after signup and I will set both your client secret and redirect_uri (required) when you reach out.  | 
**name** | **String** | Name of your app that shows up in the Affix Connect application  | 
**webhookUri** | **String** | If enabled, webhooks will be sent to this endpoint  |  [optional]



