package com.example.test00_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ModifyActivity extends AppCompatActivity {

    int colacnt, cidercnt, fantacnt, sodacnt;
    TextView tv_cnt;
    ImageView colaimg, ciderimg, fantaimg, sodaimg;

    Button btn_plus, btn_minus, btn_corrected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);


        tv_cnt = findViewById(R.id.tv_cnt);


        colaimg = findViewById(R.id.colaimg);
        ciderimg = findViewById(R.id.ciderimg);
        fantaimg = findViewById(R.id.fantaimg);
        sodaimg = findViewById(R.id.sodaimg);

        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_corrected = findViewById(R.id.btn_corrected);

        Intent intent = getIntent();

        colacnt = intent.getIntExtra("colacnt", -1);
        cidercnt = intent.getIntExtra("cidercnt", -1);
        fantacnt = intent.getIntExtra("fantacnt", -1);
        sodacnt = intent.getIntExtra("sodacnt", -1);

        if (intent.getBooleanExtra("colaTrue", false) == true) {
            tv_cnt.setText("수량" + colacnt + "개");
            colaimg.setVisibility(View.VISIBLE);
            ciderimg.setVisibility(View.INVISIBLE);
            fantaimg.setVisibility(View.INVISIBLE);
            sodaimg.setVisibility(View.INVISIBLE);

            btn_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    colacnt++;
                    tv_cnt.setText("수량" + colacnt + "개");
                }
            });


            btn_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (colacnt > 0) {
                        colacnt--;
                        tv_cnt.setText("수량" + colacnt + "개");
                    } else {
                        Toast.makeText(ModifyActivity.this, "0개 미만은 넣을 수 없습니다", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            btn_corrected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ModifyActivity.this, AdminActivity.class);
                    intent.putExtra("colacnt", colacnt);
                    intent.putExtra("cidercnt", cidercnt);
                    intent.putExtra("fantacnt", fantacnt);
                    intent.putExtra("sodacnt", sodacnt);
                    startActivity(intent);
                }
            });

        } else if (intent.getBooleanExtra("ciderTrue", false) == true) {

            tv_cnt.setText("수량" + cidercnt + "개");
            colaimg.setVisibility(View.INVISIBLE);
            ciderimg.setVisibility(View.VISIBLE);
            fantaimg.setVisibility(View.INVISIBLE);
            sodaimg.setVisibility(View.INVISIBLE);
            btn_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cidercnt++;
                    tv_cnt.setText("수량" + cidercnt + "개");
                }
            });


            btn_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (cidercnt > 0) {
                        cidercnt--;
                        tv_cnt.setText("수량" + cidercnt + "개");
                    } else {
                        Toast.makeText(ModifyActivity.this, "0개 미만은 넣을 수 없습니다", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            btn_corrected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ModifyActivity.this, AdminActivity.class);
                    intent.putExtra("colacnt", colacnt);
                    intent.putExtra("cidercnt", cidercnt);
                    intent.putExtra("fantacnt", fantacnt);
                    intent.putExtra("sodacnt", sodacnt);
                    startActivity(intent);
                }
            });

        } else if (intent.getBooleanExtra("fantaTrue", false) == true) {

            tv_cnt.setText("수량" + fantacnt + "개");
            colaimg.setVisibility(View.INVISIBLE);
            ciderimg.setVisibility(View.INVISIBLE);
            fantaimg.setVisibility(View.VISIBLE);
            sodaimg.setVisibility(View.INVISIBLE);

            btn_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fantacnt++;
                    tv_cnt.setText("수량" + fantacnt + "개");
                }
            });


            btn_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (fantacnt > 0) {
                        fantacnt--;
                        tv_cnt.setText("수량" + fantacnt + "개");
                    } else {
                        Toast.makeText(ModifyActivity.this, "0개 미만은 넣을 수 없습니다", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            btn_corrected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ModifyActivity.this, AdminActivity.class);
                    intent.putExtra("colacnt", colacnt);
                    intent.putExtra("cidercnt", cidercnt);
                    intent.putExtra("fantacnt", fantacnt);
                    intent.putExtra("sodacnt", sodacnt);
                    startActivity(intent);
                }
            });


        }



        else if (intent.getBooleanExtra("sodaTrue", false) == true) {

            tv_cnt.setText("수량" + sodacnt + "개");
            colaimg.setVisibility(View.INVISIBLE);
            ciderimg.setVisibility(View.INVISIBLE);
            fantaimg.setVisibility(View.INVISIBLE);
            sodaimg.setVisibility(View.VISIBLE);

            btn_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sodacnt++;
                    tv_cnt.setText("수량" + sodacnt + "개");
                }
            });


            btn_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (sodacnt > 0) {
                        sodacnt--;
                        tv_cnt.setText("수량" + sodacnt + "개");
                    } else {
                        Toast.makeText(ModifyActivity.this, "0개 미만은 넣을 수 없습니다", Toast.LENGTH_SHORT).show();
                    }
                }
            });

            btn_corrected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ModifyActivity.this, AdminActivity.class);
                    intent.putExtra("colacnt", colacnt);
                    intent.putExtra("cidercnt", cidercnt);
                    intent.putExtra("fantacnt", fantacnt);
                    intent.putExtra("sodacnt", sodacnt);
                    startActivity(intent);
                }
            });


        }
    }
}