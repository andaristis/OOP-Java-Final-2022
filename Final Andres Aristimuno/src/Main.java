public class Main {
    public static void main(String[] args) {
        Personaje mario = new Personaje("Mario");
        HabilidadFactory factory = HabilidadFactory.getInstance();
        mario.generarHabilidad(factory.generarHabilidad("SALTA"));
        mario.generarHabilidad(factory.generarHabilidad("SALTA"));
        mario.generarHabilidad(factory.generarHabilidad("DISPARA"));
        mario.generarHabilidad(factory.generarHabilidad("SALTA Y DISPARA"));
        mario.generarHabilidad(factory.generarHabilidad("DISPARA"));


        mario.mostrarHabilidad();
    }
}
