package Controladores;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPelea implements Initializable {
    int turno = 0;
    static Jugador j1, j2;
    @Override
    public void initialize(URL location, ResourceBundle resources){
        poke1T.setImage(j1.getPokes().get(0).getImagen());
        poke2T.setImage(j1.getPokes().get(1).getImagen());
        poke3T.setImage(j1.getPokes().get(2).getImagen());
        poke4T.setImage(j1.getPokes().get(3).getImagen());
        poke5T.setImage(j1.getPokes().get(4).getImagen());
        poke6T.setImage(j1.getPokes().get(5).getImagen());
        poke1S.setImage(j2.getPokes().get(0).getImagen());
        poke2S.setImage(j2.getPokes().get(1).getImagen());
        poke3S.setImage(j2.getPokes().get(2).getImagen());
        poke4S.setImage(j2.getPokes().get(3).getImagen());
        poke5S.setImage(j2.getPokes().get(4).getImagen());
        poke6S.setImage(j2.getPokes().get(5).getImagen());
        cambio();
    }
    @FXML
    private ImageView poke1T;
    @FXML
    private ImageView poke3T;
    @FXML
    private ImageView poke5T;
    @FXML
    private ImageView poke2T;
    @FXML
    private ImageView poke4T;
    @FXML
    private ImageView poke6T;
    @FXML
    private ImageView poke1S;
    @FXML
    private ImageView poke3S;
    @FXML
    private ImageView poke5S;
    @FXML
    private ImageView poke2S;
    @FXML
    private ImageView poke4S;
    @FXML
    private ImageView poke6S;
    @FXML
    private ImageView pokeLucha1;
    @FXML
    private ImageView pokeLucha2;

    @FXML
    private ChoiceBox pokeDisp1;
    @FXML
    private ChoiceBox pokeDisp2;

    public void atras(ActionEvent actionEvent) throws IOException {
        AnchorPane pn = (AnchorPane)FXMLLoader.load(getClass().getResource("Pelea.fxml"));
        Juego.root.getChildren().remove(pn);
        Juego.root.getChildren().add(Juego.grid.get(0));
    }
    public void cambio(){
        ObservableList<String> n1 = FXCollections.observableArrayList();
        ObservableList<String> n2 = FXCollections.observableArrayList();
        for(Pokemon i : j1.getPokes()){

            if(i.estaVivo()) {
                n1.add(i.getNombre());
            }
        }
        pokeDisp1.setItems(n1);
        for(Pokemon i : j2.getPokes()){
            if(i.estaVivo()) {
                n2.add(i.getNombre());
            }
        }
        pokeDisp2.setItems(n2);
    }
    public void selected(){
        Pokemones pk = new Pokemones();
        pokeLucha1.setImage(pk.pokemonsHash.get(pokeDisp1.getValue().toString()).getImagen());
    }
    public void selected2(){
        Pokemones pk = new Pokemones();

        pokeLucha2.setImage(pk.pokemonsHash.get(pokeDisp2.getValue().toString()).getImagen());
    }
    public void atacarP1(){
        turno++;

    }
    public void atacarP2(){
        turno++;

    }

}
