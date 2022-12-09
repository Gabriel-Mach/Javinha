package db;

import cliente.Cliente;
import pedido.Pedido;
import pratos.Prato;

public class RepositorioPedidosLista implements RepositorioPedidos{
    private Node<Pedido> inicio;
    private Node<Pedido> fim;

    public RepositorioPedidosLista() {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void cadastrar(Pedido pedido) {
        Node<Pedido> parametro = new Node<>(pedido);
        if(this.inicio == null){
            this.inicio = parametro;
        }else {
            this.fim.setProximo(parametro);

        }
        this.fim = parametro;


    }

    @Override
    public void atualizar(int id, Pedido pedido) {
        Node<Pedido> atual= this.inicio;
        while (atual!=null && id!=(atual.getKk().getId())){
            atual = atual.getProximo();

        }atual.setKk(pedido);

    }

    @Override
    public Prato existe(String nm1) {
        return null;
    }

    @Override
    public boolean buscar(int id) {

        Node<Pedido> atual= this.inicio;
        while (atual!=null && id!=(atual.getKk().getId())){
            atual = atual.getProximo();
        }if (id == atual.getKk().getId()){
            return true;
        }else {
            return false;
        }
    }


}
