package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.dilmacsedat.bestpickformobilelegendsbang.R;
import com.dilmacsedat.bestpickformobilelegendsbang.Util.Utils;

import java.util.ArrayList;

public class EmblemsActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "EmblemsAct";
    private int linLayWidth;
    private final ArrayList<ImageView> imageViewList = new ArrayList<>();
    private TextView textView_title, textView_tier1_1, textView_tier1_2, textView_tier1_3, textView_tier2_1, textView_tier2_2, textView_tier2_3, textView_tier3_1, textView_tier3_2, textView_tier3_3;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emblems);

        final LinearLayout linLay1 = findViewById(R.id.linLay1);
        final ImageView imageView_physicalemblem = findViewById(R.id.imageView_physicalemblem);
        final ImageView imageView_magicalemblem = findViewById(R.id.imageView_magicalemblem);
        final ImageView imageView_tankemblem = findViewById(R.id.imageView_tankemblem);
        final ImageView imageView_jungleemblem = findViewById(R.id.imageView_jungleemblem);
        final ImageView imageView_assassinemblem = findViewById(R.id.imageView_assassinemblem);
        final ImageView imageView_mageemblem = findViewById(R.id.imageView_mageemblem);
        final ImageView imageView_fighteremblem = findViewById(R.id.imageView_fighteremblem);
        final ImageView imageView_supportemblem = findViewById(R.id.imageView_supportemblem);
        final ImageView imageView_marksmanemblem = findViewById(R.id.imageView_marksmanemblem);

        listView = findViewById(R.id.listView);
        textView_title = findViewById(R.id.textView_title);
        textView_tier1_1 = findViewById(R.id.textView_tier1_1);
        textView_tier1_2 = findViewById(R.id.textView_tier1_2);
        textView_tier1_3 = findViewById(R.id.textView_tier1_3);
        textView_tier2_1 = findViewById(R.id.textView_tier2_1);
        textView_tier2_2 = findViewById(R.id.textView_tier2_2);
        textView_tier2_3 = findViewById(R.id.textView_tier2_3);
        textView_tier3_1 = findViewById(R.id.textView_tier3_1);
        textView_tier3_2 = findViewById(R.id.textView_tier3_2);
        textView_tier3_3 = findViewById(R.id.textView_tier3_3);

        imageViewList.add(imageView_physicalemblem);
        imageViewList.add(imageView_magicalemblem);
        imageViewList.add(imageView_tankemblem);
        imageViewList.add(imageView_jungleemblem);
        imageViewList.add(imageView_assassinemblem);
        imageViewList.add(imageView_mageemblem);
        imageViewList.add(imageView_fighteremblem);
        imageViewList.add(imageView_supportemblem);
        imageViewList.add(imageView_marksmanemblem);

        imageViewList.get(0).setBackgroundColor(getResources().getColor(R.color.colorWhite));
        textView_title.setText(getEmblemName(0));
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, getList(0));
        //listView.setAdapter(adapter);

        for (int i = 0; i < imageViewList.size(); i++)
            imageViewList.get(i).setOnClickListener(this);


        linLay1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                linLay1.getViewTreeObserver().removeOnGlobalLayoutListener(this);

                linLayWidth = (linLay1.getWidth() - Utils.dpToPx(getApplicationContext(), 80));
                linLayWidth = (linLayWidth / 5);

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

    private ArrayList<String> getList(int i) {
        ArrayList<String> temp = new ArrayList<>();

        switch (i) {
            case 0:
                temp.add("Physical Attack / + 14,00");
                temp.add("HP Regen / + 18,00");
                temp.add("Critical Strike Chance / + 2,00%");
                temp.add("HP / + 267,00");
                temp.add("Attack Speed / + 3,00%");
                break;
            case 1:
                temp.add("Magic Power / + 14,00");
                temp.add("HP Regen / + 18,00");
                temp.add("Cooldown Reduction / + 2,00%");
                temp.add("HP / + 267,00");
                temp.add("Mana / + 180,00");
                break;
            case 2:
                temp.add("Armor / + 10,00");
                temp.add("Magic Resistance / + 10,00");
                temp.add("HP / + 345");
                temp.add("Cooldown Reduction / + 2,00%");
                temp.add("HP Regen / + 18,00");
                break;
            case 3:
                temp.add("Attack Speed / + 4,50%");
                temp.add("Physical Attack / + 13,00");
                temp.add("Lifesteal / + 2,50%");
                temp.add("Movement Speed / + 6,00%");
                temp.add("HP / + 306,00");
                break;
            case 4:
                temp.add("Physical Penetration / + 14,00");
                temp.add("Physical Attack / + 18,00");
                temp.add("Critical Strike Chance / + 2,00%");
                temp.add("HP / + 267,00");
                temp.add("Attack Speed / + 3,00%");
                break;
            case 5:
                break;
            case 6:
                temp.add("Physical Penetration / + 14,00");
                temp.add("Physical Attack / + 18,00");
                temp.add("Critical Strike Chance / + 2,00%");
                temp.add("HP / + 267,00");
                temp.add("Attack Speed / + 3,00%");
                break;
            case 7:
                break;
            case 8:
                break;
        }

        return temp;
    }

    private String getEmblemName(int i) {
        String temp = "";

        switch (i) {
            case 0:
                temp = "Physical Emblem Set";
                break;
            case 1:
                temp = "Magical Emblem Set";
                break;
            case 2:
                temp = "Tank Emblem Set";
                break;
            case 3:
                temp = "Jungle Emblem Set";
                break;
            case 4:
                temp = "Assassin Emblem Set";
                break;
            case 5:
                temp = "Mage Emblem Set";
                break;
            case 6:
                temp = "Fighter Emblem Set";
                break;
            case 7:
                temp = "Support Emblem Set";
                break;
            case 8:
                temp = "Marksman Emblem Set";
                break;
        }

        return temp;
    }

    @Override
    public void onClick(View view) {
        for (int i = 0; i < imageViewList.size(); i++) {
            imageViewBgColorNull(imageViewList.get(i));
            if (view.getId() == imageViewList.get(i).getId()) {
                imageViewBgColor(imageViewList.get(i));
                textView_title.setText(getEmblemName(i));

                //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, getList(i));
                //listView.setAdapter(adapter);

                //adapter.clear();
                //adapter.addAll(getList(i));
            }
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
