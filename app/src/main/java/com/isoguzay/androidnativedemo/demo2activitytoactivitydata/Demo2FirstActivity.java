package com.isoguzay.androidnativedemo.demo2activitytoactivitydata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.isoguzay.androidnativedemo.R;

public class Demo2FirstActivity extends AppCompatActivity {

    private EditText editTextDemo2;
    private Button buttonDemo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2_first);
        editTextDemo2 = findViewById(R.id.editText_demo2first);
        buttonDemo2 = findViewById(R.id.button_demo2first);

        buttonDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getMessage = editTextDemo2.getText().toString();

                Intent intentNext = new Intent(Demo2FirstActivity.this, Demo2SecondActivity.class);
                intentNext.putExtra("message", getMessage);
                startActivity(intentNext);
            }
        });

    }
}
