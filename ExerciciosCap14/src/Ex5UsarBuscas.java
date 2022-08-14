import javax.swing.JOptionPane;

public class Ex5UsarBuscas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		boolean numeroEncontrado = Ex4Busca.buscarNumeros(1, numeros);
		
		if(numeroEncontrado == true) {
			JOptionPane.showMessageDialog(null, numeroEncontrado + " = número encontrado");
		}
		
		if(numeroEncontrado == false) {
			JOptionPane.showMessageDialog(null, numeroEncontrado + " = número não encontrado");
		}
		
		String palavras[] = {"sexo", "cachorro", "azul", "branco", "vermelho", "dourado", "cinza", "teclado", "letras", "roxo"};
		boolean palavraEncontrada = Ex4Busca.buscarPalavra("sexo", palavras);
		
		if(palavraEncontrada == true) {
			JOptionPane.showMessageDialog(null, palavraEncontrada + " = SIM a palavra foi encontrada");
		}
		
		if(palavraEncontrada == false) {
			JOptionPane.showMessageDialog(null, palavraEncontrada + " = palavra NÃO encontrada");
		}
		
	}

}
