package com.example.system.musicplayer;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        // Find the View that shows the playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Find the View that shows the stream category
        TextView stream = (TextView) findViewById(R.id.stream);

        // Find the View that shows the artist category
        TextView artist = (TextView) findViewById(R.id.artist);

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.album);

        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Find the View that shows the genre category
        TextView genre = (TextView) findViewById(R.id.genre);

        // Find the View that shows the now playing category
        TextView nowplaying = (TextView) findViewById(R.id.nowplaying);

        playlist.setOnClickListener(this);
        stream.setOnClickListener(this);
        artist.setOnClickListener(this);
        albums.setOnClickListener(this);
        songs.setOnClickListener(this);
        genre.setOnClickListener(this);
        nowplaying.setOnClickListener(this);

    }
        @Override
        public void onClick (View V){
            int id = V.getId();
            switch (id) {
                case R.id.playlist:
                    Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                    startActivity(playlistIntent);
                    break;
                case R.id.stream:
                    Intent streamIntent = new Intent(MainActivity.this, StreamActivity.class);
                    startActivity(streamIntent);
                    break;
                case R.id.artist:
                    Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                    startActivity(artistIntent);
                    break;
                case R.id.album:
                    Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                    startActivity(albumsIntent);
                    break;
                case R.id.songs:
                    Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                    startActivity(songsIntent);
                    break;
                case R.id.genre:
                    Intent genreIntent = new Intent(MainActivity.this, GenreActivity.class);
                    startActivity(genreIntent);
                    break;
                case R.id.nowplaying:
                    Intent nowplayingIntent = new Intent(MainActivity.this, NowplayingActivity.class);
                    startActivity(nowplayingIntent);
                    break;

            }
        }

    }
