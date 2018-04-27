package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.dilmacsedat.bestpickformobilelegendsbang.Constants;
import com.dilmacsedat.bestpickformobilelegendsbang.DataModel.Hero;
import com.dilmacsedat.bestpickformobilelegendsbang.R;
import com.dilmacsedat.bestpickformobilelegendsbang.Util.Utils;

import java.util.ArrayList;

public class HeroesActivity extends AppCompatActivity implements View.OnClickListener {
    private int linLayWidth;
    LinearLayout linLayHeroes, linLayH, linLayH2, linLayS, linLayText;
    String name, heroName,name2, name3;
    ImageView imageView_big;
    TextView tv_title, tv_detail;

    private final ArrayList<ImageView> imageViewList = new ArrayList<>();
    private ArrayList<Hero> list = new ArrayList<>();
    //private ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        linLayHeroes = findViewById(R.id.linLayHeroes);
        linLayH = findViewById(R.id.linlayH);
        linLayH2 = findViewById(R.id.linlayH2);
        linLayS = findViewById(R.id.linlayS);
        linLayText = findViewById(R.id.linlaytext);
        ImageView imageView_assassin = findViewById(R.id.imageView_assassin);
        ImageView imageView_fighter = findViewById(R.id.imageView_fighter);
        ImageView imageView_mage = findViewById(R.id.imageView_mage);
        ImageView imageView_marksman = findViewById(R.id.imageView_marksman);
        ImageView imageView_support = findViewById(R.id.imageView_support);
        ImageView imageView_tank = findViewById(R.id.imageView_tank);
        imageView_big = findViewById(R.id.imageView_big);
        tv_title = findViewById(R.id.textView_title);
        tv_detail = findViewById(R.id.textView_detail);


        imageViewList.add(imageView_assassin);
        imageViewList.add(imageView_fighter);
        imageViewList.add(imageView_mage);
        imageViewList.add(imageView_marksman);
        imageViewList.add(imageView_support);
        imageViewList.add(imageView_tank);


        imageViewList.get(0).setBackgroundColor(getResources().getColor(R.color.colorWhite));

        for (int i = 0; i < imageViewList.size(); i++)
            imageViewList.get(i).setOnClickListener(this);

        linLayHeroes.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                linLayHeroes.getViewTreeObserver().removeOnGlobalLayoutListener(this);

                linLayWidth = (linLayHeroes.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                linLayWidth = (linLayWidth / 6);

                for (int i = 0; i < imageViewList.size(); i++)
                    imageViewMeasures(imageViewList.get(i));

                linLayHeroes.requestLayout();
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
        if (((LinearLayout) linLayS).getChildCount() > 0)
            ((LinearLayout) linLayS).removeAllViews();
        for (int i = 0; i < imageViewList.size(); i++) {
            imageViewBgColorNull(imageViewList.get(i));
            if (view.getId() == imageViewList.get(i).getId()) {
                imageViewBgColor(imageViewList.get(i));
                switch (i) {
                    case 0:
                        list = Utils.getHeroByType("assassin");
                        break;
                    case 1:
                        list = Utils.getHeroByType("fighter");
                        break;
                    case 2:
                        list = Utils.getHeroByType("mage");
                        break;
                    case 3:
                        list =Utils.getHeroByType("marksman");
                        break;
                    case 4:
                        list =Utils.getHeroByType("support");
                        break;
                    case 5:
                        list =Utils.getHeroByType("tank");
                        break;
                }
                getList(list);
            }
        }

    }

