package com.shivamdev.slidingtabswithmaterialdesign;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by shivam.chopra on 13-02-2015.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Frag # 1", "Frag # 2", "Frag # 3"};
    private Context context;

    Fragment fragment;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;


    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0 :
                fragment =  new TabFragment1();
            break;
            case 1 :
                fragment =   new TabFragment2();
            break;
            case 2 :
                fragment =   new TabFragment3();
            break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
