# WalletsApi

All URIs are relative to *https://api.sandbox.bvnk.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transactionReport**](WalletsApi.md#transactionReport) | **GET** /api/transaction/report | Transactions Report |
| [**walletBalanceList**](WalletsApi.md#walletBalanceList) | **GET** /api/wallet/balances | List Wallet Balances |
| [**walletCreate**](WalletsApi.md#walletCreate) | **POST** /api/wallet | Create Wallet |
| [**walletList**](WalletsApi.md#walletList) | **GET** /api/wallet | List Wallets |
| [**walletRGet**](WalletsApi.md#walletRGet) | **GET** /api/wallet/{id} | Get Wallet |


<a id="transactionReport"></a>
# **transactionReport**
> List&lt;TransactionReport&gt; transactionReport(walletId, fromDate, toDate, format, transactionType)

Transactions Report

Report all transactions from wallet in specified format. Report will be generated and sent to main account email in the specified format

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    Long walletId = 255861L; // Long | Date at to retrieve balances
    String fromDate = "2022-09-17"; // String | Export range from date in format 'yyyy-MM-dd'
    String toDate = "2023-03-17"; // String | Export range to date in format 'yyyy-MM-dd'
    String format = "csv"; // String | 'json' - json format, 'csv' - csv format
    String transactionType = "transactionType_example"; // String | Transaction type code
    try {
      List<TransactionReport> result = apiInstance.transactionReport(walletId, fromDate, toDate, format, transactionType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#transactionReport");
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
| **walletId** | **Long**| Date at to retrieve balances | [optional] [default to 255861] |
| **fromDate** | **String**| Export range from date in format &#39;yyyy-MM-dd&#39; | [optional] [default to 2022-09-17] |
| **toDate** | **String**| Export range to date in format &#39;yyyy-MM-dd&#39; | [optional] [default to 2023-03-17] |
| **format** | **String**| &#39;json&#39; - json format, &#39;csv&#39; - csv format | [optional] [default to csv] |
| **transactionType** | **String**| Transaction type code | [optional] |

### Return type

[**List&lt;TransactionReport&gt;**](TransactionReport.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="walletBalanceList"></a>
# **walletBalanceList**
> List&lt;Balance&gt; walletBalanceList(date)

List Wallet Balances

Retrieves the balances of your wallets on platform.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    String date = "2020-03-17"; // String | Date at to retrieve balances
    try {
      List<Balance> result = apiInstance.walletBalanceList(date);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#walletBalanceList");
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
| **date** | **String**| Date at to retrieve balances | [optional] |

### Return type

[**List&lt;Balance&gt;**](Balance.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="walletCreate"></a>
# **walletCreate**
> Wallet walletCreate(walletRequest)

Create Wallet

Creates a wallet on the BVNK platform.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    WalletRequest walletRequest = new WalletRequest(); // WalletRequest | 
    try {
      Wallet result = apiInstance.walletCreate(walletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#walletCreate");
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
| **walletRequest** | [**WalletRequest**](WalletRequest.md)|  | [optional] |

### Return type

[**Wallet**](Wallet.md)

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

<a id="walletList"></a>
# **walletList**
> List&lt;Wallet&gt; walletList(offset, max)

List Wallets

Retrieves a list of wallets on your account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    Integer offset = 56; // Integer | start offset
    Integer max = 10; // Integer | max number results
    try {
      List<Wallet> result = apiInstance.walletList(offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#walletList");
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
| **offset** | **Integer**| start offset | [optional] |
| **max** | **Integer**| max number results | [optional] [default to 10] |

### Return type

[**List&lt;Wallet&gt;**](Wallet.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="walletRGet"></a>
# **walletRGet**
> Wallet walletRGet(id)

Get Wallet

Retrieves a specific wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    Long id = 255861L; // Long | start offset
    try {
      Wallet result = apiInstance.walletRGet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#walletRGet");
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
| **id** | **Long**| start offset | [default to 255861] |

### Return type

[**Wallet**](Wallet.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

