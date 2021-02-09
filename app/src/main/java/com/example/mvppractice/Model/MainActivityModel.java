package com.example.mvppractice.Model;

import com.example.mvppractice.Presenter.MainActivityInterface;

public class MainActivityModel {

    public static void checkPassword(String email, String password, MainActivityInterface.Presenter presenterInterface){
        if (email.equals("mehedi@gmail.com") && password.equals("123456")){
            presenterInterface.onSuccess(true);
        }else {
            presenterInterface.onSuccess(false);
        }
    }
}
