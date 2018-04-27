package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dilmacsedat.bestpickformobilelegendsbang.DataModel.Hero;
import com.dilmacsedat.bestpickformobilelegendsbang.MainActivity;
import com.dilmacsedat.bestpickformobilelegendsbang.R;

import java.util.ArrayList;

public class SplashActivity extends AppCompatActivity {
    private static final String TAG = "SplashAct";
    public static ArrayList<Hero> heroArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.btnGec).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });

        int i = 1;

        //assassin
        heroArrayList.add(new Hero(i++, "saber", "Saber", "assassin", "loong story"));
        heroArrayList.add(new Hero(i++, "karina", "Karina", "assassin", "loong story"));
        heroArrayList.add(new Hero(i++, "fanny", "Fanny", "assassin", "loong story"));
        heroArrayList.add(new Hero(i++, "hayabusa", "Hayabusa", "assassin", "loong story"));
        heroArrayList.add(new Hero(i++, "natalia", "Natalia", "assassin", "loong story"));
        heroArrayList.add(new Hero(i++, "lancelot", "Lancelot", "assassin", "loong story"));
        heroArrayList.add(new Hero(i++, "helcurt", "Helcurt", "assassin", "loong story"));
        //heroArrayList.add(new Hero(i++,"gusion","Gusion","assassin","loong story"));

        //tank
        heroArrayList.add(new Hero(i++, "tigreal", "Tigreal", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "akai", "Akai", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "franco", "Franco", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "minotaur", "Minotaur", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "lolita", "Lolita", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "johnson", "Johnson", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "gatotkaca", "Gatotkaca", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "grock", "Grock", "tank", "loong story"));
        heroArrayList.add(new Hero(i++, "hylos", "Hylos", "tank", "loong story"));

        //fighter
        heroArrayList.add(new Hero(i++, "balmond", "Balmond", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "alucard", "Alucard", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "bane", "Bane", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "zilong", "Zilong", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "freya", "Freya", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "chou", "Chou", "fighter", "loong story"));
        //heroArrayList.add(new Hero(i++, "sun", "Sun", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "alpha", "Alpha", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "ruby", "Ruby", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "hilda", "Hilda", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "lapu", "Lapu-Lapu", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "roger", "Roger", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "argus", "Argus", "fighter", "loong story"));
        heroArrayList.add(new Hero(i++, "jawhead", "Jawhead", "fighter", "loong story"));
        //heroArrayList.add(new Hero(i++, "martis", "Martis", "fighter", "loong story"));

        //mage
        heroArrayList.add(new Hero(i++, "alice", "Alice", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "nana", "Nana", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "eudora", "Eudora", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "gord", "Gord", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "kagura", "Kagura", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "cyclops", "Cyclops", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "aurora", "Aurora", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "vexana", "Vexana", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "harley", "Harley", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "odette", "Odette", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "zhask", "Zhask", "mage", "loong story"));
        heroArrayList.add(new Hero(i++, "pharsa", "Pharsa", "mage", "loong story"));
        //heroArrayList.add(new Hero(i++, "valir", "Valir", "mage", "loong story"));

        //marksman
        heroArrayList.add(new Hero(i++, "miya", "Miya", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "bruno", "Bruno", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "clint", "Clint", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "layla", "Layla", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "yisunshin", "Yi Sun-shin", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "moskov", "Moskov", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "karrie", "Karrie", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "irithel", "Irithel", "marksman", "loong story"));
        heroArrayList.add(new Hero(i++, "lesley", "Lesley", "marksman", "loong story"));
        //heroArrayList.add(new Hero(i++,"hanabi","Hanabi","marksman","loong story"));

        //support
        heroArrayList.add(new Hero(i++, "rafaela", "Rafaela", "support", "loong story"));
        heroArrayList.add(new Hero(i++, "estes", "Estes", "support", "loong story"));
        heroArrayList.add(new Hero(i++, "diggie", "Diggie", "support", "loong story"));
        //heroArrayList.add(new Hero(i++,"angela","Angela","support","loong story"));

        //Utils.getHeroByType("asd");
    }

}
