package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_second_screen);

        TextView ed1 = (TextView) findViewById(R.id.messageResult);

        String valueText = getIntent().getStringExtra("data");
        ed1.setText(valueText);
    }
}