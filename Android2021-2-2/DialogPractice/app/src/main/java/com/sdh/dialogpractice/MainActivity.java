package com.sdh.dialogpractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                final String[] versionArray = new String[] {"いち", "に", "さん"};
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("제목입니다");
//                dlg.setMessage("이곳이 내용입니다");
                dlg.setIcon(R.mipmap.ic_launcher);
//                dlg.setItems(versionArray, new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        button1.setText(versionArray[i]);
//                    }
//                });
                dlg.setSingleChoiceItems(versionArray, 0,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                button1.setText(versionArray[i]);
                            }
                        });
                dlg.setPositiveButton("戻る", null);
                dlg.show();

//                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this, "확인을 눌렀네요", Toast.LENGTH_SHORT).show();
//                    }
//                });
            }
        });
    }
}