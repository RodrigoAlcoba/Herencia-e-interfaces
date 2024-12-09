package repositorio;

import modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio,
        PaginableRepositorio{

    private List<Cliente> dataSource;

    public ClienteListRepositorio(){
        this.dataSource = new ArrayList<Cliente>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente c = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId().equals(id)){
                c = cliente;
                break;
            }
        }

        return c;
    }

    @Override
    public void crear(Cliente cliente) {this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
            Cliente c = this.porId(cliente.getId());
            c.setNombre(cliente.getNombre());
            c.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataSource.remove(c);

    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente c1, Cliente c2) {
                int resultado = 0;
                if (dir == Direccion.ASC){
                    switch (campo){
                        case "id" ->
                                resultado = c1.getId().compareTo(c2.getId());
                        case "nombre" ->
                            resultado = c1.getNombre().compareTo(c2.getNombre());
                        case "apellido" ->
                            resultado = c1.getApellido().compareTo(c2.getApellido());

                    }
                }else if(dir == Direccion.DESC){
                    switch (campo){
                        case "id" ->
                                resultado = c2.getId().compareTo(c1.getId());
                        case "nombre" ->
                                resultado = c2.getNombre().compareTo(c1.getNombre());
                        case "apellido" ->
                                resultado = c2.getApellido().compareTo(c1.getApellido());

                    }
                }
                return resultado;
            }
        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }
}
