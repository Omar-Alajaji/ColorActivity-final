package edu.temple.coloractivity;

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

public class ColorAdapter extends ArrayAdapter<colorsItem> {
    public ColorAdapter(@NonNull Context context, ArrayList<colorsItem> customColorsList) {
        super(context,0, customColorsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    public View customView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if (convertView == null ) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner_layout,parent, false);
        }
        colorsItem items=getItem(position);
        ImageView SpinnerImage = convertView.findViewById(R.id.colorSpinnerImage);
        TextView spinnerName = convertView.findViewById(R.id.colorSpinnerText);
        if (items !=null){
            SpinnerImage.setImageResource(items.getSpinnerImage());
            spinnerName.setText(items.getSpinnerText());

    }

        return convertView;
    }
}
