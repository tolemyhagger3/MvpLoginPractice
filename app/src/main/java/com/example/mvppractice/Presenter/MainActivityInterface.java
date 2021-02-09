package com.example.mvppractice.Presenter;

public interface MainActivityInterface {

    interface Presenter{
        void onSuccess(boolean isSuccess);
    }

    interface View{
        void canLogin();
        void canNotLogin();
    }
}
