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

	public Date getDataDeFabricação() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricação(Date dataDeFabricação) {
		this.dataDeFabricacao = dataDeFabricação;
	}
	

}
