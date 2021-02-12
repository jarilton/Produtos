package entities;

import java.util.Date;

public class ProdutoUsado extends Produto {
	
	private Date dataDeFabricacao;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabrica��o() {
		return dataDeFabricacao;
	}

	public void setDataDeFabrica��o(Date dataDeFabrica��o) {
		this.dataDeFabricacao = dataDeFabrica��o;
	}
	

}
