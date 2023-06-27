package com.example.project01_kymtalk.opentalk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_kymtalk.databinding.ItemOpentalk1ChatBinding;

public class OpenSub1Adapter1  extends RecyclerView.Adapter<OpenSub1Adapter1.ViewHolder> {
    ItemOpentalk1ChatBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemOpentalk1ChatBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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
        ItemOpentalk1ChatBinding binding;
        public ViewHolder(@NonNull ItemOpentalk1ChatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
