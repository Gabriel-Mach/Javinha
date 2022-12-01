package db;

import funcionario.Empregado;

public class RepositorioFuuncionarioLista implements RepositorioFuncionario {
    @Override
    public void cadastrar(Empregado funcionario) {

    }

    @Override
    public void atualizar(String cpf, Empregado funcionario) {

    }

    @Override
    public boolean existe(String cpf) {
        return false;
    }

    @Override
    public Empregado buscar(String cpf) {
        return null;
    }
}
