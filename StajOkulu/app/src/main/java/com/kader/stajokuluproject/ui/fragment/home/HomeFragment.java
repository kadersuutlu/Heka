package com.kader.stajokuluproject.ui.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.kader.stajokuluproject.databinding.FragmentHomeBinding;
import com.kader.stajokuluproject.viewmodel.HomeViewModel;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private FragmentHomeBinding binding;

    HomeViewModel viewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        viewModel=new ViewModelProvider(getActivity()).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        setViewComponent();

        return binding.getRoot();
    }

    private void setViewComponent() {
        viewModel.counter.observe(getActivity(), val -> {
            binding.textHome.setText(String.valueOf(val));
        });
        binding.btnUpdate.setOnClickListener(this::onClick);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view){
        int id=view.getId();
        if(id==binding.btnUpdate.getId()){
            getInputValue();
        }

    }

    private void getInputValue() {
        String inputValue=binding.input.getText().toString();
        viewModel.counter.setValue(Integer.valueOf(inputValue));
    }
}