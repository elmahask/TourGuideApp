package com.example.elmahask.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.list, container, false);

        ArrayList<MyData> place = new ArrayList<>();
        place.add(new MyData(getString(R.string.giza), getString(R.string.info_place1), getString(R.string.giza), getString(R.string.phone), R.drawable.pyramids));
        place.add(new MyData(getString(R.string.cairo), getString(R.string.info_place2), getString(R.string.cairo), getString(R.string.phone), R.drawable.castel));
        place.add(new MyData(getString(R.string.giza), getString(R.string.info_place3), getString(R.string.giza), getString(R.string.phone), R.drawable.pyramids));
        place.add(new MyData(getString(R.string.cairo), getString(R.string.info_place4), getString(R.string.cairo), getString(R.string.phone), R.drawable.castel));

        final MyAdapter itemsAdapter = new MyAdapter(getContext(), R.layout.list_item, place);

        ListView listView = v.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return v;
    }

}
