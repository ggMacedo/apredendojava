import javax.swing.JOptionPane;
public class Ex1 {
	public static void main(String[] args) {
		String nomes[] = new String[10];
		int i= 0;
		
		for(i = 0; i < 10; i++){
			nomes[i] = JOptionPane.showInputDialog("Apostador: " + (i + 1));
			
		}
		i = (int)(Math.random() * 10);
		JOptionPane.showMessageDialog(null, "Ganhador:" + nomes[i]);
		
		
	}
}