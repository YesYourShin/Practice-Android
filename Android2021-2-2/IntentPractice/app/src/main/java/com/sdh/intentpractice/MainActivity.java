package com.sdh.intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 메인에서 세컨드 액티비티를 호출
        RadioButton rdoSecond = (RadioButton) findViewById(R.id.rdoSecond);
        RadioButton rdoThird = (RadioButton) findViewById(R.id.rdoThird);
        Button btnNewActivity = (Button) findViewById(R.id.btnNewActivity);

        btnNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent ;

                if (rdoSecond.isChecked()==true)
                    intent = new Intent(getApplicationContext(), SecondActivity.class);
                else
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);

                startActivity(intent);
            }
        });
    }
}