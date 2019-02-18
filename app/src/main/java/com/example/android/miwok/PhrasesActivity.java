package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palavra_list);


        ArrayList<Palavra> palavras = new ArrayList<Palavra>();
        palavras.add(new Palavra("Onde você vai?","Where are you going?"));
        palavras.add(new Palavra("Qual é o seu nome?","What is your name?"));
        palavras.add(new Palavra("Meu nome é...","My name is..."));
        palavras.add(new Palavra("Como você está se sentindo?", "How are you feeling?"));
        palavras.add(new Palavra("Eu estou me sentindo bem.", "I’m feeling good."));
        palavras.add(new Palavra("Você está vindo?","Are you coming?"));
        palavras.add(new Palavra("Sim, estou indo.","Yes, I’m coming."));
        palavras.add(new Palavra("Estou chegando.","I’m coming."));
        palavras.add(new Palavra("Vamos.","Let’s go."));
        palavras.add(new Palavra("Venha aqui.","Come here."));

        PalavraAdapter adapter = new PalavraAdapter(this,palavras, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
