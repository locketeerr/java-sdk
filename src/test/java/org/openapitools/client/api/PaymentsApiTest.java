/*
 * BVNK API Endpoints
 * The BVNK API is designed to facilitate seamless and secure transactions including payments, channels, anddigital wallet transactions.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.ClientValidationErrorDto;
import org.openapitools.client.model.PayOutDetailDto;
import org.openapitools.client.model.PayRequestDto;
import org.openapitools.client.model.PaymentStatusDto;
import org.openapitools.client.model.ServerErrorDto;
import org.openapitools.client.model.SummaryPaymentDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Disabled
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    /**
     * List Payments
     *
     * Retrieves a list of payments on a specific Merchant ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PaySummaryGetTest() throws ApiException {
        String merchantId = null;
        String customerReference = null;
        String paymentExternalId = null;
        String fromDate = null;
        String toDate = null;
        BigDecimal offset = null;
        BigDecimal max = null;
        PaymentStatusDto status = null;
        String order = null;
        List<SummaryPaymentDto> response = api.apiV1PaySummaryGet(merchantId, customerReference, paymentExternalId, fromDate, toDate, offset, max, status, order);
        // TODO: test validations
    }

    /**
     * Create payment
     *
     * Creates a payment, either type IN or type OUT.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PaySummaryPostTest() throws ApiException {
        PayRequestDto payRequestDto = null;
        SummaryPaymentDto response = api.apiV1PaySummaryPost(payRequestDto);
        // TODO: test validations
    }

    /**
     * Get Payment
     *
     * Retrieves details of a specific payment using the UUID of the payment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PayUuidSummaryGetTest() throws ApiException {
        String uuid = null;
        SummaryPaymentDto response = api.apiV1PayUuidSummaryGet(uuid);
        // TODO: test validations
    }

    /**
     * Validate Address
     *
     * Validates that a crypto address is correct.  Use this endpoint to validate that an address exists, is correctly formatted, and includes all the required data. This endpoint can help prevent your end users losing funds when submitting a payout.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV1PayValidatePutTest() throws ApiException {
        PayOutDetailDto payOutDetailDto = null;
        api.apiV1PayValidatePut(payOutDetailDto);
        // TODO: test validations
    }

}