
public class Usuario {
	
	private String nomeDoUsuario;
	private String idade;
	private String cpf;
	
	
	public Usuario(String nomeDoUsuario, String idade, String cpf) {
		this.nomeDoUsuario = nomeDoUsuario;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public String toString() {
		return "Usuario: " + this.nomeDoUsuario +" Idade: "+ this.idade +" CPF: "+ this.cpf;
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

	public String getIdade() {
		return idade;
	}

	public void setDataDeNascimento(String idade) {
		this.idade = idade;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
}
