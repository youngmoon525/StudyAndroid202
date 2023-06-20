package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    public static LoginDTO dto = null;
    EditText user_id, user_pw;
    Button btn_login, btn_join_member, btn_find_id_pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        user_id = findViewById(R.id.user_id);
        user_pw = findViewById(R.id.user_pw);
        btn_login = findViewById(R.id.btn_login);
        btn_join_member = findViewById(R.id.btn_join_member);
        btn_find_id_pw = findViewById(R.id.btn_find_id_pw);




        ArrayList<LoginDTO> userlist = new ArrayList<>();
        userlist.add(new LoginDTO("admin","admin1234","관리자","500",0));
        userlist.add(new LoginDTO("kim","1234","김수봉","29",0));


        // 로그인 화면
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < userlist.size(); i++) {
                    if (user_id.getText().toString().equals(userlist.get(i).getId())  &&user_pw.getText().toString().equals(userlist.get(i).getPw()))  {
                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                        dto = userlist.get(i);
                        intent.putExtra("dto", userlist.get(i));
                        startActivity(intent);

                        break;
                    }else{
                        Toast.makeText(LoginActivity.this, "아이디 혹은 비밀번호가 틀립니다.", Toast.LENGTH_SHORT).show();
                };
                }

            }
        });



    }


}
