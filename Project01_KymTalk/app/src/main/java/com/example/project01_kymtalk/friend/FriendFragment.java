package com.example.project01_kymtalk.friend;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_kymtalk.MainActivity;
import com.example.project01_kymtalk.R;
import com.example.project01_kymtalk.databinding.FragmentFriendBinding;

import java.util.ArrayList;


public class FriendFragment extends Fragment {
    FragmentFriendBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFriendBinding.inflate(inflater , container , false);

        binding.recvFriend.setAdapter(new FriendAdapter(getList() , getContext() ));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));
        MainActivity activity = (MainActivity) getActivity();
        //Intent intent = new Intent(getContext() , MainActivity.class);
        //startActivity(intent);
        return binding.getRoot();
    }
    public ArrayList<FriendDTO> getList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.friend_img1 , "김이름" , "상쾌하구나"));
        list.add(new FriendDTO(R.drawable.friend_img2 , "이이름" , ""));
        list.add(new FriendDTO(R.drawable.friend_img3 , "박이름" , "웃으며 살자"));
        list.add(new FriendDTO(R.drawable.friend_img4 , "장이름" , "웃읍니다"));
        list.add(new FriendDTO(R.drawable.friend_img5 , "강이름" , ""));
        list.add(new FriendDTO(R.drawable.friend_img6 , "고이름" , "🙋‍♂️"));
        list.add(new FriendDTO(R.drawable.friend_img7 , "조이름" , ""));
        list.add(new FriendDTO(R.drawable.friend_img8 , "송이름" , "여행중"));
        return list;
    }
}