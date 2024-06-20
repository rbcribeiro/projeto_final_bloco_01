package produto.model;

public abstract class Produto {
	    private int codigoProduto;
		private String nomeProduto;
		private int tipo;
		private Double preco;
	    private String descricao;
	    
		public Produto(int codigoProduto, String nomeProduto, int tipo, double preco, String descricao) {
			this.codigoProduto = codigoProduto;
			this.nomeProduto = nomeProduto;
			this.tipo = tipo;
			this.preco = preco;
			this.descricao = descricao;			
		}
	    
		public int getCodigoProduto() {
			return codigoProduto;
		}

		public void getCodigo(int codigoProduto) {
			this.codigoProduto = codigoProduto;
		}
		
		public String getNomeProduto() {
			return nomeProduto;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public void exibir() {

    		System.out.println("\n\n***********************************************");
			System.out.println("                Informações do Produto:");
			System.out.println("***********************************************");
			System.out.println("Código do Produto:  " + this.codigoProduto);
			System.out.println("Nome do Produto:  " + this.nomeProduto);
			System.out.println("Descrição:  " + this.descricao);
			System.out.println("Preço do Produto:  " + this.preco);

			

		}
}
