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

public class EntertainmentFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate (R.layout.fragment_info, container, false);

        final ArrayList<Info> entertainment = new ArrayList<> ( );

        final String[] entertainmentName = getResources ( ).getStringArray (R.array.list_entertainment_name);
        final String[] entertainmentDistance = getResources ( ).getStringArray (R.array.list_entertainment_distance);
        final String[] entertainmentDetails = getResources ( ).getStringArray (R.array.list_entertainment_details);
        final String[] entertainmentDescription = getResources ( ).getStringArray (R.array.list_entertainment_description);
        final String[] entertainmentLocation = getResources ( ).getStringArray (R.array.list_entertainment_location);
        final TypedArray entertainmentImage = getResources ( ).obtainTypedArray (R.array.list_entertainment_image);

        for (int id = 0; id != entertainmentName.length; ++id) {
            Info newInfo = new Info (entertainmentName[id], entertainmentDistance[id], entertainmentDetails[id], entertainmentDescription[id], entertainmentLocation[id], entertainmentImage.getDrawable (id));
            entertainment.add (newInfo);
        }

        InfoAdapter adapter = new InfoAdapter (getActivity ( ), entertainment);

        ListView listView = (ListView) rootView.findViewById (R.id.list_info);

        listView.setAdapter (adapter);

        return rootView;
    }
}