package Controladores;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import static javafx.application.Application.launch;

public class Juego extends Application {
    static AnchorPane root;
    static List<AnchorPane> grid = new ArrayList<AnchorPane>();
    private static int idx_cur = 0;
    static Stage PRIMARIA;
    @Override
    public void start(Stage primaryStage) throws Exception {
        PRIMARIA = primaryStage;
        try {
            root = (AnchorPane) FXMLLoader.load(getClass().getResource("Rooting.fxml"));
            grid.add((AnchorPane)FXMLLoader.load(getClass().getResource("Inicio.fxml")));
            //grid.add((AnchorPane)FXMLLoader.load(getClass().getResource("Pelea.fxml")));
            root.getChildren().add(grid.get(0));
            Scene scn = new Scene(root, 653, 472);
            primaryStage.setScene(scn);
            primaryStage.setResizable(false);
            primaryStage.show();
            primaryStage.setOnCloseRequest(e -> Platform.exit());
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static AnchorPane get_Pane(int idx){
        return grid.get(idx);
    }
    public static void set_pane(int idx){
        root.getChildren().remove(grid.get(idx_cur));
        root.getChildren().add(grid.get(idx));
        idx_cur = idx;
    }
    public static void main(String[] arg) {
        launch(arg);
    }
}
