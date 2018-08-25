package com.example.system.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // Create a list of lists
        ArrayList<String> lists = new ArrayList<String>();
        lists.add("Slim Shady");
        lists.add("Am i Wrong?");
        lists.add("All of Me");
        lists.add("As Long as you love me");
        lists.add("Blank Space");
        lists.add("Break your heart");
        lists.add("You & I");
        lists.add("Words");
        lists.add("Zaroorat");
        lists.add("Zehnaseeb");


        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lists);


        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
