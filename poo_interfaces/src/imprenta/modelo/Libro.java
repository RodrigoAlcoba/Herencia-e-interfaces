package imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro  implements Imprimible{

    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible hoja) {
        this.paginas.add(hoja);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(this.genero).append("\n");

        for (Imprimible hoja : this.paginas) {
            builder.append(hoja.imprimir()).append("\n");
        }
        return builder.toString();
    }
}
