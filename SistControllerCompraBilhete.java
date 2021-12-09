import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
	}

}
