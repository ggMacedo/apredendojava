import java.util.Scanner;

class Ex3
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		double largura, comprimento, area;
		
		System.out.print("\nInforme a largura: ");
		largura = entrada.nextDouble();
		
		System.out.print("\nInforme o comprimento: ");
		comprimento = entrada.nextDouble();
		
		area = largura * comprimento;
		
		System.out.print("\nVoce digitou: " + largura);
		System.out.println("\nVoce digitou: " + comprimento);
		
		System.out.print("\nA area total e de " + area + " metros quadrados");

	}

}