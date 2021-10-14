
public class Evento {

	private String nomeDoEvento;
	private Endereco localidade;
	private int dataDoEvento;
	private int horarioDoEvento;
	private Categoria categoriaDoEvento;
	
	public Evento(String nomeDoEvento, Endereco localidade, int dataDoEvento, int horarioDoEvento, Categoria categoriaDoEvento) {
		this.setNomeDoEvento(nomeDoEvento);
		this.localidade = localidade;
		this.setDataDoEvento(dataDoEvento);
		this.setHorarioDoEvento(horarioDoEvento);
		this.setCategoriaDoEvento(categoriaDoEvento);
	}
	
	public String toString() {
		return "Evento: "+ this.nomeDoEvento + " da categoria: "+ this.categoriaDoEvento +" Será realizado em: "+ this.localidade +" no dia: "+ this.dataDoEvento +" a partir das: "+ this.horarioDoEvento;
	}
	
	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}
	

	public Endereco getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Endereco localidade) {
		this.localidade = localidade;
	}

	public int getDataDoEvento() {
		return dataDoEvento;
	}

	public void setDataDoEvento(int dataDoEvento) {
		this.dataDoEvento = dataDoEvento;
	}

	public int getHorarioDoEvento() {
		return horarioDoEvento;
	}

	public void setHorarioDoEvento(int horarioDoEvento) {
		this.horarioDoEvento = horarioDoEvento;
	}

	public Categoria getCategoriaDoEvento() {
		return categoriaDoEvento;
	}

	public void setCategoriaDoEvento(Categoria categoriaDoEvento) {
		this.categoriaDoEvento = categoriaDoEvento;
	}



	
	
}
