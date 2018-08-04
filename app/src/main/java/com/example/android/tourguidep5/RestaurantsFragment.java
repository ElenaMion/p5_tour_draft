package com.example.android.tourguidep5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RestaurantsFragment extends Fragment {

    View view;
    private RecyclerView restaurantRecyclerView;
    private List<Restaurant> restaurants;

    public RestaurantsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.restaurant_item_list, container, false);
        restaurantRecyclerView = (RecyclerView) view.findViewById(R.id.restaurant_item_list);
        RestaurantsRecyclerViewAdapter restaurantRVA = new RestaurantsRecyclerViewAdapter(getContext(), restaurants);
        restaurantRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantRecyclerView.setAdapter(restaurantRVA);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        restaurants = new ArrayList<>();
        //String mName, String mAddress, String mPhone, int mPriceRange <1-3>, String mOpeningHours
        restaurants.add(new Restaurant(getString(R.string.terapija_name), getString(R.string.terapija_address), getString(R.string.terapija_phone), 2,
                getString(R.string.terapija_hours)));
        restaurants.add(new Restaurant(getString(R.string.bhajan_name), getString(R.string.bhajan_address), getString(R.string.bhajan_phone), 3,
                getString(R.string.bhajan_hours)));
        restaurants.add(new Restaurant(getString(R.string.pumpkin_name), getString(R.string.pumpkin_address), getString(R.string.pumpkin_phone), 3,
                getString(R.string.pumpkin_hours)));
        restaurants.add(new Restaurant(getString(R.string.garuda_name), getString(R.string.garuda_address), getString(R.string.garuda_phone), 1,
                getString(R.string.garuda_hours)));
        restaurants.add(new Restaurant(getString(R.string.rama_name), getString(R.string.rama_address), getString(R.string.rama_phone), 1,
                getString(R.string.rama_hours)));

    }
}
