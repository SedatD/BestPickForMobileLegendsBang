package com.dilmacsedat.bestpickformobilelegendsbang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dilmacsedat.bestpickformobilelegendsbang.Activity.AbilitiesActivity;
import com.dilmacsedat.bestpickformobilelegendsbang.Activity.BestPickActivity;
import com.dilmacsedat.bestpickformobilelegendsbang.Activity.DonateActivity;
import com.dilmacsedat.bestpickformobilelegendsbang.Activity.EmblemsActivity;
import com.dilmacsedat.bestpickformobilelegendsbang.Activity.HeroesActivity;
import com.dilmacsedat.bestpickformobilelegendsbang.Activity.VideosActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainAct";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_bestPick).setOnClickListener(this);
        findViewById(R.id.button_heroes).setOnClickListener(this);
        findViewById(R.id.button_abilities).setOnClickListener(this);
        findViewById(R.id.button_emblems).setOnClickListener(this);
        findViewById(R.id.button_videos).setOnClickListener(this);
        findViewById(R.id.button_donate).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_bestPick:
                startActivity(new Intent(MainActivity.this, BestPickActivity.class));
                break;
            case R.id.button_heroes:
                startActivity(new Intent(MainActivity.this, HeroesActivity.class));
                break;
            case R.id.button_abilities:
                startActivity(new Intent(MainActivity.this, AbilitiesActivity.class));
                break;
            case R.id.button_emblems:
                startActivity(new Intent(MainActivity.this, EmblemsActivity.class));
                break;
            case R.id.button_videos:
                startActivity(new Intent(MainActivity.this, VideosActivity.class));
                break;
            case R.id.button_donate:
                startActivity(new Intent(MainActivity.this, DonateActivity.class));
                break;
        }
    }

}
