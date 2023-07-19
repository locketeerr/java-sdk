/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.math.BigDecimal;
import io.swagger.client.model.ClientValidationErrorDto;
import io.swagger.client.model.PayOutDetailDto;
import io.swagger.client.model.PayRequestDto;
import io.swagger.client.model.PaymentStatusDto;
import io.swagger.client.model.ServerErrorDto;
import io.swagger.client.model.SummaryPaymentDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentsApi {
    private ApiClient apiClient;

    public PaymentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apiV1PaySummaryGet
     * @param merchantId Merchant identifier (required)
     * @param customerReference Customer reference (optional)
     * @param paymentExternalId Merchant payment uuid (optional)
     * @param fromDate Start date (optional)
     * @param toDate End date (optional)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param status  (optional)
     * @param order Ordering direction (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1PaySummaryGetCall(String merchantId, String customerReference, String paymentExternalId, String fromDate, String toDate, BigDecimal offset, BigDecimal max, PaymentStatusDto status, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/pay/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (merchantId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("merchantId", merchantId));
        if (customerReference != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("customerReference", customerReference));
        if (paymentExternalId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("paymentExternalId", paymentExternalId));
        if (fromDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromDate", fromDate));
        if (toDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toDate", toDate));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (max != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("max", max));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("order", order));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1PaySummaryGetValidateBeforeCall(String merchantId, String customerReference, String paymentExternalId, String fromDate, String toDate, BigDecimal offset, BigDecimal max, PaymentStatusDto status, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId' when calling apiV1PaySummaryGet(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1PaySummaryGetCall(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Payments
     * Retrieves a list of payments on a specific Merchant ID
     * @param merchantId Merchant identifier (required)
     * @param customerReference Customer reference (optional)
     * @param paymentExternalId Merchant payment uuid (optional)
     * @param fromDate Start date (optional)
     * @param toDate End date (optional)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param status  (optional)
     * @param order Ordering direction (optional)
     * @return List&lt;SummaryPaymentDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SummaryPaymentDto> apiV1PaySummaryGet(String merchantId, String customerReference, String paymentExternalId, String fromDate, String toDate, BigDecimal offset, BigDecimal max, PaymentStatusDto status, String order) throws ApiException {
        ApiResponse<List<SummaryPaymentDto>> resp = apiV1PaySummaryGetWithHttpInfo(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order);
        return resp.getData();
    }

    /**
     * List Payments
     * Retrieves a list of payments on a specific Merchant ID
     * @param merchantId Merchant identifier (required)
     * @param customerReference Customer reference (optional)
     * @param paymentExternalId Merchant payment uuid (optional)
     * @param fromDate Start date (optional)
     * @param toDate End date (optional)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param status  (optional)
     * @param order Ordering direction (optional)
     * @return ApiResponse&lt;List&lt;SummaryPaymentDto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SummaryPaymentDto>> apiV1PaySummaryGetWithHttpInfo(String merchantId, String customerReference, String paymentExternalId, String fromDate, String toDate, BigDecimal offset, BigDecimal max, PaymentStatusDto status, String order) throws ApiException {
        com.squareup.okhttp.Call call = apiV1PaySummaryGetValidateBeforeCall(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order, null, null);
        Type localVarReturnType = new TypeToken<List<SummaryPaymentDto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Payments (asynchronously)
     * Retrieves a list of payments on a specific Merchant ID
     * @param merchantId Merchant identifier (required)
     * @param customerReference Customer reference (optional)
     * @param paymentExternalId Merchant payment uuid (optional)
     * @param fromDate Start date (optional)
     * @param toDate End date (optional)
     * @param offset Offset (optional)
     * @param max Maximum number of items in response (optional)
     * @param status  (optional)
     * @param order Ordering direction (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1PaySummaryGetAsync(String merchantId, String customerReference, String paymentExternalId, String fromDate, String toDate, BigDecimal offset, BigDecimal max, PaymentStatusDto status, String order, final ApiCallback<List<SummaryPaymentDto>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1PaySummaryGetValidateBeforeCall(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SummaryPaymentDto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV1PaySummaryPost
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1PaySummaryPostCall(PayRequestDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/pay/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1PaySummaryPostValidateBeforeCall(PayRequestDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apiV1PaySummaryPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1PaySummaryPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create payment
     * Creates a payment, either type IN or type OUT.
     * @param body  (required)
     * @return SummaryPaymentDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SummaryPaymentDto apiV1PaySummaryPost(PayRequestDto body) throws ApiException {
        ApiResponse<SummaryPaymentDto> resp = apiV1PaySummaryPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create payment
     * Creates a payment, either type IN or type OUT.
     * @param body  (required)
     * @return ApiResponse&lt;SummaryPaymentDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SummaryPaymentDto> apiV1PaySummaryPostWithHttpInfo(PayRequestDto body) throws ApiException {
        com.squareup.okhttp.Call call = apiV1PaySummaryPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SummaryPaymentDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create payment (asynchronously)
     * Creates a payment, either type IN or type OUT.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1PaySummaryPostAsync(PayRequestDto body, final ApiCallback<SummaryPaymentDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1PaySummaryPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SummaryPaymentDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV1PayUuidSummaryGet
     * @param uuid merchant payment uuid (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1PayUuidSummaryGetCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/pay/{uuid}/summary"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Hawk" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1PayUuidSummaryGetValidateBeforeCall(String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling apiV1PayUuidSummaryGet(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1PayUuidSummaryGetCall(uuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Payment
     * Retrieves details of a specific payment using the UUID of the payment.
     * @param uuid merchant payment uuid (required)
     * @return SummaryPaymentDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SummaryPaymentDto apiV1PayUuidSummaryGet(String uuid) throws ApiException {
        ApiResponse<SummaryPaymentDto> resp = apiV1PayUuidSummaryGetWithHttpInfo(uuid);
        return resp.getData();
    }

    /**
     * Get Payment
     * Retrieves details of a specific payment using the UUID of the payment.
     * @param uuid merchant payment uuid (required)
     * @return ApiResponse&lt;SummaryPaymentDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SummaryPaymentDto> apiV1PayUuidSummaryGetWithHttpInfo(String uuid) throws ApiException {
        com.squareup.okhttp.Call call = apiV1PayUuidSummaryGetValidateBeforeCall(uuid, null, null);
        Type localVarReturnType = new TypeToken<SummaryPaymentDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Payment (asynchronously)
     * Retrieves details of a specific payment using the UUID of the payment.
     * @param uuid merchant payment uuid (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1PayUuidSummaryGetAsync(String uuid, final ApiCallback<SummaryPaymentDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1PayUuidSummaryGetValidateBeforeCall(uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SummaryPaymentDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV1PayValidatePut
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1PayValidatePutCall(PayOutDetailDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/pay/validate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1PayValidatePutValidateBeforeCall(PayOutDetailDto body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apiV1PayValidatePut(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1PayValidatePutCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Validate Address
     * Validates that a crypto address is correct.  Use this endpoint to validate that an address exists, is correctly formatted, and includes all the required data. This endpoint can help prevent your end users losing funds when submitting a payout.
     * @param body  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiV1PayValidatePut(PayOutDetailDto body) throws ApiException {
        apiV1PayValidatePutWithHttpInfo(body);
    }

    /**
     * Validate Address
     * Validates that a crypto address is correct.  Use this endpoint to validate that an address exists, is correctly formatted, and includes all the required data. This endpoint can help prevent your end users losing funds when submitting a payout.
     * @param body  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiV1PayValidatePutWithHttpInfo(PayOutDetailDto body) throws ApiException {
        com.squareup.okhttp.Call call = apiV1PayValidatePutValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Validate Address (asynchronously)
     * Validates that a crypto address is correct.  Use this endpoint to validate that an address exists, is correctly formatted, and includes all the required data. This endpoint can help prevent your end users losing funds when submitting a payout.
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1PayValidatePutAsync(PayOutDetailDto body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1PayValidatePutValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}