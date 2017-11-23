package com.example.kaligaswag.pokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaligaswag on 23/11/2017.
 */

public class PokemonModel {

    private int imageID;
    private String title;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // generics method
    public static List<PokemonModel> getObjectList(){

        List<PokemonModel> datalist = new ArrayList<>();
        int[] images = getImages();
        String[] titles = getTitles();

        for (int i = 0; i < images.length; i++){
            PokemonModel pokemon = new PokemonModel();
            pokemon.setImageID(images[i]);
            pokemon.setTitle(titles[i]);
            datalist.add(pokemon);
        }

        return datalist;

    }

    private static String[] getTitles() {
        String[] titles = {
                "Eevee",
                "Charizard",
                "Snorlax",
                "Lugia",
                "MewTwo",
                "Ditto",
                "Tyranitar",
                "Charmander",
                "Squirtle",
                "Gardevoir",
                "Greninja",
                "Bulbasaur"
        };
        return titles;
    }

    private static int[] getImages() {
        int[] images = {
                R.drawable.pokemon1,
                R.drawable.pokemon2,
                R.drawable.pokemon3,
                R.drawable.pokemon4,
                R.drawable.pokemon5,
                R.drawable.pokemon6,
                R.drawable.pokemon7,
                R.drawable.pokemon8,
                R.drawable.pokemon9,
                R.drawable.pokemon10,
                R.drawable.pokemon11,
        };

        return images;
    }
}
