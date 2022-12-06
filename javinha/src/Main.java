import cliente.Cliente;
import db.RepositorioPedidos;
import db.RepositorioPedidosLista;
import db.RepositorioPedidosVetor;
import pedido.CadastroPedido;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        RepositorioPedidos rp = new RepositorioPedidosLista();
        //RepositorioPedidos rp = new RepositorioPedidosVetor();
        CadastroPedido cadastroPedido = new CadastroPedido(rp);

        Scanner s = new Scanner(in);

        Cliente cli = new Cliente();

        out.println("Bem Vindo a Cafeteria Baby Reborn");
        out.println("Você é:\n1- Cliente.Cliente\n2- Funcionario.Empregado");
        int res = s.nextInt();

        if (res == 1){
            int r1;
            out.println("1- Cardápio\n2- Seu Pedido\n3- Finalizar pedido\n 4- Sair");
            r1 = Integer.parseInt(s.next());
            while (r1!=4) {

                if (r1 == 1) {
                    cli.cardapio();
                } else if (r1 == 2) {
                    out.println("Nome do Cliente.Cliente:");
                    String ncl = s.next();

                    cli.setNm(ncl);

                    out.println("1- Pedir\n0- Sair");
                    int pd = Integer.parseInt(s.nextLine());
                    while (pd != 0) {
                        out.println("Escolha seu pedido:");
                        pd = s.nextInt();

                    }


                }
                out.println("1- Cardápio\n2- Seu Pedido\n3- Finalizar pedido\n 4- Sair");
                r1 = s.nextInt();
            }


        } else if (res == 2) {
            out.println("1- Vendas\n2- Estoque\n 3- Sair\n");
            int r2 = s.nextInt();

        }




        //conta.setId(1);
        //conta.setNm(false);
        //conta.deposito(21000.58);
//Uso do "Set" para inserir um valor quando a classe for privado//
//Uso do "Get" para inserir um valor quando a classe for privado/

    }
}
