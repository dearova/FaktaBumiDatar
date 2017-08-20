package xyz.jpap.faktabumidatar;

import java.util.Random;

/**
 * Created by DennyNugraha on 12/08/2017.
 */
public class KumpulanJudul {

    private String[] mAtasa = {



















    };
    public String getJudul() {

        String Atas = "";

        Random randomGenerator = new Random();
        int randomnumber = randomGenerator.nextInt(mAtasa.length);
        Atas = mAtasa[randomnumber];
        return Atas;
    }
}
