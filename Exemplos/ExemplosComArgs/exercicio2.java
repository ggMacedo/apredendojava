class exercicio2
{
	public static void main(String[] args)
	{ 

		System.out.println("Programa que calcula o volume de latas:\n");
		System.out.print("\nO raio é de: " +  (Double.parseDouble (args[0])) + 
				"\nA altura é de: " + (Double.parseDouble (args[1])) + 
				"\nO volume é de: " + (3.14159 * (Double.parseDouble (args[0])) * (Double.parseDouble (args[0])) * (Double.parseDouble (args[1]))));

	}

}

