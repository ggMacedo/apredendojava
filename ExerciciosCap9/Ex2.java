public class Ex2 {

	public static void main(String[] args) {
		int numeros = 0;
		int soma=0;
		int result=0;
		do{
			
			result += soma + numeros ;
			numeros ++;
		}while(numeros <= 1000);
		
		System.out.print(result + "\n");
		System.out.println("\nAcabou");
		
	}	
}	