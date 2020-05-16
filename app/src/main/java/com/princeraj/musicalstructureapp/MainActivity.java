package com.princeraj.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of songs
        final ArrayList<Song> songsList = new ArrayList<>();
        songsList.add(new Song("Rapture", "Koffee ft. Govana"));
        songsList.add(new Song("Don't Start Now", "Dua Lipa"));
        songsList.add(new Song("All To Myself", "Baby Rose"));
        songsList.add(new Song("Dumebi", "Rema"));
        songsList.add(new Song("Nina", "Rapsody"));
        songsList.add(new Song("All Mirrors", "Angel Olsen"));
        songsList.add(new Song("Senorita", "Shawn Mendes and Camila Cabello"));
        songsList.add(new Song("Anybody", "Burna Boy"));
        songsList.add(new Song("My Type", "Saweetie"));
        songsList.add(new Song("Morning", "Teyana Taylor ft. Kehlani"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter songAdapter = new SongAdapter(this, songsList);

        ListView listView = findViewById(R.id.list_View);
        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("song_name", songsList.get(position).getSongName());
                intent.putExtra("artist_name", songsList.get(position).getArtistName());
                startActivity(intent);
            }
        });
    }
}
