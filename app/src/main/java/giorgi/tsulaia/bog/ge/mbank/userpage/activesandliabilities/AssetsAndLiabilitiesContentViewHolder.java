package giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import giorgi.tsulaia.bog.ge.mbank.R;

public class AssetsAndLiabilitiesContentViewHolder extends RecyclerView.ViewHolder {
    private TextView assets;
    private TextView value;

    public AssetsAndLiabilitiesContentViewHolder(@NonNull View itemView) {
        super(itemView);
        assets = itemView.findViewById(R.id.tv_cell_content_assets);
        value = itemView.findViewById(R.id.tv_cell_content_value);
    }


    public void bindData(MatchMakerInterface matchMakerInterface) {
        assets.setText(matchMakerInterface.getProductName());
        value.setText(matchMakerInterface.getAmountBase().toString());
    }
}
