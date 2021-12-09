import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;


import javax.swing.JOptionPane;

public class SistControllerListaEventos implements ActionListener{
	SistBilheteria sistema;
	SistemaBilheteriaGUI janelaPrincipal;
	
	public SistControllerListaEventos(SistBilheteria sistema, SistemaBilheteriaGUI janelaPrincipal) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}

	public Collection<Evento> actionListener(ActionEvent e) {
		Collection<Evento> listaEventos = sistema.getEventos().values();
		for(Evento ev: listaEventos) {
			JOptionPane.showMessageDialog(janelaPrincipal, ev.toString());
		}
		return listaEventos;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
