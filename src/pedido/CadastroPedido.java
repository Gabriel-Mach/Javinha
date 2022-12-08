package pedido;

import db.RepositorioPedidos;

public class CadastroPedido {

    RepositorioPedidos pedidos;

    public CadastroPedido(RepositorioPedidos pedidos) {
        this.pedidos = pedidos;
    }

    public void cadastrar(Pedido pedido){
        if(pedidos.existe(pedido.getId())){

        }else{
            pedidos.cadastrar(pedido);
        }
    }
}
