package com.example.programe.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;
import com.example.programe.ui.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewAdapterType extends RecyclerView.Adapter<MyRecyclerViewHolderType> {
    Context mContext;
    List<Item> itemList;

    private List<String> tweetList = new ArrayList<>();

    @NonNull
    @Override
    public MyRecyclerViewHolderType onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.type_category, parent, false);
        return new MyRecyclerViewHolderType(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolderType holder, int position) {
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
