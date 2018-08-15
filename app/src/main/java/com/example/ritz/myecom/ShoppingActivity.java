package com.example.ritz.myecom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ShoppingActivity extends AppCompatActivity {

    ImageButton s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        s = (ImageButton) findViewById(R.id.imgbtn);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(ShoppingActivity.this,ProductActivity.class);
                startActivity(j);
            }
        });
    }
}
