package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);


    }

    public void sum(View view){
        EditText input1 = (EditText) findViewById(R.id.editTextNumber);
        EditText input2 = (EditText) findViewById(R.id.editTextNumber2);

        String value1 = input1.getText().toString();
        String value2 = input2.getText().toString();

        Integer result = Integer.parseInt(value1) + Integer.parseInt(value2);

        TextView resultText = findViewById(R.id.resultText);
        resultText.setText(result.toString());

        Toast.makeText(this, "Value: " + result, Toast.LENGTH_SHORT).show();
    }
}