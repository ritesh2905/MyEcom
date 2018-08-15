package com.example.ritz.myecom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public Button b ,s,skip;



    public void init() {
        b = (Button)findViewById(R.id.SignIn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        s = (Button)findViewById(R.id.SignUp);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(j);
            }
        });


        skip = (Button)findViewById(R.id.SkipForNow);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this,ShoppingActivity.class);
                startActivity(k);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
