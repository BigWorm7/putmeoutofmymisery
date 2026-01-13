package com.pt2.simga;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SeekBar rocznik;
    RadioGroup historia;
    RadioButton b1, b2, b3;

    Spinner marka;
    Spinner model;
    CheckBox wlasciciel;
    Samochod s1;
    Button button;
    ArrayList<Samochod> lista;
    ListView l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rocznik = findViewById(R.id.seekBar);
        historia = findViewById(R.id.historia);
        model = findViewById(R.id.model);
        marka = findViewById(R.id.marka);
        wlasciciel = findViewById(R.id.checkBox);
        button = findViewById(R.id.button);
        l = findViewById(R.id.lista);

        ArrayAdapter<CharSequence> arrayAdapterMarka = ArrayAdapter.createFromResource(this, R.array.marka, android.R.layout.simple_list_item_1);
        marka.setAdapter(arrayAdapterMarka);

        marka.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int modelek;
                switch (i){
                    case 0: ArrayAdapter<CharSequence> arrayAdapterModelV = ArrayAdapter.createFromResource(adapterView.getContext(), R.array.model_Volswagen, android.R.layout.simple_spinner_item); model.setAdapter(arrayAdapterModelV);break;
                    case 1: ArrayAdapter<CharSequence> arrayAdapterModelA = ArrayAdapter.createFromResource(adapterView.getContext(), R.array.model_Audi, android.R.layout.simple_spinner_item); model.setAdapter(arrayAdapterModelA);break;
                    case 2: ArrayAdapter<CharSequence> arrayAdapterModelS = ArrayAdapter.createFromResource(adapterView.getContext(), R.array.model_Volswagen, android.R.layout.simple_spinner_item); model.setAdapter(arrayAdapterModelS);break;
                    default: break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1.setMarka(marka.getSelectedItem().toString());
                s1.setModel(model.getSelectedItem().toString());
                s1.setRocznik(rocznik.getProgress());
                if (wlasciciel.isChecked()){
                    s1.setWlasciciel(true);
                }

               if (historia.getCheckedRadioButtonId()==R.id.radioButton){
                   s1.setHistoria("Bezwypadkowa");
               }else if (historia.getCheckedRadioButtonId()==R.id.radioButton2){
                   s1.setHistoria("po jednym wypadku");
               }else if (historia.getCheckedRadioButtonId()==R.id.radioButton3){
                   s1.setHistoria("do kasacji");
               }

                lista.add(s1);

                ArrayAdapter<Samochod> arrayAdapterSamochod = ArrayAdapter.createFromResource(this, lista, android.R.layout.simple_list_item_1);
                l.setAdapter(arrayAdapterSamochod);

            }
        });


    }
}