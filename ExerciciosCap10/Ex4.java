import javax.swing.JOptionPane;
public class Ex4 {

	public static void main(String[] args) {
		double diametro = Double.parseDouble(JOptionPane.showInputDialog("Informe o diametro da roda em metros:"));
		int voltas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de voltas:"));
		
		double comprimento = Math.PI * diametro / 2;
		double distancia = comprimento * voltas;
		
		JOptionPane.showMessageDialog(null, "Valores fornecidos:" + "\nQuantidade de voltas:" + voltas + "\nDiametro da roda:" + diametro + "\nDistancia percorrida e de:" + Math.ceil(distancia) + " metros.");
	
	}	
}