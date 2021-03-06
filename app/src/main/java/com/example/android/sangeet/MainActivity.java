package com.example.android.sangeet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the songs
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        TextView artist = (TextView) findViewById(R.id.artist);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(artistIntent);
            }
        });

    }
}
