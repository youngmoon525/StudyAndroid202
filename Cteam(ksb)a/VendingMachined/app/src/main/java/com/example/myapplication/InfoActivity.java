package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

        Button btn_back1;
        TextView txt_id, txt_name, txt_age, txt_money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent intent = getIntent();
        LoginDTO dto = (LoginDTO) intent.getSerializableExtra("dto");

        btn_back1 = findViewById(R.id.btn_back1);

        txt_id = findViewById(R.id.txt_id);
        txt_name = findViewById(R.id.txt_name);
        txt_age = findViewById(R.id.txt_age);
        txt_money = findViewById(R.id.txt_money);


        txt_id.setText(dto.getId());
        txt_name.setText(dto.getName());
        txt_age.setText(dto.getAge());
        txt_money.setText(LoginActivity.dto.getMoney()+"원");





        btn_back1.setOnClickListener(v -> {
            Intent intent1 = new Intent(this, MainActivity.class);
            intent1.putExtra("dto",dto);
            startActivity(intent1);
        });




    }
}