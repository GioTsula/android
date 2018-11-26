package giorgi.tsulaia.bog.ge.mbank.userpage.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.cards.Cards;

public class CardsFragmentViewHolder extends RecyclerView.ViewHolder {
    private TextView solo;
    private TextView cardNumber;
    private TextView date;
    private TextView fullName;
    private ImageView image;
    private CardView card;

    public CardsFragmentViewHolder(@NonNull View itemView) {
        super(itemView);

        initializeComponents(itemView);
    }
    private void initializeComponents(View itemView){
        solo = itemView.findViewById(R.id.tv_cell_cards_solo);
        cardNumber = itemView.findViewById(R.id.tv_cell_cards_cardnumber);
        date = itemView.findViewById(R.id.tv_cell_cards_date);
        fullName = itemView.findViewById(R.id.tv_cell_cards_full_name);
        image = itemView.findViewById(R.id.cards_cell_imageview);
        card = itemView.findViewById(R.id.cards_cell_card_view);
    }

    public void bindData(Cards card){
        this.date.setText(new SimpleDateFormat("MM/yyyy")
                .format(new Date(card.getExpDate())));
        this.fullName.setText(card.getCardHolder());
        this.cardNumber.setText(itemView.getContext().getResources()
                .getString(R.string.xxxx_xxxx_xxxx_1234)+" "+card.getLastFour());
        if(card.getCardClass().equals(itemView.getContext().getResources().getString(R.string.visa))){
            this.image.setImageResource(R.drawable.card_icon_visa_border_single);
        }
        else {
            this.image.setImageResource(R.drawable.card_icon_amex_single);
        }

        String symbol = card.getCardType().substring(0,1);
        if(symbol.equals("A")){
            this.solo.setText(itemView.getContext().getResources().getString(R.string.amex));
            this.card.setBackgroundResource(R.drawable.account_background_amex_green);
        }
        else if(symbol.equals("G")){
            this.solo.setText(itemView.getContext().getResources().getString(R.string.gold));
            this.card.setBackgroundResource(R.drawable.account_background_visa_gold);
        }
        else {
            this.solo.setText(itemView.getContext().getResources().getString(R.string.solo));
            this.card.setBackgroundResource(R.drawable.account_background_solo);
        }
    }
}
