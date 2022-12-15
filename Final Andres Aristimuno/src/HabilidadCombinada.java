import java.util.ArrayList;
import java.util.List;

public class HabilidadCombinada extends Habilidad{

    private Integer factorMultiplicador;
    private List<Habilidad> habilidadList;

    public HabilidadCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.factorMultiplicador = 4;
        habilidadList = new ArrayList<>();
    }

    public void generarHabilidad(Habilidad habilidad){
        habilidadList.add(habilidad);
    }


    @Override
    public Double calcularPuntaje() {
        Double puntajeInicial=0.0;
        for (Habilidad habilidad : habilidadList) {
            puntajeInicial += habilidad.calcularPuntaje();
        }return ((puntajeInicial/habilidadList.size())*factorMultiplicador);
    }
}
