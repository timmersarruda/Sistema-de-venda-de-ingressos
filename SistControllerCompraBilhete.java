import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.JOptionPane;


public class SistControllerCompraBilhete implements ActionListener {

	SistBilheteria sistema;
	SistemaBilheteriaGUI janelaPrincipal;
	public SistControllerCompraBilhete(SistBilheteria sistema, SistemaBilheteriaGUI janelaPrincipal) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeComprador = JOptionPane.showInputDialog(janelaPrincipal, "Informe seu CPF: ");
		String idadeComprador = JOptionPane.showInputDialog(janelaPrincipal, "Informe a data do seu nascimento: ");
		String cpfComprador = JOptionPane.showInputDialog(janelaPrincipal, "Informe seu CPF: ");
		boolean estahcadastrado = sistema.cadastrarUsuario(nomeComprador, idadeComprador, cpfComprador);
		if(sistema.getUsuarios().contains(cpfComprador)) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Bilhete comprado com sucesso");
		}else {
			JOptionPane.showMessageDialog(janelaPrincipal, e.toString());
		}
		
	}

}
