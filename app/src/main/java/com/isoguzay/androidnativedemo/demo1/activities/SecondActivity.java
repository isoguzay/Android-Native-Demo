package com.isoguzay.androidnativedemo.demo1.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.isoguzay.androidnativedemo.R;
import com.isoguzay.androidnativedemo.demo1.model.Person;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewSecondActivity = findViewById(R.id.textView_secondactivity);

        String getMessage = getIntent().getStringExtra("message");
        int getId = getIntent().getIntExtra("id", 0);
        String getName = getIntent().getStringExtra("name");

        Person getPerson = (Person) getIntent().getSerializableExtra("object");

        textViewSecondActivity.setText(getPerson.getId() + " - " + getPerson.getPersonName());

    }
}
