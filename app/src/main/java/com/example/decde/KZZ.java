package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class KZZ extends AppCompatActivity {

 Button Btn_oy1;
 Button Btn_oy2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kzz);

        Btn_oy1 = findViewById(R.id.button8);
        Btn_oy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KZZ.this, TESKKUR.class));
            }
        });
        Btn_oy2 = findViewById(R.id.button11);
        Btn_oy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KZZ.this, TESKKUR.class));
            }
        });



}}