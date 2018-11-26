package giorgi.tsulaia.bog.ge.mbank.userpage.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities.AssetsAndLiabilitiesContentViewHolder;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.cards.Cards;

public class CardsFragmentAdapter extends RecyclerView.Adapter<CardsFragmentViewHolder> {
    List<Cards> data = new ArrayList<>();

    @NonNull
    @Override
    public CardsFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_fragment_cards,viewGroup,false);
        return new CardsFragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardsFragmentViewHolder cardsFragmentViewHolder, int i) {
         cardsFragmentViewHolder.bindData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Cards> cards){
        this.data.clear();
        this.data.addAll(cards);
        notifyDataSetChanged();
    }

}
