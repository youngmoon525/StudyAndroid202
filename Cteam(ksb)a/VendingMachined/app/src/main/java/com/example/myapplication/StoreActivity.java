package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.Context;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {
    private Button btn_charge,btn_buy,btn_back,btn_info1;
    private ImageView imgv_main;
    private TextView tv_usermoney,tv_name ,tv_price,tv_explain,tv_type ;

    private EditText edt_chargemoney;

    int money;
    static int usermoney;

    ArrayList<MenuDTO> menu = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        LoginDTO dto = LoginActivity.dto;




        for (int i = 0; i < MenuVal.names.length-1; i++) {
            menu.add(new MenuDTO(MenuVal.names[i], MenuVal.explains[i], MenuVal.types[i],MenuVal.amounts[i],MenuVal.prices[i],MenuVal.src[i]));
        }



        btn_charge = findViewById(R.id.btn_charge);
        btn_buy= findViewById(R.id.btn_buy);
        btn_back=findViewById(R.id.btn_back);
        btn_info1=findViewById(R.id.btn_info1);
        edt_chargemoney =findViewById(R.id.edt_chargeMoney);
        tv_usermoney = findViewById(R.id.tv_userMoney);
        imgv_main=findViewById(R.id.imgv_main);
        tv_name=findViewById(R.id.tv_name);
        tv_price=findViewById(R.id.tv_price);
        tv_explain=findViewById(R.id.tv_explain);
        tv_type=findViewById(R.id.tv_type);

        btn_buy.setVisibility(View.GONE);
        tv_usermoney.setText(usermoney+"원");

        btn_info1.setOnClickListener(v -> {
            Intent intent = new Intent(this,InfoActivity.class );
            intent.putExtra("dto",dto);
            startActivity(intent);
        });

        btn_back.setOnClickListener(v -> {
            Intent intent = new Intent(StoreActivity.this, MainActivity.class);
            /*intent.putExtra("userid",id);
            intent.putExtra("username",name);
            intent.putExtra("userage",age);
            intent.putExtra("usermoney",money);*/
            intent.putExtra("dto",dto);
            startActivity(intent);
        });

        btn_charge.setOnClickListener(v -> {
            try {
                money = Integer.parseInt(edt_chargemoney.getText().toString());
                if(money<0) {
                    Toast.makeText(this, "다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    usermoney += money;
                    LoginActivity.dto.setMoney(usermoney);
                }


            }catch (NumberFormatException e){

            }finally {
                tv_usermoney.setText(usermoney+"원");
                edt_chargemoney.getText().clear();
            }
        });
        Context context = this;

        for (int i = 0; i < menu.size(); i++) {
            LinearLayout llt_img = findViewById(R.id.llt_img);
            ImageView imageView = new ImageView(this);
            final  int idx = i;
            imageView.setOnClickListener(v->{
                //Toast.makeText(context, menu.get(idx).getGoods_name(), Toast.LENGTH_SHORT).show();
                imgv_main.setImageResource((menu.get(idx).getGoods_src()));
                tv_name.setText((menu.get(idx).getGoods_name()));
                if(menu.get(idx).getGoods_name().length()>5)
                    tv_name.setTextSize(17);
                else
                    tv_name.setTextSize(20);
                tv_type.setText(menu.get(idx).getGoods_type());
                tv_price.setText(String.valueOf(menu.get(idx).getGoods_price()));
                tv_explain.setText(((menu.get(idx).getGoods_explain())));

                btn_buy.setVisibility(View.VISIBLE);
                btn_buy.setOnClickListener(v1 -> {

                     if (usermoney >=menu.get(idx).getGoods_price()) {
                        usermoney-=menu.get(idx).getGoods_price();
                        tv_usermoney.setText(usermoney+"원");
                        LoginActivity.dto.setMoney(usermoney);
                    }else {
                        Toast.makeText(this, "현재 잔액이 부족합니다. 충전 후 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                    }
                });
            });
            imageView.setImageResource(menu.get(i).getGoods_src());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(280, 280);
            imageView.setLayoutParams(layoutParams);
            llt_img.addView(imageView);
        }

        for (int i = 0; i < menu.size(); i++) {
            LinearLayout linearLayout = findViewById(R.id.llt_text);
            TextView textView = new TextView(this);
            textView.setLayoutParams(new LinearLayout.LayoutParams(
            0,
            LinearLayout.LayoutParams.WRAP_CONTENT,1));
            textView.setGravity(Gravity.CENTER);
            textView.setText(menu.get(i).getGoods_name());
            if(menu.get(i).getGoods_name().length()>5)
                textView.setTextSize(18);
            else
               textView.setTextSize(20);
            textView.setTypeface(ResourcesCompat.getFont(this, R.font.gamefont));

            // LinearLayout에 TextView 추가
            linearLayout.addView(textView);

        }








    }
}