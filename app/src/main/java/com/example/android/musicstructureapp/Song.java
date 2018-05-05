package com.example.android.musicstructureapp;

/**
 * Created by klaudia on 05/05/18.
 */

class Song {
    private String author;
    private String title;

    public Song(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
