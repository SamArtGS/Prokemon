package Controladores;

import javafx.fxml.FXML;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Pokemon> pokes;
    public Jugador(String nombre,ArrayList<Pokemon> pokemons){
        this.nombre = nombre;
        this.pokes = pokemons;
    }
}
