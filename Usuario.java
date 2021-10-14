
public class Usuario {
	
	private String nomeDoUsuario;
	private int dataDeNascimento;
	private int cpf;
	
	
	public Usuario(String nomeDoUsuario, int dataDeNascimento, int cpf) {
		this.nomeDoUsuario = nomeDoUsuario;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Usuario: " + this.nomeDoUsuario +" Nascimento: "+ this.dataDeNascimento +" CPF: "+ this.cpf;
	}

	public String getNomeDoUsuario() {
		return nomeDoUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeDoUsuario = nomeDoUsuario;
	}

	public int getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(int dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getCPF() {
		return cpf;
	}

	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	
	
	

}
