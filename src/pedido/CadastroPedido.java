package pedido;

import db.RepositorioPedidos;
import db.RepositorioPrato;
import exceptions.PDDExcepition;
import pratos.Prato;

public class CadastroPedido {

    RepositorioPedidos pedidos;
    RepositorioPrato prt;



    public CadastroPedido(RepositorioPedidos pedidos,RepositorioPrato prt) {
        this.prt = prt;
        this.pedidos = pedidos;
    }

    public void cadastrar(Pedido pedido) throws PDDExcepition {
        if(pedidos.buscar(pedido.getId())){
            throw new PDDExcepition();

        }else{
            pedidos.cadastrar(pedido);
        }
    }
    public double buscar(String nmP){
        Prato pt = prt.existe(nmP);
        return pt.getPreco();

    }
}
