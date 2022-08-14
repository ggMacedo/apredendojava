import java.util.Scanner;

class NotaSca
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		String nome;
		
		System.out.print("Qual o nome do aluno: ");
		nome = entrada.next();
		System.out.print("Digite a nota 1: ");
		n1 = entrada.nextDouble();
		System.out.print("Digite a nota 2: ");
		n2 = entrada.nextDouble();
		System.out.print("Digite a nota 3: ");
		n3 = entrada.nextDouble();
		System.out.print("Digite a nota 4: ");
		n4 = entrada.nextDouble();
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.print("A média é de: " + media);
	}
}