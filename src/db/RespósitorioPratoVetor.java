package db;

import pratos.Prato;

public class RespósitorioPratoVetor implements RepositorioPrato{
    Prato[] insumos = new Prato[1];
    @Override
    public void cadastrar(Prato pratos) {

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
}
