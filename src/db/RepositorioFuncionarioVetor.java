package db;

import cliente.Cliente;
import funcionario.Empregado;

public class RepositorioFuncionarioVetor implements RepositorioFuncionario {
    Empregado[] funcio ;

    public RepositorioFuncionarioVetor(int f) {
        this.funcio = new Empregado[f];
    }

    @Override
    public void cadastrar(Empregado funcionario) {
        if (this.funcio[0] == null){
                this.funcio[0] = funcionario;

        }else {
            for (int i = 0; i <funcio.length;i++){
                if (this.funcio[i] == null){
                        this.funcio[i] = funcionario;
                        break;
                }
            }
        }



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
