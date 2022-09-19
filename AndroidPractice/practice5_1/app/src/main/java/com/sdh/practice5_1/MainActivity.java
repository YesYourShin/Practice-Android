package com.sdh.practice5_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_practice5_1);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
//        baseLayout.setBackgroundColor(Color.rgb(0, 255, 0));
        setContentView(baseLayout, params);

        EditText et = new EditText(this);
        Button btn = new Button(this);
        TextView tv = new TextView(this);
        btn.setText("버튼입니다");
        btn.setBackgroundColor(Color.rgb(255, 255, 0));
        btn.setTextColor(Color.rgb(0,0,0));
        baseLayout.addView(et);
        baseLayout.addView(btn);
        baseLayout.addView(tv);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                tv.setText(et.getText().toString());
            }
        });

    }
}