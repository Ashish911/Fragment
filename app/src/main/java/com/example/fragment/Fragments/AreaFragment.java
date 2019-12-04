package com.example.fragment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaFragment extends Fragment implements View.OnClickListener{

    private Button btnCalc;
    private EditText etRadius;

    public AreaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_area, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnCalc = view.findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float Radius = Float.parseFloat(etRadius.getText().toString());
        float Result = 3.14f * Radius * Radius;

        Toast.makeText(getActivity(), "Radius is :" + Result, Toast.LENGTH_SHORT).show();
    }
}
