import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		
		sorteio();
	}
	static void sorteio () {
		int i=0;
		String nomes[] = new String[4];
		for(i = 0; i < 4; i++){
			nomes[i] = JOptionPane.showInputDialog("Brinde: " + (i + 1));
			
		}
		i = (int)(Math.random() * 4);
		JOptionPane.showMessageDialog(null, "O Brinde sorteado foi o " + (i+1) + " - " + nomes[i]);
	}
}