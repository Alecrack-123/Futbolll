package co.edu.uniquindio.poo.futbollll;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;

    public Equipo(int id, String nombre, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    // Getters y Setters
   public int getId() {
        return id;
   }
   public void setId(int id) {
        this.id = id;
   }
   public String getNombre() {
        return nombre;
   }
   public void setNombre(String nombre) {
        this.nombre = nombre;
   }
   public String getCiudad() {
        return ciudad;
   }
   public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
   }

    @Override
    public String toString() {
        return "Equipo{ID=" + id + ", Nombre='" + nombre + "', Ciudad='" + ciudad + "'}";
    }
}
