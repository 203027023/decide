package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CİKOLATA extends AppCompatActivity {

    Button Btn_oy23;
    Button Btn_oy24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cikolata);

        Btn_oy23 = findViewById(R.id.button21);
        Btn_oy23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CİKOLATA.this, TESKKUR.class));
            }
        });
        Btn_oy24= findViewById(R.id.button20);
        Btn_oy24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CİKOLATA.this, TESKKUR.class));
            }
        });



    }}