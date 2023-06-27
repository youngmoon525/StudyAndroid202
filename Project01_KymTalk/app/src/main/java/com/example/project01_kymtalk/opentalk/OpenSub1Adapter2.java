package com.example.project01_kymtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemOpentalk1ChatBinding;
import com.example.project01_kymtalk.databinding.ItemOpentalk1Recv2Binding;

public class OpenSub1Adapter2 extends RecyclerView.Adapter<OpenSub1Adapter2.ViewHolder> {
    ItemOpentalk1Recv2Binding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOpentalk1Recv2Binding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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
        ItemOpentalk1Recv2Binding binding;
        public ViewHolder(@NonNull ItemOpentalk1Recv2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
