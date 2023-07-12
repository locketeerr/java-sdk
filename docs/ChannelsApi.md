# ChannelsApi

All URIs are relative to *https://api.sandbox.bvnk.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV2ChannelGet**](ChannelsApi.md#apiV2ChannelGet) | **GET** /api/v2/channel | List Channels |
| [**apiV2ChannelPaymentGet**](ChannelsApi.md#apiV2ChannelPaymentGet) | **GET** /api/v2/channel/payment | List Channel Payments |
| [**apiV2ChannelPaymentUuidGet**](ChannelsApi.md#apiV2ChannelPaymentUuidGet) | **GET** /api/v2/channel/payment/{uuid} | Get Channel Payment |
| [**apiV2ChannelPost**](ChannelsApi.md#apiV2ChannelPost) | **POST** /api/v2/channel | Create Channel |
| [**apiV2ChannelUuidGet**](ChannelsApi.md#apiV2ChannelUuidGet) | **GET** /api/v2/channel/{uuid} | Get Channel |


<a id="apiV2ChannelGet"></a>
# **apiV2ChannelGet**
> List&lt;MerchantChannel&gt; apiV2ChannelGet(merchantId, offset, max, sort, order)

List Channels

Retrieves all channels related to a Merchant ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String merchantId = "c02153ae-8ac8-4222-80e8-b2b2af85bd78"; // String | The merchant ID that the channels belong to
    String offset = "0"; // String | Offset
    String max = "10"; // String | Maximum number of items in response
    PaymentStatusDto sort = PaymentStatusDto.fromValue("PENDING"); // PaymentStatusDto | The attribute used to sort the data
    String order = "asc"; // String | Ordering direction
    try {
      List<MerchantChannel> result = apiInstance.apiV2ChannelGet(merchantId, offset, max, sort, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#apiV2ChannelGet");
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
| **merchantId** | **String**| The merchant ID that the channels belong to | [default to c02153ae-8ac8-4222-80e8-b2b2af85bd78] |
| **offset** | **String**| Offset | [optional] |
| **max** | **String**| Maximum number of items in response | [optional] |
| **sort** | [**PaymentStatusDto**](.md)| The attribute used to sort the data | [optional] [enum: PENDING, PROCESSING, CANCELLED, COMPLETE, UNDERPAID, OVERPAID, EXPIRED] |
| **order** | **String**| Ordering direction | [optional] [enum: asc, desc] |

### Return type

[**List&lt;MerchantChannel&gt;**](MerchantChannel.md)

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
| **500** | Unexpected Error |  -  |

<a id="apiV2ChannelPaymentGet"></a>
# **apiV2ChannelPaymentGet**
> List&lt;MerchantChannelPayment&gt; apiV2ChannelPaymentGet(merchantId, status, fromDate, toDate, offset, max, order, q)

List Channel Payments

Retrieves a list of payments to a channel on a specific Merchant ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String merchantId = "c02153ae-8ac8-4222-80e8-b2b2af85bd78"; // String | The Merchant ID
    String status = "DETECTED"; // String | 
    String fromDate = "2023-03-05"; // String | From which date to start searching.
    String toDate = "2023-05-03"; // String | At which date to stop searching.
    String offset = "0"; // String | Where to start fetching records.
    String max = "10"; // String | Maximum number of items in response
    String order = "asc"; // String | Ordering direction
    String q = "q_example"; // String | Can be UUID of the payment, reference, channel UUID, transaction hash, or wallet code.
    try {
      List<MerchantChannelPayment> result = apiInstance.apiV2ChannelPaymentGet(merchantId, status, fromDate, toDate, offset, max, order, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#apiV2ChannelPaymentGet");
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
| **merchantId** | **String**| The Merchant ID | [default to c02153ae-8ac8-4222-80e8-b2b2af85bd78] |
| **status** | **String**|  | [optional] [enum: DETECTED, COMPLETE, UNKNOWN] |
| **fromDate** | **String**| From which date to start searching. | [optional] |
| **toDate** | **String**| At which date to stop searching. | [optional] |
| **offset** | **String**| Where to start fetching records. | [optional] |
| **max** | **String**| Maximum number of items in response | [optional] |
| **order** | **String**| Ordering direction | [optional] [enum: asc, desc] |
| **q** | **String**| Can be UUID of the payment, reference, channel UUID, transaction hash, or wallet code. | [optional] |

### Return type

[**List&lt;MerchantChannelPayment&gt;**](MerchantChannelPayment.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="apiV2ChannelPaymentUuidGet"></a>
# **apiV2ChannelPaymentUuidGet**
> MerchantChannelPayment apiV2ChannelPaymentUuidGet(uuid)

Get Channel Payment

Retrieves a specific payment made into a channel.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String uuid = "c0dc9c14-0312-4a6b-a1a3-a6dcebdcc8a4"; // String | The UUID of the payment you are querying.
    try {
      MerchantChannelPayment result = apiInstance.apiV2ChannelPaymentUuidGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#apiV2ChannelPaymentUuidGet");
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
| **uuid** | **String**| The UUID of the payment you are querying. | [default to c0dc9c14-0312-4a6b-a1a3-a6dcebdcc8a4] |

### Return type

[**MerchantChannelPayment**](MerchantChannelPayment.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a id="apiV2ChannelPost"></a>
# **apiV2ChannelPost**
> MerchantChannel apiV2ChannelPost(merchantChannelRequest)

Create Channel

Creates a channel that your end users can openly send payments to.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    MerchantChannelRequest merchantChannelRequest = new MerchantChannelRequest(); // MerchantChannelRequest | 
    try {
      MerchantChannel result = apiInstance.apiV2ChannelPost(merchantChannelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#apiV2ChannelPost");
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
| **merchantChannelRequest** | [**MerchantChannelRequest**](MerchantChannelRequest.md)|  | [optional] |

### Return type

[**MerchantChannel**](MerchantChannel.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **500** | Unexpected Error |  -  |

<a id="apiV2ChannelUuidGet"></a>
# **apiV2ChannelUuidGet**
> MerchantChannel apiV2ChannelUuidGet(uuid)

Get Channel

Retrieves a specific channel by UUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    ChannelsApi apiInstance = new ChannelsApi(defaultClient);
    String uuid = "9d1f67f2-a647-404b-9b02-247c77be81d0"; // String | The UUID of the channel you are querying
    try {
      MerchantChannel result = apiInstance.apiV2ChannelUuidGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelsApi#apiV2ChannelUuidGet");
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
| **uuid** | **String**| The UUID of the channel you are querying | [default to 9d1f67f2-a647-404b-9b02-247c77be81d0] |

### Return type

[**MerchantChannel**](MerchantChannel.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

