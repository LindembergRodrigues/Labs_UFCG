package menu;

import cliente.Cliente;
import cliente.ClienteController;
import fornecedor.FornecedorController;
import produtos.ProdutoController;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Menu {
    public static void main(String[] args) {
        System.out.println("SAGA");
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------");
        menu(in);

    }
    public static void menu(Scanner in){
        ProdutoController produtoController = new ProdutoController();
        ClienteController clienteController = new ClienteController();
        FornecedorController fornecedorController = new FornecedorController();

        System.out.println("(C)lientes:\n"+
                "(F)ornecedor:\n"+
                "(P)roduto:\n"+"" +
                "(S)air: "+
                "Opção >> ");
                String opcao =in.nextLine().toUpperCase(Locale.ROOT);
                switch (opcao){
                    case "C":
                        cliente(in,clienteController);
                        break;
                    case "F":
                        fornecedor(in,fornecedorController);
                        break;
                    case "P":
                        produto(in,produtoController);
                        break;
                }
        System.out.println("------------------------------------");
    }

    private static void produto(Scanner in, ProdutoController produtoController) {
        while(true) {

            }
    }

    private static void fornecedor(Scanner in, FornecedorController fornecedorController) {
    }

    private static void cliente(Scanner in, ClienteController clienteController) {
        while(true) {
            String op = acao(in);
            String CPF;
            String nome;
            String email;
            String localizacao;
            switch (op) {
                case "C":
                    System.out.println("CPF> ");
                    CPF = in.nextLine();
                    System.out.println("Nome>");
                    nome = in.nextLine();
                    System.out.println("Email> ");
                    email = in.nextLine();
                    System.out.println("localização> ");
                    localizacao = in.nextLine();
                    clienteController.inserirCliente(CPF, new Cliente(nome, email, localizacao));
                    break;
                case "L":
                    System.out.println("CPF> ");
                    CPF = in.nextLine();
                    if (clienteController.validaCPF(CPF)) {
                        System.out.println(clienteController.representacaoTextual(CPF));
                    }
                    break;
                case ("T"):
                    System.out.println(clienteController.representacaoTextualDeTodosOsClientes());
                    break;
                case "E":
                    System.out.println("CPF do cliente a ser editado> ");
                    CPF = in.nextLine();
                    if (clienteController.validaCPF(CPF)) {
                        System.out.println("Nome>");
                        nome = in.nextLine();
                        System.out.println("Email> ");
                        email = in.nextLine();
                        System.out.println("localização> ");
                        localizacao = in.nextLine();
                        clienteController.alteraCliente(CPF,new Cliente(nome,email,localizacao));
                    }
                    break;
                case "R":
                    System.out.println("CPF do cliente a ser editado> ");
                    CPF = in.nextLine();
                    if (clienteController.validaCPF(CPF)) {
                        clienteController.removeCliente(CPF);
                    }
                    break;
                case "V":
                    menu(in);
                    break;
            }
        }
    }

    public static String acao(Scanner in){
        System.out.println("\n(V)oltar\n"+
                "(C)adastrar:\n" +
                "(L)istar:\n"+
                "Listar (T)odos:\n"+
                "(E)ditar: \n"+
                "(R)emover: \n" +
                "Opção >> \n");
                return in.nextLine().toUpperCase(Locale.ROOT);
    }
}
