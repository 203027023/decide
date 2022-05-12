package com.example.decde;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.decde.databinding.ActivityKim2Binding;


public class KİM1 extends AppCompatActivity {

    Button girdiK_1;
    Button girdiK_2;
    Button girdiK_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kim1);

        girdiK_1 = findViewById(R.id.button44);
        girdiK_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KİM1.this, TESSKUR2.class));
            }
        });
        girdiK_2 = findViewById(R.id.button46);
        girdiK_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KİM1.this, TESSKUR2.class));
            }
        });
        girdiK_3 = findViewById(R.id.button45);
        girdiK_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KİM1.this, TESSKUR2.class));
            }
        });    }
}