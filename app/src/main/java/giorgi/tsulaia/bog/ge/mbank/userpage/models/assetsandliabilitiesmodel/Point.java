package giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel;

import com.google.gson.annotations.SerializedName;

import giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities.MatchMakerInterface;

public class Point implements MatchMakerInterface {
    @SerializedName("Id")
    private Integer id;

    @SerializedName("ProductName")
    private  String productName;

    @SerializedName("OrderNo")
    private Integer orderNo;

    @SerializedName("Amount")
    private Integer amount;

    @SerializedName("ProdType")
    private String prodType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public Double getAmountBase() {
        return (double) amount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }
}
