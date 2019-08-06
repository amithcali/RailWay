package com.thinkbeyound.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button spot,pnr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spot = (Button) findViewById(R.id.spot);
        pnr = (Button) findViewById(R.id.pnr);

        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent spotAct = new Intent(getApplicationContext(), Spotting.class);
                startActivity(spotAct);
            }
        });


        pnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pnrAct = new Intent(getApplicationContext(), PnrActivity.class);
                startActivity(pnrAct);
            }
        });
    }
}
