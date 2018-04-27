package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dilmacsedat.bestpickformobilelegendsbang.DataModel.Hero;
import com.dilmacsedat.bestpickformobilelegendsbang.R;
import com.dilmacsedat.bestpickformobilelegendsbang.Util.Utils;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {
    private static final String TAG = "SplashAct";
    public static ArrayList<Hero> heroArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int i = 1;
        heroArrayList.add(new Hero(i++,"123","123","qweqwe","asdasdasd"));
        heroArrayList.add(new Hero(i++,"123","123","qweqwe","asdasdasd"));
        heroArrayList.add(new Hero(i++,"123","123","qweqwe","asdasdasd"));
        Utils.getHeroByType("asd");

    }
}
