package giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel;

import com.google.gson.annotations.SerializedName;

import giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities.MatchMakerInterface;

public class AvailableAmount implements MatchMakerInterface {
    @SerializedName("ProductType")
    private String productType;

    @SerializedName("AmountBase")
    private Double amountBase;

    @SerializedName("ProductName")
    private String productName;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getAmountBase() {
        return amountBase;
    }

    public void setAmountBase(Double amountBase) {
        this.amountBase = amountBase;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
