package db;
import cliente.Cliente;
import funcionario.Empregado;

public class RepositorioFuuncionarioLista implements RepositorioFuncionario {


    private Node<Empregado> inicio;
    private Node<Empregado> fim;
    public RepositorioFuuncionarioLista() {
        this.inicio = inicio;
        this.fim = fim;
    }
    @Override
    public void cadastrar(Empregado funcionario) {
        Node<Empregado> parametro = new Node<>(funcionario);
        if(this.inicio == null){
            this.inicio = parametro;
        }else {
            this.fim.setProximo(parametro);

        }
        this.fim = parametro;

    }

    @Override
    public void atualizar(String cpf, Empregado funcionario) {
        Node<Empregado> atual= this.inicio;
        while (atual!=null && !cpf.equals(atual.getKk().getCpf())){
            atual = atual.getProximo();

        }atual.setKk(funcionario);

    }

    @Override
    public Empregado existe(String cpf) {
        Node<Empregado> atual= this.inicio;
        while (atual!=null && !cpf.equals(atual.getKk().getCpf())){
            atual = atual.getProximo();
        }
        return atual.getKk();


    }

    @Override
    public boolean buscar(String cpf) {
        Node<Empregado> atual= this.inicio;
        while (atual!=null && !cpf.equals(atual.getKk().getCpf())){
            atual = atual.getProximo();
        }if (atual.getKk().getCpf().equals(cpf)){
            return true;
        }else {
            return false;
        }
    }
}
