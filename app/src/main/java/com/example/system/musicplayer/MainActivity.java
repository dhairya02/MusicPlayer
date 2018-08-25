package com.example.system.musicplayer;

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
        // Find the View that shows the playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
        // Find the View that shows the stream category
        TextView stream = (TextView) findViewById(R.id.stream);

        // Set a click listener on that View
        stream.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent streamIntent = new Intent(MainActivity.this, StreamActivity.class);
                startActivity(streamIntent);
            }
        });
        // Find the View that shows the artist category
        TextView artist = (TextView) findViewById(R.id.artist);

        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });
        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the genre category
        TextView genre = (TextView) findViewById(R.id.genre);

        // Set a click listener on that View
        genre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        // Find the View that shows the now playing category
        TextView nowplaying = (TextView) findViewById(R.id.nowplaying);

        // Set a click listener on that View
        nowplaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowplayingIntent = new Intent(MainActivity.this, NowplayingActivity.class);
                startActivity(nowplayingIntent);
            }
        });
    }

}