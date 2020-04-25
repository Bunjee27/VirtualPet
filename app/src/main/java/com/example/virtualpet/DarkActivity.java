package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class DarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark);

        ArrayList<Dark> dmonsters = new ArrayList<>();
        dmonsters.add(new Dark("Tyrannoking", R.drawable.tyrannoking, "Rarity: Common", "Type(s): Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("Chocobunny", R.drawable.chocobunny, "Rarity: Epic", "Type(s): Dark + Magic", "Weakness(es): Light + Nature"));
        dmonsters.add(new Dark("Krampus", R.drawable.krampus, "Rarity: Legendary", "Type(s): Legendary Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("Noctum", R.drawable.noctum, "Rarity: Legendary", "Type(s): Legendary Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("MMOnster", R.drawable.mmonster, "Rarity: Legendary", "Type(s): Legendary Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("General Nishant", R.drawable.nishant, "Rarity: Legendary", "Type(s): Legendary Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("Nebotus", R.drawable.nebotus, "Rarity: Legendary", "Type(s): Legendary Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("Postiguraf", R.drawable.postiguraf, "Rarity: Epic", "Type(s): Dark + Magic", "Weakness(es): Light + Nature"));
        dmonsters.add(new Dark("Ixofex", R.drawable.ixofex, "Rarity: Legendary", "Type(s): Legendary Dark", "Weakness(es): Light"));
        dmonsters.add(new Dark("Vortux", R.drawable.vortux, "Rarity: Rare", "Type(s): Dark + Metal", "Weakness(es): Light + Magic"));


        ListView darkListview = findViewById(R.id.darkList);
        DarkAdapter darkAdapter = new DarkAdapter(this, dmonsters);
        darkListview.setAdapter(darkAdapter);
    }
}
