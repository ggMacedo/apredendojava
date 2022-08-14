import javax.swing.JOptionPane;
public class Ex3 {

	public static void main(String[] args) {
		int limiteInferior = 0;
		int limiteSuperior = 9;
		
		int alcance = limiteSuperior - limiteInferior;
		
		double nuRandom = Math.random();
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o numero que estou pensando..."));
		
		double sorteado = Math.round(limiteInferior + nuRandom * alcance);
		
		if(numero == sorteado){
		
			JOptionPane.showMessageDialog(null, "Voce acertou!!!" + "\nNumero que pensei:" + Math.round(sorteado) + "\nNumero que voce chutou:" + numero);
		
		}else{
			JOptionPane.showMessageDialog(null, "Voce errou!!!" + "\nNumero que pensei:" + Math.round(sorteado) + "\nNumero que voce chutou:" + numero);
		
		}
		
			
	}	
}
