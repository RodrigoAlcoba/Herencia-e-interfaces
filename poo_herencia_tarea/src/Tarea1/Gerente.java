package Tarea1;

public class Gerente extends Empleado{


    public Gerente() {
        super();
    }

    private double presupuesto;

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +"Gerente{" +
                "presupuesto=" + presupuesto +
                '}';
    }
}
