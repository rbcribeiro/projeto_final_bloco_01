package produto.model;

public class BrinquedoEletronico extends Produto {
    private String modelo;
    private String marca;

    public BrinquedoEletronico(int codigoProduto, String nomeProduto, int tipo, double preco, String descricao, String modelo, String marca) {
        super(codigoProduto, nomeProduto, tipo, preco, descricao);
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca  + "\n");
    }
}
