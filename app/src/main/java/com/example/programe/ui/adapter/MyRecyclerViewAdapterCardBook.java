package com.example.programe.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.programe.R;
import com.example.programe.ui.model.Item;

import java.util.List;


public class MyRecyclerViewAdapterCardBook extends RecyclerView.Adapter<MyRecyclerViewHolderCardBook> {

    Context mContext;
    List<Item> itemList;

    public MyRecyclerViewAdapterCardBook(Context mContext, List<Item> itemList) {
        this.mContext = mContext;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyRecyclerViewHolderCardBook onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.card_book_author,parent,false);
        return new MyRecyclerViewHolderCardBook(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolderCardBook holder, int position) {
        Glide.with(mContext)
                .load(itemList.get(position).getImage())
                .into(holder.cardImg_first);
        holder.cardName_first.setText(itemList.get(position).getName());
        holder.cardAuthor_first.setText(itemList.get(position).getAuthor());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

}
