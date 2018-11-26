package giorgi.tsulaia.bog.ge.mbank.userpage.transactions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions.MyOperations;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions.Transactions;

public class TransactionFragmentAdapter extends RecyclerView.Adapter<TransactionFragmentViewHolder> {
    List<MyOperations> data = new ArrayList<>();
    @NonNull
    @Override
    public TransactionFragmentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cell_fragment_transactions, viewGroup, false);
        return new TransactionFragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionFragmentViewHolder transactionFragmentViewHolder, int i) {
        transactionFragmentViewHolder.setData(data.get(i));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(Transactions data){
        this.data.clear();
        this.data.addAll(data.getMyOperations());
        notifyDataSetChanged();
    }
}
