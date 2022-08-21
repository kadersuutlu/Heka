package com.kader.stajokuluproject.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    public MutableLiveData<Integer> counter=new MutableLiveData<>();

    public HomeViewModel(){
        int value=0;
        counter.setValue(1300);
    }
}
