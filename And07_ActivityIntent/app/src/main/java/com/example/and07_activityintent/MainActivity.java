package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "수명주기";
    // 현재는 onCreate내부에서만 코드처리를 해도 무방함.
    // 추후에 여러 화면이나 Spring연동 시 새로고침 등의 처리가 필요할때는 수명주기가 있다는것을 생각하고 ,적절한 수명주기를 이용하자.

    // 안드로이드도 Spring과 마찬가지로 Debugging을 잘하면 오류찾는게 빠르다. ( 디버깅모드를 한번씩 연습해보는 습관을 들이면 좋음 )
    Button btn_phone , btn_sms , btn_search;
    EditText edt_phone , edt_sms , edt_search;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        Intent intent = getIntent();// 방금 LoginActivity에서 startActivity( ' intent ' ) 사용된 intent를 가져옴. ( 내부에 넣어둔(putExtra) 데이터를 빼오기 위해서 )

        String strValue = intent.getStringExtra("strkey");
        int intValue = intent.getIntExtra("intKey" , -1);
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dtokey");//객체의 타입을 주고 강제로 바꾸는것==>역직렬화 ==> 내부에있는 멤버를 사용하기위해 Serializable=>dto
        // name으로 값을 찾았을때 없다면 , 기본값을 어떤걸로할껀지defaultValue

        // int값 받아보기.
        Log.d(TAG, "onCreate: " + strValue);
        Log.d(TAG, "onCreate: " + intValue);
        Log.d(TAG, "onCreate: " + dto.getId());

        ArrayList<LoginDTO> list = (ArrayList<LoginDTO>) intent.getSerializableExtra("list");

        Log.d(TAG, "onCreate: " + list.size());

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");

        btn_phone = findViewById(R.id.btn_phone);
        btn_sms = findViewById(R.id.btn_sms);
        btn_search = findViewById(R.id.btn_serach);
        edt_phone = findViewById(R.id.edt_phone);
        edt_sms = findViewById(R.id.edt_sms);
        edt_search = findViewById(R.id.edt_search);

        //lamda 인터페이스를 파라메터로 넘겨야할때 함수로 메소드 지역만 만들어냄. this를 써보면 new와 함수형 lamda식을 알수있음.
        // 주의사항. 람다식에서 인테페이스를 함수형으로 쓸때 인터페이스 내부에는 메소드가 반드시 하나여야만함.
        // 명시적 : activity => activity.class 이동 시 많이 사용.
        // 암시적,묵시적 : activity => action(내가 없는 기능)사용할때씀.
        btn_phone.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL ,
                    Uri.parse("tel:/" + edt_phone.getText().toString())
                    );
            startActivity(intent);
        });

        btn_search.setOnClickListener(this);
        btn_sms.setOnClickListener(this);
    }//on

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_serach){
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY , edt_search.getText().toString());
            startActivity(intent);

        }else if(v.getId() == R.id.btn_sms ){
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse( "smsto:" + Uri.encode("010-1234-5678")) );
            intent.putExtra("sms_body" , edt_sms.getText().toString());
            startActivity(intent);
            // 암시적 인텐트나 명시적 인텐트를 사용해서 통신 후 다시 결과를 받아와야하는 상황에 쓰는 것들이 있음. ActivityLauncher , startActivityForResult
            //현재는 사용할경우가 없기때문에 pass.
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }



}