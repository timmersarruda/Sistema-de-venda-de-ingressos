
public class Usuario {
	
	private String nomeDoUsuario;
	private int dataDeNascimento;
	private String cpf;
	
	
	public Usuario(String nomeDoUsuario, int dataDeNascimento, String cpf) {
		this.nomeDoUsuario = nomeDoUsuario;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Usuario: " + this.nomeDoUsuario +" Nascimento: "+ this.dataDeNascimento +" CPF: "+ this.cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	

}
