class Mercado
{

	public static void main(String[] args)
	{
		String nome;
		double valor;
		double desconto;
		double porc;
		double result;

		nome = String.valueOf (args [0]);
		valor = Double.parseDouble (args [1]);
		porc = Double.parseDouble(args [2]);
		
		desconto = (valor / 100) * porc;
		result = valor - desconto;
		
		System.out.println("\nProduto: " + nome);
		System.out.println("\nPreço: " + "R$" + valor);
		System.out.println("\nPreço com desconto: " + "R$" + result);

	}


}