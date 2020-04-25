package com.example.virtualpet;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ListView;
        import java.util.ArrayList;


public class NatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);

        ArrayList<Nature> nmonsters = new ArrayList<>();
        nmonsters.add(new Nature("Treezard", R.drawable.treezard, "Rarity: Common", "Type: Grass", "Weakness: Fire"));
        nmonsters.add(new Nature("Dragonian Beast", R.drawable.dbeast, "Rarity: Epic", "Type: Earth + Rock", "Weakness: Dark + Fire"));
        nmonsters.add(new Nature("Griffex", R.drawable.griffex, "Rarity: Epic", "Type: Thunder + Nature", "Earth + Fire"));
        nmonsters.add(new Nature("Thunderon", R.drawable.thunderon, "Rarity: Rare", " Type: Thunder + Nature", "Weakness: Earth + Fire"));
        nmonsters.add(new Nature("Drekk", R.drawable.drekk, "Rarity: Legendary", "Type: Legendary Nature", "Weakness: Fire"));
        nmonsters.add(new Nature("Fightreer", R.drawable.fightreer, "Rarity: Legendary", "Type: Legendary Nature", "Weakness: Fire"));
        nmonsters.add(new Nature("Kulkan", R.drawable.kulkan, "Rarity: Legendary", "Legendary Nature", "Weakness: Fire"));
        nmonsters.add(new Nature("General Alces", R.drawable.galces, "Rarity: Legendary", "Type: Legendary Nature", "Weakness: Fire"));
        nmonsters.add(new Nature("Super Pandalf", R.drawable.spandalf, "Rarity: Epic", "Type: Nature + Magic", "Fire"));
        nmonsters.add(new Nature("Rubellus", R.drawable.rubellus,"Rarity: Legendary", "Type: Legendary Nature", "Weakness: Fire"));


        ListView natureListview = findViewById(R.id.natureList);
        NatureAdapter natureAdapter = new NatureAdapter(this, nmonsters);
        natureListview.setAdapter(natureAdapter);
    }
}
