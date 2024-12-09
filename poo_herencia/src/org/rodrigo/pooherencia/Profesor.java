package org.rodrigo.pooherencia;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor() {
        System.out.println("Constructor inicializando Profesor");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
