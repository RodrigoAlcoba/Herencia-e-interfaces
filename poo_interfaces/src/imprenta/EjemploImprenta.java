package imprenta;

import imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Jhon Doe", "Ingeniero de sistemas", "Resumen laboral");
       cv.addExperiencia("Java");
       cv.addExperiencia("Oracle DBA");
       cv.addExperiencia("Spring Framework");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseños: Elem. Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Factory"));


        Informe informe = new Informe("Estudio sobre microservicios", "Martin Fowler", "James");
       imprimir(cv);
       imprimir(informe);
       imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
