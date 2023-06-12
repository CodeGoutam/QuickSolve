package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class unitconverter extends AppCompatActivity {
    CardView lengthCard;
    CardView temperatureCard;
    CardView volumeCard;
    CardView speedCard;
    CardView massCard;
    CardView areaCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unitconverter);

        lengthCard=findViewById(R.id.lengthCard);
        areaCard=findViewById(R.id.areaCard);
        temperatureCard=findViewById(R.id.temperatureCard);
        volumeCard=findViewById(R.id.volumeCard);
        speedCard=findViewById(R.id.speedCard);
        massCard=findViewById(R.id.massCard);



        lengthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(unitconverter.this,length1.class);
                startActivity(intent);
            }
        });

        areaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(unitconverter.this,area.class);
                startActivity(intent);
            }
        });

        temperatureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(unitconverter.this,temp.class);
                startActivity(intent);
            }
        });

volumeCard.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        Intent intent =new Intent(unitconverter.this,volume.class);
        startActivity(intent);


    }
});

        massCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(unitconverter.this,Mass.class);
                startActivity(intent);


            }
        });


        speedCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =new Intent(unitconverter.this,speed.class);
                startActivity(intent);


            }
        });




    }
}