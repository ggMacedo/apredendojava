import javax.swing.JOptionPane;


public class Exemplo3_Semana {

	public static void main(String[] args) {
		
		String diaDaSemana;
		 diaDaSemana = JOptionPane.showInputDialog("Digite o n�mero do dia: ");
		
		 if(diaDaSemana != null){
		 
			 try{ 
				int dia = Integer.parseInt(diaDaSemana);
				
				if(dia == 1)
					diaDaSemana = "Segunda";
				
				else if(dia == 2)
					diaDaSemana = "Ter�a";
				
				else if(dia == 3)
					diaDaSemana = "Quarta";
				
				else if(dia == 4)
					diaDaSemana = "Quinta";
				
				else if(dia == 5)
					diaDaSemana = "Sexta";
				
				else if(dia == 6)
					diaDaSemana = "S�bado";
				
				else if(dia == 7)
					diaDaSemana = "Domingo";
				
				else
					diaDaSemana = "Dia desconhecido";
				
				JOptionPane.showMessageDialog(null, diaDaSemana);
				 
			 }catch(NumberFormatException e){
				 JOptionPane.showMessageDialog(null, "Digite valores n�mericos - \n" + "ERRO" + e.toString()); 
				 
			 }
		 }
	}
}

