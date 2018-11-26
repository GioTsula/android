package giorgi.tsulaia.bog.ge.mbank.userpage.activesandliabilities;

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

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.api.Api;
import giorgi.tsulaia.bog.ge.mbank.network.RetrofitInstance;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel.AssetsAndLiabilities;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AssetsAndLiabilitiesFragment extends Fragment {
    private Retrofit retrofit;
    private Api api;
    private AssetsAndLiabilitiesFragmentViewAdapter adapter;

    private RecyclerView recyclerView;

    public static AssetsAndLiabilitiesFragment newInstance() {

        Bundle args = new Bundle();

        AssetsAndLiabilitiesFragment fragment = new AssetsAndLiabilitiesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_assetsandliabilities,container,false);

        InitializeComponents(view);
        getAssetsAndLiabilities();

        return view;
    }


    private void InitializeComponents(View view){
        retrofit = RetrofitInstance.getRetrofitInstance();
        api = retrofit.create(Api.class);

        recyclerView = view.findViewById(R.id.rcAssetsAndLiabilitiesID);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new AssetsAndLiabilitiesFragmentViewAdapter();
        recyclerView.setAdapter(adapter);
    }


    private void getAssetsAndLiabilities(){
        api.getAssetsAndLiabilities().enqueue(new Callback<AssetsAndLiabilities>() {
            @Override
            public void onResponse(Call<AssetsAndLiabilities> call, Response<AssetsAndLiabilities> response) {
                if(response.isSuccessful()){
                    adapter.setData(response.body());
                }
            }
            @Override
            public void onFailure(Call<AssetsAndLiabilities> call, Throwable t) {
                Log.d("AssetsAndLiabilities",t.getMessage());
            }
        });
    }
}
