package Controladores;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.net.URL;
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
    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    @FXML
    public void salir(ActionEvent actionEvent){
        System.exit(0);
    }
    public void jugar(ActionEvent actionEvent){
        Juego.root.getChildren().remove(Juego.grid.get(0));
        Juego.root.getChildren().add(Juego.grid.get(1));
    }
}
