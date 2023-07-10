package com.example.and00_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
    // 메소드 100 점 => 리턴타입이 있는 메소드를 구현 , 호출을 자유롭게 하고 사용하는 이유를 명확히 알고있다.
    // 클래스 100 점 => 클래스 내부에 있는 멤버의 접근과 각각의 멤버를 구분하고 자유롭게 커스텀할수있다.(변형)
    // 인터페이스 100 점=> 인터페이스의 규칙을 명확히 알고 자유롭게 구현하여 사용할수있다.
    //

    // editext사용자가 어떤걸입력함. 입력을 마치고 , 로그인 버튼을 누름=>전송
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edt_id = findViewById(R.id.edt_id);
        EditText edt_pw = findViewById(R.id.edt_pw);
        Button btn_login = findViewById(R.id.btn_login);

        CommonConn.KymCallBack callBack = new CommonConn.KymCallBack() {
            @Override
            public void onResult(boolean isResult, String data) {
                Log.d("결과", "onResult: " + data);
            }
        };//<= @메모리번지수를 참조하는 인터페이스를 초기화함. ( 내부에는 메소드가 반드시있음. )
        Log.d("콜백", "콜백(인터페이스의 메모리): " + callBack);
        btn_login.setOnClickListener(v->{
           CommonConn conn = new CommonConn(this , "member/login");
           conn.addParamMap("id", edt_id.getText().toString());
           conn.addParamMap("pw", edt_pw.getText().toString());
           conn.onExcute(new CommonConn.KymCallBack() {
               @Override
               public void onResult(boolean isResult, String data) {
                   Log.d("결과", "onResult: " + data);
               }
           }); // onExcute 메소드가 실행되면 일단 Spring으로 전송처리는 정상적으로 작동한다. ( 결과를 가져오려면 어떻게 해야할까? )
        });
        TestVO vo = new TestVO();//메모리 번지수에 TestVo를 올림 @20315
        vo.str = "111";//@20315 내부의 str변수를 "111"로 값을 할당함.
        testMethod(vo);//<=@20315
        Log.d("aaa", "onCreate: " +vo.str);//<=@20315는 "222"

        callBack.onResult(true , "값을 넘김");//외부에서 이코드를 쓸수있게해줌.



    }
    public class TestVO{
        String str ;
    }
    public void testMethod(TestVO vo){
        vo.str="222";//<=@20315 내부의 str변수를 "222"로 값 재할당.
    }

    //올바른 방법아니여서 한번 확인하고 지울꺼임./
//    public static void test(String data){
//        Log.d("결과 : ", "onCreate: ↑ "  + data);
//    }

}