package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView nowPlayingArtist = (TextView) findViewById(R.id.now_playing_artist);

        nowPlayingArtist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, ArtistDetailsActivity.class);
                startActivity(intent);
            }
        });

        TextView nowPlayingAlbum = (TextView) findViewById(R.id.now_playing_album);
        nowPlayingAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NowPlayingActivity.this, AlbumDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
