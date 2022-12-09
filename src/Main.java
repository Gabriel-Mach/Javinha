import cliente.CadastroCliente;
import cliente.Cliente;
import db.*;
import exceptions.*;
import funcionario.CadastroFuncionario;
import funcionario.Empregado;
import pedido.CadastroPedido;
import pedido.Pedido;
import pratos.CadastroPrato;
import pratos.Prato;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) throws FJCFException, CPFIExecption, CJCException, PDDExcepition, PJCExcepition {
        //RepositorioPedidos rp = new RepositorioPedidosLista();
        RepositorioPedidos rp = new RepositorioPedidosVetor(100);
        CadastroPedido cad = new CadastroPedido(rp);

        RepositorioFuncionario rf = new RepositorioFuncionarioVetor(100);
        CadastroFuncionario cadF = new CadastroFuncionario(rf);

        RepositorioPrato pr = new RespositorioPratoVetor(100);
        CadastroPrato cadP = new CadastroPrato(pr);

        RepositorioCliente cliL = new RepositorioClienteVetor(10);
        CadastroCliente cadCl = new CadastroCliente(cliL);


        Scanner s = new Scanner(in);


        out.println("Bem Vindo a Cafeteria Baby Reborn");
        out.println("Você é:\n1- Cliente\n2- Funcionario\n3- Sair");
        int r1 = s.nextInt();

        do {
            switch (r1) {
                case 1/* CLIENTE */:
                    int rc;
                    boolean rz = true;


                    do {
                        out.println("1- Cardápio\n2- Seu Pedido\n 3- Sair");
                        String a1 = s.next();
                        rc = Integer.parseInt(a1);
                        switch (rc){
                            case 1/*CARDAPIO*/:
                                pr.carda();
                                break;
                            case 2/*SEU PEDIDO*/:
                                String nmCl, clCPF, clEnd, numCl;
                                out.print("Nome do Cliente:");
                                nmCl = s.nextLine();

                                out.println("CPF:");
                                clCPF = s.nextLine();

                                out.println("Endereço:");
                                clEnd = s.nextLine();

                                out.println("Numero:");
                                numCl = s.nextLine();

                                Cliente cli = new Cliente(clCPF, nmCl, clEnd, numCl);

                                cadCl.cadastrar(cli);

                                Pedido p1 = new Pedido(cli);
                                out.println("Seu Pedido");
                                String com = s.nextLine();

                                p1.setItensPedido(com);
                                int rt = 0;
                                boolean ca = true;
                                while (ca) {
                                    out.println("Mais um pedido?\n Se sim escolha\n se não, escreva sair");
                                    com = s.nextLine();

                                    if (!com.equals("sair")){
                                        p1.setItensPedido(com);

                                    }else {
                                        ca = false;
                                        cad.cadastrar(p1);
                                        break;
                                    }

                                }
                                break;
                            case 3:
                                out.println("vc saiu");
                                rz = false;
                                break;
                            default:
                                out.println("Opção Errada");
                                break;
                        }



                    }while(rz);


                    break;
                case 2/*FUNCIONARIO*/:
                    out.println("1- Cadasdrar novo Funcionário\n2- Cadastrar novo Prato\n3- Sair");
                    int r3 = s.nextInt();
                    switch (r3){
                        case 1/*CADASTRAR FUNCIONARIO*/:
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
                            break;
                        case 2 /* CADASTRAR PRATO */:
                            out.println("Nome do Prato:");
                            String nmp = s.nextLine();

                            out.println("Preço do Prato:");
                            double prp = s.nextDouble();

                            Prato p1 = new Prato(nmp, prp);
                            cadP.cadastrar(p1);
                            break;

                        default:
                            out.println("Você Saiu");
                    }

                    break;
                case 3:
                    out.println("Você Saiu!");
                    r1= 3;
                    break;


            }
            out.println("Você é:\n1- Cliente\n2- Funcionario\n3- Sair");
            r1 = s.nextInt();
        }while (r1!=3);

    }
}




        //conta.setId(1);
        //conta.setNm(false);
        //conta.deposito(21000.58);
//Uso do "Set" para inserir um valor quando a classe for privado//
//Uso do "Get" para inserir um valor quando a classe for privado/



