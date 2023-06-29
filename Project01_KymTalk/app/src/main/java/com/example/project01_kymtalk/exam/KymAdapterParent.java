package com.example.project01_kymtalk.exam;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class KymAdapterParent  {

    public abstract static class KymAdapter<KVH extends KymViewHolder>{
        public abstract KVH onCreateViewHolder(@NonNull ViewGroup parent , int viewType);
        public abstract void onBindViewHolder(KVH vh);
        public abstract int getItemCount();

    }



    public abstract static class KymViewHolder{
        // 디자인 파일을 묶어놓은 객체 ====> View
        @NonNull
        final View view ; // 상수의 규칙 ( 1. 상수를 선언과 동시에 값할당==> 초기화해놓는방법 )
                         //                2. 생성자를 이용해서 초기화 하는 방법

        public KymViewHolder(@NonNull View view) {
            this.view = view;
        }
    }

}
