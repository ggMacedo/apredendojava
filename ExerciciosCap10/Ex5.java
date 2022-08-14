import javax.swing.JOptionPane;
public class Ex5 {

	public static void main(String[] args) {
		double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do lado:"));
		
		double volume = Math.pow(lado,3);
	
		JOptionPane.showMessageDialog(null, "Volume calculado = " + Math.floor(volume) + " metros cubicos suportados.");
	
	}	
}