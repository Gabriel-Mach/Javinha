package db;

public class Node<no> {
    private no kk;
    private Node<no> proximo;

    public Node(no kk) {
        this.kk = kk;
        this.proximo = null;
    }

    public no getKk() {
        return kk;
    }

    public void setKk(no kk) {
        this.kk = kk;
    }

    public Node<no> getProximo() {
        return proximo;
    }

    public void setProximo(Node<no> proximo) {
        this.proximo = proximo;
    }
}
