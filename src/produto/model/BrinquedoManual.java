package produto.model;

public class BrinquedoManual extends Produto {
	private int numeroDePecas;
	private String tema;
    
	public BrinquedoManual(int codigoProduto, String nomeProduto, int tipo, double preco, String descricao, int numeroDePecas, String tema) {
		super(codigoProduto, nomeProduto, tipo, preco, descricao);
		this.numeroDePecas = numeroDePecas;
		this.tema = tema;
	}
			    
	public int getNumeroDePecas() {
		return numeroDePecas;
	}
	public void setNumeroDePecas(int numeroDePecas) {
		this.numeroDePecas = numeroDePecas;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public void exibir() {
		super.exibir();
		System.out.println("Número de Peças: " + numeroDePecas);
	    System.out.println("Tema: " + tema + "\n");
	}
}

