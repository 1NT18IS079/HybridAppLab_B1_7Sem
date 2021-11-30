package com.example.keerthi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class mediaPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);


        int starttime = 0 ; // startime is 0s
        int stopttime = 0; // stoptime is 0s by default
        int forwardtime = 5000 ; // 5s for forward
        int backwardtime = 5000 ; // 5s for backwardtime

        TextView songtitle = findViewById(R.id.songname);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.ipl_theme_song);
        songtitle.setText("sample_song.mp3");

        Button play = findViewById(R.id.play);
         play.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "Playing song now", Toast.LENGTH_LONG).show();
                 mediaPlayer.start();
             }
         });

        Button pause = findViewById(R.id.pause);
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song paused", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        Button forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curPos = mediaPlayer.getCurrentPosition();
                int totalDuration = mediaPlayer.getDuration();

                if(curPos + forwardtime <= totalDuration){
                    mediaPlayer.seekTo(curPos + forwardtime);
                }

            }
        });

        Button rewind = findViewById(R.id.rewind);
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curPos = mediaPlayer.getCurrentPosition();
                if(curPos - backwardtime >= starttime){
                    mediaPlayer.seekTo(curPos - backwardtime);
                }
            }
        });

        Button restart = findViewById(R.id.reset);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Song restarted", Toast.LENGTH_SHORT).show();
                mediaPlayer.reset();
            }
        });
    }
}