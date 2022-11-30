package prog;

public class Cliente {
    //Opções do cardápio
    private String[] card ={"Capuccino", "Expresso", "Frapê", "Mocaccino","Macchiato",
            "Descafeinado", "Brownie", "Quiche", "Sanduíche", "Sorvete"};

    private double[] preco ={7.55, 5.00, 14.70, 6.00, 12.60, 8.50, 5.50, 4.00, 10.30, 7.00};

    public void cardapio(){
        System.out.println("Cadápio:\nProduto ---- Preço");
        for (int i = 0; i < preco.length; i++){
            System.out.println(card[i]+"----"+preco[i]);
        }
    }
    public void pedido(){

    }

}
