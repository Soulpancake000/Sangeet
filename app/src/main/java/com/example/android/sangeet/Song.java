package com.example.android.sangeet;

public class Song {

    private int mSongId;
    private int mArtistId;
//Word Object.

    public Song(int SongId, int ArtistId) {
        mSongId = SongId;
        mArtistId = ArtistId;
    }

    //Returing String Resource id.
    public int getSongId() {
        return mSongId;
    }

    //Returing String Resource id.
    public int getArtistId() {
        return mArtistId;
    }
}
