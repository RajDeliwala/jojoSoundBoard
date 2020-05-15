package com.example.myanimeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button jojoButton = findViewById(R.id.jojoButton);

        jojoButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jojoSoundBoard = new Intent(MainActivity.this, soundBoard.class);
                startActivity(jojoSoundBoard);
            }
        }));

        Button reZeroButton = findViewById(R.id.ReZero);
        reZeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reZeroIntent = new Intent(MainActivity.this, reZero.class);
                startActivity(reZeroIntent);
            }
        });



    }
}
