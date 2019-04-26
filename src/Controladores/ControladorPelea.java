package Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPelea implements Initializable {
    @Override

    public void initialize(URL location, ResourceBundle resources) {
        poke1T.setImage();
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


    public void atras(ActionEvent actionEvent){
        Juego.root.getChildren().remove(Juego.grid.get(1));
        Juego.root.getChildren().add(Juego.grid.get(0));
    }
}
