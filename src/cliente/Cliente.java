package cliente;

public class Cliente {

   private String cpf;
   private String nome;
   private String endereco;
   private String numero;


   public Cliente(String cpf, String nome, String endereco, String numero) {
      this.cpf = cpf;
      this.nome = nome;
      this.endereco = endereco;
      this.numero = numero;
   }
   public String getCpf() { return cpf; }

   public void setCpf(String cpf) { this.cpf = cpf; }

   public String getNome() { return nome; }

   public void setNome(String nome) { this.nome = nome; }

   public String getEndereco() { return endereco; }

   public void setEndereco(String endereco) { this.endereco = endereco;  }

   public String getNumero() { return numero; }

   public void setNumero(String numero) { this.numero = numero; }
}

