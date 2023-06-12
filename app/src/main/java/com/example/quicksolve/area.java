package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class area extends AppCompatActivity {
    private TextInputEditText sqcm ;
    private TextInputEditText  sqm;
    private TextInputEditText  sqkm;
    private TextInputEditText sqmm;
    private TextInputEditText h;

    private Button sqcmBtn;
    private Button sqmBtn;
    private Button sqkmBtn;
    private Button sqmmBtn;
    private Button hBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        sqcm=(TextInputEditText)findViewById(R.id.sqcm);
        sqm=(TextInputEditText)findViewById(R.id.sqm);
        sqkm=(TextInputEditText)findViewById(R.id.sqkm);
        sqmm=(TextInputEditText)findViewById(R.id.sqmm);
        h=(TextInputEditText)findViewById(R.id.h);

        sqcmBtn=findViewById(R.id.sqcmBtn);
        sqmBtn=findViewById(R.id.sqmBtn);
        sqmmBtn=findViewById(R.id.sqmmBtn);
        sqkmBtn=findViewById(R.id.sqkmBtn);
        hBtn=findViewById(R.id.hBtn);

        //sqcmbtn one1
        sqcmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqcm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*1;
                sqcm.setText(""+onesol+" ");
//meter
                double twosol=onevar*(double) 0.0001;
                sqm.setText(""+twosol+" ");
//km
                double threesol=(double) onevar*(double)0.0000000001 ;
                sqkm.setText(""+(double)threesol+" ");
//mm
                double foursol=(double) onevar*(double)0.155 ;
                sqmm.setText(""+(double)foursol+" ");
//h
                double fivesol=(double) onevar*(double)100 ;
                h.setText(""+(double)fivesol+" ");
            }
        });


        //sqmbtn two2
        sqmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*10000;
                sqcm.setText(""+onesol+" ");
//meter
                double twosol=onevar*(double) 1;
                sqm.setText(""+twosol+" ");
//km
                double threesol=(double) onevar*(double)0.000001 ;
                sqkm.setText(""+(double)threesol+" ");
//mm
                double foursol=(double) onevar*(double)1000000 ;
                sqmm.setText(""+(double)foursol+" ");
//h
                double fivesol=(double) onevar*(double)0.0001 ;
                h.setText(""+(double)fivesol+" ");
            }
        });

        //sqkmbtn 3
        sqkmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqkm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*100000*100000;
                sqcm.setText(""+onesol+" ");
//meter
                double twosol=onevar*(double) 1000000;
                sqm.setText(""+twosol+" ");
//km
                double threesol=(double) onevar*(double)1 ;
                sqkm.setText(""+(double)threesol+" ");
//mm
                double foursol=(double) onevar*(double)1000000*1000000 ;
                sqmm.setText(""+(double)foursol+" ");
//h
                double fivesol=(double) onevar*(double)100 ;
                h.setText(""+(double)fivesol+" ");
            }
        });

        //sqmmbtn 4
        sqmmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=sqmm.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double)0.01;
                sqcm.setText(""+onesol+" ");
//meter
                double twosol=onevar*(double)0.000001 ;
                sqm.setText(""+twosol+" ");
//km
                double threesol=(double) onevar*(double)0.000000000001 ;
                sqkm.setText(""+(double)threesol+" ");
//mm
                double foursol=(double) onevar*(double)1 ;
                sqmm.setText(""+(double)foursol+" ");
//h
                double fivesol=(double) onevar*(double)0.0000000001 ;
                h.setText(""+(double)fivesol+" ");
            }
        });

        //hbtn 5
        hBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=h.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*100000000;
                sqcm.setText(""+onesol+" ");
//meter
                double twosol=onevar*(double) 10000;
                sqm.setText(""+twosol+" ");
//km
                double threesol=(double) onevar*(double)0.01 ;
                sqkm.setText(""+(double)threesol+" ");
//mm
                double foursol=(double) onevar*(double)100000*100000 ;
                sqmm.setText(""+(double)foursol+" ");
//h
                double fivesol=(double) onevar*(double)1 ;
                h.setText(""+(double)fivesol+" ");
            }
        });



    }
}