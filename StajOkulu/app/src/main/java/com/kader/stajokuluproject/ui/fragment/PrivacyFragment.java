package com.kader.stajokuluproject.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kader.stajokuluproject.R;
import com.kader.stajokuluproject.databinding.FragmentPrivacyBinding;


public class PrivacyFragment extends Fragment {

    private FragmentPrivacyBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_privacy, container, false);
    }
}