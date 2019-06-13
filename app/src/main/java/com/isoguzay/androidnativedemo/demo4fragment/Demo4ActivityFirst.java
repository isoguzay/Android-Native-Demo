package com.isoguzay.androidnativedemo.demo4fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.isoguzay.androidnativedemo.R;

public class Demo4ActivityFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo4_first);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment_first,new Demo4FragmentFirst());
        fragmentTransaction.add(R.id.fragment_second,new Demo4FragmentSecond());
        fragmentTransaction.commit();
    }
}
