package com.dilmacsedat.bestpickformobilelegendsbang.Activity;

import android.graphics.Color;
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
import android.widget.Toast;

import com.dilmacsedat.bestpickformobilelegendsbang.Constants;
import com.dilmacsedat.bestpickformobilelegendsbang.R;
import com.dilmacsedat.bestpickformobilelegendsbang.Util.Utils;

import java.util.ArrayList;

public class HeroesActivity extends AppCompatActivity implements View.OnClickListener {
    private int linLayWidth;
    LinearLayout linLayHeroes, linLayH, linLayH2, linLayS;

    private final ArrayList<ImageView> imageViewList = new ArrayList<>();
    private final ArrayList<Integer> imageViewListFighter = new ArrayList<>();
    private final ArrayList<Integer> imageViewListMage = new ArrayList<>();
    private final ArrayList<Integer> imageViewListAssassin = new ArrayList<>();
    private final ArrayList<Integer> imageViewListMarksman = new ArrayList<>();
    private final ArrayList<Integer> imageViewListSupport = new ArrayList<>();
    private final ArrayList<Integer> imageViewListTank = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinFanny = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinGusion = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinHayabusa = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinHelcurt = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinKarina = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinLancelot = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinNatalia = new ArrayList<>();
    private final ArrayList<Integer> ivListAssassinSaber = new ArrayList<>();
    private static ArrayList<String> assassinTv = new ArrayList<>();
    private final ArrayList<Integer> AssassinBig = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

        linLayHeroes = findViewById(R.id.linLayHeroes);
        linLayH = findViewById(R.id.linlayH);
        linLayH2 = findViewById(R.id.linlayH2);
        linLayS = findViewById(R.id.linlayS);
        ImageView imageView_assassin = findViewById(R.id.imageView_assassin);
        ImageView imageView_fighter = findViewById(R.id.imageView_fighter);
        ImageView imageView_mage = findViewById(R.id.imageView_mage);
        ImageView imageView_marksman = findViewById(R.id.imageView_marksman);
        ImageView imageView_support = findViewById(R.id.imageView_support);
        ImageView imageView_tank = findViewById(R.id.imageView_tank);



        imageViewList.add(imageView_assassin);
        imageViewList.add(imageView_fighter);
        imageViewList.add(imageView_mage);
        imageViewList.add(imageView_marksman);
        imageViewList.add(imageView_support);
        imageViewList.add(imageView_tank);


        imageViewListAssassin.add(R.drawable.fannysmall);
        imageViewListAssassin.add(R.drawable.hayabusasmall);
        imageViewListAssassin.add(R.drawable.helcurtsmall);
        imageViewListAssassin.add(R.drawable.karinasmall);
        imageViewListAssassin.add(R.drawable.lancelotsmall);
        imageViewListAssassin.add(R.drawable.nataliasmall);
        imageViewListAssassin.add(R.drawable.sabersmall);

        imageViewListMarksman.add(R.drawable.brunosmall);
        imageViewListMarksman.add(R.drawable.clintsmall);
        imageViewListMarksman.add(R.drawable.irithelsmall);
        imageViewListMarksman.add(R.drawable.karriesmall);
        imageViewListMarksman.add(R.drawable.laylasmall);
        imageViewListMarksman.add(R.drawable.lesleysmall);
        imageViewListMarksman.add(R.drawable.miyasmall);
        imageViewListMarksman.add(R.drawable.moskovsmall);
        imageViewListMarksman.add(R.drawable.yisunshinsmall);

        imageViewListSupport.add(R.drawable.diggiesmall);
        imageViewListSupport.add(R.drawable.estessmall);
        imageViewListSupport.add(R.drawable.nanasmall);
        imageViewListSupport.add(R.drawable.rafaelasmall);

        imageViewListTank.add(R.drawable.akaismall);
        imageViewListTank.add(R.drawable.francosmall);
        imageViewListTank.add(R.drawable.gatotkacasmall);
        imageViewListTank.add(R.drawable.grocksmall);
        imageViewListTank.add(R.drawable.hylossmall);
        imageViewListTank.add(R.drawable.johnsonsmall);
        imageViewListTank.add(R.drawable.lolitasmall);
        imageViewListTank.add(R.drawable.minotaursmall);
        imageViewListTank.add(R.drawable.tigrealsmall);

        ivListAssassinFanny.add(R.drawable.fanny1);
        ivListAssassinFanny.add(R.drawable.fanny2);
        ivListAssassinFanny.add(R.drawable.fanny3);
        ivListAssassinFanny.add(R.drawable.fanny4);

        ivListAssassinHayabusa.add(R.drawable.hayabusa1);
        ivListAssassinHayabusa.add(R.drawable.hayabusa2);
        ivListAssassinHayabusa.add(R.drawable.hayabusa3);
        ivListAssassinHayabusa.add(R.drawable.hayabusa4);

