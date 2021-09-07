package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3b);
    }

    public void ReturnToMenu(View view){

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }

}