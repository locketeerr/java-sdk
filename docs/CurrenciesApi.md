# CurrenciesApi

All URIs are relative to *https://api.sandbox.bvnk.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listCurrenciesCrypto**](CurrenciesApi.md#listCurrenciesCrypto) | **GET** /api/currency/crypto | List Crypto Currencies |
| [**listCurrenciesDeposit**](CurrenciesApi.md#listCurrenciesDeposit) | **GET** /api/currency/deposit | List Wallet Currencies |
| [**listCurrenciesFiat**](CurrenciesApi.md#listCurrenciesFiat) | **GET** /api/currency/fiat | List Fiat Currencies |


<a id="listCurrenciesCrypto"></a>
# **listCurrenciesCrypto**
> List&lt;Merchant&gt; listCurrenciesCrypto(offset, max, allowDeposits)

List Crypto Currencies

Retrieves a list of all cryptocurrencies available on the BVNK platform. This list represents cryptocurrencies that end users can select whilst making a payment.  For sandbox, only Ethereum (ETH) is fully functional.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Offset
    BigDecimal max = new BigDecimal("200"); // BigDecimal | Maximum number of items in response
    Boolean allowDeposits = false; // Boolean | list currencies that only allow deposits
    try {
      List<Merchant> result = apiInstance.listCurrenciesCrypto(offset, max, allowDeposits);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#listCurrenciesCrypto");
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
| **offset** | **BigDecimal**| Offset | [optional] [default to 0] |
| **max** | **BigDecimal**| Maximum number of items in response | [optional] [default to 200] |
| **allowDeposits** | **Boolean**| list currencies that only allow deposits | [optional] [default to false] |

### Return type

[**List&lt;Merchant&gt;**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="listCurrenciesDeposit"></a>
# **listCurrenciesDeposit**
> List&lt;Merchant&gt; listCurrenciesDeposit(offset, max)

List Wallet Currencies

These are the currencies that can be used to create a new wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Offset
    BigDecimal max = new BigDecimal("200"); // BigDecimal | Maximum number of items in response
    try {
      List<Merchant> result = apiInstance.listCurrenciesDeposit(offset, max);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#listCurrenciesDeposit");
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
| **offset** | **BigDecimal**| Offset | [optional] [default to 0] |
| **max** | **BigDecimal**| Maximum number of items in response | [optional] [default to 200] |

### Return type

[**List&lt;Merchant&gt;**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

<a id="listCurrenciesFiat"></a>
# **listCurrenciesFiat**
> List&lt;Merchant&gt; listCurrenciesFiat(offset, max, usable)

List Fiat Currencies

Retrieves a list of all display fiat currencies available on BVNK&#39;s Crypto Payments API. This list refers to currencies merchants can display on a payment page to an end user. It does not represent the list of currencies that can be held on the platform in wallets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");

    CurrenciesApi apiInstance = new CurrenciesApi(defaultClient);
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Offset
    BigDecimal max = new BigDecimal("200"); // BigDecimal | Maximum number of items in response
    Boolean usable = false; // Boolean | list currencies that are usable
    try {
      List<Merchant> result = apiInstance.listCurrenciesFiat(offset, max, usable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrenciesApi#listCurrenciesFiat");
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
| **offset** | **BigDecimal**| Offset | [optional] [default to 0] |
| **max** | **BigDecimal**| Maximum number of items in response | [optional] [default to 200] |
| **usable** | **Boolean**| list currencies that are usable | [optional] [default to false] |

### Return type

[**List&lt;Merchant&gt;**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

