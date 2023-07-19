# PaymentsApi

All URIs are relative to *https://api.sandbox.bvnk.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1PaySummaryGet**](PaymentsApi.md#apiV1PaySummaryGet) | **GET** /api/v1/pay/summary | List Payments |
| [**apiV1PaySummaryPost**](PaymentsApi.md#apiV1PaySummaryPost) | **POST** /api/v1/pay/summary | Create payment |
| [**apiV1PayUuidSummaryGet**](PaymentsApi.md#apiV1PayUuidSummaryGet) | **GET** /api/v1/pay/{uuid}/summary | Get Payment |
| [**apiV1PayValidatePut**](PaymentsApi.md#apiV1PayValidatePut) | **PUT** /api/v1/pay/validate | Validate Address |


<a id="apiV1PaySummaryGet"></a>
# **apiV1PaySummaryGet**
> List&lt;SummaryPaymentDto&gt; apiV1PaySummaryGet(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order)

List Payments

Retrieves a list of payments on a specific Merchant ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String merchantId = "5C8D8D78-366A-4AFB-B658-A64CE543C5DB"; // String | Merchant identifier
    String customerReference = "REF123"; // String | Customer reference
    String paymentExternalId = "5C8D8D78-366A-4AFB-B658-A64CE543C5DB"; // String | Merchant payment uuid
    String fromDate = "2023-03-30"; // String | Start date
    String toDate = "2023-03-30"; // String | End date
    BigDecimal offset = new BigDecimal("0"); // BigDecimal | Offset
    BigDecimal max = new BigDecimal("20"); // BigDecimal | Maximum number of items in response
    PaymentStatusDto status = PaymentStatusDto.fromValue("PENDING"); // PaymentStatusDto | 
    String order = "asc"; // String | Ordering direction
    try {
      List<SummaryPaymentDto> result = apiInstance.apiV1PaySummaryGet(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#apiV1PaySummaryGet");
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
| **merchantId** | **String**| Merchant identifier | [default to 5C8D8D78-366A-4AFB-B658-A64CE543C5DB] |
| **customerReference** | **String**| Customer reference | [optional] |
| **paymentExternalId** | **String**| Merchant payment uuid | [optional] |
| **fromDate** | **String**| Start date | [optional] |
| **toDate** | **String**| End date | [optional] |
| **offset** | **BigDecimal**| Offset | [optional] |
| **max** | **BigDecimal**| Maximum number of items in response | [optional] |
| **status** | [**PaymentStatusDto**](.md)|  | [optional] [enum: PENDING, PROCESSING, CANCELLED, COMPLETE, UNDERPAID, OVERPAID, EXPIRED] |
| **order** | **String**| Ordering direction | [optional] [enum: asc, desc] |

### Return type

[**List&lt;SummaryPaymentDto&gt;**](SummaryPaymentDto.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **500** | Unexpected Error |  -  |

<a id="apiV1PaySummaryPost"></a>
# **apiV1PaySummaryPost**
> SummaryPaymentDto apiV1PaySummaryPost(payRequestDto)

Create payment

Creates a payment, either type IN or type OUT.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    PayRequestDto payRequestDto = new PayRequestDto(); // PayRequestDto | 
    try {
      SummaryPaymentDto result = apiInstance.apiV1PaySummaryPost(payRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#apiV1PaySummaryPost");
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
| **payRequestDto** | [**PayRequestDto**](PayRequestDto.md)|  | |

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
| **400** | Bad request |  -  |
| **500** | Unexpected Error |  -  |

<a id="apiV1PayUuidSummaryGet"></a>
# **apiV1PayUuidSummaryGet**
> SummaryPaymentDto apiV1PayUuidSummaryGet(uuid)

Get Payment

Retrieves details of a specific payment using the UUID of the payment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");
    
    // Configure API key authorization: Hawk
    ApiKeyAuth Hawk = (ApiKeyAuth) defaultClient.getAuthentication("Hawk");
    Hawk.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Hawk.setApiKeyPrefix("Token");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    String uuid = "5C8D8D78-366A-4AFB-B658-A64CE543C5DB"; // String | merchant payment uuid
    try {
      SummaryPaymentDto result = apiInstance.apiV1PayUuidSummaryGet(uuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#apiV1PayUuidSummaryGet");
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
| **uuid** | **String**| merchant payment uuid | [default to 5C8D8D78-366A-4AFB-B658-A64CE543C5DB] |

### Return type

[**SummaryPaymentDto**](SummaryPaymentDto.md)

### Authorization

[Hawk](../README.md#Hawk)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **500** | Unexpected Error |  -  |

<a id="apiV1PayValidatePut"></a>
# **apiV1PayValidatePut**
> apiV1PayValidatePut(payOutDetailDto)

Validate Address

Validates that a crypto address is correct.  Use this endpoint to validate that an address exists, is correctly formatted, and includes all the required data. This endpoint can help prevent your end users losing funds when submitting a payout.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.bvnk.com");

    PaymentsApi apiInstance = new PaymentsApi(defaultClient);
    PayOutDetailDto payOutDetailDto = new PayOutDetailDto(); // PayOutDetailDto | 
    try {
      apiInstance.apiV1PayValidatePut(payOutDetailDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentsApi#apiV1PayValidatePut");
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
| **payOutDetailDto** | [**PayOutDetailDto**](PayOutDetailDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **500** | Unexpected Error |  -  |

