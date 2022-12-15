public class HabilidadFactory {

    private static HabilidadFactory instance;

    private HabilidadFactory(){

    }

    public static HabilidadFactory getInstance() {
        if(instance == null){
            instance = new HabilidadFactory();
        }
        return instance;
    }

    public Habilidad generarHabilidad(String codigo){
        switch (codigo){
            case "SALTA" :
                return new HabilidadSimple("Jump","Jump",7.5);
            case "DISPARA" :
                return new HabilidadSimple("Shoot","Shoot!",10.0);
            case "SALTA Y DISPARA" :
                HabilidadCombinada habilidadCombinada = new HabilidadCombinada("Jump&Shoot","Jump&SHoot");
                habilidadCombinada.generarHabilidad(this.generarHabilidad("SALTA"));
                habilidadCombinada.generarHabilidad(this.generarHabilidad("DISPARA"));
                return habilidadCombinada;
        }
        return null;
    }}
