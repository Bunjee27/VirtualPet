package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);

        ArrayList<Metal> mmonsters = new ArrayList<>();
        mmonsters.add(new Metal("Metalsaur", R.drawable.metalsaur, "Rarity: Common", "Type(s): Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Haku", R.drawable.haku, "Rarity: Epic", "Type(s): Dark + Metal", "Weakness(es): Light + Magic"));
        mmonsters.add(new Metal("Super Dan", R.drawable.superdan, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("M2-WYVERN", R.drawable.m2wyvern, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Annihilator R2", R.drawable.annihilatorr2, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Hackster", R.drawable.hackster, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Ultrabot", R.drawable.ultrabot, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Quixote", R.drawable.quixote, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Terroriser", R.drawable.terroriser, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));
        mmonsters.add(new Metal("Sentinel", R.drawable.sentinel, "Rarity: Legendary", "Type(s): Legendary Metal", "Weakness(es): Magic"));



        ListView metalListview = findViewById(R.id.metalList);
        MetalAdapter metalAdapter = new MetalAdapter(this, mmonsters);
        metalListview.setAdapter(metalAdapter);
    }
}
