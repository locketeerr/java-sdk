

# PayOutDetailDto

Specify payment details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Gateway to be used (crypto or wallet) |  |
|**currency** | **String** | Currency acronym payout needs to be made in |  |
|**address** | **String** | Address to withdrawal funds to |  |
|**tag** | **String** | This is a payment destination tag. This fields isn&#39;t null when the paidCurrency currency value is XRP |  [optional] |
|**protocol** | **String** | Protocol behind a currency (ERC20 or TRC20) |  [optional] |



