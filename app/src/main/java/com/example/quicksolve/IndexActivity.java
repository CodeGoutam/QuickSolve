package com.example.quicksolve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class IndexActivity extends AppCompatActivity {
 private  ImageView unitconverter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        unitconverter=findViewById(R.id.unitconverter);
        unitconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(IndexActivity.this,unitconverter.class);
                startActivity(intent);
            }
        });




    }
}