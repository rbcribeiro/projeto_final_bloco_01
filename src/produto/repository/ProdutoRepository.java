package produto.repository;
import produto.model.Produto;

public interface ProdutoRepository {
    public void procurarPorCódigo(int numero);
    public void listarTodosProdutos();
    public void cadastrarProduto(Produto produto);
    public void atualizarProduto(Produto produto);
    public void deletarProduto(int numero);
}
