package com.example.showsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    MediaPlayer mdUkulele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mdUkulele=new MediaPlayer();
        mdUkulele=MediaPlayer.create(this, R.raw.ukulele);
        mdUkulele.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                mdUkulele.stop();
                startActivity(new Intent(Splash.this, ItemListActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}