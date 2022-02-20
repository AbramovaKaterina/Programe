package com.example.programe.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.programe.databinding.FragmentReadBooksHomeBinding;

public class HomeFragment extends Fragment {

     FragmentReadBooksHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentReadBooksHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        homeViewModel.getText().observe(getViewLifecycleOwner(), binding.textHome::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}