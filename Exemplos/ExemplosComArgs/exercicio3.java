class exercicio3
{
	public static void main(String[] args)
	{ 
		System.out.println("Programa para calcular pre�o:\n");
		System.out.print("O valor bruto informado �: "  + (Double.parseDouble (args[0]))                                       +
				 "\nO pre�o � vista � de: "     + (Double.parseDouble (args[0]) - Double.parseDouble (args[0]) * 0.10) + 
				 "\nO valor de desconto � de: " + (Double.parseDouble (args[0]) * 0.10));
	}

}

