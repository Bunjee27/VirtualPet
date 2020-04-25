package com.example.virtualpet;

import android.media.Image;
import android.widget.ImageView;

public class Magic {
    private String name;
    private int photo;
    private String rarity;
    private String type;
    private String weakness;

    public Magic(String name, int photo, String rarity, String type, String weakness) {
        this.name = name;
        this.photo = photo;
        this.rarity = rarity;
        this.type = type;
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getRarity() {
        return rarity;
    }

    public String getType() {
        return type;
    }

    public String getWeakness() {
        return weakness;
    }
}

