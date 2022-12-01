package db;

import cliente.Cliente;

public class RepositorioClienteLista implements RepositorioCliente{
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
