package db;

import cliente.Cliente;

public class RepositorioClienteVetor implements RepositorioCliente{
    Cliente[] client = new Cliente[10];

    public RepositorioClienteVetor(int t) {
        this.client = new Cliente[t];
    }
    @Override
    public void cadastrar(Cliente cliente) {
        for (int i = 0; i < client.length; i++){
            if(client[i]== null){
                client[i] = cliente;
                break;
            }
        }
        for (int e = 0; e < client.length; e++){
            if(client[e]!=null){
                System.out.println("Nome: "+client[e].getNome());
                System.out.println("CPF: "+client[e].getCpf());
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
    public boolean buscar(String cpf) {
        boolean resp = false;

        for (int i = 0; i < client.length; i++) {
            if (client[i] != null && client[i].getCpf().equals(cpf)) {
                resp = true;
                break;
            }

        }
        return resp;

    }
}
