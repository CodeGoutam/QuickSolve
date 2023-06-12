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

    private Button milligramBtn;
    private Button microgramBtn;
    private Button nanogramBtn;
    private Button picogramBtn;
    private Button kilogramBtn;
    private Button megagramBtn;
    private Button poundBtn;
    private Button gramBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        milligram=findViewById(R.id.milligram);
        microgram=findViewById(R.id.microgram);
        nanogram=findViewById(R.id.nanogram);
       picogram=findViewById(R.id.picogram);
        kilogram=findViewById(R.id.kilogram);
        megagram=findViewById(R.id.megagram);
        pound=findViewById(R.id.pound);
        gram=findViewById(R.id.gram);

        milligramBtn=findViewById(R.id.milligramBtn);
        microgramBtn=findViewById(R.id.microgramBtn);
        nanogramBtn=findViewById(R.id.nanogramBtn);
        picogramBtn=findViewById(R.id.picogramBtn);
        kilogramBtn=findViewById(R.id.kilogramBtn);
        megagramBtn=findViewById(R.id.megagramBtn);
        poundBtn=findViewById(R.id.poundBtn);
        gramBtn=findViewById(R.id.gramBtn);

        //one
        milligramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=milligram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*1000;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*1000000;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*1000000000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*0.000001;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.000000001;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*0.0000022;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*0.001;
               gram.setText(""+eightsol+" ");
            }
        });



        //two
        microgramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=microgram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.001;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*1000;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*1000000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*0.000000001;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.000000000001;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*2.2046*0.000000001;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*0.000001;
                gram.setText(""+eightsol+" ");
            }
        });



        //three
        nanogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=nanogram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.000001;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*0.001;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*1000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*0.000000000001;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.000000000000001;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*2.2046*0.000000000001;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*0.000000001;
                gram.setText(""+eightsol+" ");
            }
        });


        //four
        picogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=picogram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*0.000000001;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*0.000001;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*0.001;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*0.000000000000001;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.000000000000000001;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*2.2046*0.000000000000001;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*0.000000000001;
                gram.setText(""+eightsol+" ");
            }
        });




        //five
        kilogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=kilogram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000000;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*1000000000;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*100000000*10000;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*1000000*10000*100000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.001;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*2.20462262;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*1000;
                gram.setText(""+eightsol+" ");
            }
        });



        //six
        megagramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=megagram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000000000;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*1000000000*1000;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*1000000*1000000000;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*1000000000*1000000000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*1000;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*2204.62262;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*1000000;
                gram.setText(""+eightsol+" ");
            }
        });



        //seven
        picogramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=picogram.getText().toString();
                double onevar=Double.parseDouble(onein);

                //milligram    1
                double onesol=onevar*453592.37;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*4.5359*100000000;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*4.5359*1000000*100000;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*4.5359*10000000*10000000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*0.45359237;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.00045359;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*453.59237;
                gram.setText(""+eightsol+" ");
            }
        });


        //EIGHT
        gramBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=gram.getText().toString();
                double onevar=Double.parseDouble(onein);
                //milligram    1
                double onesol=onevar*1000;
                milligram.setText(""+onesol+" ");

                //microgram    2
                double twosol=onevar*1000000;
                microgram.setText(""+twosol+" ");

                //nanogram  3
                double threesol=onevar*1000000000;
                nanogram.setText(""+threesol+" ");

                //picogram   4
                double foursol=onevar*10000000*100000;
                picogram.setText(""+foursol+" ");

                //kilogram  5
                double fivesol=onevar*0.001;
                kilogram.setText(""+fivesol+" ");

                //megagram   6
                double sixsol=onevar*0.000001;
                megagram.setText(""+sixsol+" ");

                //pound    7
                double sevensol=onevar*0.00220462;
                pound.setText(""+sevensol+" ");

                //gram    8
                double eightsol=onevar*453.59237;
                gram.setText(""+eightsol+" ");
            }
        });


    }
}