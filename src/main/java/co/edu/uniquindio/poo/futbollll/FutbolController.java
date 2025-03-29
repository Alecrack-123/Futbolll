package co.edu.uniquindio.poo.futbollll;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class FutbolController {

    private int golesEquipoA = 0;
    private int golesEquipoB = 0;

    @FXML
    private Label marcador;

    @FXML
    private Circle balon;

    @FXML
    private void initialize() {
        // Inicialización si es necesario
    }

    @FXML
    private void golEquipoA() {
        golesEquipoA++;
        marcador.setText("Equipo A: " + golesEquipoA + " - Equipo B: " + golesEquipoB);
        moverBalon(100, 200); // Mover hacia el lado izquierdo
    }

    @FXML
    private void golEquipoB() {
        golesEquipoB++;
        marcador.setText("Equipo A: " + golesEquipoA + " - Equipo B: " + golesEquipoB);
        moverBalon(500, 200); // Mover hacia el lado derecho
    }

    // Método para mover el balón
    private void moverBalon(double destinoX, double destinoY) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), balon);
        transition.setToX(destinoX - balon.getTranslateX());
        transition.setToY(destinoY - balon.getTranslateY());
        transition.play();
    }
}