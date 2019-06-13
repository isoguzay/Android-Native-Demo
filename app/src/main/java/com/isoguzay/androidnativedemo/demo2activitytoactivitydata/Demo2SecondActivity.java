package com.isoguzay.androidnativedemo.demo2activitytoactivitydata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.isoguzay.androidnativedemo.R;

public class Demo2SecondActivity extends AppCompatActivity {

    private TextView textViewDemo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2_second);
        textViewDemo2 = findViewById(R.id.textView_demo2);

        String getData = getIntent().getStringExtra("message");

        textViewDemo2.setText(getData);
    }
}
