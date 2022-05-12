package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class TESSKUR2 extends AppCompatActivity {
    Button Btn_geriM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tesskur2);

        Btn_geriM = findViewById(R.id.button39);
        Btn_geriM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TESSKUR2.this,  futbol.class));
            }
        });
    }
}