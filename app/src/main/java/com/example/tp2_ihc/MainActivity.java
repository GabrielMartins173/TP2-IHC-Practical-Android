package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartActivity1(View view){

        Intent i = new Intent(this,Activity1.class);
        startActivity(i);

    }

    public void StartActivity2(View view){

        Intent i = new Intent(this,Activity2.class);
        startActivity(i);

    }

    public void StartActivity3(View view){

        Intent i = new Intent(this,Activity3.class);
        startActivity(i);

    }

    public void StartActivity4(View view){

        Intent i = new Intent(this,Activity4.class);
        startActivity(i);

    }

    public void StartActivity5(View view){

        Intent i = new Intent(this,Activity5.class);
        startActivity(i);

    }

    public void StartActivity6(View view){

        Intent i = new Intent(this,Activity6.class);
        startActivity(i);

    }
}