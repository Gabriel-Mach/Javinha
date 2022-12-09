package db;

import funcionario.Empregado;

public class RepositorioFuncionarioVetor implements RepositorioFuncionario {
    Empregado[] funcio ;

    public RepositorioFuncionarioVetor(int f) {
        this.funcio = new Empregado[f];
    }

    @Override
    public void cadastrar(Empregado funcionario) {
        for (int i = 0; i < funcio.length; i++){
            if(funcio[i]== null){
                funcio[i] = funcionario;
                break;
            }
        }
        for (int e = 0; e < funcio.length; e++){
            if(funcio[e]!=null){
                System.out.println("Nome: "+funcio[e].getNome());
                System.out.println("CPF: "+funcio[e].getCpf());
            }
        }
    }

    @Override
    public void atualizar(String cpf, Empregado funcionario) {

    }

    @Override
    public Empregado existe(String cpf) {
        return false;
    }

    @Override
    public boolean buscar(String cpf) {
        boolean resp = false;

        for (int i = 0; i < funcio.length; i++) {
            if (funcio[i] != null && funcio[i].getCpf().equals(cpf)) {
                resp = true;
                break;
            }

        }
        return resp;
    }
}
