package Controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPelea implements Initializable {
    int turno = 0;
    int muertes1 = 0;
    int muertes2 = 0;
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
        turnos();
        cambio();
        progresos();
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
    @FXML
    private ProgressBar progres1;
    @FXML
    private ProgressBar progres2;
    @FXML
    private ProgressBar progres3;
    @FXML
    private ProgressBar progres4;
    @FXML
    private ProgressBar progres5;
    @FXML
    private ProgressBar progres6;
    @FXML
    private ProgressBar progres10;
    @FXML
    private ProgressBar progres20;
    @FXML
    private ProgressBar progres30;
    @FXML
    private ProgressBar progres40;
    @FXML
    private ProgressBar progres50;
    @FXML
    private ProgressBar progres60;

    @FXML
    private ProgressBar progresAct1;
    @FXML
    private ProgressBar progresAct2;

    @FXML
    private Button ataque;
    @FXML
    private Button pocimaVida1;
    @FXML
    private Button pocimaAtaque1;
    @FXML
    private Button pocimaDefensa1;
    @FXML
    private Button ataque1;
    @FXML
    private Button pocimaVida2;
    @FXML
    private Button pocimaAtaque2;
    @FXML
    private Button pocimaDefensa2;


    public void atras(ActionEvent actionEvent) throws IOException {
        AnchorPane pn = (AnchorPane)FXMLLoader.load(getClass().getResource("Pelea.fxml"));
        Juego.root.getChildren().remove(pn);
        Juego.root.getChildren().add(Juego.grid.get(0));
    }
    public void cambio(){
        ObservableList<String> n1 = FXCollections.observableArrayList();
        ObservableList<String> n2 = FXCollections.observableArrayList();
        for(Pokemon i : j1.getPokes()){
            if(i.getPuntoVida()>0) {
                n1.add(i.getNombre());
            }
        }
        pokeDisp1.setItems(n1);
        for(Pokemon i : j2.getPokes()){
            if(i.getPuntoVida()>0) {
                n2.add(i.getNombre());
            }
        }
        pokeDisp2.setItems(n2);
    }
    public void selected(){
        Pokemones pk = new Pokemones();
        pokeLucha1.setImage(j1.pokFind.get(pokeDisp1.getValue().toString()).getImagen());
        progresAct1.setProgress((double)j1.pokFind.get(pokeDisp1.getValue().toString()).getPuntoVida()/(double)(double)j1.pokFind.get(pokeDisp1.getValue().toString()).getVidaT());
    }

    public void selected2(){
        Pokemones pk = new Pokemones();
        pokeLucha2.setImage(j2.pokFind.get(pokeDisp2.getValue().toString()).getImagen());
        progresAct2.setProgress((double)j2.pokFind.get(pokeDisp2.getValue().toString()).getPuntoVida()/(double)(double)j2.pokFind.get(pokeDisp2.getValue().toString()).getVidaT());

    }

    public void atacarP1(){
        Pokemones pk = new Pokemones();
        Pokemon atacante;
        Pokemon defensa;
        atacante = j1.pokFind.get(pokeDisp1.getValue().toString());
        defensa = j2.pokFind.get(pokeDisp2.getValue().toString());
        if((double)defensa.getPuntoVida()-((double)atacante.getAtaque())*0.8*multiplicador(atacante,defensa)+(double)defensa.getDefensa()<=0){
            muertes1++;
        }
        defensa.setPuntoVida((double)defensa.getPuntoVida()-((double)atacante.getAtaque())*0.8*multiplicador(atacante,defensa)+(double)defensa.getDefensa());
        System.out.println(defensa.getPuntoVida());
        progresos();
        turno++;
        turnos();
    }
    //AGUA = 1
    //FUEGO = 2
    //HIERBA = 3
    //Electrico = 4
    public double multiplicador(Pokemon pk,Pokemon pl){
        double multi=1.0;
        if(pk.getTipo()==2 && pl.getTipo()==3){
            multi=2;
        }
        if(pk.getTipo()==2 && (pl.getTipo()==1 || pl.getTipo()==2)){
            multi=0.5;
        }
        if(pk.getTipo()==1 && pl.getTipo()==2){
            multi=2.0;
        }
        if(pk.getTipo()==1 && (pl.getTipo()==1 || pl.getTipo()==3)){
            multi=0.5;
        }
        if(pk.getTipo()==3 && pl.getTipo()==1){
            multi=2.0;
        }
        if(pk.getTipo()==3 && (pl.getTipo()==3 || pl.getTipo()==2)){
            multi=0.5;
        }
        if(pk.getTipo()==4 && pl.getTipo()==1){
            multi=2.0;
        }
        if(pk.getTipo()==4 && (pl.getTipo()==4 || pl.getTipo()==3)){
            multi=0.5;
        }
        return multi;
    }
    public void atacarP2(){
        Pokemones pk = new Pokemones();
        Pokemon atacante;
        Pokemon defensa;
        atacante = j2.pokFind.get(pokeDisp2.getValue().toString());
        defensa = j1.pokFind.get(pokeDisp1.getValue().toString());
        if((double)defensa.getPuntoVida()-((double)atacante.getAtaque())*0.8*multiplicador(atacante,defensa)+(double)defensa.getDefensa()<=0){muertes2++;}
        defensa.setPuntoVida((double)defensa.getPuntoVida()-((double)atacante.getAtaque())*0.8*multiplicador(atacante,defensa)+(double)defensa.getDefensa());
        System.out.println(defensa.getPuntoVida());
        progresos();
        turno++;
        turnos();
    }
    public void turnos(){
        if(muertes2==6){
            Alert alert = new Alert(Alert.AlertType.WARNING, "HAS GANADO 1: "+j1.getNombre());
            alert.showAndWait();
            System.exit(0);
        }
        if(muertes1==6){
            Alert alert = new Alert(Alert.AlertType.WARNING, "HAS GANADO 2: "+j2.getNombre());
            alert.showAndWait();
            System.exit(0);
        }
        if(turno%2==0){
            ataque.setDisable(false);
            pocimaVida1.setDisable(false);
            pocimaAtaque1.setDisable(false);
            pocimaDefensa1.setDisable(false);
            ataque1.setDisable(true);
            pocimaVida2.setDisable(true);
            pocimaAtaque2.setDisable(true);
            pocimaDefensa2.setDisable(true);
            Alert alert = new Alert(Alert.AlertType.WARNING, "Es turno del jugador 1: "+j1.getNombre());
            alert.showAndWait();
        }else{
            ataque.setDisable(true);
            pocimaVida1.setDisable(true);
            pocimaAtaque1.setDisable(true);
            pocimaDefensa1.setDisable(true);
            ataque1.setDisable(false);
            pocimaVida2.setDisable(false);
            pocimaAtaque2.setDisable(false);
            pocimaDefensa2.setDisable(false);
            Alert alert = new Alert(Alert.AlertType.WARNING, "Es turno del jugador 2: "+j2.getNombre());
            alert.showAndWait();
        }
        progresos();
    }
    @FXML
    void vida1(){
        Pokemones pk = new Pokemones();
        Pokemon vidente;
        vidente = j1.pokFind.get(pokeDisp1.getValue().toString());
        Pocion pc = new Pocion(1);
        vidente.setPuntoVida(vidente.getPuntoVida()+pc.usar());
        Alert alert = new Alert(Alert.AlertType.WARNING, "Poción de vida utilizada +20");
        alert.showAndWait();
        turno++;
        turnos();
        progresos();
    }
    @FXML
    void ataque1(){
        Pokemones pk = new Pokemones();
        Pokemon vidente;
        vidente = j1.pokFind.get(pokeDisp1.getValue().toString());
        Pocion pc = new Pocion(2);
        vidente.setAtaque(vidente.getAtaque()+pc.usar());
        Alert alert = new Alert(Alert.AlertType.WARNING, "Poción de ataque utilizada +10");
        alert.showAndWait();
        turno++;
        turnos();
        progresos();
    }
    @FXML
    void defensa1(){
        Pokemones pk = new Pokemones();
        Pokemon vidente;
        vidente = j1.pokFind.get(pokeDisp1.getValue().toString());
        Pocion pc = new Pocion(3);
        vidente.setDefensa(vidente.getDefensa()+pc.usar());
        Alert alert = new Alert(Alert.AlertType.WARNING, "Poción de defensa utilizada +10");
        alert.showAndWait();
        turno++;
        turnos();
        progresos();
    }
    @FXML
    void vida2(){
        Pokemones pk = new Pokemones();
        Pokemon vidente;
        vidente = j2.pokFind.get(pokeDisp2.getValue().toString());
        Pocion pc = new Pocion(1);
        vidente.setPuntoVida(vidente.getPuntoVida()+pc.usar());
        Alert alert = new Alert(Alert.AlertType.WARNING, "Poción de vida utilizada");
        alert.showAndWait();
        turno++;
        turnos();
        progresos();
    }
    @FXML
    void ataque2(){
        Pokemones pk = new Pokemones();
        Pokemon vidente;
        vidente = j2.pokFind.get(pokeDisp2.getValue().toString());
        Pocion pc = new Pocion(2);
        vidente.setAtaque(vidente.getAtaque()+pc.usar());
        Alert alert = new Alert(Alert.AlertType.WARNING, "Poción de ataque utilizada +10");
        alert.showAndWait();
        turno++;
        turnos();
        progresos();
    }
    @FXML
    void defensa2(){
        Pokemones pk = new Pokemones();
        Pokemon vidente;
        vidente = j2.pokFind.get(pokeDisp2.getValue().toString());
        Pocion pc = new Pocion(3);
        vidente.setDefensa(vidente.getDefensa()+pc.usar());
        Alert alert = new Alert(Alert.AlertType.WARNING, "Poción de defensa utilizada +10");
        alert.showAndWait();
        turno++;
        turnos();
        progresos();
    }



    public void progresos() {
        progres1.setProgress((double) j1.getPokes().get(0).getPuntoVida()/(double) j1.getPokes().get(0).getVidaT());
        progres2.setProgress((double) j1.getPokes().get(1).getPuntoVida()/(double) j1.getPokes().get(1).getVidaT());
        progres3.setProgress((double) j1.getPokes().get(2).getPuntoVida()/(double) j1.getPokes().get(2).getVidaT());
        progres4.setProgress((double) j1.getPokes().get(3).getPuntoVida()/(double) j1.getPokes().get(3).getVidaT());
        progres5.setProgress((double) j1.getPokes().get(4).getPuntoVida()/(double) j1.getPokes().get(4).getVidaT());
        progres6.setProgress((double) j1.getPokes().get(5).getPuntoVida()/(double) j1.getPokes().get(5).getVidaT());
        progres10.setProgress((double) j2.getPokes().get(0).getPuntoVida()/(double) j2.getPokes().get(0).getVidaT());
        progres20.setProgress((double) j2.getPokes().get(1).getPuntoVida()/(double) j2.getPokes().get(1).getVidaT());
        progres30.setProgress((double) j2.getPokes().get(2).getPuntoVida()/(double) j2.getPokes().get(2).getVidaT());
        progres40.setProgress((double) j2.getPokes().get(3).getPuntoVida()/(double) j2.getPokes().get(3).getVidaT());
        progres50.setProgress((double) j2.getPokes().get(4).getPuntoVida()/(double) j2.getPokes().get(4).getVidaT());
        progres60.setProgress((double) j2.getPokes().get(5).getPuntoVida()/(double) j2.getPokes().get(5).getVidaT());
        try {
            selected();
            selected2();
        }catch (java.lang.NullPointerException e) {
            System.out.println("Primera carga :)");
        }
    }
}
