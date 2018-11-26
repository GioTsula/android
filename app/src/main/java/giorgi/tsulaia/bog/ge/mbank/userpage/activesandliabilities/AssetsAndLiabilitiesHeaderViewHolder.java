package giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import giorgi.tsulaia.bog.ge.mbank.R;

public class AssetsAndLiabilitiesHeaderViewHolder extends RecyclerView.ViewHolder {
    private TextView header;
    public AssetsAndLiabilitiesHeaderViewHolder(@NonNull View itemView) {
        super(itemView);
        header = itemView.findViewById(R.id.tv_cell_header);
    }
    public void setData(String title){
        header.setText(title);
    }
}
