package db;

import cliente.Cliente;
import pedido.Pedido;

public class RepositorioClienteVetor implements RepositorioCliente{
    Cliente[] comandas = new Cliente[1];
    @Override
    public void cadastrar(Cliente cliente) {

    }

    @Override
    public void atualizar(String cpf, Cliente cliente) {

    }

    @Override
    public boolean existe(String cpf) {
        return false;
    }

    @Override
    public Cliente buscar(String cpf) {
        return null;
    }
}
