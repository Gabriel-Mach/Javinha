package db;

import cliente.Cliente;

public class  RepositorioClienteLista implements RepositorioCliente{
    private Node<Cliente> inicio;
    private Node<Cliente> fim;

    public RepositorioClienteLista() {
        this.inicio = null;
        this.fim = null;
    }


    @Override
    public void cadastrar(Cliente cliente) {
        Node<Cliente> parametro = new Node<>(cliente);
        if(this.inicio == null){
            this.inicio = parametro;
        }else {
            this.fim.setProximo(parametro);

        }
        this.fim = parametro;
    }
    @Override
    public void atualizar(String cpf, Cliente cliente) {
        Node<Cliente> atual= this.inicio;
        while (atual!=null && !cpf.equals(atual.getKk().getCpf())){
            atual = atual.getProximo();

        }atual.setKk(cliente);

    }

    @Override
    public Cliente existe(String cpf) {
        Node<Cliente> atual= this.inicio;
        while (atual!=null && !cpf.equals(atual.getKk().getCpf())){
            atual = atual.getProximo();
        }
            return atual.getKk();




    }

    @Override
    public boolean buscar(String cpf) {
        Node<Cliente> atual= this.inicio;
        while (atual!=null && !cpf.equals(atual.getKk().getCpf())){
            atual = atual.getProximo();
        }if (atual.getKk().getCpf().equals(cpf)){
            return true;
        }else {
            return false;
        }

    }
}
