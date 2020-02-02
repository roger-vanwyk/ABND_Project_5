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

public class SightsFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate (R.layout.fragment_info, container, false);

        final ArrayList<Info> sights = new ArrayList<> ( );

        final String[] sightsName = getResources ( ).getStringArray (R.array.list_sights_name);
        final String[] sightsDistance = getResources ( ).getStringArray (R.array.list_sights_distance);
        final String[] sightsDetails = getResources ( ).getStringArray (R.array.list_sights_details);
        final String[] sightsDescription = getResources ( ).getStringArray (R.array.list_sights_description);
        final String[] sightsLocation = getResources ( ).getStringArray (R.array.list_sights_location);
        final TypedArray sightsImage = getResources ( ).obtainTypedArray (R.array.list_sights_image);

        for (int id = 0; id != sightsName.length; ++id) {
            Info newInfo = new Info (sightsName[id], sightsDistance[id], sightsDetails[id], sightsDescription[id], sightsLocation[id], sightsImage.getDrawable (id));
            sights.add (newInfo);
        }

        InfoAdapter adapter = new InfoAdapter (getActivity ( ), sights);

        ListView listView = (ListView) rootView.findViewById (R.id.list_info);

        listView.setAdapter (adapter);

        return rootView;
    }
}