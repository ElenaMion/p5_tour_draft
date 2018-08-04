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

public class ChurchesFragment extends Fragment {

    View view;
    private RecyclerView churchRecyclerView;
    private List<Church> churches;

    public ChurchesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.church_item_list, container, false);
        churchRecyclerView = (RecyclerView) view.findViewById(R.id.church_item_list);
        ChurchesRecyclerViewAdapter churchRVA = new ChurchesRecyclerViewAdapter(getContext(), churches);
        churchRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        churchRecyclerView.setAdapter(churchRVA);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        churches = new ArrayList<>();
        //String mName, String mAddress, String mPhone, String mDescription, int mYearBuilt, int mImageResourceId
        churches.add(new Church("Riga\ 's Nativity of Christ Cathedral", "Brīvības bulvāris 23, Riga", "67211207",
                "The biggest Orthodox church in Riga. The neo-Byzantine style building. Served as planetarium during USSR times.", 1884, R.mipmap.ic_launcher_round));
        churches.add(new Church("St. Peter's Church", "Reformācijas laukums 1, Riga", "67229426",
                "The tallest of the Riga churches The gothic style building. The 72 meters high church's viewing platform and the crypt are a must-visit", 1209, R.mipmap.ic_launcher_round));
        churches.add(new Church("Riga Dome Cathedral", "Doma laukums 1, Riga", "67213213",
                "The largest Medieval church in Latvia and the Baltic States. It has Romanesque, early Gothic, Baroque, and Art Nouveau features. " +
                        "The Cathedral was the main bishop's church of Livonia right until 1561 when Livonia collapsed. It is the seat of the Archbishop of Latvia Evangelical Lutheran Church",
                1211, R.mipmap.ic_launcher_round));
        churches.add(new Church("Annunciation of Our Most Holy Lady Church", "Gogoļa Street 9, Riga", "67220566",
                "Also known as the Church of St. Nicholas the Wonderworker. " +
                        "The Church of St. Nicholas the Wonderworker was one of the oldest Orthodox churches in Riga which was first mentioned in 1453 (but built earlier). Unfortunately the building was destroyed in around 1677." +
                        "Then the Annunciation of Our Most Holy Lady Church was built where the Church of Nicholas the Wonderworker stood. The church building was made of wood, and was destroyed in 1773." +
                        "Another wooden Annunciation of Our Most Holy Lady Church was built in 1774, but got destroyed in 1812." +
                        "The modern church was built in 1814 and has three altars. It has the oldest Orthodox iconostasis in Riga (from 1859)." +
                        "The baroque style building, but has elements of classicism.", 1814, R.mipmap.ic_launcher_round));
        churches.add(new Church("Our Lady of Sorrows Church", "Pils street 5", "67227177",
                "The first stone church built in Riga after the Reformation had reached Livonia. The Classicism style building. It was dedicated to Our Lady of Sorrows as a symbol to the oppressed Catholic Religion in Terra Mariana.", 1785, R.mipmap.ic_launcher_round));
    }
}
