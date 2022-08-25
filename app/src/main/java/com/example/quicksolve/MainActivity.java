package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        startActivity(new Intent(MainActivity.this,unitconverter.class));
    }
},500);


}}