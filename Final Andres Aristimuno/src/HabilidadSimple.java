public class HabilidadSimple extends Habilidad{

    private Double puntaje;

    public HabilidadSimple(String nombre, String descripcion, Double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    @Override
    public Double calcularPuntaje() {
        if (getNombre().equals("Disparar")) {
            return puntaje = puntaje + 5.0;
        } else return puntaje;
    }
}
