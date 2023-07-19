

# CryptoAddressDto

Payment address details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Address to withdrawal funds to |  [optional] |
|**tag** | **String** | This is a payment destination tag. This fields isn&#39;t null when the paidCurrency.currency value is XRP |  [optional] |
|**protocol** | **String** | protocol behind a currency (ERC20 or TRC20) |  [optional] |
|**uri** | **String** | The destination address URI for QR code |  [optional] |
|**alternatives** | [**List&lt;AlternativeAddress&gt;**](AlternativeAddress.md) | List of non-default addresses for other tokens |  [optional] |



