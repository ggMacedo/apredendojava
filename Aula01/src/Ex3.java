import javax.swing.JOptionPane;

public class Ex3 {
	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro numero:", JOptionPane.WARNING_MESSAGE));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo numero:", JOptionPane.WARNING_MESSAGE));
		n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro numero:", JOptionPane.WARNING_MESSAGE));
		
		if(n1 < n2 && n1 < n3) {
			
			if(n2 < n3) {
				JOptionPane.showMessageDialog(null, "Numeros Ordenados:\n" + n1 + "\n" + n2 + "\n" + n3);
			}else {
				JOptionPane.showMessageDialog(null, "Numeros Ordenados:\n" + n1 + "\n" + n3 + "\n" + n2);	
			}
			
		}else if(n2 < n1 && n2 < n3) {
			
			if(n1 < n3) {
				JOptionPane.showMessageDialog(null, "Numeros Ordenados:\n" + n2 + "\n" + n1 + "\n" + n3);

			}else {
				JOptionPane.showMessageDialog(null, "Numeros Ordenados:\n" + n2 + "\n" + n3 + "\n" + n1);

			}
			
		}else if(n1 < n2) {
			JOptionPane.showMessageDialog(null, "Numeros Ordenados:\n" + n3 + "\n" + n1 + "\n" + n2);
			
		}else {
			JOptionPane.showMessageDialog(null, "Numeros Ordenados:\n" + n3 + "\n" + n2 + "\n" + n1);

		}
	}

}
