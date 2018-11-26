package giorgi.tsulaia.bog.ge.mbank.userpage.models.clientinfomodel;

import com.google.gson.annotations.SerializedName;

public class ClientAddress {
    @SerializedName("Street")
    private String street;

    @SerializedName("District")
    private String district;

    @SerializedName("Building")
    private String building;

    @SerializedName("Appartment")
    private Integer appartment;

    @SerializedName("AddressType")
    private String addressType;

    @SerializedName("CountryCode")
    private String countryCode;

    @SerializedName("ClientKey")
    private Integer clientKey;

    @SerializedName("UrbanType")
    private String urbanType;

    @SerializedName("NonCity")
    private String nonCity;

    @SerializedName("RegionCode")
    private String regionCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Integer getAppartment() {
        return appartment;
    }

    public void setAppartment(Integer appartment) {
        this.appartment = appartment;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getClientKey() {
        return clientKey;
    }

    public void setClientKey(Integer clientKey) {
        this.clientKey = clientKey;
    }

    public String getUrbanType() {
        return urbanType;
    }

    public void setUrbanType(String urbanType) {
        this.urbanType = urbanType;
    }

    public String getNonCity() {
        return nonCity;
    }

    public void setNonCity(String nonCity) {
        this.nonCity = nonCity;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
