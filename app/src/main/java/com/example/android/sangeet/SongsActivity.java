package com.example.android.sangeet;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


            // Create a list of words
            final ArrayList<Song> songs= new ArrayList<Song>();
            songs.add(new Song(R.string.song_one, R.string.artist_one));
        songs.add(new Song(R.string.song_two, R.string.artist_two));
        songs.add(new Song(R.string.song_three, R.string.artist_three));
        songs.add(new Song(R.string.song_four, R.string.artist_four));
        songs.add(new Song(R.string.song_five, R.string.artist_five));
        songs.add(new Song(R.string.song_six, R.string.artist_six));


            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            SongAdapter adapter = new SongAdapter(this, songs);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // word_list.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list);

            // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Word} in the list.
            listView.setAdapter(adapter);

    }
}