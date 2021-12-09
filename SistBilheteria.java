import java.util.Collection;
import java.util.Map;


public interface SistBilheteria {

	Map<String, Bilhete> getIdBilhete();
	
	Collection<Usuario> getUsuarios();
	
	Map<String, Evento> getEventos();

	void setIdBilhete(Map<String, Bilhete> idBilhete);

	boolean cadastrarUsuario(String nome, int idade, String cpf);
	
	boolean removerUsuario(String cpf);

}