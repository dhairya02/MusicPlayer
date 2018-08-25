package com.example.system.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("My Playlist 1", "10 Songs"));
        lists.add(new List("My Playlist 2", "5 songs"));
        lists.add(new List("My playlist 3", "6 Songs"));
        lists.add(new List("My Playlist 4", "5 Songs"));
        lists.add(new List("My Playlist 5", "6 Songs"));

        // Find the root view so we can add child views to it
        //for loop to do the same task as that of while loop
        ListAdapter adapter = new ListAdapter(this, lists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
