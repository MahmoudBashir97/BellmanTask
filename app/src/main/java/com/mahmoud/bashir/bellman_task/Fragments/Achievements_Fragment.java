package com.mahmoud.bashir.bellman_task.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mahmoud.bashir.bellman_task.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Achievements_Fragment extends Fragment {


    public Achievements_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_achievements_, container, false);
    }

}
