package giorgi.tsulaia.bog.ge.mbank.userpage.userprofile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.api.Api;
import giorgi.tsulaia.bog.ge.mbank.network.RetrofitInstance;
import giorgi.tsulaia.bog.ge.mbank.userpage.models.clientinfomodel.ClientInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class ProfileFragment extends Fragment {
    private TextView tv_name;
    private TextView tv_surname;
    private TextView tv_gender;
    private TextView tv_birthday;
    private TextView tv_client_category;
    private TextView tv_phone;
    private TextView tv_address;
    private TextView tv_mail;

    public static ProfileFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);
        setTextViews(view);

        Retrofit retrofit =  new RetrofitInstance().getRetrofitInstance();
        Api api = retrofit.create(Api.class);
        api.getClientInfo().enqueue(new Callback<ClientInfo>() {
            @Override
            public void onResponse(Call<ClientInfo> call, Response<ClientInfo> response) {
                bindData(response.body());
            }

            @Override
            public void onFailure(Call<ClientInfo> call, Throwable t) {
                Log.d("ProfileFragment",t.getMessage());
            }
        });


        return view;
    }

    private void setTextViews(View view){
       tv_name = view.findViewById(R.id.tvNameForInput);
       tv_surname = view.findViewById(R.id.tvSurnameForInput);
       tv_gender = view.findViewById(R.id.tvGenderForInput);
       tv_birthday = view.findViewById(R.id.tvBirthdayForInput);
       tv_client_category = view.findViewById(R.id.tvClientCategoryForInput);
       tv_phone = view.findViewById(R.id.tvPhoneForInput);
       tv_address = view.findViewById(R.id.tvAddressForInput);
       tv_mail = view.findViewById(R.id.tvEmailForInput);
    }

    private void bindData(ClientInfo clientInfo){
        tv_name.setText(clientInfo.getClient().getFirstName());
        tv_surname.setText(clientInfo.getClient().getLastName());
        tv_gender.setText(clientInfo.getClient().getSex());
        tv_birthday.setText(new SimpleDateFormat("dd.MM.yyyy")
                .format(new Date(clientInfo.getClient().getBirthDate())));
        tv_client_category.setText(clientInfo.getClient().getClientCategory());
        tv_phone.setText(clientInfo.getClientPhones().get(0).getMobile());
        tv_mail.setText(clientInfo.getClientMails().get(0).getMail());
        tv_address.setText(clientInfo.getClientAddresses().get(0).getStreet());

    }
}
