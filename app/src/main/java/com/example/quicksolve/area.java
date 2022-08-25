package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class area extends AppCompatActivity {
    private EditText sqcm ;
    private EditText  sqm;
    private EditText  sqkm;
    private EditText  sqmm;
    private EditText  h;

    private Button sqcmbtn;
    private Button sqmbtn;
    private Button sqkmbtn;
    private Button sqmmbtn;
    private Button hbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        sqcm=findViewById(R.id.mph);
        sqm=findViewById(R.id.kph);
        sqkm=findViewById(R.id.fps);
        sqmm=findViewById(R.id.mps);
        h=findViewById(R.id.mg);

        sqcmbtn=findViewById(R.id.mphbtn);
        sqmbtn=findViewById(R.id.kphbtn);
        sqkmbtn=findViewById(R.id.fpsbtn);
        sqmmbtn=findViewById(R.id.mpsbtn);
        hbtn=findViewById(R.id.kgbtn);

        //sqcmbtn one1
        sqcmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqcm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*1;
                sqcm.setText(""+onesol+" "+"sq. cm");
//meter
                double twosol=onevar*(double) 0.0001;
                sqm.setText(""+twosol+" "+"sq. meter");
//km
                double threesol=(double) onevar*(double)0.0000000001 ;
                sqkm.setText(""+(double)threesol+" "+"sq. km");
//mm
                double foursol=(double) onevar*(double)0.155 ;
                sqmm.setText(""+(double)foursol+" "+"sq. mm");
//h
                double fivesol=(double) onevar*(double)100 ;
                h.setText(""+(double)fivesol+" "+"hectare");
            }
        });


        //sqmbtn two2
        sqmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*10000;
                sqcm.setText(""+onesol+" "+"sq. cm");
//meter
                double twosol=onevar*(double) 1;
                sqm.setText(""+twosol+" "+"sq. meter");
//km
                double threesol=(double) onevar*(double)0.000001 ;
                sqkm.setText(""+(double)threesol+" "+"sq. km");
//mm
                double foursol=(double) onevar*(double)1000000 ;
                sqmm.setText(""+(double)foursol+" "+"sq. mm");
//h
                double fivesol=(double) onevar*(double)0.0001 ;
                h.setText(""+(double)fivesol+" "+"hectare");
            }
        });

        //sqkmbtn 3
        sqkmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqkm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*100000*100000;
                sqcm.setText(""+onesol+" "+"sq. cm");
//meter
                double twosol=onevar*(double) 1000000;
                sqm.setText(""+twosol+" "+"sq. meter");
//km
                double threesol=(double) onevar*(double)1 ;
                sqkm.setText(""+(double)threesol+" "+"sq. km");
//mm
                double foursol=(double) onevar*(double)1000000*1000000 ;
                sqmm.setText(""+(double)foursol+" "+"sq. mm");
//h
                double fivesol=(double) onevar*(double)100 ;
                h.setText(""+(double)fivesol+" "+"hectare");
            }
        });

        //sqmmbtn 4
        sqmmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqmm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double)0.01;
                sqcm.setText(""+onesol+" "+"sq. cm");
//meter
                double twosol=onevar*(double)0.000001 ;
                sqm.setText(""+twosol+" "+"sq. meter");
//km
                double threesol=(double) onevar*(double)0.000000000001 ;
                sqkm.setText(""+(double)threesol+" "+"sq. km");
//mm
                double foursol=(double) onevar*(double)1 ;
                sqmm.setText(""+(double)foursol+" "+"sq. mm");
//h
                double fivesol=(double) onevar*(double)0.0000000001 ;
                h.setText(""+(double)fivesol+" "+"hectare");
            }
        });

        //hbtn 5
        hbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=h.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*100000000;
                sqcm.setText(""+onesol+" "+"sq. cm");
//meter
                double twosol=onevar*(double) 10000;
                sqm.setText(""+twosol+" "+"sq. meter");
//km
                double threesol=(double) onevar*(double)0.01 ;
                sqkm.setText(""+(double)threesol+" "+"sq. km");
//mm
                double foursol=(double) onevar*(double)100000*100000 ;
                sqmm.setText(""+(double)foursol+" "+"sq. mm");
//h
                double fivesol=(double) onevar*(double)1 ;
                h.setText(""+(double)fivesol+" "+"hectare");
            }
        });



    }
}