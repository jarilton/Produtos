package entities;

public class ProdutoImportado extends Produto{
	
	private Double taxaAlfandegaria;
	
	public ProdutoImportado() {
		
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandeg�ria) {
		super(nome, preco);
		this.taxaAlfandegaria = taxaAlfandeg�ria;
	}

	public Double getTaxaAlfandeg�ria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandeg�ria(Double taxaAlfandeg�ria) {
		this.taxaAlfandegaria = taxaAlfandeg�ria;
	}
	
	public String etiquetaDePagamento() {
		return nome;
	}
	
	public Double precoTotal() {
		return preco;
	}

}
