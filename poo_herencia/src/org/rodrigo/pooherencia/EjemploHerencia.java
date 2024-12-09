package org.rodrigo.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Rodrigo");
        alumno.setApellido("Alcoba");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Australia");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Instituto Nacional");
        alumnoInternacional.setNotaIdiomas(6.8);
        alumnoInternacional.setNotaCastellano(6.2);
        alumnoInternacional.setNotaHistoria(5.8);
        alumnoInternacional.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Alison");
        profesor.setApellido("Castro");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura()
        + ": " + profesor.getNombre() + " " + profesor.getApellido());


        Class claseAlumnoInt = alumnoInternacional.getClass();
        while (claseAlumnoInt.getSuperclass() != null){
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();
            System.out.println(hija + "es una clase hija de la clase: " + padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }
    }
}
