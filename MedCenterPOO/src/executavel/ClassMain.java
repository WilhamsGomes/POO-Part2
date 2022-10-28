package executavel;

import java.sql.Date;
import java.util.Calendar;

import javax.swing.JOptionPane;

import classes.Atendente;
import classes.Medico;
import classes.Paciente;

public class ClassMain {

	public static void main(String[] args) {
		
		
		String [] options = {"M�dico", "Paciente", "Atendente"};
		Integer optionSystem = JOptionPane.showOptionDialog(null, "Quem far� o login?", "Clique no bot�o",  JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		
		if(optionSystem == 0) {
			
			Medico medico = new Medico();
			String nome = JOptionPane.showInputDialog("Informe o nome do m�dico");
			String cpf = JOptionPane.showInputDialog("Informe o CPF");
			String dataNascimento = JOptionPane.showInputDialog("Informe a data de nascimento");
			String idade = JOptionPane.showInputDialog("Informe a idade");
			String nomeMae = JOptionPane.showInputDialog("Informe o nome do pai");
			String nomePai = JOptionPane.showInputDialog("Informe o nome da m�e");
			
			String areaAtuacao = JOptionPane.showInputDialog("Informe a m�e �rea de atua��o");
			
			medico.setNome(nome);
			medico.setCpf(cpf);
			medico.setDataNascimento(dataNascimento);
			medico.setIdade(Integer.valueOf(idade));
			medico.setNomeMae(nomeMae);
			medico.setNomePai(nomePai);
			
			medico.setAreaAtuacao(areaAtuacao);
			//System.out.println(medico.toString());
			System.out.println(medico.toString());
		} else if (optionSystem == 1) {
			
			Paciente paciente = new Paciente();
			String nome = JOptionPane.showInputDialog("Qual o nome do paciente");
			String diagnostico = JOptionPane.showInputDialog("Qual o diagn�stico do paciente?");
			String idade = JOptionPane.showInputDialog("Qual a idade do paciente?");
			paciente.setNome(nome);
			paciente.setDiagnostico(diagnostico);
			paciente.setIdade(Integer.valueOf(idade));
			System.out.println(paciente.toString());
			System.out.println(paciente.msgMaiorIdade());
			
		} else if (optionSystem == 2) {
			
			Atendente atendente = new Atendente();
			String nome = JOptionPane.showInputDialog("Qual o nome do atendente?");
			String areaAtendimento = JOptionPane.showInputDialog("Qual a �rea de atua��o do atendente?");
			String fimExpediente = JOptionPane.showInputDialog("Qual o hor�rio do fim do expediente?");
			atendente.setExpediente(fimExpediente);
			atendente.setNome(nome);
			atendente.setAreaAtendimento(areaAtendimento);
			System.out.println(atendente.toString());
			System.out.println(atendente.verificarExpediente());
			
		}
		
		
	}

	
}
