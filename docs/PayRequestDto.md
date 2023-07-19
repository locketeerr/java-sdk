

# PayRequestDto

DTO required to create a payment in or a payment out

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | Your Merchant ID. You can find it on the Merchant Details page in your account |  |
|**amount** | **BigDecimal** | payment amount |  |
|**expiryMinutes** | **Integer** | time period after which payment expires |  [optional] |
|**currency** | **String** | currency acronym |  |
|**returnUrl** | **String** | URL that the customer will be redirected to if they click a &#39;Back to Merchant&#39; button on the payment web page |  [optional] |
|**reference** | **String** | Your payment reference ID. Feel free to submit any ID to tie the payment to your customer |  |
|**type** | **DirectionDto** |  |  |
|**payInDetails** | [**PayInDetailDto**](PayInDetailDto.md) |  |  [optional] |
|**payOutDetails** | [**PayOutDetailDto**](PayOutDetailDto.md) |  |  [optional] |



