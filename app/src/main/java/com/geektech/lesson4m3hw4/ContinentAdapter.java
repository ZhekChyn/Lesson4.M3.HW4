package com.geektech.lesson4m3hw4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geektech.lesson4m3hw4.Models.Continent;
import com.geektech.lesson4m3hw4.databinding.ItemContinentBinding;

import java.util.ArrayList;
import java.util.List;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder>{

    private List<Continent> continents;
    private OnItemClick itemClick;

    public ContinentAdapter(List<Continent> continents, OnItemClick onItemClick) {
        this.continents = continents;
        itemClick = onItemClick;
    }

    public ContinentAdapter(List<Continent> list) {
        this.continents = list;
    }

    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContinentBinding binding = ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);
        return new ContinentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continents.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemClick.OnItemClick(continents.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    static class ContinentViewHolder extends RecyclerView.ViewHolder {

        private ItemContinentBinding binding;

        public ContinentViewHolder(ItemContinentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Continent continent) {
            binding.nameContinent.setText(continent.getNameOfContinent());
            Glide.with(binding.getRoot()).load(continent.getFlagOfContinent()).into(binding.ivFlag);
        }

    }
}
