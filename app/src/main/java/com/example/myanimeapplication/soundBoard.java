package com.example.myanimeapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;




public class soundBoard extends AppCompatActivity {
    //Media Player
    MediaPlayer mediaPlayer = new MediaPlayer();

    //Function to play clip
    public void CreateSound(View v, int soundClip){
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(v.getContext(), soundClip);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soundboard_jojo);





        //Button to go back to the main menu
        Button backToMenu = findViewById(R.id.jojoBackMenu);

        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        //Individual Sound board buttons will start here
        Button yareyareButton = findViewById(R.id.yareyare);
        yareyareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.yareyare );
            }
        });


        Button tobecontinuedButton = findViewById(R.id.toBeContinued);
        tobecontinuedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.tobecontinued);
            }
        });

        Button josephShiButton = findViewById(R.id.josephShi);
        josephShiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.josephohsheet);
            }
        });


        Button diowryyButton =  findViewById(R.id.dioWry);
        diowryyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.diowry);
            }
        });

        Button zaWarudoButton = findViewById(R.id.zaWarudo);
        zaWarudoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.zawarudo);
            }
        });

        Button yesyesyesButton = findViewById(R.id.yesJotaro);
        yesyesyesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.yesyesyes);
            }
        });

        Button nononoButton = findViewById(R.id.noJotaroButton);
        nononoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.nonono);
            }
        });

        Button pillarMenButton = findViewById(R.id.pillarMen);
        pillarMenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.pillarmen);
            }
        });

        Button cherryButton = findViewById(R.id.cherryLick);
        cherryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.kakyoincherry);
            }
        });


        Button roadRollerButton = findViewById(R.id.roadRoller);
        roadRollerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.roadroller);
            }
        });

        Button dioHOHO = findViewById(R.id.dioHOHO);
        dioHOHO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.diohoho);
            }
        });


        Button whatDoingButton = findViewById(R.id.whatDoing);
        whatDoingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.whatyoudoing);
            }
        });

        Button sonoButton = findViewById(R.id.sonoButton);
        sonoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.sonochino);
            }
        });

        Button theHandButton = findViewById(R.id.handButton);
        theHandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.thehand);
            }
        });

        Button caesarButton = findViewById(R.id.caesarButton);
        caesarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.caesarscream);
            }
        });

        Button stroButton = findViewById(R.id.stroButton);
        stroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.stroenhiem);
            }
        });

        Button crazyDiamondButton = findViewById(R.id.crazyDiamondButton);
        crazyDiamondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.crazydiamond);
            }
        });


        Button boatDanceButton = findViewById(R.id.boatDanceButton);
        boatDanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.boatdance);
            }
        });

        Button snoreButton = findViewById(R.id.sleepButton);
        snoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.snoring);
            }
        });

        Button echoFreeze = findViewById(R.id.actFreeze);
        echoFreeze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.echosact3);
            }
        });

        Button clownButton = findViewById(R.id.clownButton);
        clownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.clownmusic);
            }
        });

        Button jojoLaughingButton = findViewById(R.id.jojoLaugh);
        jojoLaughingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.jojolaugh);
            }
        });

        Button boingoLaugh = findViewById(R.id.boingoLaugh);
        boingoLaugh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateSound(v, R.raw.boingolaugh);
            }
        });


    }

    @Override
    protected void onDestroy() {

        if (isFinishing())
        {
            mediaPlayer.stop();
            mediaPlayer.release();

        }
        super.onDestroy();
    }
}
