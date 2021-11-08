package menu;

import cliente.Cliente;
import cliente.ClienteController;
import fornecedor.FornecedorController;
import produtos.ProdutoController;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("SAGA");
        Scanner in = new Scanner(System.in);
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
    }

    private static void produto(Scanner in, ProdutoController produtoController) {
        String  op = acao(in);
        switch(op){
            case "C":
                System.out.println("Nome:");
                String nome = in.nextLine();
                System.out.println("Email");
                String

        }
    }

    private static void fornecedor(Scanner in, FornecedorController fornecedorController) {
    }

    private static void cliente(Scanner in, ClienteController clienteController) {
    }

    public static String acao(Scanner in){
        System.out.println("(V)oltar"+
                "(C)adastrar:" +
                "(L)istar:"+
                "Listar (T)odos:"+
                "(E)ditar: "+
                "(R)emover:" +
                "Opção >> ");
                String opcao = in.nextLine();

                return opcao;
    }
}
