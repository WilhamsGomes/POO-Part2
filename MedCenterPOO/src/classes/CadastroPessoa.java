package classes;

public abstract class CadastroPessoa {
	
	protected String nome;
	protected Integer idade;
	protected String dataNascimento;
	protected String cpf;
	protected String nomePai;
	protected String nomeMae;
	protected Integer registroGeral;
	protected String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Integer getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(Integer registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public boolean maiorDeIdade() {
		return idade >= 18;
	}
	
	@Override
	public String toString() {
		return "CadastroPessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", registroGeral=" + registroGeral + "]";
	}
	
	
	
	
	
}
