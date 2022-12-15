public abstract class Habilidad {

    private String nombre;
    private String descripcion;

    public Habilidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract Double calcularPuntaje();

    public String getNombre() {
        return nombre;
    }
    public String toString() {
        return "Nombre habilidad: " + nombre + " - Puntaje: " + calcularPuntaje();
    }
}
