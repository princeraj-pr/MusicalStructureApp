package com.princeraj.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private boolean mPlaySong = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String songName = intent.getStringExtra("song_name");
        String artistName = intent.getStringExtra("artist_name");

        TextView songTextView = findViewById(R.id.song_name_text_view);
        songTextView.setText(songName);

        TextView artistTextView = findViewById(R.id.artist_name_text_view);
        artistTextView.setText(artistName);

        final ImageButton playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mPlaySong) {
                    playButton.setImageResource(R.drawable.ic_play_circle_80dp);
                    mPlaySong = false;
                } else {
                    playButton.setImageResource(R.drawable.ic_pause_circle_80dp);
                    mPlaySong = true;
                }
            }
        });
    }
}
