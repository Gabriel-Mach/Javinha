package pedido;

import cliente.Cliente;

import java.util.ArrayList;

public class Pedido {

    private int id;
    private Cliente cliente;
    private ArrayList<String> itensPedido;
    private double total;

    public Pedido(Cliente cliente) {
        this.id = this.getId() +1;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<String>();
        this.total = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getItensPedido() {

        return itensPedido;
    }

    public void setItensPedido(String pd) {

        this.itensPedido.add(pd);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {

        this.total += total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id += id;
    }
}
//HELP//