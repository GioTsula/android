package giorgi.tsulaia.bog.ge.mbank.api;

import java.util.List;

import giorgi.tsulaia.bog.ge.mbank.loginpage.model.SessionInfo;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.assetsandliabilitiesmodel.AssetsAndLiabilities;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.cards.Cards;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.clientinfomodel.ClientInfo;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions.Transactions;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("api/Clients/Login/{username}/{password}")
    Call<SessionInfo> getSessionInfo(@Path("username") String username, @Path("password") String password);

    @GET("api/Clients/ClientInfo/")
    Call<ClientInfo> getClientInfo();

    @GET("api/Products/AssetsAndLiabilities/")
    Call<AssetsAndLiabilities> getAssetsAndLiabilities();

    @GET("api/Products/Transactions/")
    Call<Transactions> getTransactions();

    @GET("api/Products/Cards/")
    Call<List<Cards>> getCards();

}
