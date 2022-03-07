package com.example.programe.ui.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;

public class MyRecyclerViewHolderType extends RecyclerView.ViewHolder{
    TextView cat_type_title;

    public MyRecyclerViewHolderType(@NonNull View itemView) {
        super(itemView);
        cat_type_title=itemView.findViewById(R.id.cat_type_title);
    }
}
