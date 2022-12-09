package db;

import cliente.Cliente;

public interface RepositorioCliente {

    void cadastrar(Cliente cliente);
    void atualizar(String cpf, Cliente cliente);
    Cliente existe(String cpf);
    boolean buscar(String cpf);
}
