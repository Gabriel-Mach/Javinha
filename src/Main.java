import cliente.CadastroCliente;
import cliente.Cliente;
import db.*;
import exceptions.CJCException;
import exceptions.CPFIExecption;
import exceptions.FJCFException;
import funcionario.CadastroFuncionario;
import funcionario.Empregado;
import pedido.CadastroPedido;
import pedido.Pedido;
import pratos.CadastroPrato;
import pratos.Prato;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws FJCFException, CPFIExecption, CJCException {
        //RepositorioPedidos rp = new RepositorioPedidosLista();
        RepositorioPedidos rp = new RepositorioPedidosVetor(100);
        CadastroPedido cad = new CadastroPedido(rp);

        RepositorioFuncionario rf = new RepositorioFuncionarioVetor(100);
        CadastroFuncionario cadF = new CadastroFuncionario(rf);

        RepositorioPrato pr = new RespositorioPratoVetor(100);
        CadastroPrato cadP = new CadastroPrato(pr);

        RepositorioCliente cliL = new RepositorioClienteVetor(100);
        CadastroCliente cadCl = new CadastroCliente(cliL);


        Scanner s = new Scanner(in);


        out.println("Bem Vindo a Cafeteria Baby Reborn");
        out.println("Você é:\n1- Cliente\n2- Funcionario");
        String aux1 = s.nextLine();
        int res = Integer.parseInt(aux1);

        int r1;
        if (res == 1) {
            out.println("1- Cardápio\n2- Seu Pedido\n 3- Sair");
            String aux = s.nextLine();
            r1 = Integer.parseInt(aux);
            //r1 = s.nextInt();
            while (r1 != 4) {
                if (r1 == 1) {
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

                    Cliente cli = new Cliente(clCPF, nmCl, clEnd, numCl);

                    cadCl.cadastrar(cli);

                    out.println("Pedido do Cliente");
                    String com = s.nextLine();

                    while (!com.equals("SAIR")) {
                        out.println("Mais um pedido?\n Se sim escolha\n se não, escreva SAIR");
                        com = s.nextLine();

                    }

                    Pedido p1 = new Pedido(cli);

                    cad.cadastrar(p1);


                } else {
                    out.println("Opção Inválida");
                }
                out.println("1- Cardápio\n2- Seu Pedido\n4- Sair");
                r1 = s.nextInt();

            }

        } else if (res == 2) {
            int r2;
            out.println("1- Cadasdrar novo Funcionário\n2- Cadastrar novo Prato\n3- Sair");
            String aux2 = s.nextLine();
            r2 = Integer.parseInt(aux2);

            while (r2 != 3) {
                if (r2 == 1) {
                    out.println("Nome Funcionário:");
                    String nmF = s.nextLine();

                    out.println("CPF Funcionário:");
                    String cpfF = s.nextLine();

                    out.println("Endereço do Funcionário");
                    String endF = s.nextLine();

                    out.println("Função do Empregado:");
                    String funF = s.nextLine();

                    Empregado e1 = new Empregado(cpfF, nmF, endF, funF);
                    cadF.cadastrar(e1);

                } else if (r2 == 2) {
                    out.println("Nome do Prato:");
                    String nmp = s.nextLine();

                    out.println("Preço do Prato:");
                    double prp = s.nextDouble();

                    Prato p1 = new Prato(nmp, prp);
                    cadP.cadastrar(p1);


                } else {
                    out.println("Opção Inválida");

                }
                out.println("1- Cadasdrar novo Funcionário\n2- Cadastrar novo Prato\n3- Sair");
                aux2 = s.nextLine();
                r2 = Integer.parseInt(aux2);

            }
            out.println("1- Cardápio\n2- Seu Pedido\n 3- Sair");
            String aux = s.nextLine();
            r1 = Integer.parseInt(aux);


        }


        //conta.setId(1);
        //conta.setNm(false);
        //conta.deposito(21000.58);
//Uso do "Set" para inserir um valor quando a classe for privado//
//Uso do "Get" para inserir um valor quando a classe for privado/

    }
}
