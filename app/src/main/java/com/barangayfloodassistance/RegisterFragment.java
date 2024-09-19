package com.barangayfloodassistance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

public class RegisterFragment extends Fragment {

    private EditText etFullName, etEmail, etPhone, etPassword;
    private Button btnRegister;
    private TextView tvLoginPrompt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_register, container, false);

        etFullName = view.findViewById(R.id.etFullName);
        etEmail = view.findViewById(R.id.etEmail);
        etPhone = view.findViewById(R.id.etPhone);
        etPassword = view.findViewById(R.id.etPassword);
        btnRegister = view.findViewById(R.id.btnRegister);
        tvLoginPrompt = view.findViewById(R.id.tvLoginPrompt);

        btnRegister.setOnClickListener(v -> {
            // TODO: Implement registration logic
            Toast.makeText(getContext(), "Register clicked", Toast.LENGTH_SHORT).show();
        });

        tvLoginPrompt.setOnClickListener(v -> {
            ViewPager2 viewPager = requireActivity().findViewById(R.id.viewPager);
            viewPager.setCurrentItem(0);
        });

        return view;
    }
}