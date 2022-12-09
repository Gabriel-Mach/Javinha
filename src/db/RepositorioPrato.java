package db;


import pratos.Prato;

public interface RepositorioPrato {
    void cadastrar(Prato pratos);
    void atualizar(String nomePrato, Prato pratos);
    boolean existe(String nomePrato);
    boolean buscar(String nomePrato);

    void carda();
}
