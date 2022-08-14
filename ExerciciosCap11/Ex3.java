import javax.swing.JOptionPane;
public class Ex3 {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma palavra:");
		
		if(frase != null){
			
            for (int i = frase.length() - 1; i >= 0; i--){ 
			
                System.out.print(frase.charAt(i));
				
            }
			
			System.out.println();
			
		}else{
			
			System.out.println("Entre com qualquer palavra.");
			
		}	
	}
}