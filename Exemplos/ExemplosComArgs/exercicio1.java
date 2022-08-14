class exercicio1 
{
	public static void main(String[] args)
	{
		System.out.println("Programa para calcular notas:\n");
		System.out.print("Nota do aluno "   + (String.valueOf (args[0]))    + " é de "
                                                    + (Double.parseDouble (args[1]) + 
                                                       Double.parseDouble (args[2])) /2 );
	}

}