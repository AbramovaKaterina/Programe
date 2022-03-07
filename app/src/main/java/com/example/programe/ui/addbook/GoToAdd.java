package com.example.programe.ui.addbook;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.programe.R;
import com.example.programe.databinding.FragmentAddBookBinding;
import com.example.programe.databinding.FragmentReadingNowBinding;
import com.example.programe.databinding.GoToAddFragmentBinding;
import com.example.programe.ui.readingnow.ReadingNowViewModel;

public class GoToAdd extends Fragment {
    GoToAddFragmentBinding binding;
    ListView recycler_list_types;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        GoToAddViewModel goToAddViewModel = new ViewModelProvider(this).get(GoToAddViewModel.class);


        binding = GoToAddFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        recycler_list_types = binding.recyclerListTypes;
        String[] type = getResources().getStringArray(R.array.types);
        ArrayAdapter<String> adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, type);
        recycler_list_types.setAdapter(adapter);


        return inflater.inflate(R.layout.go_to_add_fragment, container, false);
    }

}