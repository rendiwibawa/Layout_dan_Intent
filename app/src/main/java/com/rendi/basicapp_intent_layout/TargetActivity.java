package com.rendi.basicapp_intent_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

     private  TextView getNama;
    private TextView nama;
    private TextView jwb1;
    private TextView jwb2;
    private TextView jwb3;


    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
  Intent intent = getIntent();
        String nama = intent.getStringExtra("Nama");
        String jawab1 = intent.getStringExtra("1");
        String jawab2 = intent.getStringExtra("2");
        String jawab3 = intent.getStringExtra("3");

        TextView tv_nama = findViewById(R.id.nama);
        TextView tv_1 = findViewById(R.id.jwn_1);
        TextView tv_2 = findViewById(R.id.jwn_2);
        TextView tv_3 = findViewById(R.id.jwn_3);

        tv_nama.setText("Hi Senang Bertemu dengan mu "+nama);
        tv_1.setText("1. Jawabanya adalah Semua bebek kakinya 2 apakah jawabanmu benar ? \nJawabanmu :"+jawab1);
        tv_2.setText("2. Jawabanya adalah sapi minum air apakah jawabanmu benar ? \nJawabanmu :"+jawab2);
        tv_3.setText("Harapanmu"+jawab3+"Semoga segera tercapai kawan Aminnn ");




    }
}

   /* @Override
    /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        nama= (TextView) findViewById(R.id.nama);
        jwb1= (TextView) findViewById(R.id.jwn_1);
        jwb2= (TextView) findViewById(R.id.jwn_2);
        jwb3= (TextView) findViewById(R.id.jwn_3);

        //get data
        if(getIntent().getExtras() != null){
            String data = getIntent().getExtras().getString()(nama.setText(););
            nama.setText(data);
            jwb1.setText(data);
            jwb2.setText(data);
            jwb3.setText(data);

        }
    }
}*/
