package imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }


    @Override
    public String imprimir() {
        return "Inform escrito por: " + autor
                + "Revisado por: " + revisor +
                "\n" + this.contenido;
    }
}
