import javax.swing.JOptionPane;

class Ex7
{
	public static void main(String[] args)
	{
	
		double result, par;
		
		double quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Insira a quilometragem percorrida: "));
		double combustivel = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor pago por litro de combustivel?: "));
		
		par = quilometragem / 8;
		result = par * combustivel;
		
		JOptionPane.showMessageDialog(null, "\nO valor gasto com a viagem de: " + quilometragem + " KM foi de R$" + result);

	}

}