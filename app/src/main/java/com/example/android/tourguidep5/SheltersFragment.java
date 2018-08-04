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

public class SheltersFragment extends Fragment {

    View view;
    private RecyclerView shelterRecyclerView;
    private List<Shelter> shelters;

    public SheltersFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.shelter_item_list, container, false);
        shelterRecyclerView = (RecyclerView)view.findViewById(R.id.shelter_item_list);
        SheltersRecyclerViewAdapter shelterRVA = new SheltersRecyclerViewAdapter(getContext(),shelters);
        shelterRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        shelterRecyclerView.setAdapter(shelterRVA);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        shelters = new ArrayList<>();
        //String mName, String mAddress, String mPhone, String mUrl, String mEmail
        shelters.add(new Shelter(getString(R.string.dzd_name), getString(R.string.dzd_address), getString(R.string.dzd_phone), getString(R.string.dzd_url), getString(R.string.dzd_email)));
        shelters.add(new Shelter(getString(R.string.ulubele_name), getString(R.string.ulubele_address), getString(R.string.ulubele_phone), getString(R.string.ulubele_url), getString(R.string.ulubele_email)));
        shelters.add(new Shelter(getString(R.string.jugla_name), getString(R.string.jugla_address), getString(R.string.jugla_phone), getString(R.string.jugla_url), getString(R.string.jugla_email)));
    }
}
