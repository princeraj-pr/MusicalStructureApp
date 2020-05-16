package com.princeraj.musicalstructureapp;

class Song {

    /**
     * Song name
     */
    private String songName;

    /**
     * artist name of the song
     */
    private String artistName;

    /**
     *
     * @param songName name of song
     * @param artistName name of artist
     */
    Song(String songName, String artistName) {
        this.songName = songName;
        this.artistName = artistName;
    }

    /**
     *
     * @return song name
     */
    String getSongName() {
        return songName;
    }

    /**
     *
     * @return artist name of the song
     */
    String getArtistName() {
        return artistName;
    }
}
