package com.sdh.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("deprecation")
public class Chapter10_3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter10_3_2);
        setTitle("Second 액티비티");

        //★ 입력하기, 메인액티비티로부터 받은 두 값을 더한다

        Intent inIntent = getIntent();
        String calc = (inIntent.getStringExtra("Calc"));

        int calValue = 0;
        if(calc.equals("+")) {
            calValue = inIntent.getIntExtra("Num1", 0) + inIntent.getIntExtra("Num2", 0);
        } else if(calc.equals("-")) {
            calValue = inIntent.getIntExtra("Num1", 0) - inIntent.getIntExtra("Num2", 0);
        } else if(calc.equals("*")) {
            calValue = inIntent.getIntExtra("Num1", 0) * inIntent.getIntExtra("Num2", 0);
        } else if(calc.equals("/")) {
            calValue = inIntent.getIntExtra("Num1", 0) / inIntent.getIntExtra("Num2", 0);
        }
        final int refValue = calValue;

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //★ 입력하기, 인텐트를 생성하고 더한 값을 넣어 , setResult()로 메인 액티비티로 돌려준다.
                Intent outIntent = new Intent(getApplicationContext(), MainActivity.class);
                outIntent.putExtra("Hap", refValue);
                setResult(RESULT_OK, outIntent);
                finish();

            }
        });
    }
}