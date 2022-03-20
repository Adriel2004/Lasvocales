package com.example.lasvocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    MediaPlayer mp;
    Button buttonVocalA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonVocalA=(Button) findViewById(R.id.buttonVocalA);
                mp=MediaPlayer.create(this, R.raw.vocala);
                buttonVocalA.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mp.start();
                    }
                });
        MediaPlayer mp;
        Button buttonVocalE;

            buttonVocalE=(Button) findViewById(R.id.buttonVocalE);
            mp=MediaPlayer.create(this, R.raw.vocale);
            buttonVocalE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();
                }
            });
        MediaPlayer mpo;
        Button buttonVocalI;

        buttonVocalE=(Button) findViewById(R.id.buttonVocalI);
        mpo=MediaPlayer.create(this, R.raw.vocali);
        buttonVocalE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpo.start();
            }
        });
        
        MediaPlayer mpa;
        Button buttonVocalO;

        buttonVocalE=(Button) findViewById(R.id.buttonVocalO);
        mpa=MediaPlayer.create(this, R.raw.vocalo);
        buttonVocalE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpa.start();
            }
        });
        MediaPlayer mps;
        Button buttonVocalU;

        buttonVocalE=(Button) findViewById(R.id.buttonVocalU);
        mps=MediaPlayer.create(this, R.raw.vocalu);
        buttonVocalE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mps.start();
            }
        });
    }
}