package com.latihanandroid.belajarsound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MediaPlayer audiobackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audiobackground= MediaPlayer.create(this,R.raw.lagu);
        audiobackground.setLooping(true);
        audiobackground.setVolume(1,1);
        audiobackground.start();
    }
}
