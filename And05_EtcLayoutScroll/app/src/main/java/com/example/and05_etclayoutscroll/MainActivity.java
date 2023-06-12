package com.example.and05_etclayoutscroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 초기화식이 조금 생소함 :

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//액티비티에서만 사용함.




        Log.d("tv_text ", "onCreate: " + R.id.tv_text);
        //TextView tv_textNew = new TextView(this);
        //static키워드가 있어서 초기화 과정 없이 사용가능 . KymClass.ATTR
        //static키워드가 없어서 초기화를 시켜야만 사용가능 .new KymClass().append("초기화해야지 사용가능");

        TextView tv_text = findViewById(R.id.tv_text);// 내가 레이아웃(activity_main)에 만든 위젯을 찾아서 java코드 변수로 초기화
        // TextView.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR // <= Static Member : 클래스가 인스턴스화 하지 않아도 메모리에 이미 올라가있는 멤버
        // tv_text.append();// <= Member // <= Instence Member : 클래스가 인스턴스화 해야지만 메모리에 로딩되는 멤버
        tv_text.append("안녕하세요2");

        Button btn_scroll = findViewById(R.id.btn_scroll);
        ScrollView scrollView = findViewById(R.id.scrollview);
        HorizontalScrollView horizon_scroll = findViewById(R.id.horizon_scroll);

       // while (true) { <=무한 반복하기때문에 사용자가 눈으로 볼수가없음. (계속해서 append)
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 20; j++) {
                tv_text.append("안녕하세요");
            }
            tv_text.append("안녕하세요"+ i + "\n");
        }

        btn_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("스크롤 위치 ", "getScollY: " + scrollView.getScrollY());
                scrollView.scrollTo(0,scrollView.getScrollY()+100);
                horizon_scroll.smoothScrollTo(horizon_scroll.getScrollX()+100 , 0);
            }
        });


      //  }


    }
}