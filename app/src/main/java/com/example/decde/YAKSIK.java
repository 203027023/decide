package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class YAKSIK extends AppCompatActivity {

    Button Btn_oy11;
    Button Btn_oy22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaksik);

        Btn_oy11 = findViewById(R.id.button14);
        Btn_oy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YAKSIK.this, TESKKUR.class));
            }
        });
        Btn_oy22 = findViewById(R.id.button15);
        Btn_oy22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(YAKSIK.this, TESKKUR.class));
            }
        });



    }}