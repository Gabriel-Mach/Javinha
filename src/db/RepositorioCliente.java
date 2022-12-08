package db;

import cliente.Cliente;

public interface RepositorioCliente {

    void cadastrar(Cliente cliente);
    void atualizar(String cpf, Cliente cliente);
    boolean existe(String cpf);
    Cliente buscar(String cpf);
}
