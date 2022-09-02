package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Mass extends AppCompatActivity {

    private EditText milligram;
    private EditText microgram;
    private EditText nanogram;
    private EditText picogram;
    private EditText kilogram;
    private EditText megagram;
    private EditText pound;
    private EditText gram;

    private Button milligrambtn;
    private Button microgrambtn;
    private Button nanogrambtn;
    private Button picogrambtn;
    private Button kilogrambtn;
    private Button megagrambtn;
    private Button poundbtn;
    private Button grambtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        milligram=findViewById(R.id.mile);
        microgram=findViewById(R.id.cm);
        nanogram=findViewById(R.id.foot);
       picogram=findViewById(R.id.picogram);
        kilogram=findViewById(R.id.kilogram);
        megagram=findViewById(R.id.megagram);
        pound=findViewById(R.id.pound);
        gram=findViewById(R.id.gram);

        milligrambtn=findViewById(R.id.micrometerbtn);
        microgrambtn=findViewById(R.id.cmbtn);
        nanogrambtn=findViewById(R.id.nanogrambtn);
        picogrambtn=findViewById(R.id.picogrambtn);
        kilogrambtn=findViewById(R.id.kilogrambtn);
        megagrambtn=findViewById(R.id.megagrambtn);
        poundbtn=findViewById(R.id.poundbtn);
        grambtn=findViewById(R.id.grambtn);

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
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000001;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000001;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*0.0000022;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.001;
               gram.setText(""+eightsol+" "+"gram");
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
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000000001;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000000001;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.2046*0.000000001;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.000001;
                gram.setText(""+eightsol+" "+"gram");
            }
        });



        //three
        nanogrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=nanogram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.000001;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*0.001;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar;
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000000000001;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000000000001;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.2046*0.000000000001;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.000000001;
                gram.setText(""+eightsol+" "+"gram");
            }
        });


        //four
        picogrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=picogram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.000000001;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*0.000001;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*0.001;
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.000000000000001;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000000000000000001;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.2046*0.000000000000001;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*0.000000000001;
                gram.setText(""+eightsol+" "+"gram");
            }
        });




        //five
        kilogrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=kilogram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000000;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000000000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*100000000*10000;
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000*10000*100000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.001;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2.20462262;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*1000;
                gram.setText(""+eightsol+" "+"gram");
            }
        });



        //six
        megagrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=megagram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000000000;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000000000*1000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*1000000*1000000000;
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*1000000000*1000000000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*1000;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*2204.62262;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*1000000;
                gram.setText(""+eightsol+" "+"gram");
            }
        });



        //seven
        picogrambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=picogram.getText().toString();
                double onevar=Double.parseDouble(onein);

                //milligram    1
                double onesol=onevar*453592.37;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*4.5359*100000000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*4.5359*1000000*100000;
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*4.5359*10000000*10000000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.45359237;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.00045359;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*453.59237;
                gram.setText(""+eightsol+" "+"gram");
            }
        });


        //EIGHT
        grambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=gram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000;
                milligram.setText(""+onesol+" "+"milligram");

                //microgram    2
                double twosol=onevar*1000000;
                microgram.setText(""+twosol+" "+" microgram");

                //nanogram  3
                double threesol=onevar*1000000000;
                nanogram.setText(""+threesol+" "+"nanogram");

                //picogram   4
                double foursol=onevar*10000000*100000;
                picogram.setText(""+foursol+" "+"picogram");

                //kilogram  5
                double fivesol=onevar*0.001;
                kilogram.setText(""+fivesol+" "+"kilogram");

                //megagram   6
                double sixsol=onevar*0.000001;
                megagram.setText(""+sixsol+" "+"megagram");

                //pound    7
                double sevensol=onevar*0.00220462;
                pound.setText(""+sevensol+" "+"pound");

                //gram    8
                double eightsol=onevar*453.59237;
                gram.setText(""+eightsol+" "+"gram");
            }
        });


    }
}