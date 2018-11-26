package giorgi.tsulaia.bog.ge.mbank.userpage.transactions;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.api.Api;
import giorgi.tsulaia.bog.ge.mbank.network.RetrofitInstance;
import giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities.AssetsAndLiabilitiesFragmentViewAdapter;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions.MyOperations;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions.Transactions;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class TransactionsFragment extends Fragment {
    private Retrofit retrofit;
    private Api api;
    private RecyclerView recyclerView;
    private TransactionFragmentAdapter adapter;


    private TextView in;
    private  TextView out;

    public static TransactionsFragment newInstance() {

        Bundle args = new Bundle();

        TransactionsFragment fragment = new TransactionsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transactions,container,false);

        InitializeComponents(view);
        getTransactions();
        return view;
    }

    private void InitializeComponents(View view) {
        retrofit = RetrofitInstance.getRetrofitInstance();
        api = retrofit.create(Api.class);

        in = view.findViewById(R.id.tv_income_value);
        out = view.findViewById(R.id.tv_outgoing_value);
        recyclerView = view.findViewById(R.id.rc_transactions);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TransactionFragmentAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getTransactions(){
        api.getTransactions().enqueue(new Callback<Transactions>() {
            @Override
            public void onResponse(Call<Transactions> call, Response<Transactions> response) {
                if (response.isSuccessful()){
                    in.setText(response.body().getIncomeSum().toString());
                    out.setText(response.body().getOutcomeSum().toString());
                    adapter.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<Transactions> call, Throwable t) {
                Log.d("Transactions",t.getMessage());
            }
        });
    }
}
