package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SARAY extends AppCompatActivity {

    Button Btn_oy19;
    Button Btn_oy18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saray);

        Btn_oy19 = findViewById(R.id.button28);
        Btn_oy19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SARAY.this, TESKKUR.class));
            }
        });
        Btn_oy18 = findViewById(R.id.button29);
        Btn_oy18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SARAY.this, TESKKUR.class));
            }
        });



    }}