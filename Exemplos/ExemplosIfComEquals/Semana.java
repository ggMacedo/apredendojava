import javax.swing.JOptionPane;

public class Semana {

	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do dia: "));
		
		if(dia == 1)
			JOptionPane.showMessageDialog(null, "Domingo");
			
			else if(dia == 2)
			JOptionPane.showMessageDialog(null, "Segunda");
			
			else if(dia == 3)
			JOptionPane.showMessageDialog(null, "Terça");
			
			else if(dia == 4)
			JOptionPane.showMessageDialog(null, "Quarta");
			
			else if(dia == 5)
			JOptionPane.showMessageDialog(null, "Quinta");
			
			else if(dia == 6)
			JOptionPane.showMessageDialog(null, "Sexta");
			
			else if(dia == 7)
			JOptionPane.showMessageDialog(null, "Sábado");
			
		  else
			JOptionPane.showMessageDialog(null, "Opção Inválida");
	
	}

}
