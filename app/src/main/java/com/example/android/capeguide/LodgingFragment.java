package com.example.android.capeguide;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

// Created 01/2020 by Roger van Wyk

public class LodgingFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate (R.layout.fragment_info, container, false);

        final ArrayList<Info> lodging = new ArrayList<> ( );

        final String[] lodgingName = getResources ( ).getStringArray (R.array.list_lodging_name);
        final String[] lodgingDistance = getResources ( ).getStringArray (R.array.list_lodging_distance);
        final String[] lodgingDetails = getResources ( ).getStringArray (R.array.list_lodging_details);
        final String[] lodgingDescription = getResources ( ).getStringArray (R.array.list_lodging_description);
        final String[] lodgingLocation = getResources ( ).getStringArray (R.array.list_lodging_location);
        final TypedArray lodgingImage = getResources ( ).obtainTypedArray (R.array.list_lodging_image);

        for (int id = 0; id != lodgingName.length; ++id) {
            Info newInfo = new Info (lodgingName[id], lodgingDistance[id], lodgingDetails[id], lodgingDescription[id], lodgingLocation[id], lodgingImage.getDrawable (id));
            lodging.add (newInfo);
        }

        InfoAdapter adapter = new InfoAdapter (getActivity ( ), lodging);

        ListView listView = (ListView) rootView.findViewById (R.id.list_info);

        listView.setAdapter (adapter);

        return rootView;
    }
}