package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dilmacsedat.bestpickformobilelegendsbang.Constants;
import com.dilmacsedat.bestpickformobilelegendsbang.R;
import com.dilmacsedat.bestpickformobilelegendsbang.Util.Utils;

import java.util.ArrayList;

public class AbilitiesActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "AbilitiesAct";
    private int linLayWidth;
    private final ArrayList<ImageView> imageViewList = new ArrayList<>();
    private TextView textView_title, textView_detail, textView_cd, textView_lwl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abilities);

        final LinearLayout linLay1 = findViewById(R.id.linLay1);
        final ImageView imageView_execute = findViewById(R.id.imageView_execute);
        final ImageView imageView_retribution = findViewById(R.id.imageView_retribution);
        final ImageView imageView_inspire = findViewById(R.id.imageView_inspire);
        final ImageView imageView_sprint = findViewById(R.id.imageView_sprint);
        final ImageView imageView_healingspell = findViewById(R.id.imageView_healingspell);
        final ImageView imageView_aegis = findViewById(R.id.imageView_aegis);
        final ImageView imageView_petrify = findViewById(R.id.imageView_petrify);
        final ImageView imageView_purify = findViewById(R.id.imageView_purify);
        final ImageView imageView_weaken = findViewById(R.id.imageView_weaken);
        final ImageView imageView_flicker = findViewById(R.id.imageView_flicker);
        final ImageView imageView_arrival = findViewById(R.id.imageView_arrival);
        final ImageView imageView_ironwall = findViewById(R.id.imageView_ironwall);
        textView_title = findViewById(R.id.textView_title);
        textView_detail = findViewById(R.id.textView_detail);
        textView_cd = findViewById(R.id.textView_cd);
        textView_lwl = findViewById(R.id.textView_lwl);

        imageViewList.add(imageView_execute);
        imageViewList.add(imageView_retribution);
        imageViewList.add(imageView_inspire);
        imageViewList.add(imageView_sprint);
        imageViewList.add(imageView_healingspell);
        imageViewList.add(imageView_aegis);
        imageViewList.add(imageView_petrify);
        imageViewList.add(imageView_purify);
        imageViewList.add(imageView_weaken);
        imageViewList.add(imageView_flicker);
        imageViewList.add(imageView_arrival);
        imageViewList.add(imageView_ironwall);

        textView_title.setText((String) Constants.getAbilitiesListTitle().get(0));
        textView_detail.setText((String) Constants.getAbilitiesListDetail().get(0));
        textView_cd.setText((String) Constants.getAbilitiesListCd().get(0));
        textView_lwl.setText((String) Constants.getAbilitiesListLwl().get(0));
        imageViewList.get(0).setBackgroundColor(getResources().getColor(R.color.colorWhite));

        for (int i = 0; i < imageViewList.size(); i++)
            imageViewList.get(i).setOnClickListener(this);


        linLay1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                linLay1.getViewTreeObserver().removeOnGlobalLayoutListener(this);

                linLayWidth = (linLay1.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                linLayWidth = (linLayWidth / 6);

                for (int i = 0; i < imageViewList.size(); i++)
                    imageViewMeasures(imageViewList.get(i));


                linLay1.requestLayout();
            }
        });

    }

    private void imageViewMeasures(ImageView imageView) {
        imageView.getLayoutParams().width = linLayWidth;
        imageView.getLayoutParams().height = linLayWidth;
    }

    private void imageViewBgColorNull(ImageView imageView) {
        imageView.setBackgroundColor(Color.TRANSPARENT);
    }

    private void imageViewBgColor(ImageView imageView) {
        imageView.setBackgroundColor(getResources().getColor(R.color.colorWhite));
        //imageView.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorWhite));
    }

    @Override
    public void onClick(View view) {
        for (int i = 0; i < imageViewList.size(); i++) {
            imageViewBgColorNull(imageViewList.get(i));
            if (view.getId() == imageViewList.get(i).getId()) {
                textView_title.setText((String) Constants.getAbilitiesListTitle().get(i));
                textView_detail.setText((String) Constants.getAbilitiesListDetail().get(i));
                textView_cd.setText((String) Constants.getAbilitiesListCd().get(i));
                textView_lwl.setText((String) Constants.getAbilitiesListLwl().get(i));
                imageViewBgColor(imageViewList.get(i));
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
