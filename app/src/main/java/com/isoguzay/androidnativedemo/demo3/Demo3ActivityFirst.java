package com.isoguzay.androidnativedemo.demo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.isoguzay.androidnativedemo.R;

public class Demo3ActivityFirst extends AppCompatActivity {

    private Button buttonDemo3First;
    private EditText editTextDemo3First;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3_first);

        buttonDemo3First = findViewById(R.id.button_demo3first);
        editTextDemo3First = findViewById(R.id.editText_demo3first);

        buttonDemo3First.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTo2 = new Intent(Demo3ActivityFirst.this, Demo3ActivitySecond.class);
                startActivity(intentTo2);
            }
        });

    }
}
