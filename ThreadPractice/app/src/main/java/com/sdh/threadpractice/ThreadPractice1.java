package com.sdh.threadpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ThreadPractice1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_practice1);

        final ProgressBar pb1, pb2;
        final Button btn;
        pb1 = (ProgressBar) findViewById(R.id.pb1);
        pb2 = (ProgressBar) findViewById(R.id.pb2);
        btn = (Button) findViewById(R.id.button1);

        //★ 입력하기.  btn 클릭시 100번 반복.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread() {
                    public void run() {
                        for (int i = pb1.getProgress(); i < 100; i = i + 2) {
                            pb1.setProgress(pb1.getProgress() + 2);
                            SystemClock.sleep(100);
                        }
                    }
                }.start();

                new Thread() {
                    public void run() {
                        for (int i = 0; i < 100; i++) {
                            pb2.setProgress(pb1.getProgress() + 1);
                            SystemClock.sleep(100);
                        }
                    }
                }.start();
            }
        });
    }
}
