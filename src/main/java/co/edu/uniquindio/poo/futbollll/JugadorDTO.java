package co.edu.uniquindio.poo.futbollll;

public class JugadorDTO {
    private int id;
    private String nombre;
    private String posicion;
    private int edad;
    private String equipoNombre; //
    // Solo el nombre del equipo

    public JugadorDTO(String nombre, String posicion, int edad, String equipoNombre) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoNombre = equipoNombre;



    }

    // Getters setter


    public String getNombre() {
        return nombre;
    }

    public String getEquipoNombre() {
        return equipoNombre;
    }

    public int getId() {
        return id;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "JugadorDTO{ID=" + id + ", Nombre='" + nombre + "', Posición='" + posicion + "', Edad=" + edad +
                ", Equipo='" + equipoNombre + "'}";
    }
}
