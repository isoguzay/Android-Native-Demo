package com.isoguzay.androidnativedemo.demo3backbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.isoguzay.androidnativedemo.R;


public class Demo3ActivitySecond extends AppCompatActivity {

    private TextView textViewDemo3Second;
    private Button buttonDemo3Second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3_second);

        textViewDemo3Second = findViewById(R.id.textView_demo3);
        buttonDemo3Second = findViewById(R.id.button_demo3second);

        buttonDemo3Second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTo3 = new Intent(Demo3ActivitySecond.this, Demo3ActivityThird.class);
                startActivity(intentTo3);
            }
        });
    }

    /*@Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intentTo1 = new Intent(Demo3ActivitySecond.this, Demo3ActivityFirst.class);
        startActivity(intentTo1);
    }*/
}
