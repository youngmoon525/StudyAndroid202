package com.example.project01_kymtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemOpentalk1Recv2Binding;
import com.example.project01_kymtalk.databinding.ItemOpentalk1Recv3Binding;

import java.util.ArrayList;

public class OpenSub1Adapter3 extends RecyclerView.Adapter<OpenSub1Adapter3.ViewHolder> {
    ItemOpentalk1Recv3Binding binding;
    ArrayList<OpenSubDTOs.OpenSub3DTO> list;

    public OpenSub1Adapter3(ArrayList<OpenSubDTOs.OpenSub3DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOpentalk1Recv3Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return  new ViewHolder( binding );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        binding.imgvProfile1.setImageResource(list.get(position).getItem1().getImgTitle());
        binding.imgvProfile2.setImageResource(list.get(position).getItem2().getImgTitle());
        binding.imgvProfile3.setImageResource(list.get(position).getItem3().getImgTitle());
        binding.imgvBackground.setImageResource(list.get(position).getItem1().getImgTitle());
        binding.tvChattitle1.setText(list.get(position).getItem1().getChatPeopleCnt()+"명");
        binding.tvChattitle2.setText(list.get(position).getItem2().getChatPeopleCnt()+"명");
        binding.tvChattitle3.setText(list.get(position).getItem3().getChatPeopleCnt()+"명");
        binding.tvRoomname1.setText(list.get(position).getItem1().getRoomName());
        binding.tvRoomname2.setText(list.get(position).getItem2().getRoomName());
        binding.tvRoomname3.setText(list.get(position).getItem3().getRoomName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalk1Recv3Binding binding;
        public ViewHolder(@NonNull ItemOpentalk1Recv3Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
