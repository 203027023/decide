package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CHAMP extends AppCompatActivity {

    Button girdim_1;
    Button girdim_2;
    Button girdim_3;
    Button girdim_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);

        girdim_1 = findViewById(R.id.button40);
        girdim_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CHAMP.this, TESSKUR2.class));
            }
        });
        girdim_2 = findViewById(R.id.button41);
        girdim_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CHAMP.this, TESSKUR2.class));
            }
        });
        girdim_3 = findViewById(R.id.button42);
        girdim_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CHAMP.this, TESSKUR2.class));
            }
        });
        girdim_4 = findViewById(R.id.button43);
        girdim_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CHAMP.this, TESSKUR2.class));
            }
        });
    }
}