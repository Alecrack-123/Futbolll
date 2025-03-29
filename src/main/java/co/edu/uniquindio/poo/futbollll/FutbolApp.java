package co.edu.uniquindio.poo.futbollll;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FutbolApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista.fxml"));
        Parent root = loader.load();

        // Configurar la escena
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Simulación de Fútbol");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}