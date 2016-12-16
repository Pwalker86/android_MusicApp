package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albumLauncher = (TextView) findViewById(R.id.album_activity_launcher);
        albumLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AlbumListActivity.class);
                startActivity(intent);
            }
        });

        TextView artistLauncher = (TextView) findViewById(R.id.artist_activity_launcher);
        artistLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArtistListActivity.class);
                startActivity(intent);
            }
        });

        TextView songLauncher = (TextView) findViewById(R.id.song_activity_launcher);
        songLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(intent);
            }
        });

        TextView nowPlayingLauncher = (TextView) findViewById(R.id.now_playing_activity_launcher);
        nowPlayingLauncher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}
