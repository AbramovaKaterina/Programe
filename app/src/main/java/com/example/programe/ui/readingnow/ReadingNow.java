package com.example.programe.ui.readingnow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.programe.R;
import com.example.programe.databinding.FragmentReadingNowBinding;

public class ReadingNow extends Fragment {

    FragmentReadingNowBinding binding;
    RecyclerView listView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ReadingNowViewModel notificationsViewModel =
                new ViewModelProvider(this).get(ReadingNowViewModel.class);

        binding = FragmentReadingNowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



//        final TextView textView = binding.navigationReadingNow;
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}