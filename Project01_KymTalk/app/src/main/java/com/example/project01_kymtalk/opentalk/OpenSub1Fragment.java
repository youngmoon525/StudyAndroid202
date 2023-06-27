package com.example.project01_kymtalk.opentalk;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.project01_kymtalk.R;
import com.example.project01_kymtalk.databinding.FragmentOpenSub1Binding;
import com.google.android.material.chip.Chip;


public class OpenSub1Fragment extends Fragment {

    FragmentOpenSub1Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenSub1Binding.inflate(inflater,container,false);
        //binding.recv1Opensub1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        binding.recv1Opensub1.setAdapter(new OpenSub1Adapter1());
        binding.recv2Opensub1.setAdapter(new OpenSub1Adapter2());
        binding.recv3Opensub1.setAdapter(new OpenSub1Adapter3());
        binding.recv4Opensub1.setAdapter(new OpenSub1Adapter2());
        binding.recv5Opensub1.setAdapter(new OpenSub1Adapter3());
        binding.recv6Opensub1.setAdapter(new OpenSub1Adapter2());
        binding.recv7Opensub1.setAdapter(new OpenSub1Adapter3());

        binding.recv1Opensub1.setLayoutManager(getManager(LinearLayout.VERTICAL));
        binding.recv2Opensub1.setLayoutManager(getManager(LinearLayout.HORIZONTAL));
        binding.recv3Opensub1.setLayoutManager(getManager(LinearLayout.HORIZONTAL));
        binding.recv4Opensub1.setLayoutManager(getManager(LinearLayout.HORIZONTAL));
        binding.recv5Opensub1.setLayoutManager(getManager(LinearLayout.HORIZONTAL));
        binding.recv6Opensub1.setLayoutManager(getManager(LinearLayout.HORIZONTAL));
        binding.recv7Opensub1.setLayoutManager(getManager(LinearLayout.HORIZONTAL));

        String[] chipTexts = { "프로배구" , "스팀덱" , "그림방" , "초성퀴즈" , "음악추천" , "배드민턴" , "자기계발" , "수능수학","햄스터"};

        for (int i = 0; i < chipTexts.length; i++) {
            binding.chipGrpOpensub1.addView(getChip(chipTexts[i]),new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        }

        return binding.getRoot();
    }
    Chip getChip(String chipText){
        Chip chip = new Chip(getContext() , null , com.google.android.material.R.style.Widget_MaterialComponents_Chip_Choice);
        chip.setText(chipText);
        chip.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        chip.setTextColor(R.drawable.chip_opentalk_forecolor);
        chip.setCloseIconVisible(true);


        return chip;
    }

    RecyclerView.LayoutManager getManager(int orientation){
        LinearLayoutManager manager = null;
        if(orientation == LinearLayout.HORIZONTAL){
            manager = new LinearLayoutManager(getContext() , LinearLayoutManager.HORIZONTAL , false);
        }else if(orientation == LinearLayout.VERTICAL){
            manager = new LinearLayoutManager(getContext());
        }else{
            manager = new LinearLayoutManager(getContext());
        }return  manager;
    }
}