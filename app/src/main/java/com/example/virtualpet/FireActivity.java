package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class FireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        ArrayList<Fire> fmonsters = new ArrayList<>();
        fmonsters.add(new Fire("Firesaur", R.drawable.firesaur, "Rarity: Common", "Type(s): Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("General Darmith", R.drawable.gdarmith, "Rarity: Legendary", "Type(s): Legendary Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("Firestorm", R.drawable.firestorm, "Rarity: Legendary", "Type(s): Legendary Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("Sunblast", R.drawable.sunblast, "Rarity: Legendary", "Type(s): Legendary Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("Ingenica", R.drawable.ingenica, "Rarity: Legendary", "Type(s): Legendary Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("The Inheritor", R.drawable.inheritor, "Rarity: Legendary", "Type(s): Legendary Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("Nitroblaster", R.drawable.nitroblaster, "Rarity: Legendary", "Type(s): Legendary Fire", "Weakness(es): Water"));
        fmonsters.add(new Fire("Rhinoram", R.drawable.rhinoram, "Rarity: Epic", "Type(s): Fire + Metal", "Weakness(es): Water + Magic"));
        fmonsters.add(new Fire("Hellborne", R.drawable.hellborne, "Rarity: Epic", "Type(s): Fire + Dark", "Weakness(es): Water + Light"));
        fmonsters.add(new Fire("Esthirel", R.drawable.esthirel, "Rarity: Epic", "Type(s): Fire + Light", "Weakness(es): Water + Metal"));

        ListView fireListview = findViewById(R.id.fireList);
        FireAdapter artistAdapter = new FireAdapter(this, fmonsters);
        fireListview.setAdapter(artistAdapter);
    }
}