package pratos;

public class Prato {
    private String nomePrato;
    private double preco;
    private Prato proximo;

    public Prato(String nomePrato, double preco) {
        this.nomePrato = nomePrato;
        this.preco = preco;
    }

    public Prato() {

    }/* hmmmm*/

    public String getNomePrato() { return nomePrato; }

    public void setNomePrato(String nomePrato) { this.nomePrato = nomePrato; }

    public double getPreco() { return preco;  }

    public void setPreco(double preco) {  this.preco = preco; }

    public Prato getProximo() {
        return proximo;
    }

    public void setProximo(Prato proximo) {
        this.proximo = proximo;
    }
}
