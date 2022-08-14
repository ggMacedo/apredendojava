import javax.swing.JOptionPane;

class Ex9
{
	public static void main(String[] args)
	{ 
		double descont, precovista;
		double valorbruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor bruto do produto: "));

		descont = valorbruto * 0.10;
		precovista = valorbruto - descont;
		
		JOptionPane.showMessageDialog(null, "O valor bruto informado e: "  + valorbruto + 
				                            "\nO preço a vista e de: "     + precovista + 
				                            "\nO valor de desconto e de: " + descont);
	}

}