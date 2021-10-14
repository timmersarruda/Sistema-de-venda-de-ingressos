import java.util.HashMap;
import java.util.Map;

public class Bilhete implements SistBilheteria {

	private Map<String, Bilhete> idBilhete;
	
	public Bilhete() {
		this.idBilhete = new HashMap<>();
	}

	@Override
	public Map<String, Bilhete> getIdBilhete() {
		return idBilhete;
	}

	@Override
	public void setIdBilhete(Map<String, Bilhete> idBilhete) {
		this.idBilhete = idBilhete;
	}
}
