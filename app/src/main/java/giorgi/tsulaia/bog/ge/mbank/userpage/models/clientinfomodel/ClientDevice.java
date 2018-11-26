package giorgi.tsulaia.bog.ge.mbank.userpage.models.clientinfomodel;

import com.google.gson.annotations.SerializedName;

public class ClientDevice {
    @SerializedName("Device")
    private String device;

    @SerializedName("ContactName")
    private String contactName;

    @SerializedName("Contact")
    private String contact;

    @SerializedName("Mobile")
    private String mobile;

    @SerializedName("Mail")
    private String mail;

    @SerializedName("DefaultContact")
    private String defaultContact;

    @SerializedName("Route")
    private String route;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDefaultContact() {
        return defaultContact;
    }

    public void setDefaultContact(String defaultContact) {
        this.defaultContact = defaultContact;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
