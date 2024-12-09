package Felinos;

import clasesAbstractas.Felino;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso,
                 String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }


    @Override
    protected String comer() {
        return "El tigre Falcao come";
    }

    @Override
    protected String dormir() {
        return "El tigre Falcao duerme";
    }

    @Override
    protected String correr() {
        return "El tigre Falcao corre";
    }

    @Override
    protected String comunicarse() {
        return "El tigre Falcao ruge";
    }
}
