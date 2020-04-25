package com.example.virtualpet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FireAdapter extends ArrayAdapter<Fire> {

    public FireAdapter(Context context, ArrayList list) {
        super(context, 0, list);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_list_item, parent, false);
        Fire currentCategoryItem = getItem(position);
        ImageView categoryItemImageView = convertView.findViewById(R.id.list_item_photo);
        TextView categoryItemTextView = convertView.findViewById(R.id.list_item_name);
        TextView categoryItemTextView2 = convertView.findViewById(R.id.list_item_rarity);
        TextView categoryItemTextView3 = convertView.findViewById(R.id.list_item_type);
        TextView categoryItemTextView4 = convertView.findViewById(R.id.list_item_weakness);
        categoryItemImageView.setImageResource(currentCategoryItem.getPhoto());
        categoryItemTextView.setText(currentCategoryItem.getName());
        categoryItemTextView2.setText(currentCategoryItem.getRarity());
        categoryItemTextView3.setText(currentCategoryItem.getType());
        categoryItemTextView4.setText(currentCategoryItem.getWeakness());
        return convertView;
    }

}
