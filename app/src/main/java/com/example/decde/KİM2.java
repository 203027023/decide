package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.decde.databinding.ActivityKim2Binding;


public class KİM2 extends AppCompatActivity {

    Button girdi_1;
    Button girdi_2;
    Button girdi_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kim2);

        girdi_1 = findViewById(R.id.button47);
        girdi_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KİM2.this, TESSKUR2.class));
            }
        });
        girdi_2 = findViewById(R.id.button48);
        girdi_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KİM2.this, TESSKUR2.class));
            }
        });
        girdi_3 = findViewById(R.id.button49);
        girdi_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KİM2.this, TESSKUR2.class));
            }
        });
    }
}