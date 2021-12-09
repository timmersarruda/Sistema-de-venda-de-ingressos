
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import java.awt.*;


public class SistemaBilheteriaGUI extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame janelaPrincipal = new SistemaBilheteriaGUI();
		janelaPrincipal.setVisible(true);
		janelaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	JLabel linha1, linha2;
	SistBilheteria sistema = new SistControleBilheteria();
	JMenuBar barraDeMenu = new JMenuBar();
	
	public SistemaBilheteriaGUI() {
		setTitle("Bilheteria");
		setSize(500,300);
		setLocation(150,150);
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		linha1 = new JLabel("Sistema de compra de ingressos", JLabel.CENTER);
		linha1.setForeground(Color.WHITE);
		linha1.setFont(new Font("Serif", Font.BOLD, 20));
		setLayout(new GridLayout(4,1));
		
		
		JMenu menuCadastrar = new JMenu("Cadastre-se");
		JMenuItem menuCadastrarUsuario = new JMenuItem("Cadastrar usuario");
		menuCadastrar.add(menuCadastrarUsuario);
		menuCadastrarUsuario.addActionListener(new SistControllerCadastro(this.sistema,this));
		
		JMenu menuExibirEvento = new JMenu("Exibir eventos");
		JMenuItem menuPesquisarEventos = new JMenuItem("Buscar próximos eventos");
		menuExibirEvento.add(menuPesquisarEventos);
		menuExibirEvento.addActionListener(new SistControllerListaEventos(this.sistema,this));
		
		JMenu menuCadastrarBilhete = new JMenu("Comprar Ingresso");
		JMenuItem menuComprarIngresso = new JMenuItem("Garanta seu ingresso");
		menuCadastrarBilhete.add(menuComprarIngresso);
		
		barraDeMenu.add(menuCadastrar);
		barraDeMenu.add(menuExibirEvento);
		barraDeMenu.add(menuCadastrarBilhete);
		
		add(barraDeMenu);
		add(linha1);
		add(new JLabel());
	}
}
