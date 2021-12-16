package com.sdh.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChapter7_1 = (Button) findViewById(R.id.btnChapter7_1);
        btnChapter7_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter7_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter7_2 = (Button) findViewById(R.id.btnChapter7_2);
        btnChapter7_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter7_2.class);
                startActivity(intent);
            }
        });

        Button btnChapter7_3 = (Button) findViewById(R.id.btnChapter7_3);
        btnChapter7_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter7_3.class);
                startActivity(intent);
            }
        });

        Button btnChapter8_1 = (Button) findViewById(R.id.btnChapter8_1);
        btnChapter8_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter8_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter10_1 = (Button) findViewById(R.id.btnChapter10_1);
        btnChapter10_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter10_1_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter10_2 = (Button) findViewById(R.id.btnChapter10_2);
        btnChapter10_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter10_2_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter10_3 = (Button) findViewById(R.id.btnChapter10_3);
        btnChapter10_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter10_3_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter10_4 = (Button) findViewById(R.id.btnChapter10_4);
        btnChapter10_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter10_4.class);
                startActivity(intent);
            }
        });

        Button btnChapter11_1 = (Button) findViewById(R.id.btnChapter11_1);
        btnChapter11_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter11_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter11_2 = (Button) findViewById(R.id.btnChapter11_2);
        btnChapter11_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter11_2.class);
                startActivity(intent);
            }
        });

        Button btnChapter11_3 = (Button) findViewById(R.id.btnChapter11_3);
        btnChapter11_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter11_3.class);
                startActivity(intent);
            }
        });

        Button btnChapter12_1 = (Button) findViewById(R.id.btnChapter12_1);
        btnChapter12_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter12_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter12_2 = (Button) findViewById(R.id.btnChapter12_2);
        btnChapter12_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter12_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter13_1 = (Button) findViewById(R.id.btnChapter13_1);
        btnChapter13_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter13_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter13_2 = (Button) findViewById(R.id.btnChapter13_2);
        btnChapter13_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter13_2.class);
                startActivity(intent);
            }
        });

        Button btnChapter14_1 = (Button) findViewById(R.id.btnChapter14_1);
        btnChapter14_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter14_1.class);
                startActivity(intent);
            }
        });

        Button btnChapter14_2 = (Button) findViewById(R.id.btnChapter14_2);
        btnChapter14_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter14_2.class);
                startActivity(intent);
            }
        });

        Button btnChapter14_3 = (Button) findViewById(R.id.btnChapter14_3);
        btnChapter14_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Chapter14_3.class);
                startActivity(intent);
            }
        });

    }
}