package db;

import cliente.Cliente;
import pedido.Pedido;

public class RepositorioClienteVetor implements RepositorioCliente{
    Cliente[] client;

    public RepositorioClienteVetor(int t) {
        this.client = new Cliente[t];
    }
    @Override
    public void cadastrar(Cliente cliente) {
        if (this.client[0] == null){
            this.client[0] = cliente;

        }else {
            for (int i = 0; i <client.length;i++){
                if (this.client[i] == null){
                    this.client[i] = cliente;
                    break;

                }
            }
        }

    }

    @Override
    public void atualizar(String cpf, Cliente cliente) {

    }

    @Override
    public boolean existe(String cpf) {
        return false;
    }

    @Override
    public Cliente buscar(String cpf) {
        return null;
    }
}
