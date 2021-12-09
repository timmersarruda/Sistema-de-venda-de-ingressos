import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SistControllerCadastro implements ActionListener {
	
	SistBilheteria sistema;
	SistemaBilheteriaGUI janelaPrincipal;
	public SistControllerCadastro(SistBilheteria sistema, SistemaBilheteriaGUI janelaPrincipal) {
		this.sistema = sistema;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	public void actionPerformed(ActionEvent e) {
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Informe o nome do usuario a ser cadastrado: ");
		String idade = JOptionPane.showInputDialog(janelaPrincipal, "Informe a sua idade: ");
		String cpf = JOptionPane.showInputDialog(janelaPrincipal, "Informe o seu CPF: ");
		boolean cadastrou = sistema.cadastrarUsuario(nome, idade, cpf);
		if(cadastrou) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Cadastro realizado com sucesso");
		}else {
			JOptionPane.showMessageDialog(janelaPrincipal, "Não foi possível realizar o cadastro, verifique se o cpf está cadastrado.");
		}
	}

}
