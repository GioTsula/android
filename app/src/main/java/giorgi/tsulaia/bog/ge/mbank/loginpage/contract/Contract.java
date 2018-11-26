package giorgi.tsulaia.bog.ge.mbank.loginpage.contract;

public interface Contract {
    interface Presenter {
        void onLoginButtonClick(String username, String password);
    }

    interface MainView {
        void onIllegalInputsEntered(String message);
        void onSuccess();
    }

    interface Interactor{
        interface OnFinishedListener {
            void onFinished(String sessionId);
            void onFalure(Throwable throwable);
        }
        void getSessionId(OnFinishedListener onFinishedListener,String username, String password);
    }
}
