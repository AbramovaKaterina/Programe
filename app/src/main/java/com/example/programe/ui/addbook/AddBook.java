package com.example.programe.ui.addbook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.databinding.FragmentAddBookBinding;
import com.example.programe.ui.adapter.MyRecyclerViewAdapter;
import com.example.programe.ui.model.Item;

import java.util.ArrayList;
import java.util.List;

public class AddBook extends Fragment {

     FragmentAddBookBinding binding;
//    RecyclerView recyclerView;
//    MyRecyclerViewAdapter adapter;
//    private AddBook AddBook;
//    LinearLayoutManager layoutManager = new LinearLayoutManager(AddBook);

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddBookViewModel dashboardViewModel =
                new ViewModelProvider(this).get(AddBookViewModel.class);

        binding = FragmentAddBookBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAddBook;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


//        recyclerView = findViewById(R.id.recycler_list);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(layoutManager);
//
//        generateItem();
//
//    }
//
//    private void generateItem() {
//        List<Item> itemList = new ArrayList<>();
//        for (int i = 0; i < 50; i++) {
//
//            itemList.add(new Item(
//                    "book ",
//                    "author",
//                    ""));
//
//        }
//        adapter = new MyRecyclerViewAdapter(this,itemList);
//        recyclerView.setAdapter(adapter);
//    }

//        @Override
//        public void onDestroyView() {
//            super.onDestroyView();
//            binding = null;
//        }
    }
}