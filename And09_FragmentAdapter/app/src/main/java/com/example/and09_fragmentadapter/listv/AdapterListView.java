package com.example.and09_fragmentadapter.listv;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.and09_fragmentadapter.R;

import java.util.ArrayList;

// class 상속 : BaseAdapter라는 Class
public class AdapterListView extends BaseAdapter {
    // 어댑터는 일반 클래스 + 기능이 있는정도 ( 반드시 화면에 보인다는 맥락이없음 ==> LayoutInflater , Toast 등의 기능 제한 )
    // 어댑터는 LayoutInflater가 기본적으로 필요한데 , 해당하는 객체를 상위(나를 사용하는 지역)에서 받아 와야한다.
    LayoutInflater inflater;
    ArrayList<ListDTO> list;

    public AdapterListView(LayoutInflater inflater, ArrayList<ListDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    // 몇개의 아이템이 반복되는지의 반복횟수 즉 , 총 리스트의 개수
    @Override
    public int getCount() {
        return list.size();
    }

    // 목록을 보여줄때 사용 된 Object(DTO)가 있다면 해당하는 DTO를 리턴하기위한 메소드.
    @Override
    public Object getItem(int position) {
        return position;
    }

    // 아이템을 유일하게 식별할수있는 값인데 position자체가 유일하기때문에 그대로 return부를 바꿔준다.
    @Override
    public long getItemId(int position) {
        return position;
    }

    // LayoutInflater를 이용해서 칸마다의 아이템을 붙이는 처리를 해줘야함.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.item_listview , parent , false);
        ImageView img_profile = convertView.findViewById(R.id.imgv_profile);
        img_profile.setImageResource(list.get(position).getImgRes());

        return convertView;
    }
}
