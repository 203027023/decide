package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class PC extends AppCompatActivity {

    Button Btn_oy27;
    Button Btn_oy28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);

        Btn_oy27 = findViewById(R.id.button25);
        Btn_oy27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PC.this, TESKKUR.class));
            }
        });
        Btn_oy28 = findViewById(R.id.button24);
        Btn_oy28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PC.this, TESKKUR.class));
            }
        });



    }}