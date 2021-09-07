package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        Sensor sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        EditText inputX = findViewById(R.id.valueX);
        EditText inputY = findViewById(R.id.valueY);
        EditText inputZ = findViewById(R.id.valueZ);

        Float valueX = Float.parseFloat(inputX.getText().toString());
        Float valueY = Float.parseFloat(inputY.getText().toString());
        Float valueZ = Float.parseFloat(inputZ.getText().toString());

        Float newValueX = sensorEvent.values[0];
        Float newValueY = sensorEvent.values[1];
        Float newValueZ = sensorEvent.values[2];

        if(Math.abs(valueX - newValueX) > 2 || Math.abs(valueY - newValueY) > 2 || Math.abs(valueZ - newValueZ) > 2){
            Intent i = new Intent(this,Activity3b.class);
            startActivity(i);
        }

        inputX.setText(String.valueOf(newValueX));
        inputY.setText(String.valueOf(newValueY));
        inputZ.setText(String.valueOf(newValueZ));

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}