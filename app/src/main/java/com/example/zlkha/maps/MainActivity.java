package com.example.zlkha.maps;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    private EditText mEmailField;
    private EditText mPasswordField;
    private Button mSignInButton;
    private Button mSignUpButton;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
    }


    private void initView() {
        // Views
        mEmailField = (EditText) findViewById(R.id.field_email);
        mPasswordField = (EditText) findViewById(R.id.field_password);
        //mSignInButton = (Button) findViewById(R.id.button_sign_in1);
        // mSignUpButton = (Button) findViewById(R.id.button_sign_up1);


        // Click listeners
        mSignInButton.setOnClickListener(this);
        mSignUpButton.setOnClickListener(this);
    }


    private boolean validateForm() {
        boolean result = true;
        if (TextUtils.isEmpty(mEmailField.getText().toString())) {
            mEmailField.setError("Required");
            result = false;
        } else {
            mEmailField.setError(null);
        }


        if (TextUtils.isEmpty(mPasswordField.getText().toString())) {
            mPasswordField.setError("Required");
            result = false;
        } else {
            mPasswordField.setError(null);
        }


        return result;
    }

    private String usernameFromEmail(String email) {
        if (email.contains("@")) {
            return email.split("@")[0];
        } else {
            return email;
        }
    }


    private void signIn() {
        Log.d(TAG, "signIn");
        if (!validateForm()) {
            return;
        }


        String email = mEmailField.getText().toString();
        String password = mPasswordField.getText().toString();

/*
    1.recuperer les donnees et faire un test
    2. creer un intent pour retourner a la page home
*/


    }

    private void signUp() {
        Log.d(TAG, "signUp");
        if (!validateForm()) {
            return;
        }


        String email = mEmailField.getText().toString();
        String password = mPasswordField.getText().toString();
        /*
       1. sauvgarder l'utilisateur a la base de donnees
       2. creer un intent pour retourner a la page login
         */


    }

    /*
    levent Onclick est ici
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //case R.id.button_sign_in:
            //   signIn();
            //  break;
            case R.id.button_sign_up:
                signUp();
                break;
        }
    }


}

