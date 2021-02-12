package entities;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandegaria;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandegária) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandegária;
	}

	public Double getTaxaAlfandegária() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegária(Double taxaAlfandegária) {
		this.taxaAlfandegaria = taxaAlfandegária;
	}
	
	public String etiquetaDePagamento() {
		return nome;
	}
	
	public Double precoTotal() {
		return preco;
	}

}
