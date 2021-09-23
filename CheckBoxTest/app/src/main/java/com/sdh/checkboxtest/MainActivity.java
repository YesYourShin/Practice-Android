package com.sdh.checkboxtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
    }
    
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
            if(checked)
                Toast.makeText(getApplicationContext(), ((CheckBox) view).getText()+" 선택", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(getApplicationContext(), ((CheckBox) view).getText()+" 선택 해제", Toast.LENGTH_SHORT).show();
    }


}