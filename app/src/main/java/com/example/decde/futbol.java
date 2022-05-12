package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class futbol extends AppCompatActivity {

    Button gir_1;
    Button gir_2;
    Button gir_3;
    Button geri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbol);

        gir_1 = findViewById(R.id.button35);
        gir_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(futbol.this, CHAMP.class));
            }
        });
        gir_2 = findViewById(R.id.button36);
        gir_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(futbol.this, KİM1.class));
            }
        });
        gir_3 = findViewById(R.id.button37);
        gir_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(futbol.this, KİM2.class));
            }
        });
        geri = findViewById(R.id.button38);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(futbol.this, giriss2.class));
            }
        });
    }
}