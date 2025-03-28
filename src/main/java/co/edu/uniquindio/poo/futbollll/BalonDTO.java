package co.edu.uniquindio.poo.futbollll;

public class BalonDTO {
    private String tipo;
    private double posicionX;
    private double posicionY;

    public BalonDTO(String tipo, double posicionX, double posicionY) {
        this.tipo = tipo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }
}
