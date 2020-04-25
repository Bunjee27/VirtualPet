package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class LightningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightning);

        ArrayList<Lightning> lnmonsters = new ArrayList<>();
        lnmonsters.add(new Lightning("Thunder Eagle", R.drawable.teagle, "Rarity: Common", "Type(s): Thunder", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Thorder", R.drawable.thorder, "Rarity: Legendary", "Type(s): Thunder", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Stoirm", R.drawable.stoirm, "Rarity: Epic", "Type(s): Water + Thunder ", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Yntec", R.drawable.yntec, "Rarity: Legendary", "Type(s): Legendary Thunder", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Vanoss", R.drawable.vanoss, "Rarity: Legendary", "Type(s): Legendary Thunder", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Rexx", R.drawable.rexx, "Rarity: Epic", "Type(s): Thunder + Metal", "Weakness(es): Earth + Magic "));
        lnmonsters.add(new Lightning("Sparking Mantis", R.drawable.smantis, "Rarity: Legendary", "Type(s): Legendary Thunder", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Mecharasu", R.drawable.mecharasu, "Rarity: Epic", "Type(s): Thunder + Metal", "Weakness(es): Earth + Magic"));
        lnmonsters.add(new Lightning("Mop", R.drawable.mop, "Rarity: Legendary", "Type(s): Legendary Thunder", "Weakness(es): Earth"));
        lnmonsters.add(new Lightning("Voltaik", R.drawable.voltaik, "Rarity: Legendary", "Type(s): Legendary Thunder", "Weakness(es): Earth"));


        ListView lightningListview = findViewById(R.id.lightningList);
        LightningAdapter lightningAdapter = new LightningAdapter(this, lnmonsters);
        lightningListview.setAdapter(lightningAdapter);
    }
}