        ivListAssassinHelcurt.add(R.drawable.helcurt1);
        ivListAssassinHelcurt.add(R.drawable.helcurt2);
        ivListAssassinHelcurt.add(R.drawable.helcurt3);
        ivListAssassinHelcurt.add(R.drawable.helcurt4);

        ivListAssassinKarina.add(R.drawable.karina1);
        ivListAssassinKarina.add(R.drawable.karina2);
        ivListAssassinKarina.add(R.drawable.karina3);
        ivListAssassinKarina.add(R.drawable.karina4);

        ivListAssassinLancelot.add(R.drawable.lancelot1);
        ivListAssassinLancelot.add(R.drawable.lancelot2);
        ivListAssassinLancelot.add(R.drawable.lancelot3);
        ivListAssassinLancelot.add(R.drawable.lancelot4);

        ivListAssassinNatalia.add(R.drawable.natalia1);
        ivListAssassinNatalia.add(R.drawable.natalia2);
        ivListAssassinNatalia.add(R.drawable.natalia3);
        ivListAssassinNatalia.add(R.drawable.natalia4);

        ivListAssassinSaber.add(R.drawable.saber1);
        ivListAssassinSaber.add(R.drawable.saber2);
        ivListAssassinSaber.add(R.drawable.saber3);
        ivListAssassinSaber.add(R.drawable.saber4);

        assassinTv.add("Despite just being a human, Fanny never gave up on her dream of flying. She fashioned a kind of steel grappling hook for herself in the hopes of using it to grab onto cliff faces and soar between mountain peaks. After countless training sessions in live environments, Fanny has finally mastered this technique. Folks who have seen her soaring through the air refer to her as the Blade of Freedom.");
        assassinTv.add("gusion");
        assassinTv.add("Many years ago, the god of the very first ninjas created the Order of the Scarlet Shadow, formed of countless outstanding disciples. Over time, beliefs within the order diverged, and the Scarlet Shadow split into two factions -- the Scarlet Sect and the Shadow Sect. Conflict between the two sects gradually intensified, even to the point of drawing swords on one another. In order to avoid bloodshed, the two sects decided that every ten tears they would select the best Scarlet ninja and the best Shadow ninja to duel. The winner would inherit the title \\\"Scarlet Shadow Grandmaster\\\", under whom the two sects would study according to the ninja code left behind by their god. Ten years ago, a Shadow emerged possessing the kind of exceptional ability one sees only once in a hundred years. Even the Scarlet sect recognized his talent, but as they anticipated the day this Shadow would inherit the Scarlet Shadow title to unite the two sects and resurrect the glory of the Order of the Scarlet Shadow, heinous events transpired that would change the ninja world forever. While undertaking a mission, the Shadow brutally killed the Scarlet Sect\\'s leader and returned to assert his supreme dominance over the two sects. Betraying one\\'s companions is the most unforgivable sin among ninjas, and the infuriated ninjas of the two sects decided to take action. They sent the foremost elite ninjas from the two sects to encircle the Shadow. The ensuing battle was the most chaotic in the Scarlet Shadow\\'s history. The two groups of elite ninjas were all slain, and the injured Shadow fled the Scarlet Shadow with his life. This battle greatly weakened the sects, bringing shame to them both, and cracks between the factions emerged once again. In the end, the two sects agreed that whoever found and killed the disgraced Shadow would become the Scarlet Shadow Grandmaster. The patriarch of the Shadow Sect selected the young Hayabusa to undergo training to this end, teaching him the secret methods of shadow manipulation without reservation, and as fate predicted, ten years later he became the strongest ninja the Shadow Sect had ever seen, and their new rightful Shadow. However, Hayabusa knew in his heart that his only purpose was to kill the former Shadow. When the former shadow re-emerged in the Land of Dawn, Hayabusa knew that the day of reckoning was not far off...");
        assassinTv.add("In the museum records of the Lord of Dawn, there is said to be a mysterious race that once forged a great empire. This race was blessed with the power to swallow up light, for they are able to temporarily blackout a space. This was not the only talent they possessed, as they also had the ability to blink through physical space, being able to surprise enemies for a sneak attack. What’s most terrifying about them, however, is what was on their tails, a concoction of naturally sourced poison, for those unfortunate enough to come in contact with the poison would should say their last words, but ultimately this is also what caused the demise of their very own race. In the annals, it does not give the specifics on how this race went extinct, but it is certain that this terrifying race definitely did walk upon on the Land of Dawn. Since their extinction, humanity had progressed prosperously, however, but the history books  could not predict that one day these creatures would slowly creep out of the shadows again...");
        assassinTv.add("karina");
        assassinTv.add("Lancelot hails from the Baroque family in the Land of Dawn, where at a young age he showed exquisite talent in the art of fencing, garnering the praise of the masses, so much so that he became lost in the admiration. When the magical tribes of the attacked, Lancelot, who had just awoken from a drunken stupor, arrogantly attacked them alone. After winning a few battles, he dropped his guard and pursued the remaining forces in arrogance but soon the magical tribes regrouped and defeated him within the mountains. After coming in contact with Princess Odette, he soon became enamoured with her purity and also soon understood how wrong he was to be so arrogant and shallow in the past. When he was recovering at the Swan Castle, Lancelot soon realised the magical potential of the Regina family, he was able to integrate it into his fencing, culminating in the shadow step maneuver. Now he once again sets foot in the fighting ring to test his new skills.");
        assassinTv.add("Natalia was raised from a little girl by the Church of Light and trained into one of the Church\\'s assassins. This young phenom had risen to become the top assassin for the Church via her outstanding talents, but then on one assassination mission, she failed, causing her companion to meet with unprecedented disaster. Although she was able to escape danger with Tigreal\\'s help, this was undoubtedly a severe blow to proud Natalia. To prove herself again, she exiled herself to the outskirts of the land far from the Empire and the Church to carry out more dangerous missions. Who is her target? Will she be able to win back all that she once possessed?");
        assassinTv.add("The 1718 Lab was located in a gigantic planar cabin of space rift where gathered plenty of scientists from all over the world. They devoted themselves to creating more powerful and advanced human being. Gathering DNA from swordsmaster of hundreds of different races, they created the ultimate swordsman using advanced technology and named him Saber. His sword can tear a hole in spacetime, allowing him to travel to any place or time. His skills as a swordsman make him difficult to defeat, and also lonely beyond compare. After countless challengers were drawn to the land of dawn, Saber also turned his sights on this place, ripping through the fabric of space and time to set foot in the land of dawn and find an opponent worthy enough to face him.");

