package com.sdh.intentputdata2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("명화 선호도 투표");

        //  별점 0점으로 초기화
        final int voteCount[] = new int[9];
        for (int i = 0; i < 9; i++)
            voteCount[i] = 0;

        ImageView image[] = new ImageView[9];
        Integer imageId[] = { R.id.iv1, R.id.iv2, R.id.iv3, R.id.iv4, R.id.iv5, R.id.iv6, R.id.iv7, R.id.iv8, R.id.iv9 };
        final String imgName[] = { "독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느강 단 베르양", "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들", "해변에서", };

        // n번재 이미지가 클릭되었을 때 별점을 올린다.
        for (int i = 0; i < imageId.length; i++) {
            final int index;
            index = i;
            image[index] = (ImageView) findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(), imgName[index] + ": 총" + voteCount[index] + " 표", Toast.LENGTH_SHORT).show();
                }
            });
        }

        // 투표 종료 버튼을 눌렀을 때 ResultActivity로 이동
        // 투표 수와 이미지 이름을 intent로 넘김
       Button btnFinish = (Button) findViewById(R.id.btnResult);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.putExtra("VoteCount", voteCount);
                intent.putExtra("ImageName", imgName);
                startActivity(intent);
            }
        });
    }
}