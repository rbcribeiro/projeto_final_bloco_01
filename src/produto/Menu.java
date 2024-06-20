package produto;
import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

import produto.model.ProdutoCarrinho;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao;
		System.out.println("TESTANDO EXIBIR PRODUTO:");

        ProdutoCarrinho produtoTeste = new ProdutoCarrinho(1, "Carrinho de Controle Remoto", 199.99, "Carrinho de brinquedo com controle remoto", "Modelo X", "Marca Y");
        produtoTeste.exibir();
        
		while (true) {
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("              ## LojãoDoPovo ##                ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println("                                               ");
			System.out.println("         1 - Cadastrar Produto                 ");
			System.out.println("         2 - Consultar Um Produto              ");
			System.out.println("         3 - Listar Todos os Produtos          ");
			System.out.println("         4 - Atualizar Um Produto              ");
			System.out.println("         5 - Apagar Um Produto                 ");
			System.out.println("         6 - Sair                              ");
			System.out.println("                                               ");
			System.out.println("***********************************************");
			System.out.println(" - Digite uma opção:                           ");
			System.out.println("                                               ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 7) {
				System.out.println("\nSem ideias ainda!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto: \n");

				keyPress();
				break;
			case 2:
				System.out.println("Consultar produto por código: \n");
				
				keyPress();
				break;
			case 3:
				System.out.println("Listar todos os Produtos: \n");

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Produto por Código: \n");
			
				keyPress();
				break;
			case 5:
				System.out.println("Apagar Produto por Código: \n");	

				keyPress();
				break;
			default:
				System.out.println("Opção Inválida! \n");

				keyPress();
				break;
			}
		}
	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para Continuar...\n\n");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você não pressionou ENTER.");
		}
	}

	public static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("    Renata Ribeiro - rbcribeiro@gmail.com");
		System.out.println("           github.com/rbcribeiro");
		System.out.println("***********************************************");
	}
}