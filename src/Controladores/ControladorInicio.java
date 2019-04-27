package Controladores;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

//para tener el control
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class ControladorInicio implements Initializable {
    public static String nombre1;
    public static String nombre2;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Extrayendo los pokemones de la clase para que el jugador 1 elija
        poke11.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke12.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke13.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke14.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke15.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke16.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));

        //Extrayendo los pokemones de la clase para que el jugador 2 seleccione
        poke21.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke22.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke23.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke24.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke25.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));
        poke26.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre()));

    }
    Pokemones pk = new Pokemones();
    @FXML
    private ChoiceBox poke11;
    @FXML
    private ChoiceBox poke13;
    @FXML
    private ChoiceBox poke12;
    @FXML
    private ChoiceBox poke14;
    @FXML
    private ChoiceBox poke15;
    @FXML
    private ChoiceBox poke16;
    @FXML
    private ChoiceBox poke21;
    @FXML
    private ChoiceBox poke23;
    @FXML
    private ChoiceBox poke22;
    @FXML
    private ChoiceBox poke24;
    @FXML
    private ChoiceBox poke25;
    @FXML
    private ChoiceBox poke26;
    @FXML
    public TextField jugador1;
    @FXML
    public TextField jugador2;
    public void salir(ActionEvent actionEvent){
        System.exit(0);
    }
    static Jugador pl1;
    static Jugador pl2;
    public void jugar(ActionEvent actionEvent){
        ArrayList<Pokemon> pokesj1 = new ArrayList<Pokemon>(5);
        ArrayList<Pokemon> pokesj2 = new ArrayList<Pokemon>(5);
        try {
            nombre1 = jugador1.getText();
            nombre2 = jugador2.getText();
            pokesj1.add(pk.pokemonsHash.get(poke11.getValue().toString()));
            pokesj1.add(pk.pokemonsHash.get(poke12.getValue().toString()));
            pokesj1.add(pk.pokemonsHash.get(poke13.getValue().toString()));
            pokesj1.add(pk.pokemonsHash.get(poke14.getValue().toString()));
            pokesj1.add(pk.pokemonsHash.get(poke15.getValue().toString()));
            pokesj1.add(pk.pokemonsHash.get(poke16.getValue().toString()));

            pokesj2.add(pk.pokemonsHash.get(poke21.getValue().toString()));
            pokesj2.add(pk.pokemonsHash.get(poke22.getValue().toString()));
            pokesj2.add(pk.pokemonsHash.get(poke23.getValue().toString()));
            pokesj2.add(pk.pokemonsHash.get(poke24.getValue().toString()));
            pokesj2.add(pk.pokemonsHash.get(poke25.getValue().toString()));
            pokesj2.add(pk.pokemonsHash.get(poke26.getValue().toString()));

            Jugador jug1 = new Jugador(nombre1,pokesj1);
            Jugador jug2 = new Jugador(nombre2,pokesj2);

            ControladorPelea.j1 = jug1;
            ControladorPelea.j2 = jug2;

            Juego.root.getChildren().remove(Juego.grid.get(0));
            AnchorPane pn = (AnchorPane)FXMLLoader.load(getClass().getResource("Pelea.fxml"));
            Juego.root.getChildren().add(pn);


        }catch (java.lang.NullPointerException e) {
            Alert alert2 = new Alert(Alert.AlertType.WARNING, "Por favor, rellena todos los campos");
            alert2.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }
}
