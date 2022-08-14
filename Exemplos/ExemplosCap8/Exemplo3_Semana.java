import javax.swing.JOptionPane;


public class Exemplo3_Semana {

	public static void main(String[] args) {
		
		String diaDaSemana;
		 diaDaSemana = JOptionPane.showInputDialog("Digite o número do dia: ");
		
		 if(diaDaSemana != null){
		 
			 try{ 
				int dia = Integer.parseInt(diaDaSemana);
				
				if(dia == 1)
					diaDaSemana = "Segunda";
				
				else if(dia == 2)
					diaDaSemana = "Terça";
				
				else if(dia == 3)
					diaDaSemana = "Quarta";
				
				else if(dia == 4)
					diaDaSemana = "Quinta";
				
				else if(dia == 5)
					diaDaSemana = "Sexta";
				
				else if(dia == 6)
					diaDaSemana = "Sábado";
				
				else if(dia == 7)
					diaDaSemana = "Domingo";
				
				else
					diaDaSemana = "Dia desconhecido";
				
				JOptionPane.showMessageDialog(null, diaDaSemana);
				 
			 }catch(NumberFormatException e){
				 JOptionPane.showMessageDialog(null, "Digite valores númericos - \n" + "ERRO" + e.toString()); 
				 
			 }
		 }
	}
}

