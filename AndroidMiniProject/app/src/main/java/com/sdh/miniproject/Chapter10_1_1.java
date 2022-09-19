package com.sdh.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Chapter10_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10_1_1);

        RadioButton rdoSecond = (RadioButton) findViewById(R.id.rdoSecond);
        RadioButton rdoThird = (RadioButton) findViewById(R.id.rdoThird);
        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent ;

                if (rdoSecond.isChecked()==true)
                    intent = new Intent(getApplicationContext(), Chapter10_1_2.class);
                else
                    intent = new Intent(getApplicationContext(), Chapter10_1_3.class);

                startActivity(intent);
            }
        });

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}