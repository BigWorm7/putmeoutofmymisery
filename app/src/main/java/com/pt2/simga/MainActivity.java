package com.pt2.simga;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    SeekBar rocznik;
    RadioGroup historia;
    RadioButton bezwypadkowa;
    RadioButton naprwaione;
    RadioButton kasacja;
    Spinner marka;
    Spinner model;
    CheckBox wlasciciel;

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

    }
}