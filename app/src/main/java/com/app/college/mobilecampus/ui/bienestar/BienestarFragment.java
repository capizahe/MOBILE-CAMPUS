package com.app.college.mobilecampus.ui.bienestar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.app.college.mobilecampus.R;

public class BienestarFragment extends Fragment {

    private BienestarViewModel bienestarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bienestarViewModel =
                ViewModelProviders.of(this).get(BienestarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bienestar, container, false);


        return root;
    }
}