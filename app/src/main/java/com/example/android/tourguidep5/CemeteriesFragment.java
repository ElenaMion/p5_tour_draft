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

public class CemeteriesFragment extends Fragment {

    View view;
    private RecyclerView cemeteryRecyclerView;
    private List<Cemetery> cemeteries;

    public CemeteriesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.cemetery_item_list, container, false);
        cemeteryRecyclerView = (RecyclerView) view.findViewById(R.id.cemetery_item_list);
        CemeteriesRecyclerViewAdapter cemeteryRVA = new CemeteriesRecyclerViewAdapter(getContext(), cemeteries);
        cemeteryRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        cemeteryRecyclerView.setAdapter(cemeteryRVA);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cemeteries = new ArrayList<>();
        //String mName, String mAddress, String description, String burials
        cemeteries.add(new Cemetery(getString(R.string.pokrov_great_name), getString(R.string.pokrov_great_address),
                getString(R.string.pokrov_great_descr),
                getString(R.string.pokrov_great_burials)));

        cemeteries.add(new Cemetery(getString(R.string.forest_brethren_name), getString(R.string.forest_brethren_address),
                getString(R.string.forest_brethren_descr),
                getString(R.string.forest_brethren_burials)));

        cemeteries.add(new Cemetery(getString(R.string.lacupe_name), getString(R.string.lacupe_address),
                getString(R.string.lacupe_descr),
                getString(R.string.lacupe_burials)));

        cemeteries.add(new Cemetery(getString(R.string.bolderaja_name), getString(R.string.bolderaja_address),
                getString(R.string.bolderaja_descr),
                getString(R.string.bolderaja_burials)));

    }
}
