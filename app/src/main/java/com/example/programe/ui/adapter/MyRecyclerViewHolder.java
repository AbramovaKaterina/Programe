package com.example.programe.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;

class MyRecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView cardName, cardAuthor;
    ImageView cardImg;

    public MyRecyclerViewHolder(@NonNull View itemView) {

        super(itemView);
        cardName  = itemView.findViewById(R.id.card_item_name);
        cardAuthor = itemView.findViewById(R.id.card_item_author);
        cardImg   = itemView.findViewById(R.id.card_image);
    }
}
