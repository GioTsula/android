package giorgi.tsulaia.bog.ge.mbank.userpage.cards;

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

import java.util.List;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.api.Api;
import giorgi.tsulaia.bog.ge.mbank.network.RetrofitInstance;
import giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities.AssetsAndLiabilitiesFragmentViewAdapter;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.cards.Cards;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CardsFragment extends Fragment {

    private Retrofit retrofit;
    private Api api;
    private CardsFragmentAdapter adapter;

    private RecyclerView recyclerView;

    public static CardsFragment newInstance() {

        Bundle args = new Bundle();

        CardsFragment fragment = new CardsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cards,container,false);

        InitializeComponents(view);
        getCards();
        return view;
    }
    private void InitializeComponents(View view) {
        retrofit = RetrofitInstance.getRetrofitInstance();
        api = retrofit.create(Api.class);

        recyclerView = view.findViewById(R.id.rcCards);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new CardsFragmentAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getCards() {
        api.getCards().enqueue(new Callback<List<Cards>>() {
            @Override
            public void onResponse(Call<List<Cards>> call, Response<List<Cards>> response) {
                if(response.isSuccessful()){
                    adapter.setData(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Cards>> call, Throwable t) {
                Log.d("card",t.getMessage());
            }
        });
    }



}
