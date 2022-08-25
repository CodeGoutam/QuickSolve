package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class temp extends AppCompatActivity {

    private EditText k;
    private EditText f;
    private EditText c;
    private EditText r;

    private Button kbtn;
    private Button fbtn;
    private Button cbtn;
    private Button rbtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        k=findViewById(R.id.mph);
        f=findViewById(R.id.kph);
        c=findViewById(R.id.fps);
        r=findViewById(R.id.mps);

        kbtn=findViewById(R.id.mphbtn);
        fbtn=findViewById(R.id.kphbtn);
        cbtn=findViewById(R.id.fpsbtn);
        rbtn=findViewById(R.id.mpsbtn);

        //one
        kbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kelvin
                String onein=k.getText().toString();


                 double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol=(double) onevar;
                k.setText(""+onesol+" "+"Kelvin");

                //fahrenheit

                double twosol=(double) 1.8*(double)(onevar-273.15)+32;
                f.setText(""+twosol+" "+"Fahrenheit");

                //celsius

                double threesol=onevar-273.15;
                c.setText(""+threesol+" "+"Celsius");

                //rankine

                double foursol=(double)onevar*(double)1.8;
                r.setText(""+foursol+" "+"Rankine");
            }
        });


        //two
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //fahrenheit
                String onein=f.getText().toString();


                double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol= (double)(onevar-32)/(double)1.8+(double)273.15;
                k.setText(""+onesol+" "+"Kelvin");

                //fahrenheit

                double twosol=(double) onevar;
                f.setText(""+twosol+" "+"Fahrenheit");

                //celsius

                double threesol=((double) onevar-32)/(double) 1.8;
                c.setText(""+threesol+" "+"Celsius");

                //rankine

                double foursol=(double) onevar+(double) 459.67;
                r.setText(""+foursol+" "+"Rankine");
            }
        });

        //three
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kelvin
                String onein=c.getText().toString();


                double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol=(double)onevar+(double) 273.15;
                k.setText(""+onesol+" "+"Kelvin");

                //fahrenheit

                double twosol=((double) onevar*1.8)+32;
                f.setText(""+twosol+" "+"Fahrenheit");

                //celsius

                double threesol=(double) onevar;
                c.setText(""+threesol+" "+"Celsius");

                //rankine

                double foursol=((double) onevar+273.15)*1.8;
                r.setText(""+foursol+" "+"Rankine");
            }
        });

        //four
        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kelvin
                String onein=r.getText().toString();


                double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol=(double) onevar/1.8;
                k.setText(""+onesol+" "+"Kelvin");

                //fahrenheit

                double twosol=(double) onevar-459.67;
                f.setText(""+twosol+" "+"Fahrenheit");

                //kelvin

                double threesol=((double) onevar-491.67)/1.8;
                c.setText(""+threesol+" "+"Celsius");

                //kelvin

                double foursol=(double) onevar;
                r.setText(""+foursol+" "+"Rankine");
            }
        });
    }
}