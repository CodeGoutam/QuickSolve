package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class speed extends AppCompatActivity {
    private EditText milePerHour;
    private EditText kiloMeterPerHour;
    private EditText footPerSecond;
    private EditText meterPerSecond;


    private Button kiloMeterPerHourBtn;
    private Button milePerHourBtn;
    private Button footPerSecondBtn;
    private Button meterPerSecondBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);


        milePerHour=findViewById(R.id.milePerHour);
        kiloMeterPerHour=findViewById(R.id.kiloMeterPerHour);
        footPerSecond=findViewById(R.id.footPerSecond);
        meterPerSecond=findViewById(R.id.meterPerSecond);


        milePerHourBtn=findViewById(R.id.milePerHourBtn);
        kiloMeterPerHourBtn=findViewById(R.id.kiloMeterPerHourBtn);
        footPerSecondBtn=findViewById(R.id.footPerSecondBtn);
       meterPerSecondBtn=findViewById(R.id.meterPerSecondBtn);


        //one
       milePerHourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=milePerHour.getText().toString();
                double onevar=Double.parseDouble(onein);
                //mile per hour    1
                double onesol=onevar;
                milePerHour.setText(""+onesol+" ");

                //kilometer/hour    2
                double twosol=onevar*1.609344;
                kiloMeterPerHour.setText(""+twosol+" ");

                //foot/second 3
                double threesol=onevar*1.46666667;
                footPerSecond.setText(""+threesol+" ");

                //meter/second 4
                double foursol=onevar*0.44704;
                meterPerSecond.setText(""+foursol+" ");

            }
        });


        //two
        kiloMeterPerHourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=kiloMeterPerHour.getText().toString();
                double onevar=Double.parseDouble(onein);
                //mile per hour    1

                double onesol=onevar*0.62137119;
                milePerHour.setText(""+onesol+" ");

                //kilometer/hour    2
                double twosol=onevar;
                kiloMeterPerHour.setText(""+twosol+" ");

                //foot/second 3
                double threesol=onevar*0.91134442;
                footPerSecond.setText(""+threesol+" ");

                //meter/second 4
                double foursol=onevar*0.27777778;
                meterPerSecond.setText(""+foursol+" ");

            }
        });


        //three
        footPerSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=footPerSecond.getText().toString();
                double onevar=Double.parseDouble(onein);
                //mile per hour    1
                double onesol=onevar*0.68181818;
                milePerHour.setText(""+onesol+" ");

                //kilometer/hour    2
                double twosol=onevar*1.09728;
                kiloMeterPerHour.setText(""+twosol+" ");

                //foot/second 3
                double threesol=onevar;
                footPerSecond.setText(""+threesol+" ");

                //meter/second 4
                double foursol=onevar*0.3048;
                meterPerSecond.setText(""+foursol+" ");

            }
        });



//four
        meterPerSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=meterPerSecond.getText().toString();
                double onevar=Double.parseDouble(onein);

                //meter per hour    1
                double onesol=onevar*2.23693629;
                milePerHour.setText(""+onesol+" ");

                //kilometer/hour    2
                double twosol=onevar*3.6;
                kiloMeterPerHour.setText(""+twosol+" ");

                //foot/second 3
                double threesol=onevar*3.2808399;
                footPerSecond.setText(""+threesol+" ");

                //meter/second 4
                double foursol=onevar;
                meterPerSecond.setText(""+foursol+" ");

            }
        });








    }
}