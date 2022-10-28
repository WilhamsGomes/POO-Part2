package classes;

public class Medico extends CadastroPessoa{

	private String especialidade;
	private String crm;
	private String areaAtuacao;
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	@Override
	public String toString() {
		return "Medico [especialidade=" + especialidade + ", crm=" + crm + ", areaAtuacao=" + areaAtuacao + "]";
	}
	
	
	
	
}
