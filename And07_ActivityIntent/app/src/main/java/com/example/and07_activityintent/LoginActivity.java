package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    EditText edt_id , edt_pw;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt_id = findViewById(R.id.edt_id);
        edt_pw = findViewById(R.id.edt_pw);
        btn_login = findViewById(R.id.btn_login);

        // editText에 있는 글자를 가져오는 메소드 : editText.getText() 입니다. ※ getText메소드가 리턴해주는 타입은 뭘까? ※
        // id가 admin 비밀번호가 admin1234 일때 다음 화면으로 이동.
        // 그 외에는 Toast를 이용해서 아이디 또는 비밀번호 틀림이라고 메세지 띄우기.



        btn_login.setOnClickListener(new View.OnClickListener() { // 인터페이스를 new로 생성하면 메소드가 반드시 있어야해서 익명의 클래스 지역을 만든다.
            @Override
            public void onClick(View v) {

                //Intent를 이용하면 화면 전환 => Intent객체 ( 안드로이드의 4대 컴포넌트의 통신을 담당 ) Act=>'Intent'=>Act
                // Context (맥락 , 상태정보 확인 ) : 현재 화면에 떠있는 객체인지 ?
                // ex) DAO , DTO , VO => 화면에 떠있는 객체가 아니기때문에 그래픽 작업을 하면 오류가 발생함. => 일반 클래스
                // ex) ↑ Act , Fragment => 화면에 떠있는 객체이기떄문에 그래픽 작업을 할수있음. 하지만 화면에 떠있는지의 상태를 알려줄수있는게 필요함==>Context
                // => 일반클래스에서도 그래픽처리가 가능하게 만드려면 Activity가 Context라는것을 파라메터로 보내줬을때. 가능함.
                if(edt_id.getText().toString().equals("admin")  && edt_pw.getText().toString().equals("admin1234")){
                    Intent intent = new Intent(LoginActivity.this , MainActivity.class);
                    intent.putExtra("strkey" , edt_id.getText().toString()+" intent");
                    intent.putExtra("intkey" , 10);

                    LoginDTO dto = new LoginDTO(edt_id.getText().toString() + "1"  , edt_pw.getText().toString() + "1");
                    intent.putExtra("dtokey" , dto);

                    ArrayList<LoginDTO> list = new ArrayList<>();// 초기화 식 . LoginDTO타입을 묶어놓을 공간마련.

                    list.add(new LoginDTO("a1" , "b1"));
                    list.add(new LoginDTO("a2" , "b2"));
                    list.add(new LoginDTO("a3" , "b3"));
                    list.add(new LoginDTO("a4" , "b4"));
                    list.add(new LoginDTO("a5" , "b5"));


                    // LoginDTO를 5개 아무데이터나 넣고 묶은 ArrayList만들어보기.


                    // intKey 숫자를 다음액티비티로 전송해보기 ( int )
                    intent.putExtra("list",list); // startActivity메소드 실행 전 데이터 담는 처리를 끝낸다.
                    startActivity(intent);
                    //intent.putExtra("list",list);// 전달 불가.
                }else{
                    Toast.makeText(LoginActivity.this, "아이디 또는 비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show();
                }



              
            }
        });

    }
    public class KymVO implements Serializable{

    }

    public class KymClass2 implements Serializable {

    }

    public void method(Serializable k){
        // 역직렬화 : KymClass k2 = (KymClass) k;
    }



}