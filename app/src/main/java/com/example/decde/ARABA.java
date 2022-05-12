package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ARABA extends AppCompatActivity {

    Button Btn_oy111;
    Button Btn_oy222;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_araba);

        Btn_oy111 = findViewById(R.id.button16);
        Btn_oy111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ARABA.this, TESKKUR.class));
            }
        });
        Btn_oy222 = findViewById(R.id.button17);
        Btn_oy222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ARABA.this, TESKKUR.class));
            }
        });



    }}