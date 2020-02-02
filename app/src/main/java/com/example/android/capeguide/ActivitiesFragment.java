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

public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate (R.layout.fragment_info, container, false);

        // Creates a list of activities
        final ArrayList<Info> activities = new ArrayList<> ( );

        final String[] activityName = getResources ( ).getStringArray (R.array.list_activity_name);
        final String[] activityDistance = getResources ( ).getStringArray (R.array.list_activity_distance);
        final String[] activityDetails = getResources ( ).getStringArray (R.array.list_activity_details);
        final String[] activityDescription = getResources ( ).getStringArray (R.array.list_activity_description);
        final String[] activityLocation = getResources ( ).getStringArray (R.array.list_activity_location);
        final TypedArray activityImage = getResources ( ).obtainTypedArray (R.array.list_activity_image);

        for (int id = 0; id != activityName.length; ++id) {
            Info newInfo = new Info (activityName[id], activityDistance[id], activityDetails[id], activityDescription[id], activityLocation[id], activityImage.getDrawable (id));
            activities.add (newInfo);
        }

        InfoAdapter adapter = new InfoAdapter (getActivity ( ), activities);

        ListView listView = (ListView) rootView.findViewById (R.id.list_info);

        listView.setAdapter (adapter);

        return rootView;
    }

}