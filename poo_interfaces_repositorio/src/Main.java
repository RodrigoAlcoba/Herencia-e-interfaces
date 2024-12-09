import modelo.Cliente;
import repositorio.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("John", "Doe"));
        repo.crear(new Cliente("Jane", "Doe"));
        repo.crear(new Cliente("Jack", "Doe"));
        repo.crear(new Cliente("Jill", "Doe"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(c -> System.out.println(c.toString()));
        
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1,3);
        paginable.forEach(c -> System.out.println(c.toString()));

        System.out.println("======= ordenar ==========");

        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar
                ("nombre", Direccion.ASC);

        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c.toString());
        }

        System.out.println("======= editar ==========");
        Cliente c = new Cliente("Bea", "Mena");
        c.setId(2);
        repo.editar(c);

    }
}