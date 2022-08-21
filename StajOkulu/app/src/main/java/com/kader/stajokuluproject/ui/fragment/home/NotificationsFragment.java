package com.kader.stajokuluproject.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kader.stajokuluproject.databinding.FragmentNotificationsBinding;
import com.kader.stajokuluproject.viewmodel.HomeViewModel;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    HomeViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        viewModel=new ViewModelProvider(getActivity()).get(HomeViewModel.class);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}