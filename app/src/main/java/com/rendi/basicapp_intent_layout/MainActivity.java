package com.rendi.basicapp_intent_layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nama = findViewById(R.id.edit_text_0);
        final EditText jawaban1 = findViewById(R.id.edit_text_1);
        final EditText jawaban2 = findViewById(R.id.edit_text_2);
        final EditText jawaban3 = findViewById(R.id.edit_text_3);

        Button save = findViewById(R.id.button);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString();
                String jawab1 = jawaban1.getText().toString();
                String jawab2 = jawaban2.getText().toString();
                String jawab3 = jawaban3.getText().toString();


                Intent intent = new Intent(MainActivity.this, TargetActivity.class );
                intent.putExtra("Nama", nama1);
                intent.putExtra("1", jawab1);
                intent.putExtra("2", jawab2);
                intent.putExtra("3", jawab3);
                startActivity(intent);


            }
        });


    }
}
