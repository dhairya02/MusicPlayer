package com.example.system.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Jay Z", "10 Songs"));
        lists.add(new List("Michael Jackson", "12 Songs"));
        lists.add(new List("Celine Dion", "5 Songs"));
        lists.add(new List("Nicki Minaj", "2 Songs"));
        lists.add(new List("Chris Brown", "9 songs"));
        // Find the root view so we can add child views to it
        //for loop to do the same task as that of while loop
        ListAdapter adapter = new ListAdapter(this, lists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
