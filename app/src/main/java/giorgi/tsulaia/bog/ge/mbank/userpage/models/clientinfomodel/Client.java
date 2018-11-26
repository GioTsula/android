package giorgi.tsulaia.bog.ge.mbank.userpage.models.clientinfomodel;

import com.google.gson.annotations.SerializedName;

public class Client {
    @SerializedName("Pin")
    private String pin;

    @SerializedName("Resident")
    private String resident;

    @SerializedName("CategoryType")
    private String categoryType;

    @SerializedName("LastNameInt")
    private String lastNameInt;

    @SerializedName("FirstNameInt")
    private String firstNameInt;

    @SerializedName("FirstName")
    private String firstName;

    @SerializedName("TranStatus")
    private String tranStatus;

    @SerializedName("LastName")
    private String lastName;

    @SerializedName("ClientCategory")
    private String clientCategory;

    @SerializedName("BirthDate")
    private Long birthDate;

    @SerializedName("Sex")
    private String sex;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getLastNameInt() {
        return lastNameInt;
    }

    public void setLastNameInt(String lastNameInt) {
        this.lastNameInt = lastNameInt;
    }

    public String getFirstNameInt() {
        return firstNameInt;
    }

    public void setFirstNameInt(String firstNameInt) {
        this.firstNameInt = firstNameInt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTranStatus() {
        return tranStatus;
    }

    public void setTranStatus(String tranStatus) {
        this.tranStatus = tranStatus;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(String clientCategory) {
        this.clientCategory = clientCategory;
    }

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
