package xyz.jpap.faktabumidatar;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by DennyNugraha on 12/08/2017.
 */
public class KumpulanWarna {
    private String[] mWarna = {
    "#FFDEAD",
    "#FFE4C4",
    "#E6E6FA",
    "#F0F8FF",
    "#FFE4E1",
    "#D3D3D3",
    "#87CEEB",
    "#E0FFFF"


    };
    public int getWarna() {

        String Warna ;

        Random randomGenerator = new Random();
        int randomnumber = randomGenerator.nextInt(mWarna.length);
        Warna = mWarna[randomnumber];
        int colorint = Color.parseColor(Warna);
        return colorint;
    }
}
