package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdminActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_cola, tv_cider, tv_fanta, tv_soda;
    int colaCnt, ciderCnt, fantaCnt, sodaCnt;
    Button btn_cola,btn_cider,btn_fanta,btn_soda,btn_corrected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);



        tv_cola = findViewById(R.id.tv_cola);
        tv_cider = findViewById(R.id.tv_cider);
        tv_fanta = findViewById(R.id.tv_fanta);
        tv_soda = findViewById(R.id.tv_soda);

        btn_cola=findViewById(R.id.btn_cola);
        btn_cider=findViewById(R.id.btn_cider);
        btn_fanta=findViewById(R.id.btn_fanta);
        btn_soda=findViewById(R.id.btn_soda);
        btn_corrected=findViewById(R.id.btn_corrected);

        btn_cola.setOnClickListener(this);
        btn_cider.setOnClickListener(this);
        btn_fanta.setOnClickListener(this);
        btn_soda.setOnClickListener(this);
        btn_corrected.setOnClickListener(this);

        Intent intent = getIntent();


        colaCnt = intent.getIntExtra("colacnt",-1);
        ciderCnt = intent.getIntExtra("cidercnt",-1);
        fantaCnt = intent.getIntExtra("fantacnt",-1);
        sodaCnt = intent.getIntExtra("sodacnt",-1);

        tv_cola.setText("현재 수량: " + intent.getIntExtra("colacnt", colaCnt) +"개");
        tv_cider.setText("현재 수량: " + intent.getIntExtra("cidercnt", ciderCnt) +"개");
        tv_fanta.setText("현재 수량: " + intent.getIntExtra("fantacnt", fantaCnt) +"개");
        tv_soda.setText("현재 수량: " + intent.getIntExtra("sodacnt", sodaCnt) +"개");


    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_cola){


            Intent intent = new Intent(AdminActivity.this, ModifyActivity.class);
            intent.putExtra("colacnt", colaCnt);
            intent.putExtra("cidercnt",ciderCnt);
            intent.putExtra("fantacnt",fantaCnt);
            intent.putExtra("sodacnt",sodaCnt);
            intent.putExtra("colaTrue",true);
            startActivity(intent);
        }
        else if (v.getId()==R.id.btn_cider){


            Intent intent = new Intent(AdminActivity.this, ModifyActivity.class);
            intent.putExtra("colacnt", colaCnt);
            intent.putExtra("cidercnt",ciderCnt);
            intent.putExtra("fantacnt",fantaCnt);
            intent.putExtra("sodacnt",sodaCnt);
            intent.putExtra("ciderTrue",true);
            startActivity(intent);
        }


        else if (v.getId()==R.id.btn_fanta){


            Intent intent = new Intent(AdminActivity.this, ModifyActivity.class);
            intent.putExtra("colacnt", colaCnt);
            intent.putExtra("cidercnt",ciderCnt);
            intent.putExtra("fantacnt",fantaCnt);
            intent.putExtra("sodacnt",sodaCnt);
            intent.putExtra("fantaTrue",true);
            startActivity(intent);
        }

        else if (v.getId()==R.id.btn_soda){


            Intent intent = new Intent(AdminActivity.this, ModifyActivity.class);
            intent.putExtra("colacnt", colaCnt);
            intent.putExtra("cidercnt",ciderCnt);
            intent.putExtra("fantacnt",fantaCnt);
            intent.putExtra("sodacnt",sodaCnt);
            intent.putExtra("sodaTrue",true);
            startActivity(intent);
        }

        else if(v.getId() == R.id.btn_corrected){

            Intent intent = new Intent(AdminActivity.this, MainActivity.class);
            intent.putExtra("colacnt", colaCnt);
            intent.putExtra("cidercnt",ciderCnt);
            intent.putExtra("fantacnt",fantaCnt);
            intent.putExtra("sodacnt",sodaCnt);

            startActivity(intent);
        }
    }
}