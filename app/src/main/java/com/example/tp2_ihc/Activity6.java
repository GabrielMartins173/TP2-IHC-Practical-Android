package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        Button getGPSBtn = (Button) findViewById(R.id.gps);

        ActivityCompat.requestPermissions(Activity6.this, new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, 123);

        getGPSBtn.setOnClickListener(view -> {
            GPSTracker gpsTracker = new GPSTracker(getApplicationContext());
            Location location = gpsTracker.getLocation();

            if(location != null){
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                Toast.makeText(getApplicationContext(), "LAT: " + latitude + "\nLONG: " + longitude, Toast.LENGTH_LONG).show();
            }
        });
    }
}