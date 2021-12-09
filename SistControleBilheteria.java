import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SistControleBilheteria implements SistBilheteria{

	private Map<String, Bilhete> idBilhete;
	private Map<String, Usuario> usuarios;
	private Map<String, Evento> eventos;
	
	public SistControleBilheteria() {
		this.idBilhete = new HashMap<>();
		this.usuarios = new HashMap<>();
		this.eventos = new HashMap<>();
	}
	
	public void recuperarDados() {
		
	}
	
	@Override
	public Map<String, Bilhete> getIdBilhete() {
		return idBilhete;
	}

	@Override
	public void setIdBilhete(Map<String, Bilhete> idBilhete) {
		this.idBilhete = idBilhete;
		
	}

	@Override
	public boolean cadastrarUsuario(String nome, String idade, String cpf) {
			if(this.estahCadastrado(cpf)) {
				return false;
			}else {
				Usuario user = new Usuario(nome, idade, cpf);
					this.usuarios.put(cpf, user);
					return true;
				}
			}


	private boolean estahCadastrado(String cpf) {
		for(Usuario u: this.usuarios.values()) {
			if(u.getCPF().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventos, idBilhete, usuarios);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SistControleBilheteria other = (SistControleBilheteria) obj;
		return Objects.equals(eventos, other.eventos) && Objects.equals(idBilhete, other.idBilhete)
				&& Objects.equals(usuarios, other.usuarios);
	}

	public Map<String, Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Map<String, Evento> eventos) {
		this.eventos = eventos;
	}

	@Override
	public Collection<Usuario> getUsuarios() {
		return this.getUsuarios();
	}

	@Override
	public boolean removerUsuario(String cpf) {
		return false;
	}
	
	public void salvarDados(Map<String, Usuario> usuarios, Map<String, Bilhete> idBilhete, Map<String, Evento> eventos) {
		this.usuarios = usuarios;
		this.idBilhete = idBilhete;
		this.eventos = eventos;
	}

}
