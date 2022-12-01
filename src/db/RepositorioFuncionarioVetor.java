package db;

import cliente.Cliente;
import funcionario.Empregado;

public class RepositorioFuncionarioVetor implements RepositorioFuncionario {
    Empregado[] funcio = new Empregado[1];
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
