package funcionario;


import db.RepositorioFuncionario;
import exceptions.CJCException;
import exceptions.CPFIExecption;
import exceptions.FJCFException;
import funcionario.Empregado;

public class CadastroFuncionario {
    RepositorioFuncionario func;
    Empregado[] funci = new Empregado[10];

    public CadastroFuncionario(RepositorioFuncionario funcionario) {
        this.func = funcionario;
    }

    public void cadastrar(Empregado funcionario) throws FJCFException, CPFIExecption, CJCException {

        if(funcionario.getCpf().length() != 11){
            throw new CPFIExecption();

        } else if (func.buscar(funcionario.getCpf())) {
            throw new CJCException();

        }else{
            func.cadastrar(funcionario);
        }
    }

}
