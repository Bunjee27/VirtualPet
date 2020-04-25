package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class WaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        ArrayList<Water> wmonsters = new ArrayList<>();
        wmonsters.add(new Water("Mersnake", R.drawable.mersnake, "Rarity: Common", "Type(s): Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("Coldberus", R.drawable.coldberus, "Rarity: Epic", "Type(s): Water + Dark", "Weakness(es): Thunder + Light"));
        wmonsters.add(new Water("Kozorg", R.drawable.kozorg, "Rarity: Legendary", "Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("Sphyrnus", R.drawable.sphyrnus, "Rarity: Legendary", " Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("Blob", R.drawable.blob, "Rarity: Legendary", "Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("The Prisoner", R.drawable.prisoner, "Rarity: Legendary", "Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("White Walker", R.drawable.wwalker, "Rarity: Legendary", "Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("Nidaria", R.drawable.nidaria, "Rarity: Legendary", "Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("Chill Bill", R.drawable.chillbill, "Rarity: Legendary", "Type(s): Legendary Water", "Weakness(es): Thunder"));
        wmonsters.add(new Water("Drop Elemental", R.drawable.delemental,"Rarity: Epic", "Type(s): Water + Magic ", "Weakness(es): Thunder + Nature"));


        ListView waterListview = findViewById(R.id.waterList);
        WaterAdapter waterAdapter = new WaterAdapter(this, wmonsters);
        waterListview.setAdapter(waterAdapter);

    }
}
