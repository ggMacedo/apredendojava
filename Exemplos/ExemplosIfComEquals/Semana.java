import javax.swing.JOptionPane;

public class Semana {

	public static void main(String[] args) {
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero do dia: "));
		
		if(dia == 1)
			JOptionPane.showMessageDialog(null, "Domingo");
			
			else if(dia == 2)
			JOptionPane.showMessageDialog(null, "Segunda");
			
			else if(dia == 3)
			JOptionPane.showMessageDialog(null, "Ter�a");
			
			else if(dia == 4)
			JOptionPane.showMessageDialog(null, "Quarta");
			
			else if(dia == 5)
			JOptionPane.showMessageDialog(null, "Quinta");
			
			else if(dia == 6)
			JOptionPane.showMessageDialog(null, "Sexta");
			
			else if(dia == 7)
			JOptionPane.showMessageDialog(null, "S�bado");
			
		  else
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
	
	}

}
