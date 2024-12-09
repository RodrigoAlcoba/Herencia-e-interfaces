package Tarea1;

public class Cliente {

    private int clienteId;

    public static int id = 1;

    public Cliente(int clienteId) {
        this.clienteId = id++;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return super.toString() +"Cliente{" +
                "clienteId=" + clienteId +
                '}';
    }
}
