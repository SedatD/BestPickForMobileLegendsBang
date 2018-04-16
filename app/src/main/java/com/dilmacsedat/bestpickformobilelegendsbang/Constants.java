package com.dilmacsedat.bestpickformobilelegendsbang;

import java.util.ArrayList;

/**
 * Created by Sedat
 * on 6.04.2018.
 */

public class Constants {
    private static final String TAG = "Constants";

    private static ArrayList<String> abilitiesListTitle = new ArrayList<>();
    private static ArrayList<String> abilitiesListDetail = new ArrayList<>();
    private static ArrayList<String> abilitiesListCd = new ArrayList<>();
    private static ArrayList<String> abilitiesListLwl = new ArrayList<>();

    public static ArrayList getAbilitiesListTitle() {
        abilitiesListTitle.add("Execute");
        abilitiesListTitle.add("Retribution");
        abilitiesListTitle.add("Inspire");
        abilitiesListTitle.add("Sprint");
        abilitiesListTitle.add("Healing Spell");
        abilitiesListTitle.add("Aegis");
        abilitiesListTitle.add("Petrify");
        abilitiesListTitle.add("Purify");
        abilitiesListTitle.add("Weaken");
        abilitiesListTitle.add("Flicker");
        abilitiesListTitle.add("Arrival");
        abilitiesListTitle.add("Iron Wall");

        return abilitiesListTitle;
    }

    public static ArrayList getAbilitiesListDetail() {
        abilitiesListDetail.add("Deals 240-800 pts of true damage to a specified hero (grows with level).");
        abilitiesListDetail.add("Deals 600-1440 pts of true damage to nearby jungle monsters or minions (damage will increase with level). Reduces damage take from jungle monsters by 30% for 3s if used when equipped with jungling items.");
        abilitiesListDetail.add("Greatly enhances the hero for a short period of time. The next 8 basic attacks will ignore 25 pts of the target's physical defense and increases your hero's attack speed 55%. Last 5s.");
        abilitiesListDetail.add("Immediately increases movement speed 42%. This effect slowly fades over 10s.\nCooldown: 100 seconds");
        abilitiesListDetail.add("Regens 15% of the hero HP and regens up 15% HP for surrounding allies based on the number of allies around the hero. Also regens 10% mana for self and surrounding allies.");
        abilitiesListDetail.add("Summons a shield to encase the hero, able to withstand 4 basic attacks (including turrets). Lasts 5s.");
        abilitiesListDetail.add("Deals 115-325 magic damage to surrounding enemies (increases with level) and petrifies targets for 0.7s.");
        abilitiesListDetail.add("After skill is released, it will immediately remove all negative effects and grants immunity; disables for one second and increases hero's speed by 30%");
        abilitiesListDetail.add("Reduces a specified hero's movement speed 70% and physical and magic power 50%. Lasts 3s.");
        abilitiesListDetail.add("Teleport a certain distance in a specified direction. For 1s after the teleport, duration of disabling effects will be reduced 50%.");
        abilitiesListDetail.add("Teleport to the Allied Turret or Minion after chanting for 3s. The Target turret or minion will be invincible when the hero is teleporting. Movement Speed will increase by 30% for the next 3s. Canceling this skill early cuts the cooldown time by 50s.");
        abilitiesListDetail.add("In 3s, physical and magic damage taken is reduced by 40%");

        return abilitiesListDetail;
    }

    public static ArrayList getAbilitiesListCd() {
        abilitiesListCd.add("Cooldown: 90 seconds");
        abilitiesListCd.add("Cooldown: 30 seconds");
        abilitiesListCd.add("Cooldown: 60 seconds");
        abilitiesListCd.add("Cooldown: 100 seconds");
        abilitiesListCd.add("Cooldown: 120 seconds");
        abilitiesListCd.add("Cooldown: 90 seconds");
        abilitiesListCd.add("Cooldown: 90 seconds");
        abilitiesListCd.add("Cooldown: 110 seconds");
        abilitiesListCd.add("Cooldown: 60 seconds");
        abilitiesListCd.add("Cooldown: 120 seconds");
        abilitiesListCd.add("Cooldown: 150 seconds");
        abilitiesListCd.add("Cooldown: 60 seconds");

        return abilitiesListCd;
    }

    public static ArrayList getAbilitiesListLwl() {
        abilitiesListLwl.add("Unlocks at Lvl 1");
        abilitiesListLwl.add("Unlocks at Lvl 1");
        abilitiesListLwl.add("Unlocks at Lvl 5");
        abilitiesListLwl.add("Unlocks at Lvl 7");
        abilitiesListLwl.add("Unlocks at Lvl 9");
        abilitiesListLwl.add("Unlocks at Lvl 11");
        abilitiesListLwl.add("Unlocks at Lvl 13");
        abilitiesListLwl.add("Unlocks at Lvl 15");
        abilitiesListLwl.add("Unlocks at Lvl 17");
        abilitiesListLwl.add("Unlocks at Lvl 19");
        abilitiesListLwl.add("Unlocks at Lvl 21");
        abilitiesListLwl.add("Unlocks at Lvl 23");

        return abilitiesListLwl;
    }

}
