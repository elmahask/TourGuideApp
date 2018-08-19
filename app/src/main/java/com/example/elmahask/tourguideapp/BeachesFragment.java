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
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.list, container, false);

        ArrayList<MyData> beach = new ArrayList<>();
        beach.add(new MyData(getString(R.string.sharm), getString(R.string.info_beach), getString(R.string.sharm), getString(R.string.phone), R.drawable.redsea));
        beach.add(new MyData(getString(R.string.alex), getString(R.string.info_beach2), getString(R.string.alex),  getString(R.string.phone), R.drawable.sea));
        beach.add(new MyData(getString(R.string.safaga), getString(R.string.info_beach3), getString(R.string.safaga),  getString(R.string.phone), R.drawable.waha));

        final MyAdapter itemsAdapter = new MyAdapter(getContext(), R.layout.list_item, beach);

        ListView listView = v.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return v;
    }
}
