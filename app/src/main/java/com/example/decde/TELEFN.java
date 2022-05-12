package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TELEFN extends AppCompatActivity {

    Button Btn_oy45;
    Button Btn_oy22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefn);

        Btn_oy45 = findViewById(R.id.button23);
        Btn_oy45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TELEFN.this, TESKKUR.class));
            }
        });
        Btn_oy22 = findViewById(R.id.button22);
        Btn_oy22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TELEFN.this, TESKKUR.class));
            }
        });



    }}