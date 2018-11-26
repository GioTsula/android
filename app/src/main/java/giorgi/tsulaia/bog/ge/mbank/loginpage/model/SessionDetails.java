package giorgi.tsulaia.bog.ge.mbank.loginpage.model;

import com.google.gson.annotations.SerializedName;

public class SessionDetails {
    @SerializedName("IsChannelActive")
    private boolean isChannelActive;

    @SerializedName("SessionTimeout")
    private Integer sessionTimeout;

    public boolean isChannelActive() {
        return isChannelActive;
    }

    public void setChannelActive(boolean channelActive) {
        isChannelActive = channelActive;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }
}
