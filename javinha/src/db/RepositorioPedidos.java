package db;

import pedido.Pedido;

public interface RepositorioPedidos {
    void cadastrar(Pedido pedido);
    void atualizar(int id, Pedido pedido);
    boolean existe(int id);
    Pedido buscar(int id);

}


