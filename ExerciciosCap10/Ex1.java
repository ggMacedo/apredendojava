import javax.swing.JOptionPane;
public class Ex1 {

	public static void main(String[] args) {
		int limiteInferior = 1;
		int limiteSuperior = 6;
		
		int alcance = limiteSuperior - limiteInferior;
		
		double nuRandom = Math.random();
		
		JOptionPane.showMessageDialog(null, "O dado foi jogado!" + "\n" + "O numero sorteado foi: " + Math.round(limiteInferior + nuRandom * alcance));
		
			
	}	
}

