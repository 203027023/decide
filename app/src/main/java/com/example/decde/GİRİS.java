package com.example.decde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class GİRİS extends AppCompatActivity {
    Button Btn_gitt;
 Button btn_git1;
    Button btn_git2;
    Button btn_git3;
    Button btn_git4;
    Button btn_git5;
    Button btn_git6;
    Button btn_git7;
    Button btn_git8;
    Button btn_git9;
    Button gerim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        Btn_gitt = findViewById(R.id.button1);
        Btn_gitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this, KZZ.class));
            }
            });
                btn_git1=findViewById(R.id.button);
                btn_git1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(GİRİS.this,YAKSIK.class));
                    }
                });

        btn_git2=findViewById(R.id.button2);
        btn_git2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,ARABA.class));
            }
        });


        btn_git3=findViewById(R.id.button3);
        btn_git3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,KAMPUS.class));
            }
        });
        btn_git4=findViewById(R.id.button4);
        btn_git4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,CİKOLATA.class));
            }
        });
        btn_git5=findViewById(R.id.button5);
        btn_git5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,TELEFN.class));
            }
        });
        btn_git6=findViewById(R.id.button6);
        btn_git6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,PC.class));
            }
        });
        btn_git7=findViewById(R.id.button7);
        btn_git7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,RENK.class));
            }
        });

        btn_git8=findViewById(R.id.button9);
        btn_git8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,SARAY.class));
            }
        });
        btn_git9=findViewById(R.id.button10);
        btn_git9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,HYVN.class));
            }
        });
        gerim=findViewById(R.id.button50);
        gerim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GİRİS.this,giriss2.class));
            }
        });
    }
}