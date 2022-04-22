package com.geektech.lesson4m3hw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.lesson4m3hw4.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private FragmentMainBinding binding;
    private ArrayList<Continent> continents;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continents);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        continents = new ArrayList<>();
        continents.add(new Continent("Africa", "https://wallpaperaccess.com/full/513008.png"));
        continents.add(new Continent("Asia", "https://wallpaperaccess.com/full/513008.png"));
    }
}