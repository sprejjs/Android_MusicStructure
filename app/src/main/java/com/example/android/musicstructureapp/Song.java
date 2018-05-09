package com.example.android.musicstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by klaudia on 05/05/18.
 */

public class Song implements Parcelable{
    private String author;
    private String title;

    public Song(String author, String title) {
        this.author = author;
        this.title = title;
    }

    protected Song(Parcel in) {
        author = in.readString();
        title = in.readString();
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(author);
        dest.writeString(title);
    }

    @Override
    public String toString(){
        return String.format("%s %s", author, title);
    }
}
