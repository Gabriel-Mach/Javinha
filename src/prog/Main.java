package prog;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cli = new Cliente();

        System.out.println("Bem Vindo a Cafeteria Baby Reborn");
        System.out.println("Você é:\n1- Cliente\n2- Empregado\n");
        int res = s.nextInt();

        if (res == 1){
            System.out.print("1- Cardápio\n2- Seu Pedido\n3- Finalizar pedido\n 4- Sair\n");
            int r1 = s.nextInt();
            if (r1 == 1){
                cli.cardapio();
            } else if (r1 == 2) {

            }


        } else if (res == 2) {
            System.out.println("1- Vendas\n2- Estoque\n 3- Sair\n");
            int r2 = s.nextInt();

        }




        //conta.setId(1);
        //conta.setNm(false);
        //conta.deposito(21000.58);
//Uso do "Set" para inserir um valor quando a classe for privado//
//Uso do "Get" para inserir um valor quando a classe for privado/
        //conta.print();
    }
}