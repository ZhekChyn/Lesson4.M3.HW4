package com.geektech.lesson4m3hw4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.lesson4m3hw4.Models.Africa;
import com.geektech.lesson4m3hw4.Models.Asia;
import com.geektech.lesson4m3hw4.Models.Australia;
import com.geektech.lesson4m3hw4.Models.Continent;
import com.geektech.lesson4m3hw4.Models.Europe;
import com.geektech.lesson4m3hw4.Models.NorthAmerica;
import com.geektech.lesson4m3hw4.Models.SouthAmerica;
import com.geektech.lesson4m3hw4.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment implements OnItemClick{

    private FragmentMainBinding binding;
    public static List<Continent> continentsList;
    private ContinentAdapter adapter;

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
        adapter = new ContinentAdapter(continentsList, this);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        continentsList = new ArrayList<>();
        continentsList.add(new Continent("Africa", R.drawable.ic_africa));
        continentsList.add(new Continent("Asia", R.drawable.ic_asia));
        continentsList.add(new Continent("North America", R.drawable.ic_north_america));
        continentsList.add(new Continent("South America", R.drawable.ic_south_america));
        continentsList.add(new Continent("Europe", R.drawable.ic_europe));
        continentsList.add(new Continent("Australia", R.drawable.ic_australia));
    }

    @Override
    public void OnItemClick(Continent continent) {
        switch (continent.getNameOfContinent()){
            case "Africa": {
                continentsList = new ArrayList<>();
                continentsList.add(new Africa("Nigeria", R.drawable.ic_nigeria));
                continentsList.add(new Africa("South Africa", R.drawable.ic_south_africa));
                continentsList.add(new Africa("Egypt", R.drawable.ic_egypt));
                continentsList.add(new Africa("Algeria", R.drawable.ic_algeria));
                continentsList.add(new Africa("Angola", R.drawable.ic_angola));
                send();
                break;
            }
            case "Asia":{
                continentsList = new ArrayList<>();
                continentsList.add(new Asia("Kyrgyzstan", R.drawable.ic_kg));
                continentsList.add(new Asia("Kazakhstan", R.drawable.ic_kazakstan));
                continentsList.add(new Asia("Russia", R.drawable.ic_ru_3x));
                continentsList.add(new Asia("China", R.drawable.ic_cn));
                continentsList.add(new Asia("Turkmenistan", R.drawable.ic_tm_3x));
                send();
                break;
            }
            case "Australia":{
                continentsList = new ArrayList<>();
                continentsList.add(new Australia("Australia", R.drawable.ic_australia));
                continentsList.add(new Australia("Fiji", R.drawable.ic_fj_3x));
                continentsList.add(new Australia("Papua New Guinea", R.drawable.ic_pg_3x));
                continentsList.add(new Australia("Vanuatu", R.drawable.ic_vu_3x));
                continentsList.add(new Australia("New Zealand", R.drawable.ic_nz_3x));
                send();
                break;
            }
            case "Europe":{
                continentsList = new ArrayList<>();
                continentsList.add(new Europe("England", R.drawable.ic_gb_3x));
                continentsList.add(new Europe("Germany", R.drawable.ic_de_3x));
                continentsList.add(new Europe("Italy", R.drawable.ic_it_3x));
                continentsList.add(new Europe("France", R.drawable.ic_fr_3x));
                continentsList.add(new Europe("Turkey", R.drawable.ic_tr_3x));
                send();
                break;
            }
            case "North America":{
                continentsList = new ArrayList<>();
                continentsList.add(new NorthAmerica("USA",R.drawable.ic_us_3x));
                continentsList.add(new NorthAmerica("Canada",R.drawable.ic_ca_3x));
                continentsList.add(new NorthAmerica("Cuba",R.drawable.ic_cu_3x));
                continentsList.add(new NorthAmerica("Mexico",R.drawable.ic_mx_3x));
                continentsList.add(new NorthAmerica("Trinidad and Tobacco",R.drawable.ic_tt_3x));
                send();
                break;
            }
            case "South America":{
                continentsList = new ArrayList<>();
                continentsList.add(new SouthAmerica("Brasilia", R.drawable.ic_br_3x));
                continentsList.add(new SouthAmerica("Chile", R.drawable.ic_cl_3x));
                continentsList.add(new SouthAmerica("Venezuela", R.drawable.ic_ve_3x));
                continentsList.add(new SouthAmerica("Argentina", R.drawable.ic_ar_3x));
                continentsList.add(new SouthAmerica("Bolivia", R.drawable.ic_bo_3x));
                send();
                break;
            }
        }
        send();
    }

    private void send() {
        requireActivity().getSupportFragmentManager().beginTransaction().
                replace(R.id.container, new SecondFragment()).commit();
    }
}