package com.example.alita_pc.alikawulansari_1202152332_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.DrawableRes;

/**
 * Created by Alita-pc on 2/25/2018.
 */

public class Air {
    private String judul;
    private String info;
    private int image;

    static final String TITLE_KEY = "Judul";
    static final String IMAGE_KEY = "Image Resource";


    public Air(String judul, String info, int image) {
        this.judul = judul;
        this.info = info;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getInfo() {
        return info;
    }

    public String getTitle() {
        return judul;
    }

    public static Intent starter(Context context, String judul, @DrawableRes int imageResId) {
        Intent detailIntent = new Intent(context, DetailActivity.class);
        detailIntent.putExtra(TITLE_KEY, judul);
        detailIntent.putExtra(IMAGE_KEY, imageResId);

        return detailIntent;
    }
}
