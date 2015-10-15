package com.example.simo.cumpleburpees;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment{

    EditText mAge;
    Button mbutton;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mAge = (EditText) rootView.findViewById(R.id.AgeEditText);
        mbutton= (Button) rootView.findViewById(R.id.calcButton);
        mbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                String ageText;
                ageText = mAge.getText().toString();
                if (ageText.matches("")){
                    mAge.setHint(R.string.Hint_Age);
                }else{
                    int age = Integer.valueOf(mAge.getText().toString());
                    if (age <= 36) {
                        Intent intent = new Intent(getActivity(), burpees_result.class);
                        intent.putExtra("age", age);
                        getActivity().startActivity(intent);
                    } else {
                        Intent intent = new Intent(getActivity(), du_result.class);
                        intent.putExtra("age", age);
                        getActivity().startActivity(intent);
                    }
                }
            }
        });
        return rootView;
    }
}
