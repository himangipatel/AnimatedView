package com.animatedview.adapter;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.animatedview.ui.SlideViewFragment;

public class CustomAdapter extends FragmentPagerAdapter {

    private Activity activity;
    private Integer[] imagesArray;
    private String[] namesArray;

    public CustomAdapter(FragmentManager fm, Activity activity, Integer[] imagesArray, String[] namesArray) {
        super(fm);
        this.activity = activity;
        this.imagesArray = imagesArray;
        this.namesArray = namesArray;
    }

    @Override
    public Fragment getItem(int position) {
        return SlideViewFragment.newInstance(position, imagesArray[position]);
    }

    @Override
    public int getCount() {
        return imagesArray.length;
    }
}