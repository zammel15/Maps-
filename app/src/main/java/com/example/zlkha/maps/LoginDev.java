package com.example.zlkha.maps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginDev extends AppCompatActivity {
    Button btn_signup, btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_dev);

        btn_signup= (Button) findViewById(R.id.button_sign_up1);
        btn_signin = (Button)findViewById(R.id.button_sign_in1) ;

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginDev.this, registration.class));

            }
        });
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginDev.this, MapsActivity.class));

            }
        });


    }
}
