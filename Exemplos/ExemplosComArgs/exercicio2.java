class exercicio2
{
	public static void main(String[] args)
	{ 

		System.out.println("Programa que calcula o volume de latas:\n");
		System.out.print("\nO raio � de: " +  (Double.parseDouble (args[0])) + 
				"\nA altura � de: " + (Double.parseDouble (args[1])) + 
				"\nO volume � de: " + (3.14159 * (Double.parseDouble (args[0])) * (Double.parseDouble (args[0])) * (Double.parseDouble (args[1]))));

	}

}

