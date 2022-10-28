package classes;

import java.util.Calendar;

import constantes.HorarioExpediente;

public class Atendente extends CadastroPessoa{

	private String areaAtendimento;
	private String expediente;
	private Integer idAtendente;
	
	public String getAreaAtendimento() {
		return areaAtendimento;
	}
	public void setAreaAtendimento(String areaAtendimento) {
		this.areaAtendimento = areaAtendimento;
	}
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	public Integer getIdAtendente() {
		return idAtendente;
	}
	public void setIdAtendente(Integer idAtendente) {
		this.idAtendente = idAtendente;
	}
	
	@Override
	public String toString() {
		return "Atendente [areaAtendimento=" + areaAtendimento + ", expediente=" + expediente + ", idAtendente="
				+ idAtendente + "]";
	}
	
	public String verificarExpediente() {
		
		Calendar data = Calendar.getInstance();
		int hora = data.get(Calendar.HOUR_OF_DAY); 
		
		System.out.println("Hora atual: " + hora);
		System.out.println("Fim do expediente em: "+ Integer.valueOf(this.expediente));
		
		if(hora >= (Integer.valueOf(this.expediente)) ) {
			return HorarioExpediente.HORARIO;
		} else {
			return HorarioExpediente.FORADOHORARIO;
		}

		
	}
	
	
	
	
}
