package prog;
public class Conta {
    private boolean nm;
    private int id;
    private double saldo;
    private String teste;

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public void print(){
        System.out.println("NM = " + this.nm);
        System.out.println("Id = "+ this.id);
        System.out.println("Saldo = "+ this.saldo);
    }
    public void setNm(boolean nm) {
        this.nm = nm;
    }
    public boolean getNm() {
        return this.nm;
    }

    public void setId(int id) {
        if (id > 0){
            this.id = id;
        }else {
            System.out.println("Número de conta Inválido");
        }

    }
    public int getId(){
        return this.id;
    }

    //public void setSaldo(double saldo) {
    //    this.saldo = saldo;
    //}
    public void deposito(double val1){
        if (val1 > 0){
            this.saldo += val1;
        }else {
            System.out.println("Valor Inválido!");
        }
    }
    public void retirar(double val2) {
        if (val2 > 0){
            this.saldo -= val2;

        }else {
            System.out.println("Valor Inválido!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
