package db;

import cliente.Cliente;
import pratos.Prato;

public class RepositorioPratoLista implements RepositorioPrato{
   Node<Prato> inicio;
   Node<Prato> fim;

    public RepositorioPratoLista() {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void carda() {

    }
    @Override
    public void cadastrar(Prato pratos) {
        Node<Prato> parametro = new Node<>(pratos);
        if(this.inicio == null){
            this.inicio = parametro;
        }else {
            this.fim.setProximo(parametro);

        }
        this.fim = parametro;
    }



    @Override
    public void atualizar(String nomePrato, Prato pratos) {
        Node<Prato> atual= this.inicio;
        while (atual!=null && !nomePrato.equals(atual.getKk().getNomePrato())){
            atual = atual.getProximo();

        }atual.setKk(pratos);

    }

    @Override
    public Prato existe(String nomePrato) {
        Node<Prato> atual= this.inicio;
        while (atual!=null && !nomePrato.equals(atual.getKk().getNomePrato())){
            atual = atual.getProximo();
        }
        return atual.getKk();


    }

    @Override
    public boolean buscar(String nomePrato) {
        Node<Prato> atual= this.inicio;
        while (atual!=null && !nomePrato.equals(atual.getKk().getNomePrato())){
            atual = atual.getProximo();
        }if (atual.getKk().getNomePrato().equals(nomePrato)){
            return true;
        }else {
            return false;
        }
    }


}
