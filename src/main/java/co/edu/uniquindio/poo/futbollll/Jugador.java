package co.edu.uniquindio.poo.futbollll;

public class Jugador {
    private  String nombre;
    private  int id;
    private  int edad;
    private  String posicion;
    private Equipo equipo;

    public Jugador(String nombre, int id, int edad, String posicion, Equipo equipo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;

   }
   public String getNombre() {
        return nombre;
   }
   public void setNombre(String nombre) {
        this.nombre = nombre;
   }
   public int getId() {
        return id;
   }
   public void setId(int id) {
        this.id = id;
   }
   public int getEdad() {
        return edad;
   }
   public void setEdad(int edad) {
        this.edad = edad;
   }
   public String getPosicion() {
        return posicion;
   }
   public void setPosicion(String posicion) {
        this.posicion = posicion;
   }
   public Equipo getEquipo() {
        return equipo;
   }
   public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
   }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}
