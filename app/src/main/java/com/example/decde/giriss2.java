package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class giriss2 extends AppCompatActivity {

    Button Btn_girer1;
    Button Btn_girer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giriss2);

        Btn_girer1 = findViewById(R.id.button34);
        Btn_girer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(giriss2.this, GİRİS.class));
            }
        });

        Btn_girer2 = findViewById(R.id.button33);
        Btn_girer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(giriss2.this, futbol.class));
            }
        });





    }
}