package com.latihanandroid.belajarsound2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private Button lagu1,lagu2;

    @Override
    protected void onPause() {
        try {
            super.onPause();
            mediaPlayer.pause();
        }catch (Exception e){

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lagu1=(Button) findViewById(R.id.lagu1);
        lagu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               playSound(1);
            }
        });
        lagu2=(Button) findViewById(R.id.lagu2);
        lagu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(2);
            }
        });

    }

    private void playSound(int i) {
        try {
            if (mediaPlayer.isPlaying()){
              mediaPlayer.stop();
              mediaPlayer.release();
            }
        } catch (Exception e){
            Toast.makeText(this,"Masuk eksepsion",Toast.LENGTH_SHORT).show();
        }

        if (i==1){
            Toast.makeText(this,"Sedang main lagu1",Toast.LENGTH_SHORT).show();
            mediaPlayer=MediaPlayer.create(this,R.raw.lagu);
        }else if (i==2){
            Toast.makeText(this,"Sedang main lagu2",Toast.LENGTH_SHORT).show();
            mediaPlayer=MediaPlayer.create(this,R.raw.lagu2);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
        
    }
}
