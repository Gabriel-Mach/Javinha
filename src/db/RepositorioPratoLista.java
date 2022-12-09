package db;

import pratos.Prato;

public class RepositorioPratoLista implements RepositorioPrato{
    Prato inicio;

    @Override
    public void carda() {

    }

    public RepositorioPratoLista() {
    }

    @Override
    public void cadastrar(Prato pratos) {
        if(this.inicio == null){
            this.inicio = pratos;
        }else{
            if(this.inicio.getProximo()!= null){
                this.inicio.getProximo();
            }
        }

    }

    @Override
    public void atualizar(String nomePrato, Prato pratos) {

    }

    @Override
    public boolean existe(String nomePrato) {
        return false;
    }

    @Override
    public boolean buscar(String nomePrato) {
        return false;
    }

    public void cardapio(){
        System.out.println();

    }
}
