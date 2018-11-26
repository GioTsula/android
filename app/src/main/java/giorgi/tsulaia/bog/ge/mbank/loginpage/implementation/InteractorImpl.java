package giorgi.tsulaia.bog.ge.mbank.loginpage.implementation;

import android.util.Log;

import giorgi.tsulaia.bog.ge.mbank.api.Api;
import giorgi.tsulaia.bog.ge.mbank.loginpage.contract.Contract;
import giorgi.tsulaia.bog.ge.mbank.loginpage.model.SessionInfo;
import giorgi.tsulaia.bog.ge.mbank.network.RetrofitInstance;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InteractorImpl implements Contract.Interactor {
    @Override
    public void getSessionId(final OnFinishedListener onFinishedListener, String username, String password) {
        Api service = RetrofitInstance.getRetrofitInstance().create(Api.class);
        Call<SessionInfo> call = service.getSessionInfo(username, password);

        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<SessionInfo>() {
            @Override
            public void onResponse(Call<SessionInfo> call, Response<SessionInfo> response) {
                onFinishedListener.onFinished(response.body().getSessionId());
            }

            @Override
            public void onFailure(Call<SessionInfo> call, Throwable t) {
                onFinishedListener.onFalure(t);
            }
        });
    }
}
