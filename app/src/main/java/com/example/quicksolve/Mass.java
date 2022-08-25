package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mass extends AppCompatActivity {

    private EditText milligram;
    private EditText microgram;
    private EditText ng;
    private EditText pg;
    private EditText kg;
    private EditText mg;
    private EditText p;
    private EditText g;

    private Button milligrambtn;
    private Button microgrambtn;
    private Button ngbtn;
    private Button pgbtn;
    private Button kgbtn;
    private Button mgbtn;
    private Button pbtn;
    private Button gbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        milligram=findViewById(R.id.mph);
        microgram=findViewById(R.id.kph);
        ng=findViewById(R.id.fps);
       pg=findViewById(R.id.pg);
        kg=findViewById(R.id.mps);
        mg=findViewById(R.id.mg);
        p=findViewById(R.id.p);
        g=findViewById(R.id.g);

        milligrambtn=findViewById(R.id.mphbtn);
        microgrambtn=findViewById(R.id.kphbtn);
        ngbtn=findViewById(R.id.fpsbtn);
        pgbtn=findViewById(R.id.mpsbtn);
        kgbtn=findViewById(R.id.kgbtn);
        mgbtn=findViewById(R.id.mgbtn);
        pbtn=findViewById(R.id.pbtn);
        gbtn=findViewById(R.id.gbtn);

        //one
        milligrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=milligram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*1000000;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000001;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000001;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*0.0000022;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.001;
               g.setText(""+eightsol+" "+"gram");
            }
        });



        //two
        microgrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=microgram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.001;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*1000;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000000001;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000000001;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.2046*0.000000001;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.000001;
                g.setText(""+eightsol+" "+"gram");
            }
        });



        //three
        ngbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=ng.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.000001;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*0.001;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000000000001;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000000000001;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.2046*0.000000000001;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.000000001;
                g.setText(""+eightsol+" "+"gram");
            }
        });


        //four
        pgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=pg.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.000000001;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*0.000001;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*0.001;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000000000000001;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000000000000001;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.2046*0.000000000000001;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.000000000001;
                g.setText(""+eightsol+" "+"gram");
            }
        });




        //five
        kgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=kg.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000000;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000000000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*100000000*10000;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000*10000*100000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.001;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.20462262;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*1000;
                g.setText(""+eightsol+" "+"gram");
            }
        });



        //six
        mgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=mg.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000000000;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000000000*1000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*1000000*1000000000;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000000*1000000000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*1000;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2204.62262;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*1000000;
                g.setText(""+eightsol+" "+"gram");
            }
        });



        //seven
        pbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=p.getText().toString();
                double onevar=Double.parseDouble(onein);

                //milligram    1
                double onesol=onevar*453592.37;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*4.5359*100000000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*4.5359*1000000*100000;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*4.5359*10000000*10000000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.45359237;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.00045359;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*453.59237;
                g.setText(""+eightsol+" "+"gram");
            }
        });


        //EIGHT
        gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=g.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*1000000000;
                ng.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*10000000*100000;
                pg.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.001;
                kg.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000001;
                mg.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*0.00220462;
                p.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*453.59237;
                g.setText(""+eightsol+" "+"gram");
            }
        });


    }
}