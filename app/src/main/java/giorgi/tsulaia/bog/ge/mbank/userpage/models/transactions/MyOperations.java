package giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions;

import com.google.gson.annotations.SerializedName;

public class MyOperations {
    @SerializedName("Amount")
    private Double amount;

    @SerializedName("EntryGroupName")
    private String entryGroupName;

    @SerializedName("Beneficiary")
    private String beneficiary;

    @SerializedName("AmountBase")
    private Double amountBase;

    @SerializedName("MerchantNameInt")
    private String merchantNameInt;

    @SerializedName("EntryGroup")
    private String entryGroup;

    @SerializedName("SrcAcc")
    private String srcAcc;

    @SerializedName("MerchantName")
    private String merchantName;

    @SerializedName("DocNomination")
    private String docNomination;

    @SerializedName("Nomination")
    private String nomination;

    @SerializedName("AcctKey")
    private Long acctKey;

    @SerializedName("PostDate")
    private Long postDate;

    @SerializedName("EntryId")
    private Long entryId;

    @SerializedName("EntryGroupNameId")
    private Long entryGroupNameId;

    @SerializedName("Date")
    private Long date;

    @SerializedName("MerchantId")
    private String merchantId;

    @SerializedName("Ccy")
    private String ccy;

    @SerializedName("ServiceId")
    private String serviceId;

    @SerializedName("DstAcc")
    private String dstAcc;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getEntryGroupName() {
        return entryGroupName;
    }

    public void setEntryGroupName(String entryGroupName) {
        this.entryGroupName = entryGroupName;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public Double getAmountBase() {
        return amountBase;
    }

    public void setAmountBase(Double amountBase) {
        this.amountBase = amountBase;
    }

    public String getMerchantNameInt() {
        return merchantNameInt;
    }

    public void setMerchantNameInt(String merchantNameInt) {
        this.merchantNameInt = merchantNameInt;
    }

    public String getEntryGroup() {
        return entryGroup;
    }

    public void setEntryGroup(String entryGroup) {
        this.entryGroup = entryGroup;
    }

    public String getSrcAcc() {
        return srcAcc;
    }

    public void setSrcAcc(String srcAcc) {
        this.srcAcc = srcAcc;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getDocNomination() {
        return docNomination;
    }

    public void setDocNomination(String docNomination) {
        this.docNomination = docNomination;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public Long getAcctKey() {
        return acctKey;
    }

    public void setAcctKey(Long acctKey) {
        this.acctKey = acctKey;
    }

    public Long getPostDate() {
        return postDate;
    }

    public void setPostDate(Long postDate) {
        this.postDate = postDate;
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public Long getEntryGroupNameId() {
        return entryGroupNameId;
    }

    public void setEntryGroupNameId(Long entryGroupNameId) {
        this.entryGroupNameId = entryGroupNameId;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDstAcc() {
        return dstAcc;
    }

    public void setDstAcc(String dstAcc) {
        this.dstAcc = dstAcc;
    }
}
