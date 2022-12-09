package db;


import funcionario.Empregado;

public interface RepositorioFuncionario {
    void cadastrar(Empregado funcionario);
    void atualizar(String cpf, Empregado funcionario);
    boolean existe(String cpf);
    boolean buscar(String cpf);
}
