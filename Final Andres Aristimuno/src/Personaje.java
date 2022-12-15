import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private List<Habilidad> habilidadList;

    public Personaje(String nombre) {
        this.nombre = nombre;
        habilidadList = new ArrayList<>();
    }

    public void generarHabilidad(Habilidad habilidad){
        habilidadList.add(habilidad);
    }
    public void mostrarHabilidad(){
        for (Habilidad habilidad : habilidadList) {
            System.out.println(habilidad);
        }
    }
}
