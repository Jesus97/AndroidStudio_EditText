package com.iesvirgendelcarmen.dam.editext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner =  (Spinner)findViewById(R.id.spinner);
        String [] valores ={"humano","gnomo","elfo de sangre","orco","taurion","no muerto"};
        spinner.setAdapter(new ArrayAdapter<String>(this , android.R.layout.simple_list_item_1, valores ));

        final String[] Fenomenos = {"Yo","Dani","David","Rosa","JoseAntonio","Elvira"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,Fenomenos);
        MultiAutoCompleteTextView texto = (MultiAutoCompleteTextView)findViewById(R.id.Multi);
        texto.setAdapter(adaptador);
        texto.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
