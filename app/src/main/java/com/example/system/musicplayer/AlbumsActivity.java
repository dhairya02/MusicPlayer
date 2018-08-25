package com.example.system.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Thriller", "Michael Jackson"));
        lists.add(new List("Abbey Road", "The Beatles"));
        lists.add(new List("Queen", "Nicki Minaj"));
        lists.add(new List("Falling into you", "Celine Dion"));
        lists.add(new List("The dark side of the moon", "Pink Flyod"));

        // Find the root view so we can add child views to it
        //for loop to do the same task as that of while loop
        ListAdapter adapter = new ListAdapter(this, lists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
