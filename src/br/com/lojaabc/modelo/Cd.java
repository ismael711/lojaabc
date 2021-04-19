package br.com.lojaabc.modelo;

public class Cd extends Produto {
	
	private String artista;
	private boolean lancamento;
	
	
	
	public void setAll(int id, String descricao, float valorCompra, float valorVenda, String artista, boolean lancamento) {
		super.setAll(id, descricao, valorCompra, valorVenda);
		this.artista = artista;
		this.lancamento = lancamento;
	}
	public Cd() {
		super();
	}
	public Cd(int id, String descricao, float valorCompra, float valorVenda, String artista, boolean lancamento) {
		super(id, descricao, valorCompra, valorVenda);
		this.artista = artista;
		this.lancamento = lancamento;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public boolean getLancamento() {
		return lancamento;
	}
	public void setLancamento(boolean lancamento) {
		this.lancamento = lancamento;
	}

	
	
	
	
}
