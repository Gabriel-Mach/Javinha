package funcionario;


import db.RepositorioFuncionario;
import exceptions.CPFIExecption;
import exceptions.FJCFException;

public class CadastroFuncionario {
    RepositorioFuncionario func;

    public CadastroFuncionario(RepositorioFuncionario funcionario) {

        this.func = funcionario;
    }

    public void cadastrar(Empregado funcionario) throws FJCFException, CPFIExecption {
        if(funcionario.getCpf().length() != 11){
            throw new CPFIExecption();
        } else if (func.existe(funcionario.getCpf())) {
            throw new FJCFException();
        }else{
            func.cadastrar(funcionario);
        }
    }

}
