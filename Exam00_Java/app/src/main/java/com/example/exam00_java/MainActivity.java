package com.example.exam00_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // getSum이라는 메소드 만들기. ( 숫자 두개(아무거나)를 입력받아서 두 수의 합을 구하는 메소드이다 )
    TextView tv1;
    Button btn1 , btn_start , btn_stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);
        btn_start = findViewById(R.id.btn_start);
        btn_stop = findViewById(R.id.btn_stop);
        // CacrDAO에 있는 getSum메소드 호출해서 텍스트뷰 글자바뀌게 해보기.
        ClacDAO dao = new ClacDAO();


        dao.num1 = 1;
        dao.num2 = 1;
        //dao.num3 = 1; //private으로 외부에서 접근을 x
        dao.num4 = 2;
        ClacDAO.num5 = 5;
        //ClacDAO.num6 = 6;//private으로 막아져있음.
        ClacDAO.num7 = 7;


        ClacDAO.ChildClass cc = dao.new ChildClass();
        cc.fieldChild = 9;
        ClacDAO.StaticChildClass scc = new ClacDAO.StaticChildClass();
        //dao.getSum(1 , 2 , tv1);
        //dao.getSum(1 , 2 , btn1);//?
        //tv1.setText(dao.getSum(1,2)+"");
        //btn1.setText(dao.getSum(1,2)+"");

        //getSum(1 , 2);//메소드가 구현(정의)되어있는 파라메터부 = 호출부의 파라메터 값을 합치면 변수 초기화식이된다.
        // int num1 = 1 , int num2 = 2 ↑
        //TextView tv1 =
        //메소드를 호출하고 안드로이드 기기를 실행해보기.
        KymCallback callback = new KymCallback() {
            @Override
            public void onResponse(String data) {
                Log.d("성공", "onResponse: ");
            }

            @Override
            public void onFailure(String data) {
                Log.d("실패", "onResponse: ");
            }
        };

        callback.onResponse("성공");
        callback.onFailure("실패");
    }

    //메소드는 구현이 자유롭다.
    //실행은 항상 사용하는곳에서 호출을 해줘야지만 됨.
   public interface KymCallback{
        public void onResponse(String data);
        public void onFailure(String data);
    }

}