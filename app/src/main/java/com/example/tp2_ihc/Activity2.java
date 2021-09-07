package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void Send(View view)
    {
        EditText input = (EditText) findViewById(R.id.editTextTextPersonName);

        Intent i = new Intent(this, Activity2SecondScreen.class);
        i.putExtra("data", input.getText().toString());
        startActivity(i);
    }
}