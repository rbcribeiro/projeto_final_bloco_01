package produto;

import produto.controller.Controller;
import java.util.Scanner;

public class Menu {

    private static Controller produtos = new Controller();
    private static Scanner leia = new Scanner(System.in);
    private static int opcao;

    public static void main(String[] args) {
        while (true) {
            exibirMenu();
            opcao = ComandosMenu.lerInt("Digite uma opção: ", leia);
            if (opcao == 6) {
                ComandosMenu.sair();
            } processarOpcao(opcao);
        }
    }

    private static void exibirMenu() {
        System.out.println("***********************************************");
        System.out.println("              ## LojãoDoPovo ##                ");
        System.out.println("***********************************************");
        System.out.println("         1 - Cadastrar Produto                 ");
        System.out.println("         2 - Consultar Um Produto              ");
        System.out.println("         3 - Listar Todos os Produtos          ");
        System.out.println("         4 - Atualizar Um Produto              ");
        System.out.println("         5 - Apagar Um Produto                 ");
        System.out.println("         6 - Sair                              ");
        System.out.println("***********************************************");
    }

    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> ComandosMenu.cadastrarProduto(produtos, leia);
            case 2 -> ComandosMenu.consultarProduto(produtos, leia);
            case 3 -> ComandosMenu.listarProdutos(produtos);
            case 4 -> ComandosMenu.atualizarProduto(produtos, leia);
            case 5 -> ComandosMenu.apagarProduto(produtos, leia);
            default -> System.out.println("Opção Inválida! \n");
        }
        ComandosMenu.keyPress();
    }
}
