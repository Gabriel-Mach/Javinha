package cliente;

import db.RepositorioCliente;
import exceptions.CJCException;
import exceptions.CPFIExecption;

public class   CadastroCliente {

    RepositorioCliente clientes;
    /*AQUI TÁ CERTINHO!*/

    public CadastroCliente(RepositorioCliente clientes) {
        this.clientes = clientes;
    }

    public void cadastrar(Cliente cliente) throws CJCException, CPFIExecption {
        if(cliente.getCpf().length() != 11){
            throw new CPFIExecption();

        } else if (clientes.buscar(cliente.getCpf())) {
            throw new CJCException();

        }else{
            clientes.cadastrar(cliente);
        }
    }
}
