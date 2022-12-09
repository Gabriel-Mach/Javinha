package db;

import pedido.Pedido;
import pratos.Prato;

public interface RepositorioPedidos {
    void cadastrar(Pedido pedido);
    void atualizar(int id, Pedido pedido);
    Prato existe(String nm1);
    boolean buscar(int id);


}


