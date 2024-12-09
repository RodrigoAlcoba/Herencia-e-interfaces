package clasesAbstractas;

public abstract class Felino extends Mamifero {
    private Float tamanoColmillos;
    private Integer velocidad;

    public Felino(String habitat, Float altura, Float largo, Float peso,
                  String nombreCientifico) {
        super(habitat, altura, largo, peso, nombreCientifico);
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(Float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }
}
