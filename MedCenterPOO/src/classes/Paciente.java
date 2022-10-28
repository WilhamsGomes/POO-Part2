package classes;

public class Paciente extends CadastroPessoa{

	private String registroPaciente;
	private String diagnostico;
	private String alergias;
	private Integer identificadorPaciente;
	private String remediosParaTomar;
	
	public String getRegistroPaciente() {
		return registroPaciente;
	}
	public void setRegistroPaciente(String registroPaciente) {
		this.registroPaciente = registroPaciente;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getAlergias() {
		return alergias;
	}
	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}
	public Integer getIdentificadorPaciente() {
		return identificadorPaciente;
	}
	public void setIdentificadorPaciente(Integer identificadorPaciente) {
		this.identificadorPaciente = identificadorPaciente;
	}
	public String getRemediosParaTomar() {
		return remediosParaTomar;
	}
	public void setRemediosParaTomar(String remediosParaTomar) {
		this.remediosParaTomar = remediosParaTomar;
	}
	
	@Override
	public String toString() {
		return "Paciente [registroPaciente=" + registroPaciente + ", diagnostico=" + diagnostico + ", alergias="
				+ alergias + ", identificadorPaciente=" + identificadorPaciente + ", remediosParaTomar="
				+ remediosParaTomar + "]";
	}
	
	@Override
	public boolean maiorDeIdade() {
		return idade>=18;
	}
	
	public String msgMaiorIdade() {
		return this.maiorDeIdade() ? "Paciente maior de idade!" : "Paciente menor de idade";
	}
	
	
}
