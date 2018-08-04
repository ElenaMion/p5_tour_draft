package com.example.android.tourguidep5;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabs;
    private ViewPager viewPager;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        categoryAdapter.addFragment(new SheltersFragment(), getString(R.string.shelters));
        categoryAdapter.addFragment(new CemeteriesFragment(), getString(R.string.cemeteries));
        categoryAdapter.addFragment(new RestaurantsFragment(), getString(R.string.restaurants));
        categoryAdapter.addFragment(new ChurchesFragment(), getString(R.string.churches));

        // Set the adapter onto the view pager
        viewPager.setAdapter(categoryAdapter);

        // Connect the tab layout with the view pager.
        tabs.setupWithViewPager(viewPager);
    }

}
