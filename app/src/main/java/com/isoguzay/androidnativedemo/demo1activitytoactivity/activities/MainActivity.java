package com.isoguzay.androidnativedemo.demo1activitytoactivity.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isoguzay.androidnativedemo.R;
import com.isoguzay.androidnativedemo.demo1activitytoactivity.model.Person;

public class MainActivity extends AppCompatActivity {

    Button buttonGoSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGoSecondActivity = findViewById(R.id.button_activity1);

        buttonGoSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("message", "Hello, I am second activity !");
                intent.putExtra("id",1);

                Person person = new Person(1,"isoguzay", 27, true);
                intent.putExtra("object", person);

                startActivity(intent);
            }
        });
    }
}
