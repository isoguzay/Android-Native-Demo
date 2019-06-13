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

public class Demo4FragmentSecond extends Fragment {

    private Button buttonDemo4Second;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_demo4_second, container,false);

        buttonDemo4Second = rootView.findViewById(R.id.button_fragment_second);

        buttonDemo4Second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("Second Fragment", "Clicked Second Fragment ! ");
            }
        });

        return rootView;
    }
}
