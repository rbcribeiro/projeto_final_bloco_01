package produto.model;

public abstract class Produto {
	    private int codigoProduto;
	    private int tipo;
		private String nomeProduto;
	    private Double preco;
	    private String descricao;
	    
		public Produto(int codigoProduto, int tipo, String nomeProduto, double preco, String descricao) {
			this.codigoProduto = codigoProduto;
			this.tipo = tipo;
			this.nomeProduto = nomeProduto;
			this.preco = preco;
			this.descricao = descricao;			
		}
	    
		public int getCodigoProduto() {
			return codigoProduto;
		}

		public void getCodigo(int codigoProduto) {
			this.codigoProduto = codigoProduto;
		}
		
	    public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public String getNomeProduto() {
			return nomeProduto;
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

			String tipo = "";
			
			switch(this.tipo) {
			case 1:
				tipo = "Brinquedos Eletrônicos";
			break;
			case 2:
				tipo = "Brinquedos Manuais";
			break;
			}
			
			System.out.println("\n\n***********************************************");
			System.out.println("                Informações do Produto:");
			System.out.println("***********************************************");
			System.out.println("Código do Produto:  " + this.codigoProduto);
			System.out.println("Tipo:  " + tipo);
			System.out.println("Nome do Produto:  " + this.nomeProduto);
			System.out.println("Descrição:  " + this.descricao);
			

		}
}
