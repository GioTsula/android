package giorgi.tsulaia.bog.ge.mbank.userpage.transactions;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions.MyOperations;


public class TransactionFragmentViewHolder  extends RecyclerView.ViewHolder {
    private TextView day;
    private  TextView company;
    private TextView pay;
    private TextView amount;

    public TransactionFragmentViewHolder(@NonNull View itemView) {
        super(itemView);
        day = itemView.findViewById(R.id.tv_day_transactions);
        company = itemView.findViewById(R.id.tv_company_transactions);
        pay = itemView.findViewById(R.id.tv_pay_transactions);
        amount = itemView.findViewById(R.id.tv_amount_transactions);
    }

    public void setData(MyOperations transactions) {
        String merchant = transactions.getMerchantName();
        if(merchant == null){
            company.setText("უცნობია");
        }else {
            company.setText(merchant);
        }
        pay.setText(transactions.getEntryGroupName());
        amount.setText(transactions.getAmount() + " ლარი");


      Date date = new Date(transactions.getPostDate());
      Date currTime = Calendar.getInstance().getTime();

      Calendar c1 = Calendar.getInstance();
      Calendar c2 = Calendar.getInstance();

      c1.setTime(currTime);
      c2.setTime(date);

      if (c1.get(Calendar.DAY_OF_YEAR) == c2.get(Calendar.DAY_OF_YEAR) &&
              c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)){
          day.setText(itemView.getContext().getResources().getString(R.string.today));
      } else if (c1.get(Calendar.DAY_OF_YEAR) == c2.get(Calendar.DAY_OF_YEAR)+1 &&
              c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
          day.setText(itemView.getContext().getResources().getString(R.string.yesterday));
      } else {
          String dt = new SimpleDateFormat("dd.MM.yyyy")
                  .format(new Date(String.valueOf(date)));
          day.setText(dt);
      }

    }

}
