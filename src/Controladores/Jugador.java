package Controladores;

import javafx.fxml.FXML;

import java.util.ArrayList;
import java.util.Hashtable;

public class Jugador {
    private String nombre;
    private ArrayList<Pokemon> pokes;
    public Hashtable<String,Pokemon> pokFind;
    public Jugador(String nombre,ArrayList<Pokemon> pokemons, Hashtable<String,Pokemon> pokFind){
        this.nombre = nombre;
        this.pokes = pokemons;
        this.pokFind = pokFind;
    }

    public ArrayList<Pokemon> getPokes() {
        return pokes;
    }

    public String getNombre() {
        return nombre;
    }
}
