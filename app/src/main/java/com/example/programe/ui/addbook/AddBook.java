package com.example.programe.ui.addbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.databinding.FragmentAddBookBinding;
import com.example.programe.ui.adapter.MyRecyclerViewAdapterCardBook;
import com.example.programe.ui.model.Item;

import java.util.ArrayList;
import java.util.List;


public class AddBook extends Fragment {

    FragmentAddBookBinding binding;
    //   RecyclerView recycler_list = binding.recyclerList;

    //String[] types= {"Adventure","Biography","Business","Cookbook","Classic","Comic book","Crime","Drama","Dictionary","History","Fantasy","Historical fiction","Horror","Mystery","Philosophy","Poetry","Romance","Science fiction","Science","Thriller","Western"};
//
    MyRecyclerViewAdapterCardBook adapter;
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    Button add_book_btn;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AddBookViewModel dashboardViewModel = new ViewModelProvider(this).get(AddBookViewModel.class);


        binding = FragmentAddBookBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        recyclerView = binding.recyclerList;
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        generateItem();


        add_book_btn = binding.addBookBtn;
        add_book_btn.setOnClickListener(v -> {
            Intent intent=new Intent(".ui.addbook.GoToAdd");
            startActivity(intent);

        });

//
//        binding.addBookBtn.setOnClickListener(v ->{
//
//            startActivity(new Intent(getActivity(), GoToAdd.class));
//        });
        return root;
    }

    private void generateItem() {
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {

            itemList.add(new Item(
                    "Book name " + i,
                    "author",
                    "https://miblart.com/wp-content/uploads/2020/01/crime-and-mystery-cover-scaled-1.jpeg"));

        }
        adapter = new MyRecyclerViewAdapterCardBook(getContext(), itemList);
        recyclerView.setAdapter(adapter);

    }


//        final TextView textView = binding.textProfile;
//        profileViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


//        View root = binding.getRoot();
//        final TextView textView = binding.textAddBook;
////        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//        return root;


}
