package org.example.music;

import java.util.ArrayList;

public class Playlist extends ArrayList<Song> {
    public Song atSecond(int seconds) {
        int secondsSong = 0;
        for (Song song : this) {
            secondsSong += song.getDuration();
            if (secondsSong >= seconds) {
                return song;
            }
        }
        return null;
    }
}
