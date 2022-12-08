package db;

import pratos.Prato;

import java.util.ArrayList;

public class RepositorioPratoLista implements RepositorioPrato{
    Prato inicio;

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
    public Prato buscar(String nomePrato) {
        return null;
    }

    public void cardapio(){
        System.out.println();

    }
}
