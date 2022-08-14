import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resp = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de menções:"));
		
		if(resp == 2) {
			int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));
			int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota:"));
			JOptionPane.showMessageDialog(null, "A média da nota é " + media(nu1, nu2));
		}if(resp == 3) {
			int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));
			int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota:"));
			int nu3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota:"));
			JOptionPane.showMessageDialog(null, "A média da nota é " + media(nu1, nu2, nu3));
		}if(resp == 4) {
			int nu1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));
			int nu2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda nota:"));
			int nu3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira nota:"));
			int nu4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quarta nota:"));
			JOptionPane.showMessageDialog(null, "A média da nota é " + media(nu1, nu2, nu3, nu4));
			
		}else {
			JOptionPane.showMessageDialog(null, "Opção invalida");
			
		}
		
	}
	
	public static double media(int n1, int n2) {
		return (n1 + n2) / 2;
		
	}
	
	public static double media(int n1, int n2, int n3) {
		return (n1 + n2 + n3) / 3;
		
	}
	
	public static double media(int n1, int n2, int n3, int n4) {
		return (n1 + n2 + n3 + n4) / 4;
		
	}

}
