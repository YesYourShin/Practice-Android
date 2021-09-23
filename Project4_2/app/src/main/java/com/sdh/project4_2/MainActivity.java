package com.sdh.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton Rdo1, Rdo2, Rdo3;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        chkAgree = (CheckBox) findViewById(R.id.chkAgree);

        rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        Rdo1 = (RadioButton) findViewById(R.id.Rdo1);
        Rdo2 = (RadioButton) findViewById(R.id.Rdo2);
        Rdo3 = (RadioButton) findViewById(R.id.Rdo3);

        imgPet = (ImageView) findViewById(R.id.imgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked() == true) {
                    text2.setVisibility(android.view.View.VISIBLE);
                    rGroup1.setVisibility(android.view.View.VISIBLE);
                    imgPet.setVisibility(android.view.View.VISIBLE);
                }else{
                    text2.setVisibility(android.view.View.INVISIBLE);
                    rGroup1.setVisibility(android.view.View.INVISIBLE);
                    imgPet.setVisibility(android.view.View.INVISIBLE);
                }

            }
        });

        Rdo1.setOnClickListener(radio_listener);
        Rdo2.setOnClickListener(radio_listener);
        Rdo3.setOnClickListener(radio_listener);

    }

    View.OnClickListener radio_listener = new View.OnClickListener() {
        public void onClick(View arg0) {
            switch (rGroup1.getCheckedRadioButtonId()) {
                case R.id.Rdo1 :
                    imgPet.setImageResource(R.drawable.pie);
                    break;
                case R.id.Rdo2 :
                    imgPet.setImageResource(R.drawable.q10);
                    break;
                case R.id.Rdo3 :
                    imgPet.setImageResource(R.drawable.r11);
                    break;
                default:
                    Toast.makeText(getApplicationContext(),
                            "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
            }
        }
    };
}