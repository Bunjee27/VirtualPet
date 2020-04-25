package com.example.virtualpet;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class MagicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic);

        ArrayList<Magic> mamonsters = new ArrayList<>();
        mamonsters.add(new Magic("Genie", R.drawable.genie, "Rarity: Common", "Type(s): Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("Bo Tai", R.drawable.botai, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("Malair", R.drawable.malair, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("Uru", R.drawable.uru, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("Shannara", R.drawable.shannara, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("Nereida", R.drawable.nereida, "Rarity: Rare", "Type(s): Nature + Magic", "Weakness(es): Fire "));
        mamonsters.add(new Magic("Soulfagous", R.drawable.soulfagous, "Rarity: Epic", "Type(s): Fire + Magic", "Weakness(es): Water + Nature"));
        mamonsters.add(new Magic("Lazarbeam", R.drawable.lazarbeam, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("Singularis", R.drawable.singularis, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));
        mamonsters.add(new Magic("White Pandalf", R.drawable.wpandalf, "Rarity: Legendary", "Type(s): Legendary Magic", "Weakness(es): Nature"));


        ListView magicListview = findViewById(R.id.magicList);
        MagicAdapter magicAdapter = new MagicAdapter(this, mamonsters);
        magicListview.setAdapter(magicAdapter);
    }
}
