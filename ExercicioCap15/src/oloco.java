import java.util.Calendar;

import javax.swing.JOptionPane;

public class oloco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento");
		String  dia, mes, ano;
		int anoAtual, diaAtual, mesAtual,diaNas, mesNas, anoNas,resd=0, resm=0, resa=0;
	
		  dia = dataNascimento.substring(0, 2);
		  mes= dataNascimento.substring(3, 5);
		  ano= dataNascimento.substring(6, 10);
		  
		  diaNas=Integer.parseInt(dia);
		  mesNas=Integer.parseInt(mes);
		  anoNas=Integer.parseInt(ano);
		  
		  diaAtual = c.get(Calendar.DAY_OF_MONTH);
		  mesAtual = c.get(Calendar.MONTH) + 1;
		  anoAtual = c.get(Calendar.YEAR);
		  
		  resa = anoAtual - anoNas;
		  resm = mesNas - mesAtual;
		  resd = diaNas - diaAtual;
		  
		  if(resa == 18) {
			  if(resm<0) {
				  JOptionPane.showMessageDialog(null, "Cadastro Concluido!");
			  }else if(resm == 0){
				  if(resd<=0) {
					  JOptionPane.showMessageDialog(null, "Cadastro Concluido!"); 
				  }else{
					  JOptionPane.showMessageDialog(null, "Não é permitido o cadastro de menores de idade" );
				  }
			  }else {
				  JOptionPane.showMessageDialog(null, "Não é permitido o cadastro de menores de idade" );
			  }
		  }else if(resa >= 19) {
			  JOptionPane.showMessageDialog(null, "Cadastro Concluido!");
		  }else{
			  JOptionPane.showMessageDialog(null, "Não é permitido o cadastro de menores de idade" );
		  }	 
	}
}
