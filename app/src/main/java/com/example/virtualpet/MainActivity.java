package com.example.virtualpet;

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

    public void openNatureActivity(View view) {
        Intent intentToOpenNatureActivity = new Intent(this, NatureActivity.class);
        startActivity(intentToOpenNatureActivity);
    }

    public void openFireActivity(View view) {
        Intent intentToOpenFireActivity = new Intent(this, FireActivity.class);
        startActivity(intentToOpenFireActivity);
    }
    public void openWaterActivity(View view) {
        Intent intentToOpenWaterActivity = new Intent(this, WaterActivity.class);
        startActivity(intentToOpenWaterActivity);
    }

    public void openLightningActivity(View view) {
        Intent intentToOpenLightningActivity = new Intent(this, LightningActivity.class);
        startActivity(intentToOpenLightningActivity);
    }

    public void openEarthActivity(View view) {
        Intent intentToOpenEarthActivity = new Intent( this, EarthActivity.class);
        startActivity(intentToOpenEarthActivity);
    }

    public void openDarkActivity(View view) {
        Intent intentToOpenDarkActivity = new Intent( this, DarkActivity.class);
        startActivity(intentToOpenDarkActivity);
    }

    public void openLightActivity(View view) {
        Intent intentToOpenLightActivity = new Intent( this, LightActivity.class);
        startActivity(intentToOpenLightActivity);
    }

    public void openMetalActivity(View view) {
        Intent intentToOpenMetalActivity = new Intent( this, MetalActivity.class);
        startActivity(intentToOpenMetalActivity);
    }

    public void openMagicActivity(View view) {
        Intent intentToOpenMagicActivity = new Intent( this, MagicActivity.class);
        startActivity(intentToOpenMagicActivity);
    }

    public void openQuizActivity(View view){
        Intent intentToOpenQuizActivity = new Intent( this, QuizActivity.class);
        startActivity(intentToOpenQuizActivity);
    }
}
