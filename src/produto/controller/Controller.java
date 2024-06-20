package produto.controller;

import java.util.*;
import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class Controller implements ProdutoRepository {
    
    private ArrayList<Produto> listarProdutos = new ArrayList<Produto>();
    
    @Override
    public void procurarPorCódigo(int codigoProduto) {
        var produto = buscarNaCollection(codigoProduto);
        
        if (produto != null)
            produto.exibir();
        else
            System.out.println("\nO Produto com Código: " + codigoProduto + " não foi encontrado!");
    }
    
    @Override
    public void listarTodosProdutos() {
        for (var produto : listarProdutos) {
            produto.exibir();
        }
    }
    
    @Override
    public void cadastrarProduto(Produto produto) {
        listarProdutos.add(produto);
        System.out.println("\nO Produto com Código: " + produto.getCodigoProduto() + " foi cadastrado com sucesso!");
    }
    
    @Override
    public void atualizarProduto(Produto produto) {
        var buscaProduto = buscarNaCollection(produto.getCodigoProduto());
        
        if (buscaProduto != null) {
            listarProdutos.set(listarProdutos.indexOf(buscaProduto), produto);
            System.out.println("\nO Produto com o código " + produto.getCodigoProduto() + " foi atualizado com sucesso!");
        } else {
            System.out.println("\nO Produto com código " + produto.getCodigoProduto() + " não foi localizado!");
        }
    }
    
    @Override
    public void deletarProduto(int codigoProduto) {
        var produto = buscarNaCollection(codigoProduto);
        
        if (produto != null) {
            if (listarProdutos.remove(produto)) {
                System.out.println("\nO Produto com Código: " + codigoProduto + " foi deletado com sucesso!");
            }
        } else {
            System.out.println("\nO Produto com Código: " + codigoProduto + " não foi encontrado!");
        }
    }
    
    public Produto buscarNaCollection(int codigoProduto) {
        for (var produto : listarProdutos) {
            if (produto.getCodigoProduto() == codigoProduto) {
                return produto;
            }
        }
        return null;
    }
}
