package com.isoguzay.androidnativedemo.demo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isoguzay.androidnativedemo.R;

public class Demo3ActivityThird extends AppCompatActivity {

    private Button buttonDemo3Third;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3_third);

        buttonDemo3Third = findViewById(R.id.button_demo3third);

        buttonDemo3Third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTo4 = new Intent(Demo3ActivityThird.this, Demo3ActivityFourth.class);
                startActivity(intentTo4);
            }
        });
    }
}
