package Tarea1;

public class Empleado extends Persona{
    private double remuneracion;
    private int idEmpleado;
    private static int id = 0;

    public Empleado() {
        this.idEmpleado = ++id;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void aumentarRemuneracion(int porcentaje){
        double aumento = (remuneracion * porcentaje) / 100;
        remuneracion+= aumento;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "remuneracion=" + remuneracion +
                ", idEmpleado=" + idEmpleado +
                '}';
    }
}
