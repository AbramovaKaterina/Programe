package com.example.programe.ui.goadd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.programe.R;
import com.example.programe.databinding.ActivityGoToAddingBinding;


public class GoToAdding extends AppCompatActivity {

    ActivityGoToAddingBinding binding;
    ProgressDialog progressDialog;

    public void onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_adding);
            GoToAddingModel addingModel =
                    new ViewModelProvider(this).get(GoToAddingModel.class);

            binding = ActivityGoToAddingBinding.inflate(inflater, container, false);
            View root = binding.getRoot();


        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Wait");
        progressDialog.setCanceledOnTouchOutside(false);


        binding.add.setOnClickListener(v -> {


        });
    }
}
