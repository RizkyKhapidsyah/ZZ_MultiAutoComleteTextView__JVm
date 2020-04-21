package com.rk.mactv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView MACTV_1_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MACTV_1_IDJAVA = findViewById(R.id.MACTV_1_IDXML);

        final ArrayList<String> BuahBuahan = new ArrayList<>();
        BuahBuahan.add("Apples");
        BuahBuahan.add("Appricots");
        BuahBuahan.add("BlackBerry");
        BuahBuahan.add("BlueBerry");
        BuahBuahan.add("Cherries");
        BuahBuahan.add("CranBerry");
        BuahBuahan.add("Sugar-Apple");
        BuahBuahan.add("Pitaya");
        BuahBuahan.add("Common Flag");
        BuahBuahan.add("JackFruit");
        BuahBuahan.add("Mangos");
        BuahBuahan.add("Papayas");

        ArrayAdapter<String> Pencocok = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, BuahBuahan);
        MACTV_1_IDJAVA.setAdapter(Pencocok);
        MACTV_1_IDJAVA.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
