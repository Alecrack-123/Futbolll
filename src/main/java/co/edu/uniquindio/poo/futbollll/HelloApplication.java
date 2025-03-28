package co.edu.uniquindio.poo.futbollll;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FutbolApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear el campo de fútbol
        Pane root = new Pane();
        root.setStyle("-fx-background-color: green;");

        // Crear el balón (representado por un círculo)
        Circle balon = new Circle(50, Color.WHITE);
        balon.setTranslateX(300); // Posición inicial X
        balon.setTranslateY(200); // Posición inicial Y
        root.getChildren().add(balon);

        // Botones para simular goles
        Button golEquipoA = new Button("Gol Equipo A");
        Button golEquipoB = new Button("Gol Equipo B");

        golEquipoA.setLayoutX(50);
        golEquipoA.setLayoutY(420);
        golEquipoB.setLayoutX(550);
        golEquipoB.setLayoutY(420);

        root.getChildren().addAll(golEquipoA, golEquipoB);

        // Acción para el gol del Equipo A
        golEquipoA.setOnAction(e -> {
            JugadorDTO jugador = new JugadorDTO("Messi", "Equipo A");
            BalonDTO balonDTO = new BalonDTO("Adidas", 300, 200);

            System.out.println(jugador.getNombre() + " ha marcado un gol para " + jugador.getEquipo());
            moverBalon(balon, 100, 200); // Mover hacia el lado izquierdo
        });

        // Acción para el gol del Equipo B
        golEquipoB.setOnAction(e -> {
            JugadorRecord jugador = new JugadorRecord("Ronaldo", "Equipo B");
            BalonRecord balonRecord = new BalonRecord("Nike", 300, 200);

            System.out.println(jugador.nombre() + " ha marcado un gol para " + jugador.equipo());
            moverBalon(balon, 500, 200); // Mover hacia el lado derecho
        });

        // Configurar la escena
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("Simulación de Fútbol");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método para mover el balón
    private void moverBalon(Circle balon, double destinoX, double destinoY) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), balon);
        transition.setToX(destinoX - balon.getTranslateX());
        transition.setToY(destinoY - balon.getTranslateY());
        transition.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}