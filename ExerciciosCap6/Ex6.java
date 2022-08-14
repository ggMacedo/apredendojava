import javax.swing.JOptionPane;

class Ex6
{
	public static void main(String[] args)
	{
		double result, valor;
		
		double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento: "));
		double largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura: "));
		double profundidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a profundidade: "));
	
		
		result = comprimento * largura * profundidade;
		valor = result * 45;
		
		JOptionPane.showMessageDialog(null, "\nValores fornecidos: " + comprimento + " , " + largura + " , " + profundidade +
		                                    "\nA piscina solicitada tem " + result + " metros cubicos" + 
											"\nO valor da construcao e de: " + " R$" + valor);
											
	}

}