        AssassinBig.add(R.drawable.fannybig);
        AssassinBig.add(0);
        AssassinBig.add(R.drawable.hayabusabig);
        AssassinBig.add(R.drawable.helcurtbig);
        AssassinBig.add(R.drawable.karinabig);
        AssassinBig.add(R.drawable.lancelotbig);
        AssassinBig.add(R.drawable.nataliabig);
        AssassinBig.add(R.drawable.saberbig);


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
        for (int i = 0; i < imageViewList.size(); i++) {
            imageViewBgColorNull(imageViewList.get(i));
            if (view.getId() == imageViewList.get(i).getId()) {
                imageViewBgColor(imageViewList.get(i));
                switch (i) {
                    case 0:
                        list = imageViewListAssassin;
                        break;
                    case 1:
                        list = imageViewListFighter;
                        break;
                    case 2:
                        list = imageViewListMage;
                        break;
                    case 3:
                        list = imageViewListMarksman;
                        break;
                    case 4:
                        list = imageViewListSupport;
                        break;
                    case 5:
                        list = imageViewListTank;
                        break;
                }
                getList(list);
            }
        }

    }

    private void getList(final ArrayList<Integer> list) {
        if (((LinearLayout) linLayH).getChildCount() > 0)
            ((LinearLayout) linLayH).removeAllViews();
        if (((LinearLayout) linLayH2).getChildCount() > 0)
            ((LinearLayout) linLayH2).removeAllViews();
        for (int b = 0; b < list.size(); b++) {
            final ImageView imageview = new ImageView(HeroesActivity.this);
            imageview.setId(b);
            imageview.setImageResource(list.get(b));
            final int id = imageview.getId();
            ImageView imageview1 = findViewById(id);
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
                    switch(id){
                        case 0 :
                            list2 = ivListAssassinFanny;
                            break;
                        case 1 :
                          //  list2 = ivListAssassinGusion;
                            break;
                        case 2:
                            list2 = ivListAssassinHayabusa;
                            break;
                        case 3:
                            list2 = ivListAssassinHelcurt;
                            break;
                        case 4:
                            list2 = ivListAssassinKarina;
                            break;
                        case 5:
                            list2 = ivListAssassinLancelot;
                            break;
                        case 6:
                            list2 = ivListAssassinNatalia;
                            break;
                        case 7:
                            list2 = ivListAssassinSaber;
                            break;
                    }
                    if (((LinearLayout) linLayS).getChildCount() > 0)
                        ((LinearLayout) linLayS).removeAllViews();
                    for (int i= 0; i<4;i++)
                    {
                        final ImageView imageview = new ImageView(HeroesActivity.this);
                        imageview.setImageResource(list2.get(i));
                        linLayS.addView(imageview);
                    }
                }
            });
        }






        for (int b = 6; b < list.size(); b++) {
            final ImageView imageview = new ImageView(HeroesActivity.this);
            imageview.setImageResource(list.get(b));
            linLayH2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    linLayH2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    linLayWidth = (linLayH2.getWidth() - Utils.dpToPx(getApplicationContext(), 96));
                    linLayWidth = (linLayWidth / 6);
                    for (int i = 0; i < list.size(); i++) {
                        LinearLayout.LayoutParams params = new LinearLayout
                                .LayoutParams(linLayWidth, linLayWidth);
                        params.setMargins(8, 8, 8, 8);
                        imageview.setPadding(2, 2, 2, 2);
                        imageview.setLayoutParams(params);
                    }
                    linLayH2.requestLayout();
                }
            });
            linLayH2.addView(imageview);
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
