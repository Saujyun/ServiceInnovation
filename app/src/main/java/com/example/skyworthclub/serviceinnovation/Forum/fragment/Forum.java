package com.example.skyworthclub.serviceinnovation.Forum.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.skyworthclub.serviceinnovation.R;

/**
 * Created by skyworthclub on 2018/1/21.
 */

public class Forum extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forum_main, container, false);
        return view;
    }
}
