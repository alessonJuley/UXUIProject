package com.example.abaouxuiproject;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemsAdapter extends ArrayAdapter<Foods> {
    public ListItemsAdapter(Activity context, ArrayList<Foods> foods){
        super(context, 0, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_item_view, parent, false);
        }

        Foods currentItem = getItem(position);

        TextView foodName = listItemView.findViewById(R.id.list_item_text);
        foodName.setText(currentItem.getName());

        TextView foodCountry = listItemView.findViewById(R.id.list_item_text2);
        foodCountry.setText(currentItem.getCountry());

        ImageView foodImage = listItemView.findViewById(R.id.list_image);
        foodImage.setImageResource(currentItem.getImage());

        return listItemView;
    }
}
