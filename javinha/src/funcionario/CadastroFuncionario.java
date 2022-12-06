package funcionario;


import db.RepositorioFuncionario;
import exceptions.CJCException;
import exceptions.CPFIExecption;

public class CadastroFuncionario {
    RepositorioFuncionario func;

    public CadastroFuncionario(RepositorioFuncionario funcionario) {
        this.func = funcionario;
    }

    public void cadastrar(Empregado funcionario) throws CJCException, CPFIExecption {
        if(funcionario.getCpf().length() != 11){
            throw new CPFIExecption();
        } else if (func.existe(funcionario.getCpf())) {
            throw new CJCException();
        }else{
            func.cadastrar(funcionario);
        }
    }
}
