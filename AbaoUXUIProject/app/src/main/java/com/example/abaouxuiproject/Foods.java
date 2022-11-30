package com.example.abaouxuiproject;

public class Foods {
    String name;
    String country;
    int description;
    int image;

    // constructor
    public Foods(String name, String country, int description, int image){
        this.name = name;
        this.country = country;
        this.description = description;
        this.image = image;
    }

    public String getName() { return name; }
    public String getCountry() { return country; }
    public int getDescription() { return description; }
    public int getImage() { return image; }
}
