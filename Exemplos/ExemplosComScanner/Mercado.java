import java.util.Scanner;

class Mercado
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double valor;
		double desconto;
		double porc;
		double result;
		
		System.out.print("Digite o nome do produto: ");
		nome = entrada.next();
		
		System.out.print("Digite o valor do produto: ");
		valor = entrada.nextDouble();
		
		System.out.print("Digite a porcentagem de desconto: ");
		porc = entrada.nextDouble();
		
		desconto = (valor / 100) * porc;
		result = valor - desconto;
		
		System.out.println("\nO seu Produto e " + nome);
		System.out.println("\nO Preco do seu produto e de: " + "R$" + valor);
		System.out.println("\nPreco com desconto: " + "R$" + result);

	}
}