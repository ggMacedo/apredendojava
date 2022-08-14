import javax.swing.JOptionPane;
public class Ex2 {
	public static void main(String[] args) {
		int cont = 0;
		String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
		
		if(palavra != null){
			
			System.out.println("Mostra a palavra 3 vezes, letra a letra");
			
			while(cont++ < 3){
				
				for(int i=0; i< palavra.length(); i++){
					
					System.out.print(palavra.charAt(i));
					
					try {Thread.sleep(5000);}catch(Exception erro){}
					
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			
			System.out.println("Banner encerrado");
			
		}
		else{
			
			System.out.println("Entre com qualquer palavra");
			
		}
	}
}