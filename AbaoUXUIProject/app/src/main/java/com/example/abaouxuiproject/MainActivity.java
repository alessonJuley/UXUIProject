package com.example.abaouxuiproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // when card is clicked, here are their functions
    public void onClickAsian(View view){
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "asian");
        startActivity(categoryListActivity);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_in);
    }

    public void onClickEuropean(View view){
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "european");
        startActivity(categoryListActivity);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_in);
    }

    public void onClickOceania(View view){
        Intent categoryListActivity = new Intent(this, list_categories.class);
        categoryListActivity.putExtra("category", "oceania");
        startActivity(categoryListActivity);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_in);
    }

}