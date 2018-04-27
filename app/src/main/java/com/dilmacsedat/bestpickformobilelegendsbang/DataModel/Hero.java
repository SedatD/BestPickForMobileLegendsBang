package com.dilmacsedat.bestpickformobilelegendsbang.DataModel;

/**
 * Created by Sedat
 * on 27.04.2018.
 */

public class Hero {
    private int id;
    private String name, fullName, type, story;

    public Hero(int id, String name, String fullName, String type, String story) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.type = type;
        this.story = story;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public String getType() {
        return type;
    }

    public String getStory() {
        return story;
    }

}
