package giorgi.tsulaia.bog.ge.mbank.userpage.models.cards;

import com.google.gson.annotations.SerializedName;

public class Cards {
    @SerializedName("CardId")
    private Long cardId;

    @SerializedName("SubProductCode")
    private String subProductCode;

    @SerializedName("LastFour")
    private String lastFour;

    @SerializedName("ProductCode")
    private String productCode;

    @SerializedName("CardHolder")
    private String cardHolder;

    @SerializedName("SubProductGroup")
    private String subProductGroup;

    @SerializedName("CardPan")
    private String cardPan;

    @SerializedName("CardClass")
    private String cardClass;

    @SerializedName("CardForTypeDictionaryValue")
    private String cardForTypeDictionaryValue;

    @SerializedName("ClientKey")
    private Long clientKey;

    @SerializedName("ProductId")
    private Long productId;

    @SerializedName("SubProductId")
    private Long subProductId;

    @SerializedName("ProductGroup")
    private String productGroup;

    @SerializedName("AcctKey")
    private Long acctKey;

    @SerializedName("NameDictionaryValue")
    private String nameDictionaryValue;

    @SerializedName("CardName")
    private String cardName;

    @SerializedName("ExpDate")
    private Long expDate;

    @SerializedName("Id")
    private Long id;

    @SerializedName("CardType")
    private String cardType;

    @SerializedName("IsCardBlocked")
    private String isCardBlocked;

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getSubProductCode() {
        return subProductCode;
    }

    public void setSubProductCode(String subProductCode) {
        this.subProductCode = subProductCode;
    }

    public String getLastFour() {
        return lastFour;
    }

    public void setLastFour(String lastFour) {
        this.lastFour = lastFour;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getSubProductGroup() {
        return subProductGroup;
    }

    public void setSubProductGroup(String subProductGroup) {
        this.subProductGroup = subProductGroup;
    }

    public String getCardPan() {
        return cardPan;
    }

    public void setCardPan(String cardPan) {
        this.cardPan = cardPan;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getCardForTypeDictionaryValue() {
        return cardForTypeDictionaryValue;
    }

    public void setCardForTypeDictionaryValue(String cardForTypeDictionaryValue) {
        this.cardForTypeDictionaryValue = cardForTypeDictionaryValue;
    }

    public Long getClientKey() {
        return clientKey;
    }

    public void setClientKey(Long clientKey) {
        this.clientKey = clientKey;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSubProductId() {
        return subProductId;
    }

    public void setSubProductId(Long subProductId) {
        this.subProductId = subProductId;
    }

    public String getProductGroup() {
        return productGroup;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public Long getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(Long acctKey) {
        this.acctKey = acctKey;
    }

    public String getNameDictionaryValue() {
        return nameDictionaryValue;
    }

    public void setNameDictionaryValue(String nameDictionaryValue) {
        this.nameDictionaryValue = nameDictionaryValue;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Long getExpDate() {
        return expDate;
    }

    public void setExpDate(Long expDate) {
        this.expDate = expDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getIsCardBlocked() {
        return isCardBlocked;
    }

    public void setIsCardBlocked(String isCardBlocked) {
        this.isCardBlocked = isCardBlocked;
    }
}
