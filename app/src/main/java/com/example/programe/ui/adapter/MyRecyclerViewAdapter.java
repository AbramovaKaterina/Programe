package com.example.programe.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;
import com.example.programe.ui.addbook.AddBook;
import com.example.programe.ui.model.Item;

import java.util.List;


public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {

    AddBook mContext;
    List<Item> itemList;


    public MyRecyclerViewAdapter(AddBook mContext, List<Item> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext.getContext())
                .inflate(R.layout.item,parent,false);
        return new MyRecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

}
