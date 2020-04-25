package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class LightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

        ArrayList<Light> lmonsters = new ArrayList<>();
        lmonsters.add(new Light("Light Spirit", R.drawable.lspirit, "Rarity: Common", "Type(s): Dark", "Weakness(es): Light"));
        lmonsters.add(new Light("Shakti", R.drawable.shakti, "Rarity: Legendary", "Type(s): Legendary Light", "Weakness(es): Metal"));
        lmonsters.add(new Light("General Ingvar", R.drawable.ingvar, "Rarity: Legendary", "Type(s): Legendary Light", "Weakness(es): Metal"));
        lmonsters.add(new Light("Goath'el", R.drawable.goathel, "Rarity: Epic", "Type(s): Thunder + Light", "Weakness(es): Earth + Metal"));
        lmonsters.add(new Light("Taiga", R.drawable.taiga, "Rarity: Legendary", "Type(s): Legendary Light", "Weakness(es): Metal"));
        lmonsters.add(new Light("Monky", R.drawable.monky, "Rarity: Legendary", "Type(s): Legendary Light", "Weakness(es): Metal"));
        lmonsters.add(new Light("Arch Knight", R.drawable.shakti, "Rarity: Legendary", "Type(s): Legendary Light", "Weakness(es): Metal"));
        lmonsters.add(new Light("Eburwin", R.drawable.eburwin, "Rarity: Epic", "Type(s): Light + Metal", "Weakness(es): Magic"));
        lmonsters.add(new Light("Lux Aura", R.drawable.luxaura, "Rarity: Legendary", "Type(s): Legendary Light", "Weakness(es): Metal"));
        lmonsters.add(new Light("Seraphim", R.drawable.seraphim, "Rarity: Epic", "Type(s): Dark + Light", "Weakness(es): Metal"));


        ListView lightListview = findViewById(R.id.lightList);
        LightAdapter lightAdapter = new LightAdapter(this, lmonsters);
        lightListview.setAdapter(lightAdapter);
    }
}
