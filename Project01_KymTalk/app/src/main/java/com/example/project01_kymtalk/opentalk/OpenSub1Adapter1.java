package com.example.project01_kymtalk.opentalk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemOpentalk1ChatBinding;

import java.util.ArrayList;

public class OpenSub1Adapter1  extends RecyclerView.Adapter<OpenSub1Adapter1.ViewHolder> {
    ItemOpentalk1ChatBinding binding;
    ArrayList<OpenSubDTOs.OpenSub1DTO> list;

    public OpenSub1Adapter1(ArrayList<OpenSubDTOs.OpenSub1DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOpentalk1ChatBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return  new ViewHolder( binding );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.imgvTitle.setImageResource(list.get(position).getImgTitle());
        holder.binding.tvRoomname.setText(list.get(position).getRoomName());
        holder.binding.tvChatdate.setText(list.get(position).getChatDate());
        holder.binding.tvChatpeoplecnt.setText(list.get(position).getChatPeopleCnt()+"");
        holder.binding.tvChattitle.setText(list.get(position).getChatTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalk1ChatBinding binding;
        public ViewHolder(@NonNull ItemOpentalk1ChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
