# MerchantIdsApi

All URIs are relative to *https://api.sandbox.bvnk.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**merchantIdCreate**](MerchantIdsApi.md#merchantIdCreate) | **POST** /api/v1/merchant | Create Merchant ID |
| [**merchantIdList**](MerchantIdsApi.md#merchantIdList) | **GET** /api/v1/merchant | List Merchant IDs |


<a id="merchantIdCreate"></a>
# **merchantIdCreate**
> SummaryPaymentDto merchantIdCreate(merchantIdCreateRequest)

Create Merchant ID

Generate a Merchant ID for your account to process pay-ins and pay-outs through our API.  A Merchant ID is essential as it designates the account wallet where incoming pay-ins will be settled. For instance, if a Merchant ID is associated with a EUR wallet ID, any incoming USDT payment will be automatically converted to EUR and deposited in the designated EUR wallet.  Vice versa, any outgoing USDT payment will be automatically converted and withdrawn from the designated EUR wallet.  For further information, please visit https://docs.bvnk.com/docs/creating-your-first-merchant to learn more about creating your first Merchant ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    MerchantIdsApi apiInstance = new MerchantIdsApi(defaultClient);
    MerchantIdCreateRequest merchantIdCreateRequest = new MerchantIdCreateRequest(); // MerchantIdCreateRequest | 
    try {
      SummaryPaymentDto result = apiInstance.merchantIdCreate(merchantIdCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdsApi#merchantIdCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantIdCreateRequest** | [**MerchantIdCreateRequest**](MerchantIdCreateRequest.md)|  | [optional] |

### Return type

[**SummaryPaymentDto**](SummaryPaymentDto.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="merchantIdList"></a>
# **merchantIdList**
> List&lt;Merchant&gt; merchantIdList()

List Merchant IDs

Retrieves merchant IDs setup on your account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    MerchantIdsApi apiInstance = new MerchantIdsApi(defaultClient);
    try {
      List<Merchant> result = apiInstance.merchantIdList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdsApi#merchantIdList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Merchant&gt;**](Merchant.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

