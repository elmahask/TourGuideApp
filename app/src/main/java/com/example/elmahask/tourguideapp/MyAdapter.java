package com.example.elmahask.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<MyData> {

    public MyAdapter(Context context, int resource, List<MyData> data) {
        super(context, 0, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;

        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        MyData currentItem = getItem(position);
        // Find the TextView in the list_item.xml layout
        TextView title = listItemView.findViewById(R.id.display_title);
        // set this text on the TextView
        title.setText(currentItem.getTitle());

        TextView description = listItemView.findViewById(R.id.display_description);
        description.setText(currentItem.getDescription());

        TextView address = listItemView.findViewById(R.id.display_address);
        address.setText(currentItem.getAddress());

        TextView phone = listItemView.findViewById(R.id.display_phone);
        phone.setText(currentItem.getPhone());

        ImageView imageView = listItemView.findViewById(R.id.display_image);
        imageView.setImageResource(currentItem.getImageResourcesId());

        return listItemView;
    }
}
