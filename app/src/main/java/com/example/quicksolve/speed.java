package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class speed extends AppCompatActivity {
    private EditText mph;
    private EditText kph;
    private EditText fps;
    private EditText mps;


    private Button kphbtn;
    private Button mphbtn;
    private Button fpsbtn;
    private Button mpsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);


        mph=findViewById(R.id.mile);
        kph=findViewById(R.id.cm);
       fps=findViewById(R.id.foot);
        mps=findViewById(R.id.millimeter);


        mphbtn=findViewById(R.id.micrometerbtn);
        kphbtn=findViewById(R.id.cmbtn);
        fpsbtn=findViewById(R.id.meterbtn);
       mpsbtn=findViewById(R.id.meterbtn);


        //one
       mphbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=mph.getText().toString();
                double onevar=Double.parseDouble(onein);
                //meter per hour    1
                double onesol=onevar;
                mph.setText(""+onesol+" "+"mile/hour");

                //kilometer/hour    2
                double twosol=onevar*1.609344;
                kph.setText(""+twosol+" "+"kilometer/hour");

                //foot/second 3
                double threesol=onevar*1.46666667;
                fps.setText(""+threesol+" "+"foot/second");

                //meter/second 4
                double foursol=onevar*0.44704;
                mps.setText(""+foursol+" "+"meter/second");

            }
        });


        //two
        kphbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=kph.getText().toString();
                double onevar=Double.parseDouble(onein);
                //meter per hour    1

                double onesol=onevar*0.62137119;
                mph.setText(""+onesol+" "+"mile/hour");

                //kilometer/hour    2
                double twosol=onevar;
                kph.setText(""+twosol+" "+"kilometer/hour");

                //foot/second 3
                double threesol=onevar*0.91134442;
                fps.setText(""+threesol+" "+"foot/second");

                //meter/second 4
                double foursol=onevar*0.27777778;
                mps.setText(""+foursol+" "+"meter/second");

            }
        });


        //three
        fpsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=fps.getText().toString();
                double onevar=Double.parseDouble(onein);
                //meter per hour    1
                double onesol=onevar*0.68181818;
                mph.setText(""+onesol+" "+"mile/hour");

                //kilometer/hour    2
                double twosol=onevar*1.09728;
                kph.setText(""+twosol+" "+"kilometer/hour");

                //foot/second 3
                double threesol=onevar;
                fps.setText(""+threesol+" "+"foot/second");

                //meter/second 4
                double foursol=onevar*0.3048;
                mps.setText(""+foursol+" "+"meter/second");

            }
        });



//four
        mpsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=mps.getText().toString();
                double onevar=Double.parseDouble(onein);

                //meter per hour    1
                double onesol=onevar*2.23693629;
                mph.setText(""+onesol+" "+"mile/hour");

                //kilometer/hour    2
                double twosol=onevar*3.6;
                kph.setText(""+twosol+" "+"kilometer/hour");

                //foot/second 3
                double threesol=onevar*3.2808399;
                fps.setText(""+threesol+" "+"foot/second");

                //meter/second 4
                double foursol=onevar;
                mps.setText(""+foursol+" "+"meter/second");

            }
        });








    }
}