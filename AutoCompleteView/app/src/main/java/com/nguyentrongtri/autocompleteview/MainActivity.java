package com.nguyentrongtri.autocompleteview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCountry;
    ArrayList dsCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findcontrols();
        dsCountry = new ArrayList<String>();
        dsCountry.add("Viet Nam");
        dsCountry.add("England");
        dsCountry.add("Laos");
        dsCountry.add("The USA");
        dsCountry.add("China");
        dsCountry.add("Japan");
        dsCountry.add("Russia");
        dsCountry.add("Thailand");
        dsCountry.add("Cambodia");
        ArrayAdapter<String> adapterCountry;
        adapterCountry = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,dsCountry);
        autoCountry.setAdapter(adapterCountry);
    }
    public void findcontrols(){
        autoCountry=findViewById(R.id.autoCompleteTextView);
    }
}