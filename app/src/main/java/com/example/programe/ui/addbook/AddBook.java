package com.example.programe.ui.addbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;
import com.example.programe.databinding.FragmentAddBookBinding;
import com.example.programe.ui.addbook.GoToAdding;


public class AddBook extends Fragment {

    FragmentAddBookBinding binding;
 //   RecyclerView recycler_list = binding.recyclerList;

    //String[] types= {"Adventure","Biography","Business","Cookbook","Classic","Comic book","Crime","Drama","Dictionary","History","Fantasy","Historical fiction","Horror","Mystery","Philosophy","Poetry","Romance","Science fiction","Science","Thriller","Western"};
//



    public  View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddBookViewModel dashboardViewModel =
                new ViewModelProvider(this).get(AddBookViewModel.class);

        binding = FragmentAddBookBinding.inflate(inflater, container, false);
        View root = binding.getRoot();






//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(AddBook.this, R.array.types, android.R.layout.simple_list_item_1);
//        binding.recyclerList.setAdapter(adapter);
//
//
//
//        binding.addBookBtn.setOnClickListener(v ->{
//
//            startActivity(new Intent(this, GoToAdding.class));
////            Intent intent = new Intent(AddBook(), GoToAdding.class);
////            startActivity(intent);
//        });
        return root;
    }





//        final TextView textView = binding.textProfile;
//        profileViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);






//        View root = binding.getRoot();
//        final TextView textView = binding.textAddBook;
////        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//        return root;




}
