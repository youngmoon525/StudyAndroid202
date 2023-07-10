package com.example.and00_login;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolderParent> {

    @NonNull
    @Override
    public ViewHolderParent onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderParent holder, int position) {
        //holder.recy.setAdapter(new ChildAdapter());
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolderChild>{

        @NonNull
        @Override
        public ViewHolderChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolderChild holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
        public class ViewHolderChild extends RecyclerView.ViewHolder{

            public ViewHolderChild(@NonNull View itemView) {
                super(itemView);
            }
        }
    }



    public class ViewHolderParent extends RecyclerView.ViewHolder{

        public ViewHolderParent(@NonNull View itemView) {
            super(itemView);
        }
    }

}
