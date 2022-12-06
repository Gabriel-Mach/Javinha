package db;

import cliente.Cliente;
import pedido.Pedido;

public class RepositorioPedidosVetor implements RepositorioPedidos{
    Pedido [] pedidos = new Pedido[1];
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
