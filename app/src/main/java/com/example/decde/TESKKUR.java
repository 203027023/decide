package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class TESKKUR extends AppCompatActivity {
Button Btn_geri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teskkur);

        Btn_geri = findViewById(R.id.button32);
        Btn_geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TESKKUR.this, GİRİS.class));
            }
        });
    }
}