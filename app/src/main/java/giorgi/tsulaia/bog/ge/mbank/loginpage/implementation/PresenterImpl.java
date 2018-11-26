package giorgi.tsulaia.bog.ge.mbank.loginpage.implementation;

import android.util.Log;

import giorgi.tsulaia.bog.ge.mbank.loginpage.contract.Contract;
import giorgi.tsulaia.bog.ge.mbank.network.RetrofitInstance;

public class PresenterImpl implements Contract.Presenter,Contract.Interactor.OnFinishedListener{
    private Contract.MainView mainView;
    private Contract.Interactor interactor;

    public PresenterImpl(Contract.MainView mainView , Contract.Interactor interactor){
        this.mainView = mainView;
        this.interactor = interactor;
    }
    @Override
    public void onLoginButtonClick(String username, String password) {
        if(username.isEmpty() || password.isEmpty()){
            mainView.onIllegalInputsEntered("აუცილებელია ყველა ველი იყოს შევსებული");
        } else if (username.length()<3 || password.length()<3){
            mainView.onIllegalInputsEntered("ველებში სიმბოლოების სიგრძე არ შეიძ₾ლება იყოს 3-ზე ნაკლები");
        }  else {
            interactor.getSessionId(this,username,password);
        }
    }

    @Override
    public void onFinished(String sessionId) {
        RetrofitInstance.setInterceptor(sessionId);
        mainView.onSuccess();
    }

    @Override
    public void onFalure(Throwable throwable) {
        Log.d("failure",throwable.getMessage());
    }
}
