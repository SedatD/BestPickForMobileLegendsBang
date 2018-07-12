package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.os.Bundle;
import android.view.View;

import com.dilmacsedat.bestpickformobilelegendsbang.Constants;
import com.dilmacsedat.bestpickformobilelegendsbang.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class VideosActivity extends YouTubeBaseActivity implements View.OnClickListener {
    private static final String TAG = "VideosAct";
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        findViewById(R.id.button).setOnClickListener(this);
        youTubePlayerView = findViewById(R.id.youtube_player_view);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("FgXs3oPlax8");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                youTubePlayerView.initialize(Constants.getYoutubeApiKey(), onInitializedListener);
                break;
        }
    }

}
