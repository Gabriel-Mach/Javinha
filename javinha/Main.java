import cliente.CadastroCliente;
import cliente.Cliente;
import db.*;
import exceptions.CJCException;
import exceptions.CPFIExecption;
import exceptions.FJCFException;
import exceptions.PJCExcepition;
import funcionario.CadastroFuncionario;
import funcionario.Empregado;
import pedido.CadastroPedido;
import pedido.Pedido;
import pratos.CadastroPrato;
import pratos.Prato;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws FJCFException, CPFIExecption, CJCException, PJCExcepition {
        RepositorioPedidos rp = new RepositorioPedidosLista();
        //RepositorioPedidos rp = new RepositorioPedidosVetor();
        CadastroPedido cad = new CadastroPedido(rp);

        RepositorioFuncionario rf = new RepositorioFuuncionarioLista();
        CadastroFuncionario cadF = new CadastroFuncionario(rf);

        RepositorioPratoLista pr = new RepositorioPratoLista();
        CadastroPrato cadP = new CadastroPrato(pr);

        RepositorioClienteLista cliL = new RepositorioClienteLista();
        CadastroCliente cadCl = new CadastroCliente(cliL);



        Scanner s = new Scanner(System.in);



        out.println("Bem Vindo a Cafeteria Baby Reborn");
        out.println("Você é:\n1- Cliente\n2- Funcionario");
        int res = s.nextInt();

        if (res == 1){
            int r1;
            out.println("1- Cardápio\n2- Seu Pedido\n 3- Sair");
            //r1 = Integer.parseInt(s.next());
            r1 = s.nextInt();
            while (r1!=4) {
                if (r1 == 1){
                    out.println(pr);

                } else if (r1 == 2) {
                    String nmCl, clCPF, clEnd, numCl;
                    out.println("Nome do Cliente:");
                    nmCl = s.nextLine();

                    out.println("CPF:");
                    clCPF = s.nextLine();

                    out.println("Endereço:");
                    clEnd = s.nextLine();

                    out.println("Numero:");
                    numCl = s.nextLine();

                    Cliente cli = new Cliente(nmCl,clCPF,clEnd,numCl);

                    cadCl.cadastrar(cli);

                    out.println("Pedido do Cliente");
                    String com = s.nextLine();





                   while (com != "SAIR"){
                        out.println("Mais um pedido?\n Se sim escolha\n se não, escreva SAIR");
                       com = s.nextLine();

                   }

                   Pedido p1 = new Pedido(cli);

                   cad.cadastrar(p1);


                } else {
                    out.println("Opção Inválida");
                }
                out.println("1- Cardápio\n2- Seu Pedido\n3- Finalizar pedido\n 4- Sair");
                r1 = s.nextInt();
            }

        } else if (res == 2){
            int r2;
            out.println("1- Cadasdrar novo Funcionário\n2- Cadastrar novo Prato\n3- Sair");
            r2 = s.nextInt();
            while (r2 != 3){
                if (r2 == 1){
                    out.println("Nome Funcionário:");
                    String nmF = s.nextLine();

                    out.println("CPF Funcionário");
                    String cpfF = s.nextLine();

                    out.println("Endereço do Funcionário");
                    String endF = s.nextLine();

                    out.println("Função do Empregado:");
                    String funF = s.nextLine();

                    Empregado e1 = new Empregado(nmF, cpfF, endF, funF);
                    cadF.cadastrar(e1);

                } else if (r2 == 2) {
                    out.println("Nome do Prato:");
                    String nmp = s.next();

                    out.println("Preço do Prato:");
                    double prp = s.nextDouble();

                    Prato p1 = new Prato(nmp,prp);
                    cadP.cadastrar(p1);




                } else {
                    out.println("Opção Inválida");

                }
                out.println("1- Cadasdrar novo Funcionário\n2- Cadastrar novo Prato\n3- Sair");
                r2 = s.nextInt();

            }


        }





        //conta.setId(1);
        //conta.setNm(false);
        //conta.deposito(21000.58);
//Uso do "Set" para inserir um valor quando a classe for privado//
//Uso do "Get" para inserir um valor quando a classe for privado/

    }
}
