package com.example.mvppractice.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mvppractice.Presenter.MainActivityInterface;
import com.example.mvppractice.Presenter.MainActivityPresenter;
import com.example.mvppractice.R;

public class MainActivity extends AppCompatActivity implements MainActivityInterface.View {

    private EditText email, password;
    private Button Go;
    private ImageView icon;

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        Go = (Button) findViewById(R.id.buttongo);
        icon = (ImageView) findViewById(R.id.icon);

        presenter = new MainActivityPresenter(this);



        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mail = email.getText().toString().trim();
                String Password = password.getText().toString().trim();

                if (TextUtils.isEmpty(Mail) || TextUtils.isEmpty(Password)) {

                } else {
                    presenter.login(Mail, Password);
                }
            }
        });
    }



    @Override
    public void canLogin() {
        Toast.makeText(this, "Done!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void canNotLogin() {
        Toast.makeText(this, "Try Again!!", Toast.LENGTH_SHORT).show();
    }
}