package com.example.system.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create a list of lists
        ArrayList<String> lists = new ArrayList<String>();
        lists.add("Musical Theatre");
        lists.add("Pop Music");
        lists.add("Rock");
        lists.add("Jazz");
        lists.add("Classical Music");
        lists.add("Blues");
        lists.add("Popular music");
        lists.add("Folk Music");
        lists.add("Reggae");
        lists.add("Rhythm and blues");

       
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lists);

       
        ListView listView = (ListView) findViewById(R.id.list);

       
        listView.setAdapter(itemsAdapter);
    }
}
