package com.example.supermonkeyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActMainMenu extends AppCompatActivity {

    private ImageButton btnPlay;
    private ImageButton btnCustomisation;
    private ImageButton btnQuitGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main_menu);

        //--- Elements --- //

        btnPlay          = findViewById(R.id.btnPlay);
        btnCustomisation = findViewById(R.id.btnSkinMenu);
        btnQuitGame      = findViewById(R.id.btnQuit);

        //--- Listeners ---//

        /**
         * Play button
         *
         * (Start the game with the configuration of the players (skins etc....)
         */
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActGame.class);
                //intent.putExtra(); //---> passer le shared preference du joueur
                startActivity(intent);
            }
        });

        btnCustomisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActCustomization.class);
                startActivity(intent);
            }
        });

        btnQuitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}