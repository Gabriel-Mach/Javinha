package funcionario;

public class Empregado {

        private String cpf;
        private String nome;
        private String endereco;
        private String funcao;

    public Empregado(String cpf, String nome, String endereco, String funcao) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.funcao = funcao;
    }
    public String getCpf() {  return cpf; }

    public void setCpf(String cpf) {  this.cpf = cpf;  }

    public String getNome() {  return nome; }

    public void setNome(String nome) { this.nome = nome;  }

    public String getEndereco() { return endereco;  }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getFuncao(String funF) { return funcao; }

    public void setFuncao(String funcao) {  this.funcao = funcao; }


}


