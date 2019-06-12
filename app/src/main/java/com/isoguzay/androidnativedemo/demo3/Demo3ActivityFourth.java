package com.isoguzay.androidnativedemo.demo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isoguzay.androidnativedemo.R;

public class Demo3ActivityFourth extends AppCompatActivity {

    private Button buttonDemo3fourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3_fourth);

        buttonDemo3fourth = findViewById(R.id.button_demo3fourth);

        buttonDemo3fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTo2 = new Intent(Demo3ActivityFourth.this, Demo3ActivitySecond.class);
                startActivity(intentTo2);
            }
        });
    }
}
