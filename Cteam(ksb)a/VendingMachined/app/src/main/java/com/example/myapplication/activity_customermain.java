package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class activity_customermain extends AppCompatActivity {
    private ImageButton imgb_ad_1,imgb_ad_2,imgb_ad_3,imgb_ad_4,imgb_ad_after,getImgb_ad_before;
    private Button btn_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customermain);

        btn_type= findViewById(R.id.btn_type);
        btn_type.setOnClickListener(v -> {
            //PopupMenu popupMenu = new PopupMenu(activity_customermain.this, button);
        });


    }
}