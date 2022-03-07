package com.example.programe.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;

class MyRecyclerViewHolderCardBook extends RecyclerView.ViewHolder {
    TextView cardName_first, cardAuthor_first, cardName_second,cardAuthor_second;
    ImageView cardImg_first,cardImg_second;

    public MyRecyclerViewHolderCardBook(@NonNull View itemView) {

        super(itemView);

        cardName_first  = itemView.findViewById(R.id.card_item_name_first);
        cardAuthor_first = itemView.findViewById(R.id.card_item_author_first);
        cardImg_first   = itemView.findViewById(R.id.card_image_first);

        cardName_second  = itemView.findViewById(R.id.card_item_name_second);
        cardAuthor_second = itemView.findViewById(R.id.card_item_author_second);
        cardImg_second   = itemView.findViewById(R.id.card_image_second);

    }
}
