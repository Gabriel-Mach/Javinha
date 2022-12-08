package db;

import cliente.Cliente;
import pedido.Pedido;

public class RepositorioPedidosVetor implements RepositorioPedidos{
    Pedido [] comanda ;

    public RepositorioPedidosVetor(int t) {
        this.comanda = new Pedido[t];
    }

    @Override
    public void cadastrar(Pedido pedido) {
        if (this.comanda[0] == null){
                this.comanda[0] = pedido;

        }else {
            for (int i = 0; i <comanda.length;i++){
                if (this.comanda[i] == null){
                        this.comanda[i] = pedido;
                        break;

                }
            }
        }

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
