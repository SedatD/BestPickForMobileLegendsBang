package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.dilmacsedat.bestpickformobilelegendsbang.R;

public class BestPickActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearLayout_good, linearLayout_counters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_pick);

        linearLayout_good = findViewById(R.id.linearLayout_good);
        linearLayout_counters = findViewById(R.id.linearLayout_counters);
        ImageView imageView_l1 = findViewById(R.id.imageView_l1);
        ImageView imageView_l2 = findViewById(R.id.imageView_l2);
        ImageView imageView_l3 = findViewById(R.id.imageView_l3);
        ImageView imageView_l4 = findViewById(R.id.imageView_l4);
        ImageView imageView_l5 = findViewById(R.id.imageView_l5);
        ImageView imageView_r1 = findViewById(R.id.imageView_r1);
        ImageView imageView_r2 = findViewById(R.id.imageView_r2);
        ImageView imageView_r3 = findViewById(R.id.imageView_r3);
        ImageView imageView_r4 = findViewById(R.id.imageView_r4);
        ImageView imageView_r5 = findViewById(R.id.imageView_r5);
        imageView_l1.setOnClickListener(this);
        imageView_l2.setOnClickListener(this);
        imageView_l3.setOnClickListener(this);
        imageView_l4.setOnClickListener(this);
        imageView_l5.setOnClickListener(this);
        imageView_r1.setOnClickListener(this);
        imageView_r2.setOnClickListener(this);
        imageView_r3.setOnClickListener(this);
        imageView_r4.setOnClickListener(this);
        imageView_r5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView_l1:
                break;
        }
    }

}
