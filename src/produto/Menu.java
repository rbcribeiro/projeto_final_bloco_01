package produto;

import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

import produto.controller.Controller;

import produto.model.BrinquedoEletronico;
import produto.model.BrinquedoManual;

public class Menu {

	public static void main(String[] args) {

		Controller produtos = new Controller();

		Scanner leia = new Scanner(System.in);

		String nomeProduto, descricao;
		int opcao, codigoProduto;
		double preco;
		/*
		 * System.out.println("TESTANDO EXIBIR PRODUTO:");
		 * 
		 * BrinquedoEletronico produtoTeste = new BrinquedoEletronico(1,
		 * "Carrinho de Controle Remoto", 199.99,
		 * "Carrinho de brinquedo com controle remoto", "Modelo X", "Marca Y");
		 * produtoTeste.exibir();
		 */
        
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

			if (opcao == 6) {
				System.out.println("\nSem ideias ainda!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto: \n");

				System.out.println("Digite o Código do Brinquedo: ");
				codigoProduto = leia.nextInt();
				System.out.println("Digite o nome do Brinquedo: ");
				leia.skip("\\R");
				nomeProduto = leia.nextLine();
				System.out.println("Digite o Preço do Brinquedo: ");
				preco = leia.nextDouble();
				
				System.out.println("Digite o Descrição do Brinquedo: ");
				descricao = leia.nextLine();

				int tipo = 0;
			    while (tipo != 1 && tipo != 2) {
			        System.out.println("Digite o tipo do Brinquedo (1-Eletrônico ou 2-Manual): ");
			        tipo = leia.nextInt();
			        leia.nextLine(); 
			    }

			    switch (tipo) {
			    case 1 -> {
			    	System.out.println("Digite o modelo do Brinquedo Eletrônico: ");
			        String modelo = leia.nextLine();
			        System.out.println("Digite a marca do Brinquedo Eletrônico: ");
			        String marca = leia.nextLine();
					produtos.cadastrarProduto(new BrinquedoEletronico( codigoProduto, nomeProduto, preco, descricao, modelo, marca));


			    } 
			    case 2 -> {
			        System.out.println("Digite o número de peças do Brinquedo Manual: ");
			        int numeroDePecas = leia.nextInt();
			        leia.nextLine(); 
			        System.out.println("Digite o tema do Brinquedo Manual: ");
			        String tema = leia.nextLine();
					produtos.cadastrarProduto(new BrinquedoManual( codigoProduto, nomeProduto, preco, descricao, numeroDePecas, tema));

			    }
			    }

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
				
				System.out.println("Digite o Código do Produto: \n");
				codigoProduto = leia.nextInt();
				
				produtos.deletarProduto(codigoProduto);

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