    private void getList(final ArrayList<Hero> list) {
        if (((LinearLayout) linLayH).getChildCount() > 0)
            ((LinearLayout) linLayH).removeAllViews();
        if (((LinearLayout) linLayH2).getChildCount() > 0)
            ((LinearLayout) linLayH2).removeAllViews();
        tv_title.setText("");
        tv_detail.setText("");
        imageView_big.setImageDrawable(null);
        for (int b = 0; b < list.size(); b++) {
            final ImageView imageview = new ImageView(HeroesActivity.this);
            imageview.setId(b);
            name = list.get(b).getName()+"small";
            imageview.setImageResource(getResources().getIdentifier(name , "drawable", getPackageName()));
            final int id = imageview.getId();
            linLayH.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    linLayH.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    linLayWidth = (linLayH.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                    linLayWidth = (linLayWidth / 6);
                    for (int i = 0; i < 6; i++) {
                        LinearLayout.LayoutParams params = new LinearLayout
                                .LayoutParams(linLayWidth, linLayWidth);
                        params.setMargins(8, 8, 8, 8);
                        imageview.setLayoutParams(params);
                        imageview.setPadding(2, 2, 2, 2);
                    }
                    linLayH.requestLayout();
                }
            });
            linLayH.addView(imageview);
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(list.equals(Utils.getHeroByType("assassin"))){
                        heroName = list.get(id).getName();
                    }
                    if(list.equals(Utils.getHeroByType("tank"))){
                        heroName = list.get(id).getName();
                    }
                    if (((LinearLayout) linLayS).getChildCount() > 0)
                        ((LinearLayout) linLayS).removeAllViews();
                    name3 = heroName+"big";
                    imageView_big.setImageResource(getResources().getIdentifier(name3 , "drawable", getPackageName()));
                    tv_title.setText(list.get(id).getFullName());
                    tv_detail.setText(list.get(id).getStory());
                    for (int i= 1; i<5;i++)
                    {
                        final ImageView imageview = new ImageView(HeroesActivity.this);
                        name2 = heroName+i;
                        imageview.setImageResource(getResources().getIdentifier(name2 , "drawable", getPackageName()));
                        linLayS.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                            @Override
                            public void onGlobalLayout() {
                                linLayS.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                linLayWidth = (linLayS.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                                linLayWidth = (linLayWidth / 6);
                                for (int i = 0; i < 6; i++) {
                                    LinearLayout.LayoutParams params = new LinearLayout
                                            .LayoutParams(linLayWidth, linLayWidth);
                                    params.setMargins(8, 8, 8, 8);
                                    imageview.setLayoutParams(params);
                                    imageview.setPadding(2, 2, 2, 2);
                                }
                                linLayS.requestLayout();
                            }
                        });
                        linLayS.addView(imageview);
                    }
                }
            });
        }


        for (int b = 6; b < list.size(); b++) {
            final ImageView imageview = new ImageView(HeroesActivity.this);
            imageview.setId(b);
            name = list.get(b).getName()+"small";
            imageview.setImageResource(getResources().getIdentifier(name , "drawable", getPackageName()));
            final int id = imageview.getId();
            //  ImageView imageview1 = findViewById(id);
            linLayH2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    linLayH2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    linLayWidth = (linLayH2.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                    linLayWidth = (linLayWidth / 6);
                    for (int i = 0; i < 6; i++) {
                        LinearLayout.LayoutParams params = new LinearLayout
                                .LayoutParams(linLayWidth, linLayWidth);
                        params.setMargins(8, 8, 8, 8);
                        imageview.setLayoutParams(params);
                        imageview.setPadding(2, 2, 2, 2);
                    }
                    linLayH2.requestLayout();
                }
            });
            linLayH2.addView(imageview);
            imageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(list.equals(Utils.getHeroByType("assassin"))){
                        heroName = list.get(id).getName();
                    }
                    if(list.equals(Utils.getHeroByType("tank"))){
                        heroName = list.get(id).getName();
                    }
                    if (((LinearLayout) linLayS).getChildCount() > 0)
                        ((LinearLayout) linLayS).removeAllViews();
                    name3 = heroName+"big";
                    imageView_big.setImageResource(getResources().getIdentifier(name3 , "drawable", getPackageName()));
                    tv_title.setText(list.get(id).getFullName());
                    tv_detail.setText(list.get(id).getStory());
                    for (int i= 1; i<5;i++)
                    {
                        final ImageView imageview = new ImageView(HeroesActivity.this);
                        name2 = heroName+i;
                        imageview.setImageResource(getResources().getIdentifier(name2 , "drawable", getPackageName()));
                        linLayS.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                            @Override
                            public void onGlobalLayout() {
                                linLayS.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                linLayWidth = (linLayS.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                                linLayWidth = (linLayWidth / 6);
                                for (int i = 0; i < 6; i++) {
                                    LinearLayout.LayoutParams params = new LinearLayout
                                            .LayoutParams(linLayWidth, linLayWidth);
                                    params.setMargins(8, 8, 8, 8);
                                    imageview.setLayoutParams(params);
                                    imageview.setPadding(2, 2, 2, 2);
                                }
                                linLayS.requestLayout();
                            }
                        });
                        linLayS.addView(imageview);
                    }
                }
            });
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
