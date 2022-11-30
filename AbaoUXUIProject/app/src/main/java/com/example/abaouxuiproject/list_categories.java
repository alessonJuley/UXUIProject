package com.example.abaouxuiproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class list_categories extends AppCompatActivity {

    String cuisine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_categories);
        Intent intent = getIntent();
        cuisine = intent.getStringExtra("category");

        if(cuisine.equals("asian")){
            showAsianFoods();
            getSupportActionBar().setTitle("Asian Foods");
        }
        else if(cuisine.equals("european")){
            showEuropeanFoods();
            getSupportActionBar().setTitle("European Foods");
        }
        else if(cuisine.equals("oceania")){
            showOceaniaFoods();
            getSupportActionBar().setTitle("Oceania Foods");
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_out, R.anim.slide_out);
    }

    // show methods
    private void showAsianFoods(){
        // declare array
        final ArrayList<Foods> asianFoods = new ArrayList<>();
        asianFoods.add(new Foods("Ma Po Tofu", "China", R.string.mapo_details, R.drawable.mapo));
        asianFoods.add(new Foods("Kimchi", "South Korea", R.string.kimchi_details, R.drawable.kimchi));
        asianFoods.add(new Foods("Ramen", "Japan", R.string.ramen_details, R.drawable.ramen));
        asianFoods.add(new Foods("Adobo", "the Philippines", R.string.adobo_details, R.drawable.adobo));
        asianFoods.add(new Foods("Curry", "India", R.string.curry_details, R.drawable.curry));
        asianFoods.add(new Foods("Kacchi Biryani", "Bangladesh",R.string.biryani_details, R.drawable.kacchibiryani));
        asianFoods.add(new Foods("Nihari", "Pakistan", R.string.nihari_details, R.drawable.nihari));
        asianFoods.add(new Foods("Pad Thai", "Thailand", R.string.padthai_details, R.drawable.padthai));
        asianFoods.add(new Foods("Laksa", "Singapore", R.string.laksa_details, R.drawable.laksa));
        asianFoods.add(new Foods("Nasi Goreng", "Indonesia", R.string.nasi_details, R.drawable.nasigoreng));

        // list item adapter
        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, asianFoods);

        ListView listView = findViewById(R.id.foodsList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Foods food = asianFoods.get(position);
                Intent i = new Intent(getBaseContext(), details.class);
                i.putExtra("name", food.getName());
                i.putExtra("image", food.getImage());
                i.putExtra("description", food.getDescription());

                startActivity(i);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });
    }

    private void showEuropeanFoods(){
        // declare array
        final ArrayList<Foods> europeanFoods = new ArrayList<>();
        europeanFoods.add(new Foods("Full English Breakfast", "United Kingdom", R.string.english_details, R.drawable.englishbreakfast));
        europeanFoods.add(new Foods("Fondue", "Switzerland", R.string.fondue_details, R.drawable.fondue));
        europeanFoods.add(new Foods("Croissant", "France", R.string.croissant_details, R.drawable.croissant));
        europeanFoods.add(new Foods("Currywurst", "Germany", R.string.currywurst_details, R.drawable.currywurst));
        europeanFoods.add(new Foods("Aranchini", "Italy", R.string.aranchini_details, R.drawable.aranchini));
        europeanFoods.add(new Foods("Paella Valenciana", "Spain",R.string.paella_details, R.drawable.paella));
        europeanFoods.add(new Foods("Moussaka", "Greece", R.string.moussaka_details, R.drawable.moussaka));
        europeanFoods.add(new Foods("Kroppakaka", "Sweden", R.string.kroppakaka_details, R.drawable.kroppkaka));
        europeanFoods.add(new Foods("Borscht", "Ukraine", R.string.borscht_details, R.drawable.borscht));
        europeanFoods.add(new Foods("Syrniki", "Russia", R.string.syrniki_details, R.drawable.syrniki));

        // list item adapter
        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, europeanFoods);

        ListView listView = findViewById(R.id.foodsList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Foods food = europeanFoods.get(position);
                Intent i = new Intent(getBaseContext(), details.class);
                i.putExtra("name", food.getName());
                i.putExtra("image", food.getImage());
                i.putExtra("description", food.getDescription());

                startActivity(i);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });
    }

    private void showOceaniaFoods(){
        // declare array
        final ArrayList<Foods> oceaniaFoods = new ArrayList<>();
        oceaniaFoods.add(new Foods("Vegemite", "Australia", R.string.vegemite_details, R.drawable.vegemite));
        oceaniaFoods.add(new Foods("Kokoda", "Fiji", R.string.kokoda_details, R.drawable.kokoda));
        oceaniaFoods.add(new Foods("Maori Hangi", "New Zealand", R.string.hangi_details, R.drawable.hangi));
        oceaniaFoods.add(new Foods("Panipopo", "Samoa", R.string.panipopo_details, R.drawable.panipopo));
        oceaniaFoods.add(new Foods("Fruit Bat Soup", "Palau", R.string.bat_details, R.drawable.fruitbatsoup));
        oceaniaFoods.add(new Foods("Mumu", "Papua New Guinea",R.string.mumu_details, R.drawable.mumu));
        oceaniaFoods.add(new Foods("Poi", "The Solomon Islands", R.string.poi_details, R.drawable.poi));
        oceaniaFoods.add(new Foods("Ota 'Ika", "Tonga", R.string.ota_details, R.drawable.otaika));
        oceaniaFoods.add(new Foods("Lap lap", "Vanuatu", R.string.laplap_Details, R.drawable.laplap));
        oceaniaFoods.add(new Foods("Pulaka", "Tuvalu", R.string.pulaka_details, R.drawable.pulaka));

        // list item adapter
        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, oceaniaFoods);

        ListView listView = findViewById(R.id.foodsList);
        listView.setAdapter(listItemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Foods food = oceaniaFoods.get(position);
                Intent i = new Intent(getBaseContext(), details.class);
                i.putExtra("name", food.getName());
                i.putExtra("image", food.getImage());
                i.putExtra("description", food.getDescription());

                startActivity(i);
                overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
            }
        });
    }
}
