package com.example.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class FirstFragment extends Fragment {
    Button button;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_first, container, false);
        button = view.findViewById(R.id.bottom_add);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(requireActivity(),R.id.fragmentContainerView);
                navController.navigate(R.id.action_firstFragment_to_secondFragment22);
            }
        });
        return view;
    }
}
