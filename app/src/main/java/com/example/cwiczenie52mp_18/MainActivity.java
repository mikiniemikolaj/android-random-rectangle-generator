package com.example.cwiczenie52mp_18;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvLosowaLiczba;
    Button btnLosuj;
    View prostokat;
    int liczba;

    int[] kolory = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.CYAN,
            Color.MAGENTA,
            Color.GRAY,
            Color.BLACK,
            Color.DKGRAY,
            Color.LTGRAY
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvLosowaLiczba = findViewById(R.id.tvLosowaLiczba);
        btnLosuj = findViewById(R.id.btnLosuj);
        prostokat = findViewById(R.id.prostokat);

        btnLosuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczba = (int) (Math.random() * 10) + 1;
                tvLosowaLiczba.setText("Wylosowana liczba: " + liczba);
                prostokat.setBackgroundColor(kolory[liczba - 1]);

                ViewGroup.LayoutParams params = prostokat.getLayoutParams();
                params.height = liczba * 30;
                prostokat.setLayoutParams(params);
            }
        });
    }
}