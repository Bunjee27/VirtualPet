package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class EarthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earth);

        ArrayList<Earth> emonsters = new ArrayList<>();
        emonsters.add(new Earth("Rockilla", R.drawable.rockilla,"Rarity: Common", "Type(s): Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Molem", R.drawable.molem, "Rarity: Rare", "Type(s): Nature + Earth", "Weakness(es): Fire + Dark"));
        emonsters.add(new Earth("LaCroc", R.drawable.lacroc, "Rarity: Rare", "Type(s): Nature + Earth", "Weakness(es): Fire + Dark"));
        emonsters.add(new Earth("Darude", R.drawable.darude, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Zameleon", R.drawable.zameleon, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Basthet", R.drawable.basthet, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Atlas", R.drawable.atlas, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Wolfgang", R.drawable.wolfgang, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Ouros", R.drawable.ouros, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));
        emonsters.add(new Earth("Hyperia", R.drawable.hyperia, "Rarity: Legendary", "Type(s): Legendary Earth", "Weakness(es): Dark"));


        ListView earthListview = findViewById(R.id.earthList);
        EarthAdapter earthAdapter = new EarthAdapter(this, emonsters);
        earthListview.setAdapter(earthAdapter);
    }
}
