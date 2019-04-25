package Controladores;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPelea extends Jugador implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void atras(ActionEvent actionEvent){
        Juego.root.getChildren().remove(Juego.grid.get(1));
        Juego.root.getChildren().add(Juego.grid.get(0));
    }
}
