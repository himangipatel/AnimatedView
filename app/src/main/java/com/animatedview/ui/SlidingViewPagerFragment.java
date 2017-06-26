package com.animatedview.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.animatedview.R;

/**
 * Created by Himangi on 26/6/17
 */

public class SlidingViewPagerFragment extends Fragment {


    public static SlidingViewPagerFragment newInstance(int page, Integer image) {
        SlidingViewPagerFragment slidingViewPagerFragment = new SlidingViewPagerFragment();
        Bundle args = new Bundle();
        args.putInt("image",image);
        slidingViewPagerFragment.setArguments(args);
        return slidingViewPagerFragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_slide_view_pager, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
        imageView.setImageResource(getArguments().getInt("image"));
        Log.d("Image", String.valueOf(getArguments().getInt("image")));

    }
}
