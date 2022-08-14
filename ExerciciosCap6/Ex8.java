import javax.swing.JOptionPane;

class Ex8
{
	public static void main(String[] args)
	{
	
		final double PI = 3.14159;
		double volume;
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		
		volume = PI * (raio * raio) * altura;
		
		JOptionPane.showMessageDialog(null, "\nO volume da lata e: " + volume);
		
	}
	
}