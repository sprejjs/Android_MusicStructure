package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by klaudia on 05/05/18.
 */

public class LibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library_list);

        ArrayList<Song> words = new ArrayList<Song>();
        words.add(new Song("Ramstein", "Du hast"));
        words.add(new Song("Abba", "Money, money"));
        words.add(new Song("Linkin Park", "Numb"));
        words.add(new Song("Lana Del Rey", "Summertime sadness"));
        words.add(new Song("Elton John", "I'm still standing"));
        words.add(new Song("Sylwia Banasik", "Pod drzewem"));
        words.add(new Song("Kuba Jurzyk", "Zrobię z was mężczyzn"));
        words.add(new Song("Alvaro Soler", "El Mismo Sol"));
        words.add(new Song("LemON", "Jutro"));
        words.add(new Song("Maroon 5", "Sugar"));

        SongAdapter itemsAdapter = new SongAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.listview);

        listView.setAdapter(itemsAdapter);

    }
}