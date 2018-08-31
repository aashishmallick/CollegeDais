package com.example.animeshsrivastava.collegedais;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText ET_NAME, ET_AGE, ET_COLLEGE, ET_MOBILE, ET_USER_NAME, ET_USER_PASS;
    String name, age, college, mobile, user_name, user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ET_NAME = (EditText)findViewById(R.id.etname);
        ET_AGE = (EditText) findViewById(R.id.etage);
        ET_COLLEGE = (EditText) findViewById(R.id.etcollege);
        ET_MOBILE = (EditText) findViewById(R.id.etmobile);
        ET_USER_NAME = (EditText) findViewById(R.id.etusername);
        ET_USER_PASS = (EditText) findViewById(R.id.etpassword);

    }

  public void userReg(View view)
  {
      name = ET_NAME.getText().toString();
      age = ET_AGE.getText().toString();
      college = ET_COLLEGE.getText().toString();
      mobile = ET_MOBILE.getText().toString();
      user_name = ET_USER_NAME.getText().toString();
      user_pass = ET_USER_PASS.getText().toString();

      String method = "register";
      BackgroundTask backgroundTask = new BackgroundTask(this);
      backgroundTask.execute(method, name, age, college, mobile, user_name, user_pass);
      finish();

  }

}
