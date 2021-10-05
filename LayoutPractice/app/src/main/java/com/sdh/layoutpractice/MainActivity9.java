package com.sdh.layoutpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {

    ImageView img_p1, img_p2, img_p3, img_p4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        img_p1=(ImageView) findViewById(R.id.img_p1);
        img_p2=(ImageView) findViewById(R.id.img_p2);
        img_p3=(ImageView) findViewById(R.id.img_p3);
        img_p4=(ImageView) findViewById(R.id.img_p4);

        img_p2.setVisibility(View.INVISIBLE);
        img_p3.setVisibility(View.INVISIBLE);
        img_p4.setVisibility(View.INVISIBLE);

    }

    public void onClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_page1 :
                img_p1.setVisibility(View.VISIBLE);
                img_p2.setVisibility(View.INVISIBLE);
                img_p3.setVisibility(View.INVISIBLE);
                img_p4.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_page2 :
                img_p2.setVisibility(View.VISIBLE);
                img_p1.setVisibility(View.INVISIBLE);
                img_p3.setVisibility(View.INVISIBLE);
                img_p4.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_page3 :
                img_p3.setVisibility(View.VISIBLE);
                img_p1.setVisibility(View.INVISIBLE);
                img_p2.setVisibility(View.INVISIBLE);
                img_p4.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_page4 :
                img_p4.setVisibility(View.VISIBLE);
                img_p1.setVisibility(View.INVISIBLE);
                img_p3.setVisibility(View.INVISIBLE);
                img_p2.setVisibility(View.INVISIBLE);
                break;
        }
    }
}