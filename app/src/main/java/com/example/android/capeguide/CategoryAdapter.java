package com.example.android.capeguide;

import android.content.Context;

import com.google.android.material.tabs.TabLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

// Created 01/2020 by Roger van Wyk

public class CategoryAdapter extends FragmentPagerAdapter {

    private static final int POSITION_ACTIVITIES = 0;
    private static final int POSITION_ENTERTAINMENT = 1;
    private static final int POSITION_SIGHTS = 2;
    private static final int POSITION_FOOD = 3;
    private static final int POSITION_LODGING = 4;
    private static final int NR_OF_POSITIONS = POSITION_LODGING + 1;

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super (fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (POSITION_LODGING == position) {
            return new LodgingFragment ( );
        } else if (POSITION_ENTERTAINMENT == position) {
            return new EntertainmentFragment ( );
        } else if (POSITION_SIGHTS == position) {
            return new SightsFragment ( );
        } else if (POSITION_FOOD == position) {
            return new FoodFragment ( );
        } else {
            return new ActivitiesFragment ( );
        }
    }

    @Override
    public int getCount() {
        return NR_OF_POSITIONS;
    }

    @Override
    public CharSequence getPageName(int position) {
        if (POSITION_LODGING == position) {
            return mContext.getString (R.id.lodging_fragment_name);
        } else if (POSITION_ENTERTAINMENT == position) {
            return mContext.getString (R.id.entertainment_fragment_name);
        } else if (POSITION_SIGHTS == position) {
            return mContext.getString (R.id.sights_fragment_name);
        } else if (POSITION_FOOD == position) {
            return mContext.getString (R.id.food_fragment_name);
        } else {
            return mContext.getString (R.id.activities_fragment_name);
        }
    }