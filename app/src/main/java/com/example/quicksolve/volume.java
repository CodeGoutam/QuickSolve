package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume extends AppCompatActivity {
    private EditText cubicCentimeter;
    private EditText cubicMile;
    private EditText cubicMeter;
    private EditText cubicDecimeter;
    private EditText cubicKilometer;
    private EditText cubicInch;
    private EditText cubicYard;
    private EditText cubicFoot;

    private Button cubicCentimeterBtn;
    private Button cubicMeterBtn;
    private Button cubicDecimeterBtn;
    private Button cubicKilometerBtn;
    private Button cubicInchBtn;
    private Button cubicYardBtn;
    private Button cubicMileBtn;
    private Button cubicFootBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        cubicCentimeter=findViewById(R.id.cubicCentimeter);
        cubicMile=findViewById(R.id.cubicMile);
        cubicMeter=findViewById(R.id.cubicMeter);
        cubicDecimeter=findViewById(R.id.cubicDecimeter);
        cubicKilometer=findViewById(R.id.cubicKilometer);
        cubicInch=findViewById(R.id.cubicInch);
        cubicYard=findViewById(R.id.cubicYard);
        cubicFoot=findViewById(R.id.cubicFoot);

        cubicCentimeterBtn=findViewById(R.id.cubicCentimeterBtn);
        cubicMileBtn=findViewById(R.id.cubicMileBtn);
        cubicMeterBtn=findViewById(R.id.cubicMeterBtn);
        cubicDecimeterBtn=findViewById(R.id.cubicDecimeterBtn);
        cubicKilometerBtn=findViewById(R.id.cubicKilometerBtn);
        cubicInchBtn=findViewById(R.id.cubicInchBtn);
        cubicYardBtn=findViewById(R.id.cubicYardBtn);
        cubicFootBtn=findViewById(R.id.cubicFootBtn);

        //one
        cubicCentimeterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicCentimeter.getText().toString();
                double onevar=Double.parseDouble(onein);
            //ccm    1
                double onesol=onevar;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*0.000001;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*0.001;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*0.000000000000001;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*0.06102374;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*0.00000131;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*2.3991*0.0000000000000001;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*0.00003531;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //two
        cubicMeterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicMeter.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*1000000;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*1000;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*0.000000001;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*61023.7441;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*1.30795062;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*2.3991*0.0000000001;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*35.3146667;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //three
        cubicDecimeterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicDecimeter.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*1000;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*0.001;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*0.000000000001;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*61.0237441;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*0.00130795;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*2.3991*0.0000000000001;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*0.03531467;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //four
        cubicKilometerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicKilometer.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*100000000*100*100000;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*1000000000;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*1000000000*1000;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*6.1024*1000000000*100*100;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*1.3080*1000000000;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*0.23991276;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*3.5315*100000*100000;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //five
        cubicInchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicInch.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*16.387064;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*0.00001639;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*0.01638706;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*1.6387*0.00000000000001;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*0.00002143;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*3.9315*0.000000000000001;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*0.0005787;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //six
        cubicYardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicYard.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*764554.858;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*0.76455486;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*764.554858;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*7.6455*0.0000000001;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*46656;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*1.8343*0.0000000001;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*27;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //seven
        cubicMileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicMile.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*4.1682*10000000*100000000;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*4.1682*1000000000;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*4.1682*10000000*100000;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*4.16818183;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*2.5436*1000000000*100000;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*5.4518*1000000000;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar*1.4720*1000000*100000;
                cubicFoot.setText(""+eightsol+" ");
            }
        });


        //eight
        cubicFootBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cubicFoot.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*28316.8466;
                cubicCentimeter.setText(""+onesol+" ");

                //cm    2
                double twosol=onevar*0.02831685;
                cubicMeter.setText(""+twosol+" ");

                //cdm   3
                double threesol=onevar*28.3168466;
                cubicDecimeter.setText(""+threesol+" ");

                //ckm    4
                double foursol=onevar*2.8317*0.00000000001;
                cubicKilometer.setText(""+foursol+" ");

                //cinch   5
                double fivesol=onevar*1728;
                cubicInch.setText(""+fivesol+" ");

                //cyard    6
                double sixsol=onevar*0.03703704;
                cubicYard.setText(""+sixsol+" ");

                //cmile    7
                double sevensol=onevar*6.7936*0.000000000001;
                cubicMile.setText(""+sevensol+" ");

                //cfoot    8
                double eightsol=onevar;
                cubicFoot.setText(""+eightsol+" ");
            }
        });
    }
}