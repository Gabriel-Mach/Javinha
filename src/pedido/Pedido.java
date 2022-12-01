package pedido;

import cliente.Cliente;
import pratos.Prato;

import java.util.ArrayList;

public class Pedido {

    private int id;
    private Cliente cliente;
    private ArrayList<Prato> itensPedido;
    private double total;

    public Pedido(Cliente cliente) {
        this.id = this.getId() +1;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<>();
        this.total = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Prato> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<Prato> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
