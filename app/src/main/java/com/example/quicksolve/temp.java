package com.example.quicksolve;

//99package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.quicksolve.R;

public class temp extends AppCompatActivity {

    private EditText kelvin;
    private EditText fahrenheit;
    private EditText celsius;
    private EditText rankine;

    private Button kelvinBtn;
    private Button fahrenheitBtn;
    private Button celsiusBtn;
    private Button rankineBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        kelvin=findViewById(R.id.kelvin);
        fahrenheit=findViewById(R.id.fahreneit);
        celsius=findViewById(R.id.celsius);
        rankine=findViewById(R.id.rankine);

        kelvinBtn=findViewById(R.id.kelvinBtn);
        fahrenheitBtn=findViewById(R.id.fahrenheitBtn);
        celsiusBtn=findViewById(R.id.celsiusBtn);
        rankineBtn=findViewById(R.id.rankineBtn);

        //one
        kelvinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kelvin
                String onein=kelvin.getText().toString();


                 double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol=(double) onevar;
                kelvin.setText(""+onesol+" ");

                //fahrenheit

                double twosol=(double) 1.8*(double)(onevar-273.15)+32;
                fahrenheit.setText(""+twosol+" ");

                //celsius

                double threesol=onevar-273.15;
                celsius.setText(""+threesol+" ");

                //rankine

                double foursol=(double)onevar*(double)1.8;
                rankine.setText(""+foursol+" ");
            }
        });


        //two
        fahrenheitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //fahrenheit
                String onein=fahrenheit.getText().toString();


                double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol= (double)(onevar-32)/(double)1.8+(double)273.15;
                kelvin.setText(""+onesol+" ");

                //fahrenheit

                double twosol=(double) onevar;
                fahrenheit.setText(""+twosol+" ");

                //celsius

                double threesol=((double) onevar-32)/(double) 1.8;
                celsius.setText(""+threesol+" ");

                //rankine

                double foursol=(double) onevar+(double) 459.67;
                rankine.setText(""+foursol+" ");
            }
        });

        //three
        celsiusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kelvin
                String onein=celsius.getText().toString();


                double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol=(double)onevar+(double) 273.15;
                kelvin.setText(""+onesol+" ");

                //fahrenheit

                double twosol=((double) onevar*1.8)+32;
                fahrenheit.setText(""+twosol+" ");

                //celsius

                double threesol=(double) onevar;
                celsius.setText(""+threesol+" ");

                //rankine

                double foursol=((double) onevar+273.15)*1.8;
                rankine.setText(""+foursol+" ");
            }
        });

        //four
        rankineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //kelvin
                String onein=rankine.getText().toString();


                double onevar = Double.parseDouble(onein);

                //kelvin

                double onesol=(double) onevar/1.8;
                kelvin.setText(""+onesol+" ");

                //fahrenheit

                double twosol=(double) onevar-459.67;
                fahrenheit.setText(""+twosol+" ");

                //kelvin

                double threesol=((double) onevar-491.67)/1.8;
                celsius.setText(""+threesol+" ");

                //kelvin

                double foursol=(double) onevar;
                rankine.setText(""+foursol+" ");
            }
        });
    }
}