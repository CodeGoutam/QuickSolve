package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class unitconverter extends AppCompatActivity {

  private Button length ;
    Button speed;
     Button area;
      Button temperature;
    Button mass;
      Button volume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitconverter);

        length=findViewById(R.id.length);
        speed=findViewById(R.id.speed);
        area=findViewById(R.id.area);
        temperature=findViewById(R.id.temperature);
        mass=findViewById(R.id.mass);
        volume=findViewById(R.id.volume);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(unitconverter.this,length1.class);
                startActivity(intent);
            }
        });

        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(unitconverter.this,area.class);
                startActivity(intent);
            }
        });

        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(unitconverter.this,temp.class);
                startActivity(intent);
            }
        });

volume.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        Intent intent =new Intent(unitconverter.this,volume.class);
        startActivity(intent);


    }
});

        mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(unitconverter.this,Mass.class);
                startActivity(intent);


            }
        });


        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(unitconverter.this,speed.class);
                startActivity(intent);


            }
        });




    }
}