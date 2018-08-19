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
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list, container, false);

        ArrayList<MyData> food = new ArrayList<>();
        food.add(new MyData(getString(R.string.cairo), getString(R.string.info1), getString(R.string.cairo), getString(R.string.phone), R.drawable.waha));
        food.add(new MyData(getString(R.string.alex), getString(R.string.info2), getString(R.string.alex), getString(R.string.phone), R.drawable.caieg_restaurant));
        food.add(new MyData(getString(R.string.cairo), getString(R.string.info4), getString(R.string.cairo), getString(R.string.phone), R.drawable.bean));
        food.add(new MyData(getString(R.string.alex), getString(R.string.info5), getString(R.string.alex), getString(R.string.phone), R.drawable.food));

        final MyAdapter itemsAdapter = new MyAdapter(getContext(), R.layout.list_item, food);

        ListView listView = v.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return v;
    }
}
