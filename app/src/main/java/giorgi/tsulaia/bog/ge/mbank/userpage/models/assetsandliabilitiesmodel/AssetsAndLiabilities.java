package giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssetsAndLiabilities {
    @SerializedName("Points")
    private List<Point> points;

    @SerializedName("Assets")
    private List<Asset> assets;

    @SerializedName("Liabilities")
    private List<Liability> liabilities;

    @SerializedName("AvailableAmounts")
    private List<AvailableAmount> availableAmounts;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public List<AvailableAmount> getAvailableAmounts() {
        return availableAmounts;
    }

    public void setAvailableAmounts(List<AvailableAmount> availableAmounts) {
        this.availableAmounts = availableAmounts;
    }
}
