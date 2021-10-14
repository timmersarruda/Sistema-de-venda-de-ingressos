
public class Endereco {
	
	private String rua;
	private int numeroDoLocal;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, int numeroDoLocal, String cidade, String estado) {
		
	}
	
	public String toString() {
		return "Rua: "+ this.rua +"N°: "+ this.numeroDoLocal +"Cidade: "+ this.cidade +"Estado: "+ this.estado;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumeroDoLocal() {
		return numeroDoLocal;
	}
	public void setNumeroDoLocal(int numeroDoLocal) {
		this.numeroDoLocal = numeroDoLocal;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
