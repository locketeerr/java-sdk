

# GatewayTransactionDto

Specify details about transaction (onchain or offchain) linked to the payment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateCreated** | **Long** |  |  [optional] |
|**dateConfirmed** | **Long** |  |  [optional] |
|**hash** | **String** | Transaction hash |  [optional] |
|**amount** | **BigDecimal** | payment amount |  [optional] |
|**risk** | **Object** |  |  [optional] |
|**networkFeeCurrency** | **String** | currency acronym |  [optional] |
|**networkFeeAmount** | **BigDecimal** | payment amount |  [optional] |
|**sources** | **List&lt;String&gt;** | list of source addresses (only applicable if payment in) |  [optional] |
|**displayRate** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |
|**exchangeRate** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |



