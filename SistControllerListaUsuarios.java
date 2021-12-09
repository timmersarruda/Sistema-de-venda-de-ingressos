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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Evento> getEventos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdBilhete(Map<String, Bilhete> idBilhete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean cadastrarUsuario(String nome, int idade, String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removerUsuario(String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

}
