package com.sdh.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;

public class Chapter11_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter11_2);
        setTitle("갤러리 영화 포스터");

        final Gallery gallery = (Gallery) findViewById(R.id.gallery1);
        // ★ 입력하기 MyGridAdapter 변수 생성하여 그리드뷰 gv에 적용한다

        MyGalleryAdapter galAdapter = new MyGalleryAdapter(this);
        gallery.setAdapter(galAdapter);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    // BaseAdapter를 상속 받아 MyGridAdapter를 정의한다
    public class MyGalleryAdapter extends BaseAdapter {
        Context context;

        // 전달받은 this 컨텍스트(activity에 대한 참조)를 생성자로부터 받은 다음 context 변수에 대입
        //  context 변수를 다른 메서드에서도 사용하기 위함
        public MyGalleryAdapter(Context c) {
            context = c;
        }

        Integer[] posterID = {R.drawable.mov01, R.drawable.mov02,
                R.drawable.mov03, R.drawable.mov04, R.drawable.mov05,
                R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
                R.drawable.mov09, R.drawable.mov10, R.drawable.mov01,
                R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
                R.drawable.mov05, R.drawable.mov06, R.drawable.mov07,
                R.drawable.mov08, R.drawable.mov09, R.drawable.mov10,
                R.drawable.mov01, R.drawable.mov02, R.drawable.mov03,
                R.drawable.mov04, R.drawable.mov05, R.drawable.mov06,
                R.drawable.mov07, R.drawable.mov08, R.drawable.mov09,
                R.drawable.mov10};

        // ★ 입력하기.  ctrl + I 를 눌러 BaseAdapter 추상 메서드 자동 완성
        // 핵심은 getCount()와 getView() 메서드.   getView() 메서드 코드 별도 파일 제공됨.

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //영화 포스터의 개수(40개)만큼 반복됨. 영화 포스터를 그리드 뷰의 각 칸마다 보여주는 기능

            //이미지 변수 생성, 이미지뷰(영화포스터) 크기를 200x300 크기로 설정
            ImageView imageview = new ImageView(context);
            imageview.setLayoutParams(new Gallery.LayoutParams(200, 300));

            //이미지 뷰를 각 그리드뷰의 중앙에 배치
            imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageview.setPadding(5, 5, 5, 5);

            //이미지 뷰에 영화 포스터 1개(파라미미터로 넘어온 position 위치 지정
            imageview.setImageResource(posterID[position]);


            //getView 메서드의 파라미터인 position을 클릭 리스너 안에서 사용하기 위해 pos 변수에 대입
            final int pos = position;

            // 각각 영화 포스터 클릭하면 대화상자 나오고 영화 포스터 원래 크기로 보여지도록
            imageview.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View v, MotionEvent event) {
                    ImageView ivPoster = (ImageView) findViewById(R.id.ivPoster);
                    ivPoster.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ivPoster.setImageResource(posterID[pos]);
                    return false;
                }
            });

            return imageview;
        }
    }
}