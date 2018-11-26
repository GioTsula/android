package giorgi.tsulaia.bog.ge.mbank.loginpage;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import giorgi.tsulaia.bog.ge.mbank.R;
import giorgi.tsulaia.bog.ge.mbank.userpage.UserPageActivity;
import giorgi.tsulaia.bog.ge.mbank.loginpage.contract.Contract;
import giorgi.tsulaia.bog.ge.mbank.loginpage.implementation.InteractorImpl;
import giorgi.tsulaia.bog.ge.mbank.loginpage.implementation.PresenterImpl;

public class MainActivity extends AppCompatActivity  implements  Contract.MainView{
    private TextInputEditText username;
    private TextInputEditText password;
    private Button login;

    private Contract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.usernameEditTextID);
        password = findViewById(R.id.passwordEditTextID);
        login = findViewById(R.id.loginButtonID);
        presenter = new PresenterImpl(this, new InteractorImpl());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onLoginButtonClick(username.getText().toString(),password.getText().toString());
            }
        });
    }


    @Override
    public void onIllegalInputsEntered(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSuccess() {
        Intent intent = new Intent(MainActivity.this,UserPageActivity.class);
        startActivity(intent);
    }
}
