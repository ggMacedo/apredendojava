import java.util.Scanner;

class Ex4 
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, valor3, valor4;
		double media, soma, resto1, resto2, resto3, resto4;
		
		System.out.print("Entre com o valor1: ");
		valor1 = entrada.nextInt();
		
		System.out.print("Entre com o valor2: ");
		valor2 = entrada.nextInt();
		
		System.out.print("Entre com o valor3: ");
		valor3 = entrada.nextInt();
		
		System.out.print("Entre com o valor4: ");
		valor4 = entrada.nextInt();
		
		System.out.print("\nOs numeros fornecidos foram " + valor1 + " , " + valor2 + " , " + valor3 + " , " + valor4);
		
		soma = valor1 + valor2 + valor3 + valor4;
		media = soma / 4;
		
		resto1 = soma % valor1;
		resto2 = soma % valor2;
		resto3 = soma % valor3;
		resto4 = soma % valor4;
		
		System.out.print("\nMedia entre os valores: " + media);
		System.out.print("\nSoma dos valores: " + soma);
		
		
		System.out.print("\nResto da divisao entre a somatoria pelo valor1: " + resto1);
		System.out.print("\nResto da divisao entre a somatoria pelo valor2: " + resto2);
		System.out.print("\nResto da divisao entre a somatoria pelo valor3: " + resto3);
		System.out.print("\nResto da divisao entre a somatoria pelo valor4: " + resto4);
		
	}

}