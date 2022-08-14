import javax.swing.JOptionPane;
public class Ex4 {
	public static void main(String[] args) {
		String letras;
		String frase = JOptionPane.showInputDialog("Digite uma palavra:");
		int conta = 0;
		
		if(frase != null){
			
			System.out.println("Efeito desejado:");
			
			for(int i=0; i <= frase.length(); i++){
				
				if(i>=1 && i < frase.length() + 1){
					
					letras = frase.substring(0,i);
					System.out.println(letras);
					
				}
				
				if(i == frase.length()){
					
					for(conta=1; conta <= frase.length(); conta++){
						
						letras = frase.substring(0, i - conta);
						System.out.println(letras);
						
					}	
				}	
			}
		}else{
			
			System.out.println("Entre com qualquer palavra.");
			
		}
	}
}