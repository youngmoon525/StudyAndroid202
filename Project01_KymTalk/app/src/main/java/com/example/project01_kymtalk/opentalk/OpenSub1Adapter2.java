package com.example.project01_kymtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemOpentalk1ChatBinding;
import com.example.project01_kymtalk.databinding.ItemOpentalk1Recv2Binding;

import java.util.ArrayList;

public class OpenSub1Adapter2 extends RecyclerView.Adapter<OpenSub1Adapter2.ViewHolder> {
    ItemOpentalk1Recv2Binding binding;
    ArrayList<OpenSubDTOs.OpenSub2DTO> list;

    public OpenSub1Adapter2(ArrayList<OpenSubDTOs.OpenSub2DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOpentalk1Recv2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return  new ViewHolder( binding );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.imgvBackground.setImageResource(list.get(position).getImgBackground());
        holder.binding.tvTitle.setText(list.get(position).getChatTitle());
        holder.binding.tvSubtitle.setText(list.get(position).getChatSub());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalk1Recv2Binding binding;
        public ViewHolder(@NonNull ItemOpentalk1Recv2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
