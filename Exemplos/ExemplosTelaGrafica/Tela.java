import javax.swing.JOptionPane;

class Tela
{
	public static void main(String[] args)
	{
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, nome);
	}

}