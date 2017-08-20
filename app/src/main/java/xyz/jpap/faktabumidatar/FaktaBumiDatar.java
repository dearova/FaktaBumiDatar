package xyz.jpap.faktabumidatar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FaktaBumiDatar extends AppCompatActivity {
    private KumpulanFakta mfaktafakta = new KumpulanFakta();

    private KumpulanWarna mwarnawarna = new KumpulanWarna();

    //Langkah 1 mendeklarasikan variable yang digunakan
    private TextView mFaktaTextView;

    private Button mTampilkanFaktaLain;
    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakta_bumi_datar);

        //Langkah 2 men assign view dari file layout ke variable
        mFaktaTextView = (TextView) findViewById(R.id.TextBawah);
        mTampilkanFaktaLain = (Button) findViewById(R.id.LihatFaktaButton);

        mRelativeLayout = (RelativeLayout) findViewById(R.id.LayoutDepan);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fakta = mfaktafakta.getFakta();

                int Warna = mwarnawarna.getWarna();

                mFaktaTextView.setText(fakta);


                mRelativeLayout.setBackgroundColor(Warna);
            }
        };

        mTampilkanFaktaLain.setOnClickListener(listener);

    }
}
