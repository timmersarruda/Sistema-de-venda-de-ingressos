import java.util.HashMap;
import java.util.Map;

public class Bilhete {

	private Map<String, Bilhete> idBilhete;
	
	public Bilhete() {
		this.idBilhete = new HashMap<>();
	}

	public Map<String, Bilhete> getIdBilhete() {
		return idBilhete;
	}

	public void setIdBilhete(Map<String, Bilhete> idBilhete) {
		this.idBilhete = idBilhete;
	}
	
	public String toString(String nome, int idade, String cpf, String idBilhete) {
		return "Usuário: "+ nome +"\n Idade: "+ idade +"\n CPF: "+ cpf +" ID: "+ this.idBilhete ;
	}
	
}
