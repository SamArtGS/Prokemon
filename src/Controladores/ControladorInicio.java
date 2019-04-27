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
import java.util.Hashtable;
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
        poke11.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke12.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke13.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke14.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke15.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke16.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));

        //Extrayendo los pokemones de la clase para que el jugador 2 seleccione
        poke21.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke22.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke23.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke24.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke25.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));
        poke26.setItems(FXCollections.observableArrayList(pk.pokemons.get(0).getNombre(), pk.pokemons.get(1).getNombre(), pk.pokemons.get(2).getNombre(),pk.pokemons.get(3).getNombre(),pk.pokemons.get(4).getNombre(),pk.pokemons.get(5).getNombre(),pk.pokemons.get(6).getNombre(),pk.pokemons.get(7).getNombre(),pk.pokemons.get(8).getNombre(),pk.pokemons.get(9).getNombre(),pk.pokemons.get(10).getNombre(),pk.pokemons.get(11).getNombre(),pk.pokemons.get(12).getNombre(),pk.pokemons.get(13).getNombre(),pk.pokemons.get(14).getNombre()));

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

    public void jugar(ActionEvent actionEvent){
        ArrayList<Pokemon> pokesj1 = new ArrayList<Pokemon>(6);
        ArrayList<Pokemon> pokesj2 = new ArrayList<Pokemon>(6);

        Hashtable<String,Pokemon> pokesfin1 = new Hashtable<String,Pokemon>(6);
        Hashtable<String,Pokemon> pokesfin2 = new Hashtable<String,Pokemon>(6);
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

            pokesfin1.put(pokesj1.get(0).getNombre(),pokesj1.get(0));
            pokesfin1.put(pokesj1.get(1).getNombre(),pokesj1.get(1));
            pokesfin1.put(pokesj1.get(2).getNombre(),pokesj1.get(2));
            pokesfin1.put(pokesj1.get(3).getNombre(),pokesj1.get(3));
            pokesfin1.put(pokesj1.get(4).getNombre(),pokesj1.get(4));
            pokesfin1.put(pokesj1.get(5).getNombre(),pokesj1.get(5));

            pokesfin2.put(pokesj2.get(0).getNombre(),pokesj2.get(0));
            pokesfin2.put(pokesj2.get(1).getNombre(),pokesj2.get(1));
            pokesfin2.put(pokesj2.get(2).getNombre(),pokesj2.get(2));
            pokesfin2.put(pokesj2.get(3).getNombre(),pokesj2.get(3));
            pokesfin2.put(pokesj2.get(4).getNombre(),pokesj2.get(4));
            pokesfin2.put(pokesj2.get(5).getNombre(),pokesj2.get(5));



            Jugador jug1 = new Jugador(nombre1,pokesj1,pokesfin1);
            Jugador jug2 = new Jugador(nombre2,pokesj2,pokesfin2);

            ControladorPelea.j1 = jug1;
            ControladorPelea.j2 = jug2;

            Juego.root.getChildren().remove(Juego.grid.get(0));
            AnchorPane pn = (AnchorPane)FXMLLoader.load(getClass().getResource("Pelea.fxml"));
            Juego.root.getChildren().add(pn);


        }catch (java.lang.NullPointerException e) {
            Alert alert2 = new Alert(Alert.AlertType.INFORMATION, "Por favor, selecciona todos los pokemons necesarios");
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
