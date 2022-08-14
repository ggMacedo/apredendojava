import javax.swing.JOptionPane;

class Ex5
{
	public static void main(String[] args)
	{
		double soma, media, resto1, resto2, resto3, resto4;
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro valor: "));
	    int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo valor: "));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o terceiro valor: "));
		int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o quarto valor: "));
	
	
	    soma = valor1 + valor2 + valor3 + valor4;
		media = soma / 4;
		
		resto1 = soma % valor1;
		resto2 = soma % valor2;
		resto3 = soma % valor3;
		resto4 = soma % valor4;
		
		JOptionPane.showMessageDialog(null, "\nNumeros fornecidos: " + valor1 + " , " + valor2 + " , " + valor3 + " , " + valor4 +
		                                    "\nMedia entre os valores: " + media + 
											"\nSomatorio: " + soma + 
											"\nResto da divisao entre a somatoria pelo primeiro valor: " + resto1 + 
											"\nResto da divisao entre a somatoria pelo segundo valor: " + resto2 + 
											"\nResto da divisao entre a somatoria pelo terceiro valor: " + resto3 + 
											"\nResto da divisao entre a somatoria pelo quarto valor: " + resto4);
	
	}

}