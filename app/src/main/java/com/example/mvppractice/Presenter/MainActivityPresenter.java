package com.example.mvppractice.Presenter;

import com.example.mvppractice.Model.MainActivityModel;
import com.example.mvppractice.Presenter.MainActivityInterface;

public class MainActivityPresenter implements MainActivityInterface.Presenter {

    MainActivityInterface.View view;

    public MainActivityPresenter(MainActivityInterface.View view) {
        this.view = view;
    }


    public void login(String email, String password){
        MainActivityModel.checkPassword(email, password, this);
    }



    @Override
    public void onSuccess(boolean isSuccess) {
        if (isSuccess){
            view.canLogin();
        }else {
            view.canNotLogin();
        }
    }
}
