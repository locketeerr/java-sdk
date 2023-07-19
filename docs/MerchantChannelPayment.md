

# MerchantChannelPayment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **String** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**merchantDisplayName** | **String** |  |  [optional] |
|**reference** | **String** |  |  [optional] |
|**dateCreated** | **Long** |  |  [optional] |
|**lastUpdated** | **Long** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**uuid** | **String** |  |  [optional] |
|**hash** | **String** |  |  [optional] |
|**address** | **String** |  |  [optional] |
|**tag** | **String** |  |  [optional] |
|**paidCurrency** | **String** |  |  [optional] |
|**displayCurrency** | **String** |  |  [optional] |
|**walletCurrency** | **String** |  |  [optional] |
|**feeCurrency** | **String** |  |  [optional] |
|**paidAmount** | **BigDecimal** |  |  [optional] |
|**displayAmount** | **BigDecimal** |  |  [optional] |
|**walletAmount** | **BigDecimal** |  |  [optional] |
|**feeAmount** | **BigDecimal** |  |  [optional] |
|**exchangeRate** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |
|**displayRate** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |
|**risk** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |
|**sources** | **List&lt;String&gt;** |  |  [optional] |
|**networkFee** | [**NetworkFee**](NetworkFee.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DETECTED | &quot;DETECTED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



