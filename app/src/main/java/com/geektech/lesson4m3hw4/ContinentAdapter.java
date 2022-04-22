package com.geektech.lesson4m3hw4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.lesson4m3hw4.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.CountryViewHolder>{

    private ArrayList<Continent> continents;

    public ContinentAdapter(ArrayList<Continent> continents) {
        this.continents = continents;
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(continents.get(position));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    static class CountryViewHolder extends RecyclerView.ViewHolder {
        private ItemCountryBinding binding;

        public CountryViewHolder(ItemCountryBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Continent continent) {
            binding.tvContinent.setText((CharSequence) continent);
        }
    }
}
