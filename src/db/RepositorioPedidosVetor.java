package db;

import pedido.Pedido;
import pratos.Prato;

public class RepositorioPedidosVetor implements RepositorioPedidos{
    Pedido [] comanda ;

    public RepositorioPedidosVetor(int t) {
        this.comanda = new Pedido[t];
    }

    @Override
    public void cadastrar(Pedido pedido) {
        for (int i = 0; i < comanda.length; i++){
            if(comanda[i]== null){
                comanda[i] = pedido;
                break;
            }
        }

    }

    @Override
    public void atualizar(int id, Pedido pedido) {

    }

    @Override
    public Prato existe(String nm1) {
        return null;
    }

    @Override
    public boolean buscar(int id) {
        return false;
    }

}
