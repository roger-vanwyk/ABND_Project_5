package com.example.android.capeguide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

// Created 01/2020 by Roger van Wyk

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        // Find the ViewPager for user to swipe between fragments
        ViewPager viewPager = findViewById (R.id.viewpager);

        // Create an adapter that knows where to place each fragment on every page
        CategoryAdapter adapter = new CategoryAdapter (this, getSupportFragmentManager ( ));

        // Set adapter onto ViewPager
        viewPager.setAdapter (adapter);

        // Find the TabLayout to show category tabs
        TabLayout tabLayout = findViewById (R.id.tabs);

        // This updates the tabs and ViewPager according to every swipe.
        tabLayout.setupWithViewPager (viewPager);
    }
}