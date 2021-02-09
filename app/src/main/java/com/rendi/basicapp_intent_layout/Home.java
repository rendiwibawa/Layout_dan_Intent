package com.rendi.basicapp_intent_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btn_1 = findViewById(R.id.btn_baca1);
        btn_1.setOnClickListener(this);

        Button btn_2 = findViewById(R.id.btn_baca2);
        btn_2.setOnClickListener(this);

        Button btn_3 = findViewById(R.id.btn_baca3);
        btn_3.setOnClickListener(this);

        Button btn_4 = findViewById(R.id.btn_baca4);
        btn_4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_baca1:
                    Intent moIntent = new Intent(Home.this, MainActivity.class);
                    startActivity(moIntent);
                    break;

                case R.id.btn_baca2:
                    Intent pindah = new Intent(Home.this, linearlayoutt.class);
                    startActivity(pindah);
                    break;

                case R.id.btn_baca3:
                    Intent los = new Intent(Home.this, relativelayout.class);
                    startActivity(los);
                    break;


            }
        }

    }
