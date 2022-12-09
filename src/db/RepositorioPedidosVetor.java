package db;

import pedido.Pedido;

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
    public boolean existe(int id) {
        return false;
    }

    @Override
    public boolean buscar(int id) {
        /*boolean resp = false;
        for (int i = 0; i<comanda.length; i++){
            if (comanda[i] != null && comanda[i].getId()) {
                resp = true;
                break;
            }

        }
        return resp;
        */
        return false;
    }
}
