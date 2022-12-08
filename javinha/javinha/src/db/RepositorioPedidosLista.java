package db;

import cliente.Cliente;
import pedido.Pedido;

public class RepositorioPedidosLista implements RepositorioPedidos{
    @Override
    public void cadastrar(Pedido pedido) {

    }

    @Override
    public void atualizar(int id, Pedido pedido) {

    }

    @Override
    public boolean existe(int id) {
        return false;
    }

    @Override
    public Pedido buscar(int id) {
        return null;
    }
}
