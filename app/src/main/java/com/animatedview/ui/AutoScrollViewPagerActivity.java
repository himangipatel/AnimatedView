package com.animatedview.ui;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.animatedview.adapter.CustomAdapter;
import com.animatedview.R;
import com.animatedview.customviews.AutoScrollViewPager;

public class AutoScrollViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_scrollview_pager);

        Integer[] imageId = {R.drawable.main_bg, R.drawable.main_bg1, R.drawable.main_bg2, R.drawable.main_bg1};
        String[] imagesName = {"image1", "image2", "image3", "image4"};

        AutoScrollViewPager viewPager = (AutoScrollViewPager) findViewById(R.id.viewpager);
        viewPager.startAutoScroll();
        viewPager.setInterval(2000);
        viewPager.setCycle(true);
        viewPager.setStopScrollWhenTouch(true);
        PagerAdapter adapter = new CustomAdapter(getSupportFragmentManager(), AutoScrollViewPagerActivity.this, imageId, imagesName);
        viewPager.setAdapter(adapter);
    }
}
