package com.example.android.capeguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// Created 01/2020 by Roger van Wyk

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Activity context, ArrayList<Info> info) {
        super (context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (convertView == null) {
            convertView = LayoutInflater.from (getContext ( )).inflate (R.layout.list_item, parent, false);
        }

        Info currentInfo = getItem (position);

        TextView InfoNameTextView = (TextView) listItemView.findViewById (R.id.name_text_view);
        infoNameTextView.setText (currentInfo.getInfoName ( ));

        TextView InfoDistanceTextView = (TextView) listItemView.findViewById (R.id.distance_text_view);
        infoDistanceTextView.setText (currentInfo.getInfoDistance ( ));

        TextView InfoDetailsTextView = (TextView) listItemView.findViewById (R.id.details_text_view);
        infoDetailsTextView.setText (currentInfo.getInfoDetails ( ));

        TextView DescriptionTextView = (TextView) listItemView.findViewById (R.id.description_text_view);
        infoDescriptionTextView.setText (currentInfo.getInfoDescription ( ));

        TextView LocationTextView = (TextView) listItemView.findViewById (R.id.location_text_view);
        infoLocationTextView.setText (currentInfo.getInfoLocation ( ));

        ImageView imageView = (ImageView) listItemView.findViewById (R.id.place_image_view);
        imageView.setDrawable (currentInfo.getImageDrawable ( ));

        return listItemView;
    }
}