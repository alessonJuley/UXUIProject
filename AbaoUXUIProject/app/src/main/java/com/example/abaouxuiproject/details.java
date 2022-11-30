package com.example.abaouxuiproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class details extends AppCompatActivity {
    String name;
    int image;
    int details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView nameTextView = (TextView) findViewById(R.id.detailsTitle);
        ImageView imageView = (ImageView) findViewById(R.id.detailsImage);
        TextView detailsTextView = (TextView) findViewById(R.id.detailsText);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        image = intent.getIntExtra("image", 0);
        details = intent.getIntExtra("description", 0);

        nameTextView.setText(name);
        imageView.setImageResource(image);
        detailsTextView.setText(details);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_out, R.anim.slide_out);
    }
}
