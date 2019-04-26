package Controladores;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.Hashtable;

public class Pokemones{
    //pokemónEléctricos
    Pokemon poke1 = new Pokemon("Squirle",150,200,200,100,100,true,1, new Image("Imagenes/poke1a.png"));
    Pokemon poke2 = new Pokemon("Yvysaur", 150,200,200,100,100,true,2,new Image("Imagenes/poke1e.png"));
    Pokemon poke3 = new Pokemon("Pikachu",150,200,200,100,100,true,3,new Image("Imagenes/poke1f.png"));
    Pokemon poke4 = new Pokemon("Yvysaur", 150,200,200,100,100,true,4,new Image("Imagenes/poke1t.png"));

    Pokemon poke5 = new Pokemon("Charmander",150,200,200,100,100,true,1,new Image("Imagenes/poke2a.png"));
    Pokemon poke6 = new Pokemon("Evvee", 150,200,200,100,100,true,2,new Image("Imagenes/poke2f.png"));
    Pokemon poke7 = new Pokemon("Bobufed",150,200,200,100,100,true,3,new Image("Imagenes/poke2t.png"));
    Pokemon poke8 = new Pokemon("TNOSS", 150,200,200,100,100,true,4,new Image("Imagenes/poke3a.png"));

    Pokemon poke9 = new Pokemon("Avenger",150,200,200,100,100,true,1,new Image("Imagenes/poke3f.png"));
    Pokemon poke10 = new Pokemon("No C", 150,200,200,100,100,true,2,new Image("Imagenes/poke3t.png"));
    Pokemon poke11 = new Pokemon("Profesor ",150,200,200,100,100,true,3,new Image("Imagenes/poke4a.png"));
    Pokemon poke12 = new Pokemon("Ash", 150,200,200,100,100,true,4,new Image("Imagenes/poke4f.png"));

    Pokemon poke13 = new Pokemon("Patricio",150,200,200,100,100,true,1,new Image("Imagenes/poke5a.png"));
    Pokemon poke14 = new Pokemon("terriermon", 150,200,200,100,100,true,2,new Image("Imagenes/poke6a.png"));
    Pokemon poke15 = new Pokemon("aquamon",150,200,200,100,100,true,3,new Image("Imagenes/poke6a.png"));
    Pokemon poke16 = new Pokemon("vergamon", 150,200,200,100,100,true,4,new Image("Imagenes/poke6a.png"));
    public Pokemones(){

    }
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>() {{
        add(poke1);
        add(poke2);
        add(poke3);
        add(poke4);
        add(poke5);
        add(poke6);
        add(poke7);
        add(poke8);
        add(poke9);
        add(poke10);
        add(poke11);
        add(poke12);
        add(poke13);
        add(poke14);
        add(poke15);
        add(poke16);
    }};
    Hashtable<String,Pokemon> pokemonsHash = new Hashtable<String, Pokemon>() {{
        put(poke1.getNombre(),poke1);
        put(poke2.getNombre(),poke2);
        put(poke3.getNombre(),poke3);
        put(poke4.getNombre(),poke4);
        put(poke5.getNombre(),poke5);
        put(poke6.getNombre(),poke6);
        put(poke7.getNombre(),poke7);
        put(poke8.getNombre(),poke8);
        put(poke9.getNombre(),poke9);
        put(poke10.getNombre(),poke10);
        put(poke11.getNombre(),poke11);
        put(poke12.getNombre(),poke12);
        put(poke13.getNombre(),poke13);
        put(poke14.getNombre(),poke14);
        put(poke15.getNombre(),poke15);
        put(poke16.getNombre(),poke16);
    }};
}
