package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HYVN extends AppCompatActivity {

    Button Btn_oy01;
    Button Btn_oy02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyvn);

        Btn_oy01 = findViewById(R.id.button31);
        Btn_oy01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HYVN.this, TESKKUR.class));
            }
        });
        Btn_oy02 = findViewById(R.id.button30);
        Btn_oy02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HYVN.this, TESKKUR.class));
            }
        });



    }}