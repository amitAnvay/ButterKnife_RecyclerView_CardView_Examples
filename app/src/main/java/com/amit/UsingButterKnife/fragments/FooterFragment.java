package com.amit.UsingButterKnife.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.amit.UsingButterKnife.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FooterFragment extends Fragment {

    @Bind(R.id.fragment_text)
    TextView textView;


    public FooterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_footer, container, false);
        ButterKnife.bind(this,view);
        return view;

    }

    @OnClick(R.id.fragment_text)
    void onFooterClicked(){
        Toast.makeText(getContext(),"Footer is clicked",Toast.LENGTH_SHORT).show();
    }

}
