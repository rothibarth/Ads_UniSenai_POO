package modelo;

public abstract class Aberturas {
	
	protected String descricao;
	protected int estado;
	
	public String getDescricao() { 
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}

}
