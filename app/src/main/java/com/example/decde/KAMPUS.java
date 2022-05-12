package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class KAMPUS extends AppCompatActivity {

    Button Btn_oy25;
    Button Btn_oy26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kampus);

        Btn_oy25 = findViewById(R.id.button19);
        Btn_oy25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KAMPUS.this, TESKKUR.class));
            }
        });
        Btn_oy26 = findViewById(R.id.button18);
        Btn_oy26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KAMPUS.this, TESKKUR.class));
            }
        });



    }}