# TradingAndConversionsApi

All URIs are relative to *https://api.sandbox.bvnk.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**quoteAccept**](TradingAndConversionsApi.md#quoteAccept) | **PUT** /api/v1/quote/accept/{uuid} | Accept Quote |
| [**quoteCreate**](TradingAndConversionsApi.md#quoteCreate) | **POST** /api/v1/quote | Create Quote |
| [**quoteList**](TradingAndConversionsApi.md#quoteList) | **GET** /api/v1/quote/{merchantId} | List Quotes |
| [**quoteRead**](TradingAndConversionsApi.md#quoteRead) | **GET** /api/v1/quote/{uuid} | Read Quote |


<a id="quoteAccept"></a>
# **quoteAccept**
> AcceptedQuote quoteAccept(uuid)

Accept Quote

Executes a quote.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAndConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    TradingAndConversionsApi apiInstance = new TradingAndConversionsApi(defaultClient);
    String uuid = "5dc4e061-31c6-4b96-8c4d-0ea984aece0b"; // String | The quote UUID you are accepting.
    try {
      AcceptedQuote result = apiInstance.quoteAccept(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAndConversionsApi#quoteAccept");
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
| **uuid** | **String**| The quote UUID you are accepting. | [default to 5dc4e061-31c6-4b96-8c4d-0ea984aece0b] |

### Return type

[**AcceptedQuote**](AcceptedQuote.md)

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

<a id="quoteCreate"></a>
# **quoteCreate**
> Quote quoteCreate(estimate, quoteRequest)

Create Quote

Creates a quote to convert between wallets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAndConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    TradingAndConversionsApi apiInstance = new TradingAndConversionsApi(defaultClient);
    Boolean estimate = false; // Boolean | Create estimate quote
    QuoteRequest quoteRequest = new QuoteRequest(); // QuoteRequest | 
    try {
      Quote result = apiInstance.quoteCreate(estimate, quoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAndConversionsApi#quoteCreate");
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
| **estimate** | **Boolean**| Create estimate quote | [optional] [default to false] |
| **quoteRequest** | [**QuoteRequest**](QuoteRequest.md)|  | [optional] |

### Return type

[**Quote**](Quote.md)

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

<a id="quoteList"></a>
# **quoteList**
> List&lt;Quote&gt; quoteList(merchantId)

List Quotes

Retrieves all quotes on a specific Merchant ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAndConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    TradingAndConversionsApi apiInstance = new TradingAndConversionsApi(defaultClient);
    String merchantId = "0a12a214-1619-43fa-9be1-0029f6a440a0"; // String | Merchant ID you are retrieving quotes from.
    try {
      List<Quote> result = apiInstance.quoteList(merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAndConversionsApi#quoteList");
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
| **merchantId** | **String**| Merchant ID you are retrieving quotes from. | [default to 0a12a214-1619-43fa-9be1-0029f6a440a0] |

### Return type

[**List&lt;Quote&gt;**](Quote.md)

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
| **404** | Not Found |  -  |

<a id="quoteRead"></a>
# **quoteRead**
> Quote quoteRead(uuid)

Read Quote

Retrieves a specific quote.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TradingAndConversionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    TradingAndConversionsApi apiInstance = new TradingAndConversionsApi(defaultClient);
    String uuid = "0a12a214-1619-43fa-9be1-0029f6a440a0"; // String | UUID of the quote you are retrieving.
    try {
      Quote result = apiInstance.quoteRead(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradingAndConversionsApi#quoteRead");
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
| **uuid** | **String**| UUID of the quote you are retrieving. | [default to 0a12a214-1619-43fa-9be1-0029f6a440a0] |

### Return type

[**Quote**](Quote.md)

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
| **404** | Not Found |  -  |

