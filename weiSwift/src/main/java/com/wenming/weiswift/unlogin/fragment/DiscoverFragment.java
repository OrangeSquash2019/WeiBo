package com.wenming.weiswift.unlogin.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenming.weiswift.R;

/**
 * Created by wenmingvs on 15/12/26.
 */
public class DiscoverFragment extends Fragment {
    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.discoverfragment_layout, container, false);
        return mView;
    }


}