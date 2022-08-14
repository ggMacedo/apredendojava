class exercicio2VAR
{
	public static void main (String[] args)
	{
		
		final double PI = 3.14159;
		double volume;
		double raio = Double.parseDouble(args [0]);
		double altura = Double.parseDouble(args [1]);
		
		volume = PI * (raio * raio) * altura;
	
		System.out.print("O volume é de: " + volume);
	
	}



}