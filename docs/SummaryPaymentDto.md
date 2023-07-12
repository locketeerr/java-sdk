

# SummaryPaymentDto

Contains all the information about a summary payment object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | unique identifier for the merchant payment |  [optional] |
|**merchantDisplayName** | **String** | display name for the merchant payment |  [optional] |
|**merchantId** | **String** | Your Merchant ID. You can find it on the Merchant Details page in your account |  [optional] |
|**dateCreated** | **Long** | Currently this is a long - can it be changed? Date and times are encoded into UNIX epoch timestamps |  [optional] |
|**expiryDate** | **Long** | Date and times are encoded into UNIX epoch timestamps |  [optional] |
|**quoteExpiryDate** | **Long** | Date and times are encoded into UNIX epoch timestamps |  [optional] |
|**acceptanceExpiryDate** | **Long** | Date and times are encoded into UNIX epoch timestamps |  [optional] |
|**quoteStatus** | **String** |  |  [optional] |
|**reference** | **String** | Your payment reference ID. Feel free to submit any ID to tie the payment to your customer |  [optional] |
|**type** | **DirectionDto** |  |  [optional] |
|**subType** | [**SubTypeEnum**](#SubTypeEnum) | Payment sub type |  [optional] |
|**status** | **PaymentStatusDto** |  |  [optional] |
|**displayCurrency** | [**PayAmountsDto**](PayAmountsDto.md) |  |  [optional] |
|**walletCurrency** | [**PayAmountsDto**](PayAmountsDto.md) |  |  [optional] |
|**paidCurrency** | [**PayAmountsDto**](PayAmountsDto.md) |  |  [optional] |
|**feeCurrency** | [**PayAmountsDto**](PayAmountsDto.md) |  |  [optional] |
|**displayRate** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |
|**exchangeRate** | [**ExchangeRateDto**](ExchangeRateDto.md) |  |  [optional] |
|**address** | [**CryptoAddressDto**](CryptoAddressDto.md) |  |  [optional] |
|**returnUrl** | **String** | URL that the customer will be redirected to if they click a \&quot;Back to Merchant\&quot; button on the payment web page |  [optional] |
|**redirectUrl** | **String** | URL to the payment page that you can redirect your customers to |  [optional] |
|**transactions** | [**List&lt;GatewayTransactionDto&gt;**](GatewayTransactionDto.md) |  |  [optional] |
|**refund** | **Object** | The payment this object is a refund of. This should reference the pay in that this refund was created for |  [optional] |
|**refunds** | **List&lt;Object&gt;** | Refunds that have been requested for this payment. This should reference the refund payout for this pay in |  [optional] |



## Enum: SubTypeEnum

| Name | Value |
|---- | -----|
| MERCHANTPAYIN | &quot;merchantPayIn&quot; |
| MERCHANTPAYOUT | &quot;merchantPayOut&quot; |
| MERCHANTREFUND | &quot;merchantRefund&quot; |



