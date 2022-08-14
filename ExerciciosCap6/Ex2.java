class Ex2
{
	public static void main(String[] args)
	{
		int quantidade1, quantidade2, quantidade3;
		double valor1, valor2, valor3, total;
		
		quantidade1 = Integer.parseInt(args[0]);
		valor1 = Double.parseDouble(args[1]);
		
		quantidade2 = Integer.parseInt(args[2]);
		valor2 = Double.parseDouble(args[3]);
		
		quantidade3 = Integer.parseInt(args[4]);
		valor3 = Double.parseDouble(args[5]);
		
		total = (quantidade1 * valor1) + (quantidade2 * valor2) + (quantidade3 * valor3);
	
		System.out.print("A quantidade do produto-1: " + quantidade1);
		System.out.println("\nO valor do produto-1: " + valor1);
	
		System.out.print("\nA quantidade do produto-2: " + quantidade2);
		System.out.println("\nO valor do produto-2: " + valor2);
		
		System.out.print("\nA quantidade do produto-3: " + quantidade3);
		System.out.println("\nO valor do produto-3: " + valor3);
		
		System.out.print("\nValor total entre produtos: " + total);
		
	}

}