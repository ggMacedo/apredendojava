
public class Randomico {
	static int[] numeros = new int[10];
	static int contPar = 0;
	static int contImpar = 0;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < numeros.length; i++) {
			double r = Math.random() * 100;

			numeros[i] = (int) r; // Type casting

			if (numeros[i] % 2 == 0)
				contPar++;
			else
				contImpar++;
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(i + " " + numeros[i]);
		}

		System.out.println("Quantidade pares: " + contPar);
		System.out.println("Quantidade ímpares: " + contImpar);
	}

}
