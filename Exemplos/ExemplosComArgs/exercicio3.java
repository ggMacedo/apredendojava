class exercicio3
{
	public static void main(String[] args)
	{ 
		System.out.println("Programa para calcular preço:\n");
		System.out.print("O valor bruto informado é: "  + (Double.parseDouble (args[0]))                                       +
				 "\nO preço á vista é de: "     + (Double.parseDouble (args[0]) - Double.parseDouble (args[0]) * 0.10) + 
				 "\nO valor de desconto é de: " + (Double.parseDouble (args[0]) * 0.10));
	}

}

