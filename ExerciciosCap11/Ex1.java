import javax.swing.JOptionPane;
public class Ex1 {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase:");
		String fraseSemVogais = frase.toLowerCase();
		
		fraseSemVogais = fraseSemVogais.replaceAll("a"," ");
		fraseSemVogais = fraseSemVogais.replaceAll("e"," ");
		fraseSemVogais = fraseSemVogais.replaceAll("i"," ");
		fraseSemVogais = fraseSemVogais.replaceAll("o"," ");
		fraseSemVogais = fraseSemVogais.replaceAll("u"," ");
		fraseSemVogais = fraseSemVogais.replaceAll("[^\\p{ASCII}]", " ");
	
		JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nFrase sem vogais: " + fraseSemVogais); 
		
	}
}