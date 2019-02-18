package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palavra_list);


        ArrayList<Palavra> palavras = new ArrayList<Palavra>();
        palavras.add(new Palavra("pai","father", R.drawable.family_father));
        palavras.add(new Palavra("mãe","mother", R.drawable.family_mother));
        palavras.add(new Palavra("filho","son", R.drawable.family_son));
        palavras.add(new Palavra("filha", "daughter", R.drawable.family_daughter));
        palavras.add(new Palavra("irmão mais velho", "older brother", R.drawable.family_older_brother));
        palavras.add(new Palavra("irmão mais novo","younger brother", R.drawable.family_younger_brother));
        palavras.add(new Palavra("irmã mais velha","older sister", R.drawable.family_older_sister));
        palavras.add(new Palavra("irmã mais nova","younger sister", R.drawable.family_younger_sister));
        palavras.add(new Palavra("avó","grandmother", R.drawable.family_grandmother));
        palavras.add(new Palavra("avô","grandfather", R.drawable.family_grandfather));

        PalavraAdapter adapter = new PalavraAdapter(this,palavras, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
