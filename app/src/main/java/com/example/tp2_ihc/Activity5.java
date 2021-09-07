package com.example.tp2_ihc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor temperature;
    TextView temperatureValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        temperatureValue = (TextView) findViewById(R.id.temperature1);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        temperature = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);

        if(temperature != null){
            sensorManager.registerListener(Activity5.this, temperature, SensorManager.SENSOR_DELAY_NORMAL);
        }else{
            temperatureValue.setText("Temperature sensor not supported.");
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor = sensorEvent.sensor;

        if(sensor.getType() == Sensor.TYPE_AMBIENT_TEMPERATURE){
            temperatureValue.setText("Temperature Value in Celsius Degrees:" + sensorEvent.values[0]);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}