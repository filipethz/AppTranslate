package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palavra_list);


        ArrayList<Palavra> palavras = new ArrayList<Palavra>();
        palavras.add(new Palavra("vemelho","red", R.drawable.color_red));
        palavras.add(new Palavra("verde","green", R.drawable.color_green));
        palavras.add(new Palavra("marrom","brown", R.drawable.color_brown));
        palavras.add(new Palavra("cinza", "gray", R.drawable.color_gray));
        palavras.add(new Palavra("preto", "black", R.drawable.color_black));
        palavras.add(new Palavra("branco","white", R.drawable.color_white));
        palavras.add(new Palavra("azul","blue", R.drawable.color_black));
        palavras.add(new Palavra("rosa","pink",R.drawable.color_black));
        palavras.add(new Palavra("roxo","purple",R.drawable.color_dusty_yellow));
        palavras.add(new Palavra("laranja","orange", R.drawable.color_mustard_yellow));

        PalavraAdapter adapter = new PalavraAdapter(this,palavras, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
