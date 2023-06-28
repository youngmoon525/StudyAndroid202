package com.example.project01_kymtalk.gridtest;

import android.os.Bundle;

import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.example.project01_kymtalk.R;
import com.example.project01_kymtalk.databinding.FragmentGridBinding;


public class GridFragment extends Fragment {
    FragmentGridBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGridBinding.inflate(inflater , container , false);
        binding.grdv.setAdapter(new GridAdapter(inflater));

        return binding.getRoot();
    }

    public class GridAdapter extends BaseAdapter{
        LayoutInflater inflater;

        public GridAdapter(LayoutInflater inflater) {
            this.inflater = inflater;
        }

        @Override
        public int getCount() {
            return 50;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.item_opentalk1_chat , parent,false);
            return convertView;
        }
    }
}