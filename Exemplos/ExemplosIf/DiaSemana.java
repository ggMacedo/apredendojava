import javax.swing.JOptionPane;

public class DiaSemana {

	public static void main(String[] args) {
     String dia = String.valueOf(JOptionPane.showInputDialog("Escreva o dia desejado: "));
		
		if(dia.equals("domingo") )
			JOptionPane.showMessageDialog(null, "1");
			
			else if(dia.equals("segunda") )
			JOptionPane.showMessageDialog(null, "2");
			
			else if(dia.equals("terca") )
			JOptionPane.showMessageDialog(null, "3");
			
			else if(dia.equals("quarta") )
			JOptionPane.showMessageDialog(null, "4");
			
			else if(dia.equals("quinta") )
			JOptionPane.showMessageDialog(null, "5");
			
			else if(dia.equals("sexta") )
			JOptionPane.showMessageDialog(null, "6");
			
			else if(dia.equals("sexta") )
			JOptionPane.showMessageDialog(null, "7");
			
		else
			JOptionPane.showMessageDialog(null, "Opção Inválida");
		
	}

}