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
    }
}