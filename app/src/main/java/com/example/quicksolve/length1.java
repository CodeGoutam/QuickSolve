package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class length1 extends AppCompatActivity {
    private EditText cm ;
    private EditText  meter;
    private EditText  km;
    private EditText  inch;
    private EditText  millimeter;
    private EditText  foot;
    private EditText  yard;
    private EditText  mile;
    private EditText  nanometer;
    private EditText  micrometer;

    private Button cmbtn;
    private Button meterbtn;
    private Button kmbtn;
    private Button inchbtn;
    private Button millimeterbtn;
    private Button footbtn;
    private Button yardbtn;
    private Button milebtn;
    private Button nanometerbtn;
    private Button micrometerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length1);

        cm=findViewById(R.id.cm);
        meter=findViewById(R.id.meter);
        km=findViewById(R.id.km);
        inch=findViewById(R.id.inch);
        millimeter=findViewById(R.id.millimeter);
        foot=findViewById(R.id.foot);
        yard=findViewById(R.id.yard);
        mile=findViewById(R.id.mile);
        nanometer=findViewById(R.id.nanometer);
        micrometer=findViewById(R.id.micrometer);

        cmbtn=findViewById(R.id.cmbtn);
        meterbtn=findViewById(R.id.meterbtn);
        kmbtn=findViewById(R.id.kmbtn);
        inchbtn=findViewById(R.id.inchbtn);
        millimeterbtn=findViewById(R.id.millimeterbtn);
        footbtn=findViewById(R.id.footbtn);
        yardbtn=findViewById(R.id.yardbtn);
        milebtn=findViewById(R.id.milebtn);
        nanometerbtn=findViewById(R.id.nanometerbtn);
        micrometerbtn=findViewById(R.id.micrometerbtn);

        cmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein= cm.getText().toString();

//one1
                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*1;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*100;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar/(double) 100000;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 0.394;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*10 ;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*0.0328084;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*0.0109361;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*0.0000062137;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*10000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*10000;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });

//two2

        meterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=meter.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*100;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*1;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.001 ;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 39.37;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*1000 ;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 3.28084;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double) 1.094;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.000621;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 1000000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*1000000;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });

//three3

        kmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=km.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*100000;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*1000;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)1 ;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 39370.0787;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*1000000;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double)3280.8399;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double) 1093.6133;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.62137119;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
               double ninesol=(double) onevar*(double)1000000000*1000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*1000000000;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });

//four4

        inchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=inch.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*2.54;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double) 0.0254;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.0000254;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 1;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*25.4 ;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 0.08333333;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double)0.02777778;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.00001578;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 2.54*10000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*25400;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });
//fifth 5

        millimeterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=millimeter.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double)0.1;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double) 0.001;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.000001;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 0.03937008;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*25.4 ;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 0.08333333;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double)0.02777778;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.00001578;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 2.5400*10000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*1000;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });


        //sixth6

        footbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=foot.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double)30.48 ;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double) 0.3048;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.0003048 ;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 12;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*(double) 304.8;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 1;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double) 0.33333333;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.00018939;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 3.0480*100000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*(double)304800;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });

//seventh7

        yardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=yard.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double) 91.44;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double) 0.9144;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.0009144 ;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 36;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*(double) 914.4;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 3;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double) 1;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.00056818;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 9.1440*100000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*(double)914400;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });

//eighth8

        milebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=mile.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double)160934.4;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double)1609.344;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)1.609344;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double)63360;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*(double)1.6093*1000000;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 5280;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double)1760;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double) 0.00056818;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 9.1440*100000000;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*914400;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });
//ninth9

        nanometerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=nanometer.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double) 0.0000001;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double)0.000000001;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.000000000001 ;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double) 3.9370*0.00000001;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*(double) 0.000001;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double) 3.2808*0.000000001;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double) 1.0936*0.000000001;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double)6.2137*0.0000000000001;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double) 1;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*(double) 0.001;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });

        //tenth10

        micrometerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=micrometer.getText().toString();


                double onevar=Double.parseDouble(onein);
//cm
                double onesol=onevar*(double)0.0001 ;
                cm.setText(""+onesol+" "+"cm");
//meter
                double twosol=onevar*(double) 0.000001;
                meter.setText(""+twosol+" "+"meter");
//km
                double threesol=(double) onevar*(double)0.000000001 ;
                km.setText(""+(double)threesol+" "+"km");
//inch
                double foursol=(double) onevar*(double)0.00003937 ;
                inch.setText(""+(double)foursol+" "+"inch");
//mm
                double fivesol=(double) onevar*(double) 0.001;
                millimeter.setText(""+(double)fivesol+" "+"mm");
//foot
                double sixsol=(double) onevar*(double)0.00000328;
                foot.setText(""+(double)sixsol+" "+"foot");
//yard
                double sevensol=(double) onevar*(double)0.00000109 ;
                yard.setText(""+(double)sevensol+" "+"yard");
//mile
                double eightsol=(double) onevar*(double)6.2137*0.0000000001 ;
                mile.setText(""+(double)eightsol+" "+"mile");
//nanometer
                double ninesol=(double) onevar*(double)1000 ;
                nanometer.setText(""+(double)ninesol+" "+"nm");
//micrometer
                double tensol=(double) onevar*1;
                micrometer.setText(""+(double)tensol+" "+"micrometer");
            }
        });


    }
}