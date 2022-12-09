package pedido;

import db.RepositorioPedidos;
import exceptions.PDDExcepition;

public class CadastroPedido {

    RepositorioPedidos pedidos;

    public CadastroPedido(RepositorioPedidos pedidos) {
        this.pedidos = pedidos;
    }

    public void cadastrar(Pedido pedido) throws PDDExcepition {
        if(pedidos.buscar(pedido.getId())){
            throw new PDDExcepition();

        }else{
            pedidos.cadastrar(pedido);
        }
    }
}
