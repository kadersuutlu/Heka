package com.kader.stajokuluproject.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;

import com.kader.stajokuluproject.R;
import com.kader.stajokuluproject.databinding.FragmentSigninBinding;
import com.kader.stajokuluproject.viewmodel.HomeViewModel;

public class SigninFragment extends Fragment {

    private FragmentSigninBinding binding;

    HomeViewModel viewModel;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSigninBinding.inflate(inflater, container, false);

        viewModel=new ViewModelProvider(this).get(HomeViewModel.class);

        return binding.getRoot();


    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SigninFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}