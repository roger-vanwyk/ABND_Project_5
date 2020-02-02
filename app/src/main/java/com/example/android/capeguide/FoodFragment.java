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

public class FoodFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate (R.layout.fragment_info, container, false);

        final ArrayList<Info> food = new ArrayList<> ( );

        final String[] foodName = getResources ( ).getStringArray (R.array.list_food_name);
        final String[] foodDistance = getResources ( ).getStringArray (R.array.list_food_distance);
        final String[] foodDetails = getResources ( ).getStringArray (R.array.list_food_details);
        final String[] foodDescription = getResources ( ).getStringArray (R.array.list_food_description);
        final String[] foodLocation = getResources ( ).getStringArray (R.array.list_food_location);
        final TypedArray foodImage = getResources ( ).obtainTypedArray (R.array.list_food_image);

        for (int id = 0; id != foodName.length; ++id) {
            Info newInfo = new Info (foodName[id], foodDistance[id], foodDetails[id], foodDescription[id], foodLocation[id], foodImage.getDrawable (id));
            food.add (newInfo);
        }

        InfoAdapter adapter = new InfoAdapter (getActivity ( ), food);

        ListView listView = (ListView) rootView.findViewById (R.id.list_info);

        listView.setAdapter (adapter);

        return rootView;
    }
}