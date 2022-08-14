import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
			idade();
	}
	static void idade () {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		
		if (i >= 0 && i <=2 ) {
			JOptionPane.showMessageDialog(null, "Bebê");
		}
		else if (i >= 3 && i <=12 ) {
			JOptionPane.showMessageDialog(null, "Criança");
		}
		else if (i >= 13 && i <=19 ) {
			JOptionPane.showMessageDialog(null, "Adolescente");
		}
		else if (i >= 20 && i <=30 ) {
			JOptionPane.showMessageDialog(null, "Jovem");
		}
		else if (i >= 31 && i <=60 ) {
			JOptionPane.showMessageDialog(null, "Adulto");
		}
		else if (i >= 61 ){
			JOptionPane.showMessageDialog(null, "Idoso");
		}
		
	}


}
