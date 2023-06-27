package com.example.project01_kymtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemOpentalk1Recv2Binding;
import com.example.project01_kymtalk.databinding.ItemOpentalk1Recv3Binding;

public class OpenSub1Adapter3 extends RecyclerView.Adapter<OpenSub1Adapter3.ViewHolder> {
    ItemOpentalk1Recv3Binding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOpentalk1Recv3Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return  new ViewHolder( binding );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalk1Recv3Binding binding;
        public ViewHolder(@NonNull ItemOpentalk1Recv3Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
