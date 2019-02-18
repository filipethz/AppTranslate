package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palavra_list);

        ArrayList<Palavra> palavras = new ArrayList<Palavra>();
        palavras.add(new Palavra("um","one", R.drawable.number_one));
        palavras.add(new Palavra("dois","two", R.drawable.number_two));
        palavras.add(new Palavra("três","three", R.drawable.number_three));
        palavras.add(new Palavra("quatro", "four", R.drawable.number_four));
        palavras.add(new Palavra("cinco", "five", R.drawable.number_five));
        palavras.add(new Palavra("seis","six", R.drawable.number_six));
        palavras.add(new Palavra("sete","seven", R.drawable.number_seven));
        palavras.add(new Palavra("oito","eight", R.drawable.number_eight));
        palavras.add(new Palavra("nove","nine", R.drawable.number_nine));
        palavras.add(new Palavra("dez","ten", R.drawable.number_ten));

        PalavraAdapter adapter = new PalavraAdapter(this,palavras, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
