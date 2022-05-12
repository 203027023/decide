package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RENK extends AppCompatActivity {

    Button Btn_oy30;
    Button Btn_oy31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renk);

        Btn_oy31 = findViewById(R.id.button27);
        Btn_oy31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RENK.this, TESKKUR.class));
            }
        });
        Btn_oy30 = findViewById(R.id.button26);
        Btn_oy30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RENK.this, TESKKUR.class));
            }
        });



    }}