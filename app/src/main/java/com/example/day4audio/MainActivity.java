package com.example.day4audio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.selfcare);  // it's need raw folder in res

    }

    public void playSong(View view) {
        mp.start();
    }

    public void pause(View view) {
        mp.pause();
    }

    public void stop(View view) {
        mp.stop();
        mp = MediaPlayer.create(this, R.raw.selfcare); // to start from zero after click stop but
    }
}