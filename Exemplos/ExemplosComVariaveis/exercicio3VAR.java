class exercicio3VAR
{
	public static void main(String[] args)
	{ 
		double valorbruto;
		double precovista;
		double descont;

		valorbruto = Double.parseDouble(args [0]);
		descont = valorbruto * 0.10;
		precovista = valorbruto - descont;
		
		System.out.print("O valor bruto informado �: "  + valorbruto + 
				 "\nO pre�o � vista � de: "     + precovista + 
				 "\nO valor de desconto � de: " + descont);
	}

}

