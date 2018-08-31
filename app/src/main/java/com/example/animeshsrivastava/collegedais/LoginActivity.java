package com.example.animeshsrivastava.collegedais;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity  {

    Button bbutton;
    EditText ET_NAME, ET_PASS;
    String login_name, login_pass;
    TextView tvregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ET_NAME = (EditText) findViewById(R.id.user_name);
        ET_PASS = (EditText) findViewById(R.id.user_pass);

    }

    public void userReg(View view)
    {
        startActivity(new Intent(this, Register.class));
    }

    public void userLogin(View view)

    {

        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask= new BackgroundTask(this);
        backgroundTask.execute(method, login_name, login_pass);


    }


}