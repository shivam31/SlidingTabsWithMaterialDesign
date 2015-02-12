package com.shivamdev.slidingtabswithmaterialdesign;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.shivamdev.slidingtabswithmaterialdesign.my_tabs.SlidingTabLayout;


public class MainActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this));

        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) findViewById(R.id.slidingTabs);
    }
}
