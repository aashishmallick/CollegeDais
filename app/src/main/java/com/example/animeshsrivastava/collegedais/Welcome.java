package com.example.animeshsrivastava.collegedais;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity implements View.OnClickListener {


 Button bwelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


bwelcome=(Button)findViewById(R.id.bwelcome);
        bwelcome.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bwelcome:
                Intent i=new Intent(this,LoginActivity.class);
                startActivity(i);
        }
    }

}