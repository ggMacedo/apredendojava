import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		int  nu1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero: "));
		int  nu2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero: "));
		int  nu3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro n�mero: "));
		
		if(nu1 > nu2 && nu1 > nu3)
			JOptionPane.showMessageDialog(null, "N�meros fornecidos: \n" + nu1 + "\n" + nu2 + "\n" + nu3 + "\n Maior n�mero �: " + nu1);
		
		if(nu2 > nu1 && nu2 > nu3)
			JOptionPane.showMessageDialog(null, "N�meros fornecidos: \n" + nu1 + "\n" + nu2 + "\n" + nu3 + "\n Maior n�mero �: " + nu2);
		
		if(nu3 > nu1 && nu3 > nu2)
			JOptionPane.showMessageDialog(null, "N�meros fornecidos: \n" + nu1 + "\n" + nu2 + "\n" + nu3 + "\n Maior n�mero �: " + nu3);
	}

}
