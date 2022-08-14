import java.util.Scanner;

class Ex1{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double n1, n2, media;
		
		System.out.print("\nQual a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.print("\nQual a segunda nota: ");
		n2 = entrada.nextDouble();
			
		media = (n1 + n2) / 2;
		
		if(media <= 3)
			System.out.print("\nA média foi de: " + media + " Retido");
		
		else if(media >= 3.1 & media < 6)
			System.out.print("\nA média foi de: " + media + " Progressão Parcial");	
		
	    else
			System.out.print("\nA média foi de: " + media + " Aprovado");
		
	}

}
