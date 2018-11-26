package giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel.AssetsAndLiabilities;

public class AssetsAndLiabilitiesFragmentViewAdapter extends RecyclerView.Adapter {
    private List<Object> data = new ArrayList<>();
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if( i == 0 ) {
            View view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.cell_header_fragment_assetsandliabilities,viewGroup,false);
            return new AssetsAndLiabilitiesHeaderViewHolder(view);
        } else {
            View view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.cell_content_fragment_assetsandliabilities,viewGroup,false);
            return new AssetsAndLiabilitiesContentViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if(data.get(i) instanceof String){
            ((AssetsAndLiabilitiesHeaderViewHolder)viewHolder).setData((String)data.get(i));
        }  else {
            ((AssetsAndLiabilitiesContentViewHolder)viewHolder).bindData((MatchMakerInterface) data.get(i));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position) instanceof String ? 0 : 1;
    }

    public void setData(AssetsAndLiabilities data){
        this.data.clear();
        if(data.getPoints().size() > 0){
            this.data.add("ქულები");
            this.data.addAll(data.getPoints());
        }
        if(data.getAssets().size() > 0 ){
            this.data.add("აქტივები");
            this.data.addAll(data.getAssets());
        }
        if(data.getLiabilities().size() > 0){
            this.data.add("ვალდებულებები");
        }
        this.data.addAll(data.getLiabilities());
        if(data.getAvailableAmounts().size() > 0){
            this.data.add("ხელმისაწვდომი რაოდენობები");
            this.data.addAll(data.getAvailableAmounts());
        }
        notifyDataSetChanged();
    }
}
