package produto;

import produto.controller.Controller;
import produto.model.BrinquedoEletronico;
import produto.model.BrinquedoManual;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComandosMenu {

    public static void cadastrarProduto(Controller produtos, Scanner leia) {
        System.out.println("Cadastrar Produto:\n");

        int codigoProduto = lerInt("Digite o Código do Brinquedo: ", leia);
        String nomeProduto = lerString("Digite o nome do Brinquedo: ", leia);
        double preco = lerDouble("Digite o Preço do Brinquedo: ", leia);
        String descricao = lerString("Digite a Descrição do Brinquedo: ", leia);
        int tipo = lerInt("Digite 1-Eletrônico ou 2-Manual: ", leia);

        if (tipo == 1) {
            String modelo = lerString("Digite o modelo do Brinquedo Eletrônico: ", leia);
            String marca = lerString("Digite a marca do Brinquedo Eletrônico: ", leia);
            produtos.cadastrarProduto(new BrinquedoEletronico(codigoProduto, nomeProduto, tipo, preco, descricao, modelo, marca));
        } else if (tipo == 2) {
            int numeroDePecas = lerInt("Digite o número de peças do Brinquedo Manual: ", leia);
            String tema = lerString("Digite o tema do Brinquedo Manual: ", leia);
            produtos.cadastrarProduto(new BrinquedoManual(codigoProduto, nomeProduto, tipo, preco, descricao, numeroDePecas, tema));
        }
    }

    public static void consultarProduto(Controller produtos, Scanner leia) {
        int codigoProduto = lerInt("Digite o Código do Produto: ", leia);
        produtos.procurarPorCódigo(codigoProduto);
    }

    public static void listarProdutos(Controller produtos) {
        System.out.println("Listar todos os Produtos:\n");
        produtos.listarTodosProdutos();
    }

    public static void atualizarProduto(Controller produtos, Scanner leia) {
        int codigoProduto = lerInt("Digite o Código do Produto: ", leia);
        var buscarProduto = produtos.buscarNaCollection(codigoProduto);

        if (buscarProduto != null) {
            int tipo = buscarProduto.getTipo();
            String nomeProduto = lerString("Digite o Nome do Produto: ", leia);
            String descricao = lerString("Digite a Descrição do Produto: ", leia);
            double preco = lerDouble("Digite o Preço do Produto: ", leia);

            if (tipo == 1) {
                String modelo = lerString("Digite o modelo do Brinquedo Eletrônico: ", leia);
                String marca = lerString("Digite a marca do Brinquedo Eletrônico: ", leia);
                produtos.atualizarProduto(new BrinquedoEletronico(codigoProduto, nomeProduto, tipo, preco, descricao, modelo, marca));
            } else if (tipo == 2) {
                int numeroDePecas = lerInt("Digite o número de peças do Brinquedo Manual: ", leia);
                String tema = lerString("Digite o tema do Brinquedo Manual: ", leia);
                produtos.atualizarProduto(new BrinquedoManual(codigoProduto, nomeProduto, tipo, preco, descricao, numeroDePecas, tema));
            }
        } else {
            System.out.println("O Produto não foi encontrado!");
        }
    }

    public static void apagarProduto(Controller produtos, Scanner leia) {
        int codigoProduto = lerInt("Digite o Código do Produto: ", leia);
        produtos.deletarProduto(codigoProduto);
    }

    public static void sair() {
        System.out.println("\nVenha Brincar Sem Limites!");
        sobre();
        System.exit(0);
    }

    public static void keyPress() {
        try {
            System.out.println("\n\nPressione Enter para Continuar...\n\n");
            System.in.read();
        } catch (Exception e) {
            System.out.println("Você não pressionou ENTER.");
        }
    }

    public static String lerString(String mensagem, Scanner leia) {
        System.out.println(mensagem);
        leia.skip("\\R?");
        return leia.nextLine();
    }

    public static int lerInt(String mensagem, Scanner leia) {
        System.out.println(mensagem);
        int valor = 0;
        try {
            valor = leia.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Digite um valor inteiro válido!");
            leia.nextLine(); 
        }
        return valor;
    }

    public static double lerDouble(String mensagem, Scanner leia) {
        System.out.println(mensagem);
        double valor = 0;
        try {
            valor = leia.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Digite um valor decimal válido!");
            leia.nextLine(); 
        }
        return valor;
    }

    public static void sobre() {
        System.out.println("\n***********************************************");
        System.out.println("    Renata Ribeiro - rbcribeiro@gmail.com");
        System.out.println("           github.com/rbcribeiro");
        System.out.println("***********************************************");
    }
}
