import javax.swing.JOptionPane;

class Mercado
{
	public static void main(String[] args)
	{
		double result;
		double desconto;
		
		String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		
		double porc = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de desconto: "));
		
		desconto = (valor / 100) * porc;
		result = valor - desconto;
		
		JOptionPane.showMessageDialog(null, "\nNome do produto: " + nome);
		JOptionPane.showMessageDialog(null, "\nO Preco do seu produto e de: " + "R$" + valor);
		JOptionPane.showMessageDialog(null, "\nPreco com desconto: " + "R$" + result);

	}
}