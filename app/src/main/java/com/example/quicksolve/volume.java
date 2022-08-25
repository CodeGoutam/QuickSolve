package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class volume extends AppCompatActivity {
    private EditText ccm;
    private EditText cm;
    private EditText cdm;
    private EditText ckm;
    private EditText cinch;
    private EditText cyard;
    private EditText cmile;
    private EditText cfoot;

    private Button ccmbtn;
    private Button cmbtn;
    private Button cdmbtn;
    private Button ckmbtn;
    private Button cinchbtn;
    private Button cyardbtn;
    private Button cmilebtn;
    private Button cfootbtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        ccm=findViewById(R.id.mph);
        cm=findViewById(R.id.kph);
        cdm=findViewById(R.id.fps);
        ckm=findViewById(R.id.pg);
        cinch=findViewById(R.id.mps);
       cyard=findViewById(R.id.mg);
        cmile=findViewById(R.id.p);
        cfoot=findViewById(R.id.g);

        ccmbtn=findViewById(R.id.mphbtn);
        cmbtn=findViewById(R.id.kphbtn);
        cdmbtn=findViewById(R.id.fpsbtn);
        ckmbtn=findViewById(R.id.mpsbtn);
        cinchbtn=findViewById(R.id.kgbtn);
        cyardbtn=findViewById(R.id.mgbtn);
        cmilebtn=findViewById(R.id.pbtn);
        cfootbtn=findViewById(R.id.gbtn);

        //one
        ccmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=ccm.getText().toString();
                double onevar=Double.parseDouble(onein);
            //ccm    1
                double onesol=onevar;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*0.000001;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*0.001;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*0.000000000000001;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*0.06102374;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*0.00000131;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*2.3991*0.0000000000000001;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*0.00003531;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //two
        cmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cm.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*1000000;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*1000;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*0.000000001;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*61023.7441;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*1.30795062;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*2.3991*0.0000000001;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*35.3146667;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //three
        cdmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cdm.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*1000;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*0.001;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*0.000000000001;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*61.0237441;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*0.00130795;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*2.3991*0.0000000000001;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*0.03531467;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //four
        ckmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=ckm.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*100000000*100*100000;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*1000000000;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*1000000000*1000;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*6.1024*1000000000*100*100;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*1.3080*1000000000;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*0.23991276;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*3.5315*100000*100000;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //five
        cinchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cinch.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*16.387064;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*0.00001639;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*0.01638706;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*1.6387*0.00000000000001;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*0.00002143;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*3.9315*0.000000000000001;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*0.0005787;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //six
        cyardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cyard.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*764554.858;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*0.76455486;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*764.554858;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*7.6455*0.0000000001;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*46656;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*1.8343*0.0000000001;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*27;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //seven
        cmilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cmile.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*4.1682*10000000*100000000;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*4.1682*1000000000;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*4.1682*10000000*100000;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*4.16818183;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*2.5436*1000000000*100000;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*5.4518*1000000000;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar*1.4720*1000000*100000;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });


        //eight
        cfootbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String onein=cfoot.getText().toString();
                double onevar=Double.parseDouble(onein);
                //ccm    1
                double onesol=onevar*28316.8466;
                ccm.setText(""+onesol+" "+"cubic centimeter");

                //cm    2
                double twosol=onevar*0.02831685;
                cm.setText(""+twosol+" "+"cubic meter");

                //cdm   3
                double threesol=onevar*28.3168466;
                cdm.setText(""+threesol+" "+"cubic decimeter");

                //ckm    4
                double foursol=onevar*2.8317*0.00000000001;
                ckm.setText(""+foursol+" "+"cubic kilometer");

                //cinch   5
                double fivesol=onevar*1728;
                cinch.setText(""+fivesol+" "+"cubic inch");

                //cyard    6
                double sixsol=onevar*0.03703704;
                cyard.setText(""+sixsol+" "+"cubic yard");

                //cmile    7
                double sevensol=onevar*6.7936*0.000000000001;
                cmile.setText(""+sevensol+" "+"cubic mile");

                //cfoot    8
                double eightsol=onevar;
                cfoot.setText(""+eightsol+" "+"cubic foot");
            }
        });
    }
}