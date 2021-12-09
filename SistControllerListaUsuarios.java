import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Map;

import javax.swing.JOptionPane;

public class SistControllerListaUsuarios implements SistBilheteria{
	SistBilheteria sistema;
	SistemaBilheteriaGUI janelaPrincipal;
	
	public SistControllerListaUsuarios(SistBilheteria sistema, SistemaBilheteriaGUI janelaPrincipal) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
		
	}
	
	public Collection<Usuario> actionListener(ActionEvent e) {
		Collection<Usuario> collectionUsuarios = sistema.getUsuarios();
		for(Usuario u: collectionUsuarios) {
			JOptionPane.showMessageDialog(janelaPrincipal, u.toString());
		}
		return collectionUsuarios;
	}
	
	public void cationPerformed(ActionEvent e) {
		
	}

	@Override
	public Map<String, Bilhete> getIdBilhete() {
		return null;
	}

	@Override
	public Collection<Usuario> getUsuarios() {
		return null;
	}

	@Override
	public Map<String, Evento> getEventos() {
		return null;
	}

	@Override
	public void setIdBilhete(Map<String, Bilhete> idBilhete) {
		
	}

	@Override
	public boolean cadastrarUsuario(String nome, String idade, String cpf) {
		return false;
	}

	@Override
	public boolean removerUsuario(String cpf) {
		return false;
	}

}
