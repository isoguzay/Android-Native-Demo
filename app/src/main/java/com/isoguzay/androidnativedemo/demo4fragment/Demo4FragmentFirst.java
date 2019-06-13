package com.isoguzay.androidnativedemo.demo4fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.isoguzay.androidnativedemo.R;

public class Demo4FragmentFirst extends Fragment {

    private Button buttonDemo4First;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_demo4_first,container,false);

        buttonDemo4First = rootView.findViewById(R.id.button_fragment_first);

        buttonDemo4First.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("First Fragment", "Clicked First Fragment ! ");
            }
        });
        return rootView;
    }
}
